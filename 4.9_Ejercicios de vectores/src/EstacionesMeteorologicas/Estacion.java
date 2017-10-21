package EstacionesMeteorologicas;



public class Estacion {
	
	private String Nombre;
	private int Enero,Febrero,Marzo,Abril,Mayo,Junio,Julio,Agosto,Septiembre,Octubre,Noviembre,Diciembre;
	private double Promedio;
	
	public double getPromedio() {
		return Promedio;
	}

	public void setPromedio(double promedio) {
		Promedio = promedio;
	}

	public int getEnero() {
		return Enero;
	}

	public void setEnero(int enero) {
		Enero = enero;
	}

	public int getFebrero() {
		return Febrero;
	}

	public void setFebrero(int febrero) {
		Febrero = febrero;
	}

	public int getMarzo() {
		return Marzo;
	}

	public void setMarzo(int marzo) {
		Marzo = marzo;
	}

	public int getAbril() {
		return Abril;
	}

	public void setAbril(int abril) {
		Abril = abril;
	}

	public int getMayo() {
		return Mayo;
	}

	public void setMayo(int mayo) {
		Mayo = mayo;
	}

	public int getJunio() {
		return Junio;
	}

	public void setJunio(int junio) {
		Junio = junio;
	}

	public int getJulio() {
		return Julio;
	}

	public void setJulio(int julio) {
		Julio = julio;
	}

	public int getAgosto() {
		return Agosto;
	}

	public void setAgosto(int agosto) {
		Agosto = agosto;
	}

	public int getSeptiembre() {
		return Septiembre;
	}

	public void setSeptiembre(int septiembre) {
		Septiembre = septiembre;
	}

	public int getOctubre() {
		return Octubre;
	}

	public void setOctubre(int octubre) {
		Octubre = octubre;
	}

	public int getNoviembre() {
		return Noviembre;
	}

	public void setNoviembre(int noviembre) {
		Noviembre = noviembre;
	}

	public int getDiciembre() {
		return Diciembre;
	}

	public void setDiciembre(int diciembre) {
		Diciembre = diciembre;
	}
	 
	
	public Estacion(String nombre) {
		Nombre = nombre;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	
}
