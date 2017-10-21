import java.util.Scanner;
public class Media {
	public static void main(String[] args) {
		double a,b,c;
		Scanner S= new Scanner (System.in);
		c=0;
		for(b=10;b>0;b--){
			System.out.println("Introduce un numero:");
			a= S.nextDouble();
			c+=a;
			
		}
		

		System.out.println("la media aritmetica es: "+c/10);
	}

}
