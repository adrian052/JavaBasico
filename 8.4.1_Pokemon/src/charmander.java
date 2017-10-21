
public class charmander extends pokemon{
	public charmander() {
		super("Charmander");
	}

	//metodos
	public int ataque2() {
		int daño = 0;
		if(pm2 > 0){
			daño = ataque * 2;
		}
		
		return daño;
	}
}
