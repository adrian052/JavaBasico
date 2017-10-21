package Ficheros;
import java.io.*;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
	Scanner S = new Scanner(System.in);	
	metodosSueltos m= new metodosSueltos();
	int x=1;
	do{

	System.out.println("1.-Crear un fichero");
	System.out.println("2.-Leer Fichero");
	System.out.println("3.-Modificar Fichero");	
	System.out.println("0.-Salir");
	String y,z;
	x=S.nextInt();
	switch(x){
	case 1:
		m.nuevoFichero();
		System.out.println("Archivo Guardado.");
		break;
	case 2:	
		m.leerFichero();
		break;
	case 3:

		m.agregarTextoAlfinal();
        System.out.print("Archivo Modificado");
		break;		
	}
	}while(x>0);
	
	
	
	
	
	

	
	}
}
