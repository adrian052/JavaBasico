import java.util.Scanner;

public class MayorQueOtro {
	public static void main(String[]arg){
		int a,b;
		
		Scanner S= new Scanner(System.in);
		
		System.out.println("Introduce el numero menor: ");
		a= S.nextInt();
		
		do{
			System.out.println("Escribe un numero mayor que el anterior");
			b= S.nextInt();
			
		}while(b<=a);
		
		System.out.println("Correcto");
	}
}
