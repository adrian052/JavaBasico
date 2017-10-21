import java.util.Scanner;

public class comprimir {
	public static void main(String[] args) {
		
		Scanner S = new Scanner(System.in);
		
	String cad1="Hola Bienvenido a Java.";
	System.out.println("Escribe el caractér(es) que quieres quitar a (Hola Bienvenido a Java.)");
	
	String cad2=S.nextLine();

	
	for(int i=0;i<cad1.length();i++){
		for(int j=0;j<cad2.length();j++){
			if(cad1.charAt(i)==cad2.charAt(j)){
			char letra=cad1.charAt(i);
			cad1=cad1.replace(letra, ' ');
 
			}
		}
	}
	System.out.println(cad1);

	}

}
