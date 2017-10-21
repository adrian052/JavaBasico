
public class Libro {
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPaginas;
	
	//constructor
	
	public Libro(int ISBN,String titulo,String autor,int numPaginas){
		this.ISBN = ISBN;
		this.titulo =titulo;
		this.autor =autor;
		this.numPaginas = numPaginas;
		
	}
	//metodos

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	public String toString(){
		return "el libro "+titulo+" con ISBN "+ISBN+" creado por el autor "+autor+" que tiene "+numPaginas+" paginas";
		
	}
	
}
