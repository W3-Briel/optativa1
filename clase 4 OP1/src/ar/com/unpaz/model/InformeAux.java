package ar.com.unpaz.model;

import java.util.List;

public class InformeAux {
	public int id;
	public List<Object> ventas;
	public List<Object> clientes;
	
	protected int totalGanancias;
	protected int cantidadVentas;
	protected String nombreVendedor;

	public InformeAux (int id, List<Object> ventas,List<Object> clientes) {
		this.id = id;
		this.ventas = ventas;
		this.clientes = clientes;
	}

	public int getTotalGanancias() {
		return totalGanancias;
	}

	public void setTotalGanancias(int ganancias) {
		this.totalGanancias = ganancias;
	}

	public int getCantidadVentas() {
		return cantidadVentas;
	}

	public void setCantidadVentas(int total) {
		this.cantidadVentas = total;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public List<Object> getClientes() {
		return clientes;
	}
}
