import java.util.Scanner;
public class ParImpar {
	public static void main(String []arg){
		
	
	int a;
	Scanner S= new Scanner(System.in);
	
	do{
		System.out.println("Escribe un numero entero positivo: ");
		a=S.nextInt();
	}while(a<0);
	
	
	if(a%2!=0){
		System.out.println("El numero es impar");
	}
	else{
		System.out.println("El numero es par");
	}
	
	
	
}
}