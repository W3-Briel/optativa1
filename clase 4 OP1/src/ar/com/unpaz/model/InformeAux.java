package ar.com.unpaz.model;

import java.util.List;

public class InformeAux {
	public int id;
	public List<Object> ventas;
	
	protected int ganancias;
	protected int totalVentas;
	protected String nombreVendedor;
	
	public InformeAux (int id, List<Object> ventas) {
		this.id = id;
		this.ventas = ventas;
	}

	public int getGanancias() {
		return ganancias;
	}

	public void setGanancias(int ganancias) {
		this.ganancias = ganancias;
	}

	public int getTotalVentas() {
		return totalVentas;
	}

	public void setTotalVentas(int total) {
		this.totalVentas = total;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}
	
}
