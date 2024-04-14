package ar.com.unpaz.main;
import ar.com.unpaz.services.*;
//import ar.com.unpaz.model.*;
//import ar.com.unpaz.model.Cliente;

import java.util.List;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> listObjVenta = new DTOVenta().formmatedData();
		Informe info = new Informe(1,listObjVenta);
		
		System.out.println(info.getTotalVentas());
	}
}