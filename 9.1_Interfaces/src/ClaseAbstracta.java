public abstract class ClaseAbstracta {
	protected int x, y,z;
	
	//Constructor
	public ClaseAbstracta(int x,int y,int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	//Metodos
	public int getNum1(){
		return 1;
		
	}
	
	public abstract int getNum2();
	
	

}
