package ar.com.unpaz.model;
//detalle.txt > idINT VentaINT(id) ProductoINT(id) CantidadINT PrecioFLOAT
public class Detalle {
	public int id;
	public int venta;
	public int producto;
	public int cantidad;
	public int precio;
	
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
