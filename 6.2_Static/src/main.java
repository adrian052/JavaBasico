
public class main {

	public static void main(String[] args) {
		
		triangulo t1 = new triangulo(10,"t1");
		triangulo t2= new triangulo (20,"t2");
		
		System.out.println("El valor del triangulo t1 es: "+t1.getArea());
		System.out.println("El valor del triangulo t2 es: "+t2.getArea());
		System.out.println("El nombre del triangulo t1 es: "+t2.getNOmbre());
	}

}
