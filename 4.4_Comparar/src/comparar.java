
public class comparar {
	public static void main (String[]arg){
		int[] v1={1,2,3,4,5,6,7,8,9};
		int[] v2={1,2,3,4,5,6,7,8,9};
	
		boolean iguales= true;
		
		if (v1.length!=v2.length){
			iguales =false;
		}
		
		for(int i=0;i <v1.length && iguales;i++){
	
			if(v1[i]!=v2[i]){
				iguales =false;
				
			}
				
		}
		if (iguales){
			
			System.out.println("Ambos vectores son iguales");
		}
		else{
			System.out.println("Ambos vectores no son iguales");
		}
		
		
		
		
	}
}
