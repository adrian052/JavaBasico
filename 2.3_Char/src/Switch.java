
public class Switch {
	public static void main (String[]arg){
		
		int letra;
		letra = 30000;
		
		switch(letra){
			case 1: 
				System.out.println("El valor es 1");
				break;
			case 2: 
				System.out.println("El valor es 2");
				break;
			case 3: 
				System.out.println("El valor es 3");
				break;
			case 4: 
				System.out.println("El valor es 4");	
				break;// se debe poner un break;
			default:
			{System.out.println("el valor que buscas no esta en un case" );}
		}
	}
}
