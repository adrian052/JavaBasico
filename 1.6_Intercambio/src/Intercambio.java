import java.util.Scanner;
public class Intercambio {
	
	public static void main (String []arg){
		
		int a,b,c;
		
		Scanner S = new Scanner(System.in);
				
		System.out.println("introduce el valor para el atributo a:");
		
		a= S.nextInt();
		
		System.out.println("introduce el valor para el atributo b:");
		
		b= S.nextInt();
		
		c=a;
		a=b;
		b=c;
				
		
		System.out.println("el valor de a es: " +a+" el valor de b es: "+b);
		
		
		
		
		
	}

}
