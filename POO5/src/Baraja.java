
public class Baraja {
	// declaraciones
	private Carta cartas[];
	private  int posSiguienteCarta;
	
	public static final int NUM_CARTAS= 40;

	public Baraja(){
		this.cartas= new Carta[NUM_CARTAS];
		this.posSiguienteCarta = 0;
	}
	

	
	
	//get and set
	public Carta[] getCartas() {
		return cartas;
	}

	public void setCartas(Carta[] cartas) {
		this.cartas = cartas;
	}

	public int getPosSiguienteCarta() {
		return posSiguienteCarta;
	}

	public void setPosSiguienteCarta(int posSiguienteCarta) {
		this.posSiguienteCarta = posSiguienteCarta;
	}
	
	//metodos	
	
	
	private void crearBaraja(){
		String[]Palos=Carta.PALOS;
		
		
		for(int i= 0; i<Palos.length;i++){
			for(int j = 0; j<Carta.LIMITE_CARTA_PALO;j++){
				if (!(j==7||j==8)){
					if(j>=9){
						cartas[(i*(Carta.LIMITE_CARTA_PALO-2)(j-2))]=new Carta(j+1,Palos[i]);
					}else{
						cartas[(i*(Carta.LIMITE_CARTA_PALO-2)+j)]=new Carta(j+1,Palos[i]);
					}
					
				}
			}
		}
		
		
		
	}
	
	 
	public barajar(){
		
	}
	
	public siguienteCarta(){
		
	}
	
	public cartasDisponibles(){
		
	}
	
	public darCartas(){
		
	}
	
	public void cartasMonton(){
		
	}
	
	public void mostrarBaraja(){
		
	}
	
}
