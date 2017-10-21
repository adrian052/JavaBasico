package Almacenar;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		Personas p = new Personas();
		Scanner S =new Scanner(System.in);
		
		
		p.nuevaPersona("Adrian","Ibarra",18,98763);
		p.nuevaPersona("Jorge","Hernandez",23,712457);
		p.nuevaPersona("Ana","Lopez",41,54632);
		p.nuevaPersona("Roberto","Jimenez",19,63532);
		p.nuevaPersona("Maria","Barboza",25,452398);
		p.nuevaPersona("Juan","Gonzalez",30,239845);
		p.nuevaPersona("Laura","Ibarra",15,245608);
		p.nuevaPersona("Panfilo","Gomez",34,78974);
		p.nuevaPersona("Josefina","Vazquez",78,76643);
		p.nuevaPersona("Jesus","Fernandez",23,2354681);
		p.nuevaPersona("Andres","Iniesta",67,76542);
		p.nuevaPersona("Leopoldo","Ramirez",89,9384);
		p.nuevaPersona("Roque","Jimenez",69,12343);
		p.nuevaPersona("Fernando","Lopez",12,43546);
		p.nuevaPersona("Miriam","Escoboza",17,34534);
		p.nuevaPersona("Xavier","Hernandez",56,76867);
		p.nuevaPersona("Karla","Davalos",65,96774);
		p.nuevaPersona("Sebastian","Gonzalez",23,575438);
		p.nuevaPersona("Quina","Robles",76,239874);
		p.nuevaPersona("Heriberto","Guzman",15,234562);
		
		System.out.println("Escribe el dni: ");
		int edad = p.buscaPersona(S.nextInt());
		if (edad!=-1){
			System.out.println("la edad es: "+edad);
		}else{
			System.out.println("No se encontró el DNI");
		}
		
		
	}

}
