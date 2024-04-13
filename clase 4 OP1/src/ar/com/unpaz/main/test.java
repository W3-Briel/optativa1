package ar.com.unpaz.main;
import ar.com.unpaz.repositorio.*;
import ar.com.unpaz.services.*;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MostrarClientes hola = new MostrarClientes();
// 		hola.formmatedData(() -> new Archivo().leerArchivoCliente());
		System.out.println(hola.formmatedData(new Archivo().leerArchivoCliente()));
	}
}