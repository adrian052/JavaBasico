
public class Cine {
	private Asiento asientos[][];
	private double precio;
	private Pelicula pelicula;
	
	public Cine(int filas, int columnas, double precio, Pelicula pelicula){
		asientos= new Asiento[filas][columnas];
		this.precio= precio;
		this.pelicula= pelicula;
		rellenaButacas();
		
	}

	public Asiento[][] getAsiento() {
		return asientos;
	}

	public void setAsiento(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	private void rellenaButacas(){
		int fila = asientos.length;
		for(int i = 0;i< asientos.length;i++){
			for(int j =0;j< asientos[0].length;j++){
				asientos[i][j] = new Asiento((char)('A'+j),fila, null);
			}
			fila--;
		}
	}
	
	public boolean haySitio(){
		
		boolean haySitio= false;
		
		for(int i = 0;i< asientos.length;i++){
			for(int j =0;j< asientos[0].length;j++){
				if(asientos[i][j].ocupado()){
					haySitio=true;
				}
			}
		}
		return haySitio;
		
	}
	
	public boolean haySitioButaca(int fila,char columna){
		return asientos[asientos.length-fila][columna-'A'].ocupado();
		
	}
	

	
}
