
public class moto extends Vehiculo{
	private boolean repararCadena;
	//constructor
	public moto(String color,int cv){
		super(color,cv,4);
		this.repararCadena=repararCadena;

	}
	//metodos
	public void acelera(){
		velocidad += 20;
	}
	
	
}
