import java.util.Scanner;

public class DoWhile {
		public static void main(String[]arg){
		int a,b;
		Scanner S= new Scanner(System.in);
		
		System.out.println("Introduce el numero menor");
		a=S.nextInt();
		System.out.println("Introduce el numero mayor");
		b= S.nextInt();
		//Un bucle do while siempre se ejecutará al menos una vez 	
		do{
			
			System.out.println(a+" ");
			a++;
		}while(a<b);
			
			
			
		}
}
