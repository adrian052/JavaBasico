
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
	//Cuantos puntos de daño le puedo quitarle a otro personaje
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
	
	//Cuantos puntos de daño me van a quitar a mi
	public void  daño(int puntos){
		hp -= puntos;
	}
}








