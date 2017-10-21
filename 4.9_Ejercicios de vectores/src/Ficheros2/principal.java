package Ficheros2;
import java.util.Scanner;
public class principal {
	public static void main(String[] args) {
		metodos m= new metodos();
		
		Scanner S = new Scanner(System.in);
		System.out.println("Escribe el nombre del archivo a copiar.");
		String x = S.nextLine();
		m.copiarFichero(x);
		

		
	
	
	
	}

}
