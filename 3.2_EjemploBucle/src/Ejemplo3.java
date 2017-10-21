import java.util.Scanner;
public class Ejemplo3 {
	public static void main(String[]arg){
		
		Scanner w= new Scanner(System.in);
		int	a,b,i,c;
		System.out.println("Introduce el numero menor: ");
		a=w.nextInt();
		System.out.println("Introduce el numero mayor: ");
		b=w.nextInt();
		i=a;
		c=0;
		while(i < b){
			c+=i;
			i++;
			
		}
		
		System.out.println("El valor de la suma es: "+c);
		
	}
}
