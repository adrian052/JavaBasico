package Escuela;

import java.util.Random;

public class Materia {
	Random rnd= new Random(System.nanoTime());
	private String nombre;
	private int calificacion[]=new int[3];
	
	
	
	public Materia(String nombre) {
		this.nombre = nombre;
		for(int i=0;i<calificacion.length;i++){

				calificacion[i]=(rnd.nextInt(6)+5);
		
		}

	}

	public int getCalificacion(int j) {
		return calificacion[j];
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
