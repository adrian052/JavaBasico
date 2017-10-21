
public class Guerrero extends personaje {
	public int armadura;
	//constructor
	public Guerrero(String nombre, int hp, int fuerza, int defensa,int armadura){
	super(nombre,hp,fuerza,defensa);
		
	this.armadura= armadura;
	}
	
	//Sobreescritura
	
	public int lucha(){
		return fuerza *2;
	}
	
	public void daño(int puntos){
		int aux = puntos-armadura;
		
		if (aux<0){
			aux=0;
		}
		hp-=aux;
		}

	
}
