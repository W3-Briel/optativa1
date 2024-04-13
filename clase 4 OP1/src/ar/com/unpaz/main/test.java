package ar.com.unpaz.main;
import ar.com.unpaz.services.*;
//import ar.com.unpaz.model.Cliente;

import java.util.List;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DTOVenta hola = new DTOVenta();
		
		List<Object> venta = hola.formmatedData();
		System.out.println(venta);
	}
}