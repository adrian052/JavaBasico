import java.util.Scanner;
public class main {
public static void main(String[]arg){
	int x,j,f;
	String y;
	
	Scanner S = new Scanner(System.in);
	
	System.out.println("Escribe el nombre del peleador: ");
	y = S.nextLine();
	System.out.println("Escribe la edad: ");
	j= S.nextInt();
	System.out.println("Escribe la vida");
	x= S.nextInt();
	System.out.println("Escribe la fuerza");
	f = S.nextInt();
	
	
	persona juanito = new persona();
	juanito.setNombre(y);
	juanito.setEdad(j);
	juanito.setVida(x);
	System.out.println("juanito a comido y dice: ");
	juanito.comer();
	
	System.out.println("Escribe el nombre del peleador: ");
	y = S.nextLine();
	System.out.println("Escribe la edad: ");
	j= S.nextInt();
	System.out.println("Escribe la vida");
	x= S.nextInt();
	System.out.println("Escribe la fuerza");
	f = S.nextInt();
	
	persona jorge = new persona();
	juanito.setNombre(y);
	juanito.setEdad(j);
	juanito.setVida(x);
	System.out.println("juanito a comido y dice: ");
	juanito.comer();
	
	System.out.println("la edad de juanito es de: "+juanito.getEdad());
	
	
	
	
}
}
