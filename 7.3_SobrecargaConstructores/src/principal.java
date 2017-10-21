import java.util.Random;

public class principal {

	public static void main(String[] args) {
		
		Random rand = new Random (System.nanoTime());
		int aux1,aux2;
		
		aux1= rand.nextInt(10);
		aux2= rand.nextInt(10);
		
		vertice a = new vertice (5,10);
		
		
		aux1= rand.nextInt(10);
		aux2= rand.nextInt(10);
		
		vertice b = new vertice (aux1,aux2);
		
		aux1= rand.nextInt(10);
		aux2= rand.nextInt(10);
		
		vertice c = new vertice (aux1,aux2);
		
		triangulo t1= new triangulo(a,b,c);
		
		vertice temp = t1.getA();
		
		System.out.println(temp.getX()+" y "+temp.getY());
		
		temp.setX(20);
		temp.setY(32);
		
		System.out.println(a.getX()+" y "+a.getY());
		

	}

}
