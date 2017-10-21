package EstacionesMeteorologicas;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Control Control= new Control();
		Scanner S = new Scanner(System.in);
		//estaciones
		Control.nuevaEstacion("Teul");
		Control.nuevaEstacion("Zacatecas");
		Control.nuevaEstacion("Mexico Df.");
		Control.nuevaEstacion("Culiacan");
		Control.nuevaEstacion("Los Angeles");
		Control.nuevaEstacion("El cairo");
		Control.nuevaEstacion("Estambul");
		Control.nuevaEstacion("Roma");
		Control.nuevaEstacion("Berlin");
		Control.nuevaEstacion("Roterdam");
		Control.nuevaEstacion("Nueva York");
		Control.nuevaEstacion("Nueva Jersey");
		Control.nuevaEstacion("Tokio");
		Control.nuevaEstacion("San Salvador");
		Control.nuevaEstacion("Bogota");
		Control.nuevaEstacion("Guadalajara");
		Control.nuevaEstacion("Medellin");
		Control.nuevaEstacion("Antioquia");
		Control.nuevaEstacion("Panamá");
		Control.nuevaEstacion("Los Cabos");
		Control.nuevaEstacion("Monterrey");
		Control.nuevaEstacion("Chicago");
		Control.nuevaEstacion("Portland");
		Control.nuevaEstacion("Boston");
		Control.nuevaEstacion("Georgia");
		Control.nuevaEstacion("Tegucijalpa");
		Control.nuevaEstacion("Lima");
		Control.nuevaEstacion("Buenos Aires");
		Control.nuevaEstacion("Dublin");
		Control.nuevaEstacion("Shangai");
		Control.nuevaEstacion("Denver");
		Control.nuevaEstacion("Florida");
		
		//aplicacion
		
		Control.llenarDatos();
		
		

		
	
		System.out.println("Escribe la estacion: ");
		Control.imprimirMensual(S.nextLine());
		
		
		
		
		Control.MasLluvia();
		Control.MenosLluvia();
		
	
	}	
	}

