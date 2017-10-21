import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
			double a,res;
		
			System.out.println("Introduce tu numero");
			a= S.nextDouble();
			res=a;
			a--;
		while(a>0){
			
			res=res*a;
			a--;
		}

		System.out.println(res);

	}

}
