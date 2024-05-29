package prueba1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicios {
	/**
	Ejercicio 1: Filtrar y Transformar una Lista de Números
	Enunciado: 
	Dada una lista de números enteros, filtra los números pares, eleva cada número par al cuadrado y recopila los resultados en una nueva lista.
	 * */
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
	
	public static void ejercicio2() {
		/**
	Ejercicio 2: Filtrar y Contar Palabras
	Enunciado: 
	Dada una lista de palabras, filtra las palabras que tienen más de 3 caracteres y conviértelas a minúsculas.
	Cuenta cuántas palabras cumplen esta condición.
		* */
		List<String> lista = Arrays.asList("asd","dsa","hola","chau","saludo","saludooo","asdasdasdas");
		
		
		long listaResultado = lista.stream()
									.filter(p -> p.length() > 3)
									.map(r -> r.toLowerCase())
									.count();
		
		System.out.println(listaResultado);
	}
	
	public static void main(String args[]) {
		Ejercicios.ejercicio2();
	}
	
}
