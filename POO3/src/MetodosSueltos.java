
public class MetodosSueltos {
	
	public static int generaNumeroAleatorio(int Minimo,int Maximo){
int num= (int)Math.floor(Math.random()*(Minimo-(Maximo+1))+(Maximo+1));	
return num;
	}

}
