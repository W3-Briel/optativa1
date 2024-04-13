package ar.com.unpaz.services;
import ar.com.unpaz.repositorio.Archivo;
import ar.com.unpaz.model.Venta;

import java.util.List;

//int id, String fecha, int cliente, int total

public class DTOVenta extends FormattedFunction implements IFormatter{
	public DTOVenta() {
		this.setDatos(new Archivo().leerArchivoVenta());
	}
	public Object formmated(List<String> dato) {
		try {
			// controlamos el tamaño de la lista
			String[] sDato = dato.get(0).split(",");
			if(sDato.length != 4) {
				System.out.println(dato.size());
				throw new IllegalArgumentException("No se puede instanciar una Venta con una lista de este tamaño.");
				}
			// instanciamos el Producto, sabiendo que la lista es de String.
			Venta dVenta = new Venta(	Integer.parseInt(sDato[0]),
										sDato[1],
										Integer.parseInt(sDato[2]),
										Integer.parseInt(sDato[3])
										);
			return dVenta;
			}catch (IllegalArgumentException e){
					System.out.println("Se produjo un error; "+e.getMessage());
					return null;
				}
			}
}
