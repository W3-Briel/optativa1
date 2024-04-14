package ar.com.unpaz.services;
import ar.com.unpaz.model.Cliente;
import ar.com.unpaz.repositorio.Archivo;
import java.util.List;


//int id, String nombre, String apellido, int telefono

public class DTOCliente extends FormattedFunction implements IFormatter{

	public DTOCliente() {
		this.setDatos(new Archivo().leerClientes());
	}

	@Override
	public Object formmated(List<String> dato) {
		try {
			// controlamos el tamaño de la lista
			String[] sDato = dato.get(0).split(",");
			if(sDato.length != 4) {
				System.out.println(dato.size());
				throw new IllegalArgumentException("No se puede instanciar un Cliente con una lista de este tamaño.");
			}
			// instanciamos al Cliente, sabiendo que la lista es de String.
			Cliente dCliente = new Cliente( Integer.parseInt(sDato[0]),
											sDato[1],
											sDato[2],
											Integer.parseInt(sDato[3])
											);
			return dCliente;
			}catch (IllegalArgumentException e){
				System.out.println("Se produjo un error; "+e.getMessage());
				return null;
		}
	}
}
