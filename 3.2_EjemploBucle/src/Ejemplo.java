import java.util.Scanner;

public class Ejemplo {
	public static void main(String[]arg){
		
		int a,b,i;
	Scanner S= new Scanner(System.in);
		
		System.out.println("Introduce el numero menor: ");
		a= S.nextInt();
		System.out.println("Introduce el numero mayor: ");
		b=S.nextInt();
		i= a;
		while(i<b){
			System.out.print(i+", ");
			i++;//"i++"="i+=1"
		}
		
	}
}
