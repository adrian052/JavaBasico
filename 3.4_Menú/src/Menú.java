import java.util.Scanner;
public class Men� {
	public static void main (String[]arg){
	int	a;
	
	Scanner l= new Scanner(System.in);
	
	do{
		System.out.println("1.-Ense�ar por pantalla Hola Mundo");
		System.out.println("2.-Ense�ar mi Nombre");
		System.out.println("3.-Ense�ar Nombre de una canci�n");
		System.out.println("Introduce una opcion: ");
		System.out.println("4.-Introducir los numeros entre 1 y 5");
		a= l.nextInt();
	}while(a>4 || a<1);
	
	switch (a){
		case 1: System.out.println("Hola Mundo");
		break;
		case 2: System.out.println("Adri�n Ibarra Gonz�lez");
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
