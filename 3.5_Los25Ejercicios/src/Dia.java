import java.util.Scanner;
public class Dia {
	public static void main(String[] args) {
		int a;
		Scanner S= new Scanner(System.in);
		
		do{	
		System.out.println("Escribe un numero del 1 al 7");
		a= S.nextInt();
		
		}while(a<1 || a>7);
	
	
	switch(a){
	case 1: System.out.println("Es lunes ");
	break;
	case 2:	System.out.println("Es martes");
	break;
	case 3:	System.out.println("Es miercoles");
	break;
	case 4: System.out.println("Es jueves");
	break;
	case 5: System.out.println("Es viernes");
	break;
	case 6: System.out.println("Es sabado");
	break;
	case 7: System.out.println("Es domingo");
	break;
		
	
	}
	}

}
