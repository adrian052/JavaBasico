import java.util.Random;
public class Polinomio {
	private Vertice[] z;
	
	public Polinomio(int tama�o){
		int aux1,aux2;
		
		Random rnd= new Random(System.nanoTime());
		z= new Vertice[tama�o];
		for(int i=0;i<tama�o;i++){
			aux1 = rnd.nextInt(10);
			aux2 =rnd.nextInt(10);
			z[i]= new Vertice(aux1,aux2);
		}	
	}
	
	
	public void Mostrar(int i){
		System.out.println("El valor de la posision i: "+i+" es X: "+z[i].getX()+" Y: "+z[i].getY());
	}
	
	
}
