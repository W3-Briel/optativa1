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
	public static void ejercicio3(){
		/**Ejercicio 3: Calcular la Suma de Edades de Personas
		Enunciado:
		Dada una lista de objetos Persona con atributos nombre y edad, filtra las personas mayores de 18 años y calcula la suma de sus edades.
		 **/
		
		class Persona{
			public int edad;
			public String nombre;
			
			public Persona(int edad, String nombre) {
				this.edad = edad;
				this.nombre = nombre;
				}
			public int getEdad() {
				return edad;
			}
			public void setEdad(int edad) {
				this.edad = edad;
			}
			public String getNombre() {
				return nombre;
			}
			public void setNombre(String nombre) {
				this.nombre = nombre;
			}
			
		}
		
		List<Persona> personas = Arrays.asList(new Persona(15,"Paulina"),
				new Persona(18,"Nelson"),
				new Persona(21,"Angel"),
				new Persona(16,"Emir"),
				new Persona(19,"Dylan"),
				new Persona(20,"Marto"));

		int acumulador_mayores = personas.stream()
								.filter(p -> p.getEdad() >= 18)
								.mapToInt(Persona::getEdad)
								.sum();
		
		System.out.println(acumulador_mayores);
		
	}	
	
	public static void main(String args[]) {
		Ejercicios.ejercicio3();
	}
	
}
