package prueba1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
	public static void main (String args[]) {
		List<String> myList = Arrays.asList("a","b","c","d");
		
		Stream<String> streams = myList.stream();
//								.filter(s->s.startsWith("a"))
//								.map(String::toUpperCase);
		
		
		System.out.println(myList);
		Stream<String> filteredStream = streams.filter(s -> s.startsWith("a"))
												.map(String::toUpperCase);
		
		List<String> listaConvertida = filteredStream.collect(Collectors.toList());
		
		listaConvertida.forEach(System.out::println);
		
		
		List<String> myList2 = Arrays.asList("apple", "banana", "cherry", "date");
		List<String> result = myList2.stream()
								.filter(s -> s.startsWith("a"))
								.map(String::toUpperCase)
								.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
	}
	
}
