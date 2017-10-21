import java.util.Scanner;
public class Menú {
	public static void main (String[]arg){
	int	a;
	
	Scanner l= new Scanner(System.in);
	
	do{
		System.out.println("1.-Enseñar por pantalla Hola Mundo");
		System.out.println("2.-Enseñar mi Nombre");
		System.out.println("3.-Enseñar Nombre de una canción");
		System.out.println("Introduce una opcion: ");
		System.out.println("4.-Introducir los numeros entre 1 y 5");
		a= l.nextInt();
	}while(a>4 || a<1);
	
	switch (a){
		case 1: System.out.println("Hola Mundo");
		break;
		case 2: System.out.println("Adrián Ibarra González");
		break;
		case 3: System.out.println("El mono de alambre");
		break;
		case 4:
			for(int n=2;n<5;n++){
			System.out.print(n+" ");}
		break;	

	}
	}
}
