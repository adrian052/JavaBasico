import java.util.Scanner;
public class Palindromo {
	public static void main(String[] args) {
		String palabra;
		Scanner S = new Scanner(System.in);
		boolean diferente = false;
		
		System.out.println("Escribe la palabra a verificar");
		palabra =S.nextLine();
		
		
	
		for(int i = 0,j=palabra.length()-1; i<palabra.length();i++,j--){
			if(palabra.charAt(i)!=palabra.charAt(j)){
				diferente=true;
			}
		}

		if (diferente){
			System.out.println("NO es un palindromo");
		}else{
			System.out.println("Es un palindromo");
		}

}
}