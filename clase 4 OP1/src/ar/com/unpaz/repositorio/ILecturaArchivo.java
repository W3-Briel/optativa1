package ar.com.unpaz.repositorio;
import java.util.List;

public interface ILecturaArchivo {
	List<List<String>> leerClientes();
	List<List<String>> leerVentas();
	List<List<String>> leerDetalles();
	List<List<String>> leerProductos();
//	List<List<String>> leerCompleto();
}