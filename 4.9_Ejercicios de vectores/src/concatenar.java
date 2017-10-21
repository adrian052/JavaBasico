import java.util.Scanner;
public class concatenar {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String c1;
		String c2;
		
		System.out.println("Agrega el final de la frase");		
		c1="La vida es: ";
		System.out.println(c1);		
		c2=S.nextLine();
		System.out.println(c1+c2);
		

	}

}
