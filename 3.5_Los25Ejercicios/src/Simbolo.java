import java.util.Scanner;
public class Simbolo {
	public static void main(String[]arg){
		
		int a,b,c;

		Scanner j=new Scanner(System.in);
		
		System.out.println("Introduce el primer numero de la operacion: ");
		a= j.nextInt();
		System.out.println("Introduce el segundo numero de la operacion: ");
		b= j.nextInt();
		

		do{
			System.out.println("1.-Sumar");
			System.out.println("2.-restar");		
			System.out.println("3.-multiplicar");
			System.out.println("4.-dividir");
			System.out.println("Elije un numero:");
			c=j.nextInt();
		}while(c>4 || c<1);
			

			
		switch(c){
		case 1:			System.out.println(a+b);
			break;
		case 2:			System.out.println(a-b);
			break;
		case 3:			System.out.println(a*b);
			break;
		case 4:			System.out.println(a/b);
			break;
		
		}
		
		}
	}

