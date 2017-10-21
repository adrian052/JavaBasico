package Almacenar;
public class Persona {

	private String nombre,apellidos;
	private int edad,dni;
	
	
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Persona(String nombre, String apellidos, int edad, int dni) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.dni = dni;
	}

	public int BuscaPersona(int dni){
		return edad;
	}
	
}
