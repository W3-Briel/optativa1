package services;

public class SepararLista {
	public int[] lista;
	
	public int[] parte1;
	public int[] parte2;
	
	public SepararLista(int[] lista) {
		this.lista = lista;
		
		this.parte1 = new int[Math.round(this.lista.length/2)];
		this.parte2 = new int[this.lista.length - Math.round(this.lista.length/2)];
		
		System.arraycopy(this.lista, 0, this.parte1, 0, Math.round(this.lista.length/2));
		System.arraycopy(this.lista, Math.round(this.lista.length/2), this.parte2, 0, this.lista.length - Math.round(this.lista.length/2));
	}
	
	public int[] getParte1() {
		return parte1;
	}
	public int[] getParte2() {
		return parte2;
	}
}
