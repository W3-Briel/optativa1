package ar.com.unpaz.model;
//producto.txt > idINT NombreSTRING CantidadINT PrecioFLOAT
public class Producto {
	public int id;
	public String nombre;
	public int cantidad;
	public int precio;
	
	public Producto(int id, String nombre, int cantidad, int precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
