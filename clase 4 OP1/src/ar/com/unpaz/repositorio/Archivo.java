package ar.com.unpaz.repositorio;
import java.util.List;

public class Archivo extends LeerLineas implements ILecturaArchivo{
	@Override
	public List<List<String>> leerClientes() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\cliente.txt");
	}

	@Override
	public List<List<String>> leerVentas() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\venta.txt");
	}

	@Override
	public List<List<String>> leerDetalles() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\detalle.txt");
	}

	@Override
	public List<List<String>> leerProductos() {
		return this.getDatos("C:\\Users\\Angel\\OneDrive\\Documents\\workspace OP1\\optativa trabajo 2\\repositorio\\producto.txt");
	}

//	@Override
//	public List<List<String>> leerCompleto() {
//		return null;
//	}

}
