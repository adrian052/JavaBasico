package Vendedores2;
import java.util.Random;
public class Empleado {
	Random rnd= new Random(System.nanoTime());
	private String nombre;
	private int edad,dni;
	private int[]ventas=new int[6];
	//contructor
	Empleado(String nombre,int dni){
		this.nombre=nombre;
		this.dni=dni;
		edad=rnd.nextInt(45)+18;	
		for(int i=0;i<5;i++){
			ventas[i]=rnd.nextInt(50000)+50000;
		}
		
		}
	
	//geters and seters
	
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
	public int getVentas(int i){
		return ventas[i];
	}
	
	
	
}
