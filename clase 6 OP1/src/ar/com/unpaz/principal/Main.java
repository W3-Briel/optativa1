package ar.com.unpaz.principal;

import ar.com.unpaz.servicios.*;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// programa que imporime una palabra, letra por letra, utilizando hilos paralelos
		String palabra = "angel";
		
		Hilo1 letra_a = new Hilo1('a');
		Hilo2 letra_n = new Hilo2('n');
		Hilo3 letra_g = new Hilo3('g');
		Hilo4 letra_e = new Hilo4('e');
		Hilo5 letra_l = new Hilo5('l');
		
		letra_a.start();
		letra_a.sleep(10);
		letra_n.start();
		letra_n.sleep(10);
		letra_g.start();
		letra_g.sleep(10);
		letra_e.start();
		letra_e.sleep(10);
		letra_l.start();
		letra_l.sleep(10);
//		for(int i = 0; i < 100; i++) {
//			System.out.println(palabra);
//		}
		
	}

}
