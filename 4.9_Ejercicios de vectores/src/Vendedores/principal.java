package Vendedores;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		//declaracion de variables
		Compañia Honda=new Compañia();
		Scanner S = new Scanner(System.in);
		int h=0;
		//creacion de vendedores
		Honda.nuevoVendedor("Adrian","Lopez", 2345,12);
		Honda.nuevoVendedor("Jorge", "Ibarra", 56789,15);
		Honda.nuevoVendedor("Damian","Hernandez",1234,9);
		Honda.nuevoVendedor("Antonio","Lopez",5643,89);
		Honda.nuevoVendedor("Pedro","Lopez",5623443,56);
		Honda.nuevoVendedor("Juan","Lopez",564893,45);
		Honda.nuevoVendedor("Jesus","Lopez",563243,2);
		Honda.nuevoVendedor("Rubén","Lopez",563243,12);
		Honda.nuevoVendedor("Dario","Lopez",566543,67);
		Honda.nuevoVendedor("Fransisco","Lopez",5643,82);
		Honda.nuevoVendedor("Leo","Lopez",56343,346);
		Honda.nuevoVendedor("Sandro","Lopez",5643,123);
		Honda.nuevoVendedor("Ana","Lopez",5643463,56);
		Honda.nuevoVendedor("Laura","Lopez",564643,3);
		Honda.nuevoVendedor("Andrea","Lopez",564245,34);
		
		
		//codigo de switch		
		System.out.println("1.-Ventas de un vendedor. ");
		System.out.println("2.-Ventas totales. ");
		System.out.println("3.-Dos mayores Vendedores. ");
		h=S.nextInt();

		switch(h){
			case 1:
		
		System.out.println("Escribe el dni");
		int x=S.nextInt();
		int venta=Honda.buscarPersona(x);
		String name=Honda.buscarNombre(x);
		System.out.println("El vendendedor "+name);
		System.out.println(venta+" Dolares en ventas");
		System.out.println();
		
		break;
		
			case 2:
		
		int y =Honda.ventasTotales();
		System.out.println(y+" Dolares en ventas totales.");
		System.out.println();
		break;
			case 3:
		
		Honda.mejoresVendedores();
		break;
		default:System.out.println("Error AUtodestruccion PUUUUMM");
		}
	}

}
