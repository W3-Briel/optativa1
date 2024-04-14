package ar.com.unpaz.main;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import ar.com.unpaz.services.*;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// inicializamos las variables donde tendremos los datos guardados, para no escanear muchas veces un archivo.
		List<Object> listObjVentas = new ArrayList<>();
		List<Object> listObjClientes = new ArrayList<>();
		List<Object> listObjProductos = new ArrayList<>();
		List<Object> listObjDetalles = new ArrayList<>(); 
		
		String barra = "******************************";
		
		// menu
		boolean ejecutar = true;
		do {
			System.out.println(barra);
			System.out.println("MENU:\n\t0: SALIR\n\t1:Mostrar ventas\n\t2:Mostrar clientes\n\t3:Mostrar Productos\n\t4:Mostrar detalles\n\t5:Mostrar informe");
			System.out.println(barra);
			System.out.println("Escribe el numero de tu eleccion: ");
			String eleccion = scanner.next();
			
			switch(eleccion){
			case "1":
				if(listObjVentas.isEmpty()) listObjVentas = new DTOVenta().formmatedData();
				
				System.out.println(listObjVentas);
				break;
			case "2":
				if(listObjClientes.isEmpty()) listObjClientes = new DTOCliente().formmatedData();
				
				System.out.println(listObjClientes);
				break;
			case "3":
				if(listObjProductos.isEmpty()) listObjProductos = new DTOProducto().formmatedData();
				
				System.out.println(listObjProductos);
				break;
			case "4":
				if(listObjDetalles.isEmpty()) listObjDetalles = new DTODetalle().formmatedData();
				
				System.out.println(listObjDetalles);
				break;
			case "5":
				try{
					System.out.println("Ingresar la ID para mostrar su informe;");
					int id = scanner.nextInt();
					
					if(listObjVentas.isEmpty()) listObjVentas = new DTOVenta().formmatedData();
					if(listObjClientes.isEmpty()) listObjClientes = new DTOCliente().formmatedData();
					
					new Informe(id,listObjVentas,listObjClientes).embed();;
				}catch(InputMismatchException e) {
					System.out.println("ERROR: asegurate de que sea un numero entero!");
				}
				
				break;
			case "0":
				ejecutar = false;
				System.out.println(barra);
				System.out.println("chau");
				System.out.println(barra);
				break;
			default:
				System.out.println("Solo opciones validas, por favor!");
			}
		}while(ejecutar);

		scanner.close();
	}
}
