import java.util.Scanner;
public class Ejemplo2 {
	public static void main(String[]arg){
		
		int a,b;
		Scanner J=new Scanner(System.in);
		
		System.out.println("Introduce el numero menor: ");
		a=J.nextInt();
		System.out.println("Introduce el numero mayor: ");
		b=J.nextInt();
		//En los bucles for se puede declarar las variables entre los parentesis
		for(int c=a;c<b;c++){
			System.out.print(c+" ");
					}		
	}
}
