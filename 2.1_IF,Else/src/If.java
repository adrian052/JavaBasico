// "==" "<"">""<="">=""¡="
// Numero Par
import java.util.Scanner;
public class If {
	public static void main (String[]arg){
		
		double x;
		Scanner S= new Scanner(System.in);
		System.out.println("Escribe un numero par saber si es par: ");
		
		x= S.nextDouble();
		
		if(x%2==0){
			System.out.println("El numero: "+x+ "  es par");
			
		}
		else{
			System.out.println("el numero: "+x+ "  es impar");
		}
		
		
		
		

		}
	}

