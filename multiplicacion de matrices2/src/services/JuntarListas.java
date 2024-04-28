package services;

public class JuntarListas {
	public int[] listas_juntas;
	
	public JuntarListas(int[] lista1,int[] lista2) {
		this.listas_juntas = new int[lista1.length + lista2.length];
		
		System.arraycopy(lista1, 0, this.listas_juntas, 0, lista1.length);
		System.arraycopy(lista2, 0, this.listas_juntas, lista1.length, lista2.length);
	}
	
	public int[] getListasJuntas(){
		System.out.println(this.listas_juntas);
		return this.listas_juntas;
	}
}
