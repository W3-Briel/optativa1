package services;

public class Hilos extends Thread{
	public int[] parte1;
	public int[] parte2;
	public int[] resultado;
	
	public Hilos(int[] parte1, int[] parte2) {
		this.parte1 = parte1;
		this.parte2 = parte2;
		
		this.resultado = new int[parte1.length];
	}
	
	public synchronized void run() {
		if (this.parte1.length == this.parte2.length) {
			for(int i = 0; i<this.parte1.length; i++) {
				this.resultado[i] = this.parte1[i] * this.parte2[i];
			}
		}
		this.notify();
	}
	
	public synchronized int[] getResultado() {
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.resultado;
	}
}
