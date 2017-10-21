import java.util.Scanner;
public class contar {

	public static void main(String[] args) {
		String cad,c;
		Scanner S = new Scanner(System.in);
		int cont=0;
		
		System.out.println("Escribe la cadena:");
		cad=S.nextLine();
		
		System.out.println("Escribe el caractér a contar: ");
		c=S.nextLine();
		
	for(int i=0;i<cad.length();i++){
		if(cad.charAt(i)==c.charAt(0)){
			cont++;

		}
	}			System.out.println(cont+" veces se repite el caractér");

	}

}
