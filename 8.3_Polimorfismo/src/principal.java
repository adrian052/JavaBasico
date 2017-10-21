import java.util.Scanner;
import java.util.Vector;

public class principal {
	
	public static void main(String[] args){
		Vehiculo v = null;
		Scanner S = new Scanner(System.in);
		int opcion;
		
		System.out.println("Elije una opción: ");
		opcion= S.nextInt();
		
		switch(opcion){
			case 1:
				v= new coche(100,4,"rojo");
				break;
			case 2:
				v= new moto("verde",100);
				break;
				
		}
		
		System.out.println("la velocidad es: "+v.getVelocidad());
		v.acelera();
		System.out.println("la velocidad es: "+v.getVelocidad());
		
	}
}
