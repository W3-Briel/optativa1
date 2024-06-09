package executeservice;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		
		Runnable task1 = () -> {
			System.out.println("tarea 1 ejecutandose en ID:" + Thread.currentThread().getId());
		};
		
		Runnable task2 = () -> {
			System.out.println("tarea 2 ejecutandose en ID:" + Thread.currentThread().getId());
		};
		
		
		// ExecutorService inicializa las instancias de hilos. tienen que ser directamente de Runnable o callable
		executor.submit(task1);
		executor.submit(task2);
	}
}
