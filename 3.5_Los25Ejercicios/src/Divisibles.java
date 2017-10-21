import java.util.Scanner;
public class Divisibles {
	public static void main (String[]arg){
	
	int a,b;
	Scanner S= new Scanner(System.in); 
	
	System.out.println("Escribe el primer numero: ");
	a= S.nextInt();
	System.out.println("Escribe el segundo numero: ");
	b= S.nextInt();
	
	if(a%b==0){
	System.out.println("El primer numero es divisible" );	
		
	}
	else if(b%a==0){
	System.out.println("EL segundo numero es divisible");	
	}else{
		System.out.println("Ningun numero es divisible");		
	}
		
	
	
	}
}
