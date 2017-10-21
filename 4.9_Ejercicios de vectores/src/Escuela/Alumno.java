package Escuela;

import java.util.Random;

public class Alumno {
	Random rnd= new Random(System.nanoTime());
	
	private String nombre;
	private int edad,dni;
	private int[][]calificaciones=new int[3][7];

	
	
	//contructor
	
		public Alumno(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
		edad=(rnd.nextInt(7)+12);
		
		for(int i=0;i<calificaciones.length;i++){
			for(int j=0;j<calificaciones[0].length;j++){
				calificaciones[i][j]=(rnd.nextInt(6)+5);
			}
		}
	}
		
		

	//geters and seters.
		
	public int getCalificacion(int i,int j){
		return calificaciones[i][j];
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
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

	




	
}
