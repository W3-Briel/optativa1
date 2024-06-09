package executeservice;

/*
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;*/

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class execute {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> { // dentro de submit se pueden ejecutar lambdas -> instancias de runnable o callable
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        
        executor.shutdown();
	}

}
