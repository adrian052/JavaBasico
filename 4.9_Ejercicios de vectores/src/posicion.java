import java.util.Scanner;
public class posicion {
	public static void main(String[] args) {
		String cad1,cad2;
		Scanner S = new Scanner(System.in);
		boolean find =false;
		
		System.out.println("Escribe la primera cadena de caractéres");
		cad1=S.nextLine();
		
		System.out.println("Escribe la segunda cadena de caractéres");
		cad2=S.nextLine();
		
		for(int i =0;i<cad1.length();i++){
			for(int j=0;j<cad2.length()&&!find;j++){
		
				if(cad1.charAt(i)==cad2.charAt(j)){
					find=true;
					System.out.println("el primer caracter que coincide es: "+cad1.charAt(i));
				}else{
					System.out.println("No existe coincidencia");
				}
				}
				
			}					

		}
		
		
		
		
	}


