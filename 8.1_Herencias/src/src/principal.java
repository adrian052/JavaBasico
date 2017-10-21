package src;

public class principal {
	
	public static void main(String[] args){
		coche c = new coche(100, 4,"Azul");
		moto m = new moto ("Azul",200);
		
		System.out.println("La velocidad del coche es de: "+c.getVelocidad());
		System.out.println("La velocidad del moto es de: "+m.getVelocidad());
		
		c.acelera();
		m.acelera();
		
		System.out.println("La velocidad del coche es de: "+c.getVelocidad());
		System.out.println("La velocidad del moto es de: "+m.getVelocidad());
	}
}
