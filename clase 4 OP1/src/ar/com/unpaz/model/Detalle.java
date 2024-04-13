package ar.com.unpaz.model;

public class Detalle {
	public int id;
	public int venta;
	public int producto;
	public int cantidad;
	public int precio;
	
	public String toString() {
		return String.format("[ID: %d, Venta: %d, Producto: %d, Cantidad: %d, Precio: %d]",
								this.id,this.venta,this.producto,this.cantidad,this.precio);
	}

	public Detalle(int id, int venta, int producto, int cantidad, int precio) {
		this.id = id;
		this.venta = venta;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precio = precio;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getVenta() {
		return venta;
	}


	public void setVenta(int venta) {
		this.venta = venta;
	}


	public int getProducto() {
		return producto;
	}


	public void setProducto(int producto) {
		this.producto = producto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
