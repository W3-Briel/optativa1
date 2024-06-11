package ar.com.unpaz.parcial2;

import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

public class Parcial2Op1 {
	
	public void actividad1() {
		/*
		1-Escribe un programa en Java que utilice parallel streams 
		para encontrar el máximo valor en una lista de números generados aleatoriamente. 
		La lista debe contener 5000 números 
		El programa debe imprimir el máximo valor encontrado.
		*/
			int[] maximo = new int[1];
			
			//lista de 5000 valores aleatorios
			final int limitLength = 5000;
			ArrayList<Integer> randomValues = new ArrayList<Integer>();
			
			IntStream.rangeClosed(0, limitLength)
					.parallel()
					.forEach(p -> {
							Integer value = (int) Math.round(Math.random() * 1000 + 1);
							
							if (value.intValue() > maximo[0]) {
								maximo[0] = value.intValue();
							}
							
							randomValues.add(value);
					});
			
			System.out.println("el valor maximo de la lista random es; " + maximo[0]);
		}
	
	
	public void actividad2(){
		/*
		2-Escribe un programa en Java que utilice parallel streams 
		para encontrar cuanto valor son pares e impares en una lista de números generados aleatoriamente. 
		La lista debe contener 5000 números 
		El programa debe imprimir el máximo valor encontrado.
		*/
		int[] maximo = new int[1];
		
		final int limitLength = 5000;
		ArrayList<Integer> randomValues = new ArrayList<Integer>();
		
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();
		
		IntStream.rangeClosed(0, limitLength)
				.parallel()
				.forEach(p -> {
						Integer value = (int) Math.round(Math.random() * 1000 + 1);
						
						if (value.intValue() > maximo[0]) {
							maximo[0] = value.intValue();
						}
						
						randomValues.add(value);
				});
		
		randomValues.parallelStream()
					.forEach(n -> {
						if (n % 2 == 0) {
							pares.add(n);
						}
						impares.add(n);
					});
		
		System.out.println("el valor maximo es: " + maximo);
	}
	
	public void actividad3() {
	/*
	3-Desarrolla un programa en Java que utilice streams para filtrar una lista de enteros 
	y encontrar aquellos que son múltiplos de 3.
	
	La lista debe contener 1000 números enteros generados aleatoriamente entre 1 y 10000. 
	El programa debe imprimir los números filtrados.
	*/
		final int limitLength = 1000;
		
		ArrayList<Integer> randomValues = new ArrayList<Integer>();		
		
		//lista de 1000 valores aleatorios
		IntStream.rangeClosed(1, limitLength)
				.parallel()
				.forEach(p -> {
						Integer value = (int) Math.round(Math.random() * 10000 + 1);
						randomValues.add(value);
				});
		
		List<Integer> multiplos = randomValues.stream()
										.filter(n -> (n % 3) == 0)
										.collect(Collectors.toList());
		
		System.out.println("los multiplos de 3 encontrados en la lista son:");
		multiplos.stream()
				.forEach(System.out::println);
	}
	
	public static void main(String args[]) {
		
		Parcial2Op1 actividades = new Parcial2Op1();
		
		actividades.actividad1();
		actividades.actividad2();
		actividades.actividad3();
	}
}
