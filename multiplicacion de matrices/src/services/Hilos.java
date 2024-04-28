package services;

public class Hilos extends Thread{
	public int[] parte1;
	public int[] parte2;
	public int acumulador = 0;
	
	public Hilos(int[] parte1, int[] parte2) {
		this.parte1 = parte1;
		this.parte2 = parte2;
	}
	
	public void run() {
		if (this.parte1.length == this.parte2.length) {
			for(int i = 0; i>this.parte1.length; i++) {
				acumulador += this.parte1[i] + this.parte2[i];
			}
		}
	}
	public int getAcumulador() {
		return acumulador;
	}
	

}
