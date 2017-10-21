// Clase Scanner = recoje lo que se escribe por teclado 
//Para ver las instrucciones de Scanner voy al API

import java.util.Scanner;

public class Teclado {
	public static void main (String[] arg){
		String a,b;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Introduce un valor por teclado");
		 a= sc.next();
		 System.out.println("el valor de a es: " +a);
	}
}
