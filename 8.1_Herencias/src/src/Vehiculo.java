package src;
public class Vehiculo {
	private int cv, ruedas;
	private int velocidad;
	private String color;
	private int cristales;
	
	//constructor
	public Vehiculo(String color, int cv,int ruedas){
		this.color=color;
		this.cv=cv;
		this.ruedas =ruedas;
		
		
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
			velocidad += cv/20;
		}
			
		public void frena(){
			velocidad = 0;
		}
}
