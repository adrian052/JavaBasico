
public class persona {
	private String nombre;
	private int edad,fuerza,vida;
	
	
	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	// get and set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	//constructor
	persona(){
		nombre="";
		edad=0;
	}
	
	void comer(){
		System.out.println("mmm que rico");
	}
	
	
	
}
