
public class triangulo {
	private vertice a, b,c;
	
	public triangulo(vertice a,vertice b, vertice c){
		this.a= new vertice(a);
		this.b = new vertice(b);
		this.c = new vertice(c);
	}
	
	
//set and get
	public vertice getA() {
		vertice copia = new vertice(a);
		return new vertice(a);
	}

	public void setA(vertice a) {
		this.a = a;
	}

	public vertice getB() {
		return b;
	}

	public void setB(vertice b) {
		this.b = b;
	}

	public vertice getC() {
		return c;
	}

	public void setC(vertice c) {
		this.c = c;
	}
	
	
	
}
