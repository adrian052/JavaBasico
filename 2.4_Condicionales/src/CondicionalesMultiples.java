import java.util.Scanner;

public class CondicionalesMultiples {
	public static void main(String[] args) {
		int x;
		Scanner s = new Scanner (System.in);
		
		System.out.print("Escribe un numero:");
		
		x= s.nextInt();// "&&" es para decir "y"por el contrario "||" es decir "o"
		if(x>0 && x < 10 ){
			System.out.println("está en el rango de 0 a 10");
		}
		else{
			System.out.println("el numero no se encuentra en el rango de 0 a 10");
			
		}

	}

}
