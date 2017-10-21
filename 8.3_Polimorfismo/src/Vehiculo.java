
public class Vehiculo {
	private int cv, ruedas;
	protected int velocidad;
	private String color;
	private int cristales;
	
	//constructor
	public Vehiculo(String color, int cv,int ruedas){
		this.color=color;
		this.cv=cv;
		this.ruedas =ruedas;
		velocidad =0;
	}
	//Gets
	public int getCv() {
		return cv;
	}
	public int getRuedas() {
		return ruedas;
	}
	public int getVelocidad() {
		return velocidad;
	}
	
	//metodos
		public void acelera(){
			velocidad += 10;
		}
			
		public void frena(){
			velocidad = 0;
		}
}
