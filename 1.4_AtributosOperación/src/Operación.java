
public class Operación {
public static void main (String[]arg){
	
	double a, b;
	
	
	a=25;
	b=10;
	a += b; // a +=b es lo mismo que a= a+b
	// para obtener el resto se utiliza el signo %
	// las operaciones en programación van de derecha a izquierda 
	

	System.out.println("el resultado es: " +a);
	
	a%=b;
	
	System.out.println ("el resultado de la resta es: "+a );
}
}
