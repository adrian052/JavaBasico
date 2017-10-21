import java.util.Scanner;

public class Boleanas {
public static void main (String[]arg){
	double temp;
	Scanner S= new Scanner (System.in);
	
	System.out.println("Escribe una temperatura");
	
	temp= S.nextDouble();
	
	if (temp >30){
		System.out.println("Hace Calor");
		
	}
	else if(temp >20){
		System.out.println("Temperatura Normal"); 	
}
	else{
		System.out.println("Hace Frio");
	}
	
	System.out.println("Estoy Afuera");
}
}

