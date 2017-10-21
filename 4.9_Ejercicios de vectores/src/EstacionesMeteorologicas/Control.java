package EstacionesMeteorologicas;
import java.util.Random;
public class Control {
	Random rnd= new Random(System.currentTimeMillis());
	Estacion[] estacion= new Estacion[100];
	int estacionesRegistradas=0;


	
	
	public void nuevaEstacion(String nombre){
		estacion[estacionesRegistradas]= new Estacion(nombre);
		estacionesRegistradas++;
		}



	public void llenarDatos(){
		for(int i=0;i<estacionesRegistradas;i++){
			estacion[i].setEnero(numeroAleatorio());
			estacion[i].setFebrero(numeroAleatorio());
			estacion[i].setMarzo(numeroAleatorio());
			estacion[i].setAbril(numeroAleatorio());
			estacion[i].setMayo(numeroAleatorio());
			estacion[i].setJunio(numeroAleatorio());
			estacion[i].setJulio(numeroAleatorio());
			estacion[i].setAgosto(numeroAleatorio());
			estacion[i].setSeptiembre(numeroAleatorio());
			estacion[i].setOctubre(numeroAleatorio());
			estacion[i].setNoviembre(numeroAleatorio());
			estacion[i].setDiciembre(numeroAleatorio());	
		}
	}

	
	public void imprimirMensual(String j){
		for(int k=0;k<estacion.length;k++){
			if(j.equals(estacion[k].getNombre())){
				

		System.out.println("Enero: "+estacion[k].getEnero()+" l/m2");
		System.out.println("Febrero: "+estacion[k].getFebrero()+" l/m2");
		System.out.println("Marzo: "+estacion[k].getMarzo()+" l/m2");
		System.out.println("Abril: "+estacion[k].getAbril()+" l/m2");
		System.out.println("Mayo: "+estacion[k].getMayo()+" l/m2");
		System.out.println("Junio: "+estacion[k].getJunio()+" l/m2");
		System.out.println("Julio: "+estacion[k].getJulio()+" l/m2");
		System.out.println("Agosto: "+estacion[k].getAgosto()+" l/m2");
		System.out.println("Septiembre: "+estacion[k].getSeptiembre()+" l/m2");
		System.out.println("Octubre: "+estacion[k].getOctubre()+" l/m2");
		System.out.println("Noviembre: "+estacion[k].getNoviembre()+" l/m2");
		System.out.println("Diciembre: "+estacion[k].getDiciembre()+" l/m2");
		k=estacion.length+1;

			}
			
		}System.out.println();

	}
	
	
	public void llenarPromedios(){	
		for(int i=0;i<estacionesRegistradas;i++){
			int p=0;
			p+=estacion[i].getEnero();
			p+=estacion[i].getFebrero();
			p+=estacion[i].getMarzo();
			p+=estacion[i].getAbril();
			p+=estacion[i].getMayo();
			p+=estacion[i].getJunio();
			p+=estacion[i].getJulio();
			p+=estacion[i].getAgosto();
			p+=estacion[i].getSeptiembre();
			p+=estacion[i].getOctubre();
			p+=estacion[i].getNoviembre();
			p+=estacion[i].getDiciembre();
			estacion[i].setPromedio(p/12);
		}
	}
		public void MasLluvia(){

			double PM=0;
			llenarPromedios();
			
			for(int i=0;i<estacionesRegistradas;i++){
				if(estacion[i].getPromedio()>PM){
					PM=estacion[i].getPromedio();
				}
			}
			for(int i=0; i<estacionesRegistradas;i++){
				if(estacion[i].getPromedio()==PM){
					System.out.println(estacion[i].getNombre()+" es el mayor, con promedio de lluvia de: "+PM+" l/m2");
				}
			}
			
		}
		public void MenosLluvia(){
			double Min=80;
			llenarPromedios();
			
			for(int i=0;i<estacionesRegistradas;i++){
				if(estacion[i].getPromedio()<Min){
					Min=estacion[i].getPromedio();
				}
			}
			for(int i=0;i<estacionesRegistradas;i++){
				if(Min==estacion[i].getPromedio()){
					System.out.println(estacion[i].getNombre()+" es el menor con Promdedio de lluvia de: "+Min+" l/m2");
				}
			}
			
		}
	
	
	//metodos Sueltos prro
	public int numeroAleatorio(){
		int x=rnd.nextInt();
		return x;	
	}
	
	
	
	
}
