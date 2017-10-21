import java.util.Scanner;

public class between {
	public static void main(String[]arg){
		
			int a,b,c;
		Scanner S= new Scanner(System.in);
		
		System.out.println("Escribe primer numero: ");
		a= S.nextInt();
		
		do{
			System.out.println("Escribe un numero mayor: ");
			b= S.nextInt();
		}while(a>=b);
		
		for(c=a+1;c<b;c++){
			System.out.println(c+" ");
		}
		
		
		
		
	}

}
