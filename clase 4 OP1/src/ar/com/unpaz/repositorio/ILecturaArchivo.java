package ar.com.unpaz.repositorio;
import java.util.List;

public interface ILecturaArchivo {
	List<List<String>> leerArchivoCliente();
	List<List<String>> leerArchivoVenta();
	List<List<String>> leerArchivoDetalle();
	List<List<String>> leerArchivoProducto();
//	List<List<String>> leerCompleto();
}