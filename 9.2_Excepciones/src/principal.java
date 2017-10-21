public class principal {
	public static void main(String[] args) {
		int i=0;
		int[]vec = null;
		
		
		switch(i){
			case 0:
				vec=new int[10];
				break;
			case 1:	
				vec=new int[5];
				break;
		}
		
		try{
		vec[1]=10;
		System.out.println(vec[10]);
		}catch(NullPointerException ex){
			vec= new int[10];
		}catch(ArrayIndexOutOfBoundsException ex){
			vec[5]=10;
		}catch(Exception ex){
			System.out.println("Ha ocurrido una excepción desconocida");
		}finally{
			System.out.println("Se está cerrando el programa");
		}
		
	}
}
