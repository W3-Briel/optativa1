package ar.com.unpaz.services;
import ar.com.unpaz.repositorio.Archivo;
import ar.com.unpaz.model.Producto;

import java.util.List;

//int id, String nombre, int cantidad, int precio
public class DTOProducto extends FormattedFunction implements IFormatter{
	public DTOProducto() {
		this.setDatos(new Archivo().leerArchivoProducto());
	}
	public Object formmated(List<String> dato) {
		try {
			// controlamos el tamaño de la lista
			String[] sDato = dato.get(0).split(",");
			if(sDato.length != 4) {
				System.out.println(dato.size());
				throw new IllegalArgumentException("No se puede instanciar un Producto con una lista de este tamaño.");
				}
			// instanciamos el Producto, sabiendo que la lista es de String.
			Producto dProducto = new Producto(  Integer.parseInt(sDato[0]),
												sDato[1],
												Integer.parseInt(sDato[2]),
												Integer.parseInt(sDato[3])
												);
			return dProducto;
			}catch (IllegalArgumentException e){
					System.out.println("Se produjo un error; "+e.getMessage());
					return null;
				}
			}
}
