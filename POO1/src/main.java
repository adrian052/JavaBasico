
public class main {
	public static void main(String[] args) {

		Libro Libro1 = new Libro(12,"el señor de los anillos","hola",44);
		Libro Libro2 = new Libro(14, "el laberinto del fauno","Adrián",90);
		
		System.out.println(Libro1.toString());
		System.out.println(Libro2.toString());

		if (Libro1.getNumPaginas()>Libro2.getNumPaginas()){
			System.out.println(Libro1.getTitulo()+" tiene mas paginas que "+Libro2.getTitulo());
		}
		else{
			System.out.println(Libro2.getTitulo()+" tiene mas paginas que "+Libro1.getTitulo());
		}
		
	}

}
