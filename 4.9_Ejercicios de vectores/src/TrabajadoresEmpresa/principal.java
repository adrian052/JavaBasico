package TrabajadoresEmpresa;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		Scanner S =new Scanner(System.in);
		Empresa Chevron= new Empresa();
		
		Chevron.nuevoTrabajador("Adrián",1234);
		Chevron.nuevoTrabajador("Juan",2345);
		Chevron.nuevoTrabajador("Fernando",3456);
		Chevron.nuevoTrabajador("Roberto",4567);
		Chevron.nuevoTrabajador("Joaquin",5678);
		Chevron.nuevoTrabajador("Emilio",6789);
		Chevron.nuevoTrabajador("Sandro",7890);
		Chevron.nuevoTrabajador("Alejanro",5987);
		Chevron.nuevoTrabajador("Andrés",9876);
		Chevron.nuevoTrabajador("Ricardo",8765);
		Chevron.nuevoTrabajador("Luis",7654);
		Chevron.nuevoTrabajador("Ramón",6543);
		Chevron.nuevoTrabajador("Reginaldo",5432);
		Chevron.nuevoTrabajador("Rigoberto",4321);
		Chevron.nuevoTrabajador("Saulo",2356);
		Chevron.nuevoTrabajador("Damián",9740);
		Chevron.nuevoTrabajador("Leonardo",48484);
		Chevron.nuevoTrabajador("Sebastian",9643);
		Chevron.nuevoTrabajador("Franscisco",134780);
		Chevron.nuevoTrabajador("Bartolo",76543);
		Chevron.nuevoTrabajador("Melquiadez",1928);
		
		
		System.out.println("1.-Leer los datos y pagos de trabajador: ");
		System.out.println("2.-Ver la hora de salida de trabajador: ");
		int s=S.nextInt();
		
		
		switch(s){
			case 1: Chevron.mostrarDatos();
				break;
			case 2: Chevron.mostrarHoraSalida();
				break;
		}
		

	}

}
