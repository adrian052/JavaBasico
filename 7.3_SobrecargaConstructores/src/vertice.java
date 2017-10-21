
public class vertice {
	private int x, y;
//constructor
	public vertice(int x,int y){
		this.x= x;
		this.y= y;
	}
//constructor de copia
	
	public vertice(vertice copia){
		x =copia.x;
		y =copia.y;
		
	}
	
	
//	set and get
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
