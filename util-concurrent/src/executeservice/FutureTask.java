package executeservice;


import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


import java.util.List;
import java.util.ArrayList;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

// crear un una lista que sea de tipo Future y que contenga las task del executorservices, cada tarea mostrara un numero aleatorio y dormira el hilo 1 segundo.

// al final, utilizar un parallelstream para sumar todos los valores de la lista

public class FutureTask {
	
	public static void main(String[] args) {
		
		// lista de tareas
		List<Future<Integer>> tasks = new ArrayList<Future<Integer>>();
		
		ExecutorService executor = Executors.newFixedThreadPool(5); // pileta de x hilos
		
		for(int i = 0; i < 10 ; i++) {
			
			Callable<Integer> callableTask = () -> {
	            Thread.sleep(1000); // dormimos el hilo 1 segundo
	            return (int) (Math.random() * 1000) + 1; // numero random
	        };
			
			Future<Integer> task = executor.submit(callableTask); // al ser un callable luego tengo que trabajar el try catch
			tasks.add(task);
		}
		
		
		tasks.parallelStream()
			.forEach((f)->{
				try {
					System.out.println(f.get());
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		
		int suma = tasks.parallelStream()
						.mapToInt(t -> {
							try {
								return t.get().intValue();
							} catch (InterruptedException | ExecutionException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							return 0;
						})
						.sum();
		
		System.out.println("la suma total de estos numeros aleatorios es: " + suma);
	}
}
