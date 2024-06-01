package tutorial1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class Main {
	public static void main(String args[]) {
		
		// datos aleatorios  para practicar(=
		Person p1 = new Person(1,"angel", LocalDate.of(2003, 5, 28));
		Person p2 = new Person(2,"bruno", LocalDate.of(2000, 3, 23));
		Person p3 = new Person(3,"paulina", LocalDate.of(2008, 3, 8));
		Person p4 = new Person(4,"nicolas", LocalDate.of(2023, 1, 1));
		Person p5 = new Person(5,"emir", LocalDate.of(2012, 11, 21));
		
		Product pr1 = new Product(1,"pancho", 660.50);
		Product pr2 = new Product(2,"Guiso", 800.0);
		Product pr3 = new Product(3,"asado", 1999.99);
		Product pr4 = new Product(4,"papas fritas", 799.99);		
		
		List<Person> persons = Arrays.asList(p1,p2,p3,p4,p5);
		List<Product> product = Arrays.asList(pr1,pr2,pr3,pr4);
		
		// INICIO
		
		//lambda //method refence
		
		//expression lambda/ parametroPropio -> accion
//		persons.forEach(p -> System.out.println(p));
		
		//method refence/ cuando el parametroPropio aparezca en la accion, se puede escribir de esta manera
		// si en la lambda se realizan mas de una operacion, o una operacion tiene mas de un parametro.
		// ya no se podria utilizar este metodo.
//		persons.forEach(System.out::println);
		
		//1- Filter (param: Predicate) / un Predicate es una condicional! true o false. / seria como un WHERE de SQL
		
		/*
		List<Person> filteredList= persons.stream()
								.filter(p -> Main.getAge(p.getBirth()) >= 18 )
								.collect(Collectors.toList());
		
		Main.printList(filteredList);*/
		
		
	}
	
	public static int getAge(LocalDate birthDate) {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}
	
	// el "?" es un generico que representa cualquier objeto.
	public static void printList(List<?> list) {
		list.forEach(System.out::println);
	}
}
