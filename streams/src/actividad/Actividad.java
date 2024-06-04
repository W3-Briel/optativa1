package actividad;

import java.util.Arrays;
import java.util.List;

import java.util.stream.*;

class NegativeRange extends RuntimeException{
	public NegativeRange() {
		super("no puedes ingresar un valor negativo como rango!");
	}
}

public class Actividad {
	public void enunciado1(){
//		Enunciado 1: Implementa un programa en Java que utilice parallel streams
//		para calcular la suma de los cuadrados de los números enteros del 1 al 100 de manera paralela.
		
		// n0*n0 + n1*n1 ...
		
		int total = IntStream.rangeClosed(1, 100)
							.parallel()
							.map(n -> n*n)
							.sum();
		
		System.out.println(total);
	}
	
	public void enunciado2(String sub, List<String> listStrings) {
//		Enunciado 2: Desarrolla una aplicación en Java que procese una lista de strings y 
//		busque las palabras que contienen una determinada subcadena utilizando parallel streams para mejorar la eficiencia del proceso.
		
		List<String> result = listStrings.parallelStream()
										.filter(word -> word.contains((CharSequence) sub))
										.collect(Collectors.toList());
	
		System.out.println(result);
	}
	
	public void enunciado3() {
//		Enunciado 3: Escribe un programa en Java que utilice parallel streams para
//		calcular el producto de los elementos de una lista de números enteros generados aleatoriamente y mostrar el resultado por pantalla.
		
		final int listLength = 50;
		final int maxRandomValue = 1000;
		
		int total = IntStream.rangeClosed(1, listLength)
							.parallel()
							.map(i -> (int) (Math.random() * maxRandomValue) + 1)
							.sum();
		
		System.out.println(total);
	}
	
	public void enunciado4(int range) {
//		Enunciado 4: Crea una aplicación en Java que utilice parallel streams para encontrar los números primos
//		en un rango dado y mostrarlos en orden ascendente, aprovechando la capacidad de procesamiento paralelo para mejorar el rendimiento del cálculo.
		
		if (range < 0) throw new NegativeRange();
		
		final int numberRange = range;
		List<Integer> counsins = Stream.iterate(1,n -> n +1 )
										.parallel()
										.limit(numberRange)
										.filter(num -> {
											
											if (num <= 1) return false;
											
											for (int i = 2; i <= Math.sqrt(num); i++) {
									            if (num % i == 0) return false;
										 	}
											
											return true;
										})
										.sorted()
										.collect(Collectors.toList());
		System.out.println(counsins);
		
	}
	
	public static void main(String args[]) {
		
		new Actividad().enunciado1();
		
		new Actividad().enunciado2("angel" , // sub cadena de ejemplo
									Arrays.asList("hola","chau","adasdasangelasdasd","asdfasdfmateoasdasd") // lista de ejemplo
									);
		
		new Actividad().enunciado3();
		
		new Actividad().enunciado4(-1);
		
	}
}
