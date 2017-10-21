package Ficheros;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
public class metodosSueltos {
	Scanner S = new Scanner(System.in);

	public void nuevoFichero(){
		System.out.println("Escribe el nombre del archivo.");
		String y=S.nextLine();
		System.out.println("Escribe el texto: ");
		String z=S.nextLine();
		try{
			FileWriter fichero= new FileWriter(y);
			fichero.write(z);
			fichero.close();
		}catch(Exception ex){ex.printStackTrace();}
	}
	
	public void leerFichero(){
		System.out.println("Escribe el nombre del archivo: ");
		String y =S.nextLine();
		try{
			FileReader lector= new FileReader(y);
			BufferedReader BR= new BufferedReader(lector);
			System.out.println(BR.readLine());
		}catch(Exception ex){System.out.println("Error");}
	}
	
	public void agregarTextoAlfinal(){
		System.out.println("Escribe el nombre del archivo: ");
		String y=S.nextLine();
		System.out.println("Escribe el texto que deseas agregar: ");
		String z=S.nextLine();
        try {
            FileWriter fstream = new FileWriter(y, true);
            BufferedWriter out = new BufferedWriter(fstream);
                out.write(" "+z);
            out.close();
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
 }
	
}
