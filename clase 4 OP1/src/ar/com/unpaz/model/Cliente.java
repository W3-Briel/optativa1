package ar.com.unpaz.model;
//cliente.txt > idINT nombreSTRING apellidoSTRING telefonoINT
public class Cliente {
	public int id;
	public String nombre;
	public String apellido;
	public int telefono;

	public String toString() {
		return String.format("[ID: %d, Nombre: %s, Apellido: %s, Telefono: %d]",
								this.id,this.nombre,this.apellido,this.telefono);
	}

	public Cliente(int id, String nombre, String apellido, int telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
