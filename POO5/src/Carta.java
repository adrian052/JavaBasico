
public class Carta {

	private int numero;
	private String palo;
	
	public static final String []PALOS ={"espadas","oros", "Copas","bastos"};
	public static final int LIMITE_CARTA_PALO =12;
	

	public Carta(int numero, String palo) {

		this.numero = numero;
		this.palo = palo;
	}
	

	public String toString(){
		return "numero= "+numero+", palo = "+palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public static String[] getPalos() {
		return PALOS;
	}
	
	
	
	
}
