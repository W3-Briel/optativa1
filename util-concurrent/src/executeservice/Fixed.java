package executeservice;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Fixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable task1 = () -> {
			System.out.println("tarea 1 ejecutandose en " + Thread.currentThread().getId());
		};
		
		Runnable task2 = () -> {
			System.out.println("tarea 2 ejecutandose en " + Thread.currentThread().getId());
		};
		
		
		executor.submit(task1);
		executor.submit(task2);
	}
}
