
public class personaje {
	private String nombre;
	protected int hp, fuerza, defensa; //hp: puntos de salud
	
	//Constructor:
	public personaje(String nombre, int hp, int fuerza, int defensa){
		this.nombre = nombre;
		this.hp = hp;
		this.fuerza = fuerza;
		this.defensa = defensa;
	}

	//Getters:
	public String getNombre() {
		return nombre;
	}
	public int getHp() {
		return hp;
	}

	//Metodos:
	//Cuantos puntos de da�o le puedo quitarle a otro personaje
	public final int lucha(int x){
		return x;
	}
	
	public int lucha(){
		int aux = fuerza;
		
		if(aux < 0){
			aux = 0;
		}
		return aux;
	}
	
	//Cuantos puntos de da�o me van a quitar a mi
	public void  da�o(int puntos){
		hp -= puntos;
	}
}








