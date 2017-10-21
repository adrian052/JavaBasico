package Vendedores;

public class Vendedor {
	private String nombre,apellidos;
	private int dni;
	private int venta;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public Vendedor(String nombre, String apellidos, int dni, int venta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.venta = venta;
	}
	public int getVenta() {
		return venta;
	}
	public void setVenta(int venta) {
		this.venta = venta;
	}

	
	
}
