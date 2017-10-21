
public class hola {
	public static void main(String[]arg){
		
	guerrero g1= new guerrero();	
	guerrero g2 =new guerrero();
	
	g1.nombre= "Adrián";
	g1.fuerza= 100;
	g1.salud=80;
		
	g2.nombre ="Fernando";
	g2.fuerza=120;
	g2.salud=100;
		
		System.out.println("el nombre de mi guerrero es: "+g1.nombre);
		System.out.println("el nombre de mi guerrero es: "+g2.nombre);
		
	}
}
