package ar.com.unpaz.repositorio;
import java.util.List;

public class Archivo extends LeerLineas implements ILecturaArchivo{
	@Override
	public List<List<String>> leerArchivoCliente() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\cliente.txt");
	}

	@Override
	public List<List<String>> leerArchivoVenta() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\venta.txt");
	}

	@Override
	public List<List<String>> leerArchivoDetalle() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\detalle.txt");
	}

	@Override
	public List<List<String>> leerArchivoProducto() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\producto.txt");
	}

//	@Override
//	public List<List<String>> leerCompleto() {
//		return null;
//	}

}
