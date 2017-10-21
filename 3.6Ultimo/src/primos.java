
public class primos {
	public static void main (String[]arg){
		
		boolean res=true;
		
		for(int i=1;i<200;i++){
			res=true;
			for(int j=2;j<i&&res;j++){
		if (i%j==0){
			
			res=false;
			
		}
						}	
				
			if (res){
				System.out.println(i+", ");

			}
		
			
			
		}
		
		
		
		
		
		
		
		
	}
}
