package ar.com.unpaz.servicios;

public class Hilo2 extends Thread{
	char letra;
	public Hilo2(char letra) {
		this.letra = letra;
	}
	
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(this.letra);
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
