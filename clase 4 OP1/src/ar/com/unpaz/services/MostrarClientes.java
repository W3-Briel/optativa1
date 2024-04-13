package ar.com.unpaz.services;
import ar.com.unpaz.model.Cliente;

import java.util.ArrayList;
import java.util.List;


//int id, String nombre, String apellido, int telefono

public class MostrarClientes implements IFormatter{

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
			Cliente dCliente = new Cliente(Integer.parseInt(sDato[0]),
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

	// se podria utilizar este metodo para las demas clases
	@Override
	// buscarle la vuelta para ver si es posible abstraer este codigo y encapsular
	public List<Object> formmatedData(List<List<String>> datos) {
		List<Object> diccionarioDeClientes = new ArrayList<>();
		datos.forEach(dCliente -> diccionarioDeClientes.add(this.formmated(dCliente)));
		return diccionarioDeClientes;
	}
	
}
