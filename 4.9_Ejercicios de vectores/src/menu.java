import java.util.Scanner;
public class menu {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		String c1,c2,c3;
		int menu=0;

		
		System.out.println("Escribe la primera cadena");
		c1=S.nextLine();
		System.out.println("Escribe la segunda cadena");
		c2=S.nextLine();
		
		
		
		System.out.println("Elige una opcion: ");
		System.out.println("1.- Comparación cadenas");
		System.out.println("2.- Copia de la primera sobre la segunda");
		System.out.println("3.- Concatenación de ambas cadenas");
		System.out.println("4.- Cálculo de la longitud de las cadenas");
		menu=S.nextInt();
		
		
		switch(menu){
		case 1:{		if(c1.equals(c2)){
			System.out.println("Son iguales los strings");
		}
		else{
			System.out.println("Los strings no son iguales");
		}
		}break;
		
		case 2:{
			c2=c1;
			System.out.println("Se ha copiado y la segunda cadena es: "+c2);	
		}break;
		
		case 3:{
			 System.out.println(c1+" "+c2);
		}break;
		case 4:{
			System.out.println("La longitud de la primera cadena es: "+c1.length());
			System.out.println("La longitud de la primera cadena es: "+c2.length());
		}break;
		default:{
			System.out.println("Es la opcion por defecto");
		}
		
		
		
		}
		


	}

}
