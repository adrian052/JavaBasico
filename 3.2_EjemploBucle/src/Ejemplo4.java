import java.util.Scanner;

public class Ejemplo4 {
public static void main(String[]arg){
		
		Scanner w= new Scanner(System.in);
		int	a,b,c;
		System.out.println("Introduce el numero menor: ");
		a=w.nextInt();
		System.out.println("Introduce el numero mayor: ");
		b=w.nextInt();

		c=0;
		for(int i=a;i<b;i++){
			c+=i;
		}
		
		System.out.println("El valor de la suma es: "+c);
}
}
