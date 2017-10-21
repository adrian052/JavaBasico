package Escuela;
import java.util.Scanner;
public class prinicpal {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		Instituto UAD = new Instituto();
		UAD.nuevoAlumno("Adrian",1234);
		UAD.nuevoAlumno("Jorge",2345);
		UAD.nuevoAlumno("Juan", 3456);
		UAD.nuevoAlumno("Fernando",4567 );
		UAD.nuevoAlumno("Roberto", 5678);
		UAD.nuevoAlumno("Joaquin", 6789);
		UAD.nuevoAlumno("Damián", 7890);
		UAD.nuevoAlumno("Sebastian",4321 );
		UAD.nuevoAlumno("Bernardo", 5432);
		UAD.nuevoAlumno("Ulises", 6543);
		UAD.nuevoAlumno("Omar", 7654);
		UAD.nuevoAlumno("Roberta", 8765);
		UAD.nuevoAlumno("Maria", 9876);
		UAD.nuevoAlumno("Fernanda", 6421);
		UAD.nuevoAlumno("Juana", 9632);
		UAD.nuevoAlumno("Nora", 2498);
		UAD.nuevoAlumno("Reina", 1309);
		UAD.nuevoAlumno("Laura", 1762);
		UAD.nuevoAlumno("Sandra", 1673);
		UAD.nuevoAlumno("Fatima", 1090);
		UAD.nuevoAlumno("Heriberta", 9341);
		UAD.nuevoAlumno("Silvia", 1276);
		UAD.nuevoAlumno("Rubi", 5490);
		UAD.nuevoAlumno("Erica", 9090);
		
		System.out.println("1.-Calificaciones de un alumno");
		System.out.println("2.-Mayor Nota de materia");
		int x=S.nextInt();
		
		switch(x){
		case 1:
			System.out.println("Introduce el dni: ");
			UAD.notaGlobal(S.nextInt());
			break;
		case 2:
			System.out.println("Introduce la materia: ");
			UAD.mayorNota(1);
			break;
		}
		
		

	}
	

}
