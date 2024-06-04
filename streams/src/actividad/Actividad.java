package actividad;

import java.util.Arrays;
import java.util.stream.*;


public class Actividad {

//	Enunciado 2: Desarrolla una aplicación en Java que procese una lista de strings y 
//				busque las palabras que contienen una determinada subcadena utilizando parallel streams para mejorar la eficiencia del proceso.
//
//	Enunciado 3: Escribe un programa en Java que utilice parallel streams para
//				calcular el producto de los elementos de una lista de números enteros generados aleatoriamente y mostrar el resultado por pantalla.
//
//	Enunciado 4: Crea una aplicación en Java que utilice parallel streams para encontrar los números primos
//				en un rango dado y mostrarlos en orden ascendente, aprovechando la capacidad de procesamiento paralelo para mejorar el rendimiento del cálculo.

	
	public void enunciado1(){
//		Enunciado 1: Implementa un programa en Java que utilice parallel streams
//		para calcular la suma de los cuadrados de los números enteros del 1 al 100 de manera paralela.
		
		// n*n + n1*n1 ...
		
		int[] num = new int[100];
		
		for (int i = 1; i<=100 ; i++) {
			num[i-1] = i*i;
		}
		
		
		System.out.println(Arrays.stream(num)
								.parallel()
								.sum());
		
		
	}
	
	public static void main(String args[]) {
		new Actividad().enunciado1();
	}
}
