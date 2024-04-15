package ar.com.unpaz.model;


//venta.txt > idINT FechaSTRING ClienteINT(id) TotalINT
public class Venta {
	public int id;
	public String fecha;
	public int cliente;
	public int total;
	
	public String toString() {
		return String.format("{ID: %d, Fecha: %s, Cliente: %d, Total: $%d}",
								this.id,this.fecha,this.cliente,this.total);
	}
	
	public Venta(int id, String fecha, int cliente, int total) {
		this.id = id;
		this.fecha = fecha;
		this.cliente = cliente;
		this.total = total;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getCliente() {
		return cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
