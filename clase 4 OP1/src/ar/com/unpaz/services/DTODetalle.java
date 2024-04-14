package ar.com.unpaz.services;
import ar.com.unpaz.model.Detalle;
import ar.com.unpaz.repositorio.Archivo;
import java.util.List;

//int id, int venta, int producto, int cantidad, int precio

public class DTODetalle extends FormattedFunction implements IFormatter{
	public DTODetalle() {
		this.setDatos(new Archivo().leerDetalles());
	}
	
	public Object formmated(List<String> dato) {
		try {
			// controlamos el tamaño de la lista
			String[] sDato = dato.get(0).split(",");
			if(sDato.length != 5) {
				System.out.println(dato.size());
				throw new IllegalArgumentException("No se puede instanciar un Detalle con una lista de este tamaño.");
			}
			// instanciamos al Cliente, sabiendo que la lista es de String.
			Detalle dDetalle = new Detalle(Integer.parseInt(sDato[0]),
											Integer.parseInt(sDato[1]),
											Integer.parseInt(sDato[2]),
											Integer.parseInt(sDato[3]),
											Integer.parseInt(sDato[4])
											);
			return dDetalle;
		} catch (IllegalArgumentException e) {
			System.out.println("Se produjo un error; "+e.getMessage());
			return null;
		}
	}
}
