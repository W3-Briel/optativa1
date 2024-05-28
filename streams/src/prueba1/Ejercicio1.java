package prueba1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio1 {
	public static void ejercicio1 () {
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
		Stream<Integer> listaStream = listaNumeros.stream();
		
		List<Integer> resultado = listaStream.filter(n-> n % 2 == 0)
											.map(r -> r*r)
											.collect(Collectors.toList());
		
		System.out.println(resultado);
		
	}
	
	public static void ejercicio1_parallels () {
		
		List<Integer> listaNumeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11);
		
		Stream<Integer> listaStream = listaNumeros.parallelStream();
		
		List<Integer> resultado = listaStream.filter(n-> n % 2 == 0)
											.map(r -> r*r)
											.collect(Collectors.toList());
		
		System.out.println(resultado);
		
	}
	
	public static void main(String args[]) {
		Ejercicio1.ejercicio1_parallels();
		
	}
	
}
