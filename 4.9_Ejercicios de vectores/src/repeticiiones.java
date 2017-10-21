import java.util.Scanner;

public class repeticiiones {

	public static void main(String[] args) {
		String cadena;
		int aux;
		
		Scanner S = new Scanner (System.in);
		
		System.out.println("Escribe la cadena a invertir");
		cadena= S.nextLine();
		
		for(int i = cadena.length();i>0;i--){
			System.out.print(cadena.charAt(i-1));
		}

	}

}
