
public class normalización {
public static void main(String[]arg){
	double[]v1={1,3,4,2,9,5,3,1,68,7,0,1,24,25,13,15,18,23,17,48};
			double j=0;
			
	for(int i=0;i<v1.length;i++){
		if(v1[i]>j){
			j=v1[i];
		}	
	}
System.out.println(j);
	
	for(int i=0; i<v1.length;i++){
		v1[i]/=j;
		
	}
	
	for(int i=0;i<v1.length;i++){
		System.out.println(v1[i]);
	}
	
	
	
	
	
	}
	
}

