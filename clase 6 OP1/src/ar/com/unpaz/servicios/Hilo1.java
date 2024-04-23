package ar.com.unpaz.servicios;

public class Hilo1 extends Thread{
	char letra;
	public Hilo1(char letra) {
		this.letra = letra;
	}
	
	public void run() {
		for(int i = 0; i < 3; i++) {
			try {
				System.out.println(this.letra);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
