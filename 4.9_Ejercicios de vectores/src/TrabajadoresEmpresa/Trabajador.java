package TrabajadoresEmpresa;

import java.util.Random;

public class Trabajador {
	private String nombre;
	private int salario,dni;
	private final static int entrada = 420;
	private int[] salida=new int[5];
	
	Random rdn = new Random(System.nanoTime());
	
	//constructor
	public Trabajador(String nombre,int dni){
		this.nombre=nombre;
		this.dni=dni;
		salario= (rdn.nextInt(10)+9);
		
		for(int i =0;i<5;i++){
			salida[i]= (rdn.nextInt(180)+840);
		}
	}
	
	
	
	//get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getSalida(int i) {
		int s=salida[i];
		return s;
	}

	public void setSalida(int[] salida) {
		this.salida = salida;
	}

	public static int getEntrada() {
		return entrada;
	}

	

	
	
	
	
	
	
	
}
