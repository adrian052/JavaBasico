//oredenar un vector
public class Length {
	public static void main(String[]arg){
		
		int vec[]={1,2,3,4,5,3,100,5,7,3,4,5,90,1,2,43,49484,-1};
		int aux;
		
		for(int i=0;i <vec.length;i++){
			
			System.out.print(vec[i]+" ");
		
		}

		System.out.println();
		
		for(int i=0;i<vec.length;i++){
			for(int j= i+1;j<vec.length;j++){
				if (vec[j]<vec[i]){
					aux=vec[j];
					vec [j]=vec[i];
					vec [i]=aux;
							
				}
			}


		}
		
		for(int i=0;i <vec.length;i++){
			
			System.out.print(vec[i]+" ");
		
		}
		
	}
}
