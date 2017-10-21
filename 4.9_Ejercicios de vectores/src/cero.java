import java.util.Scanner;
public class cero {
	public static void main(String[]arg){
	int[]v1=new int [15];
	int[]v2={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	Scanner S = new Scanner (System.in);
	
	for(int i= 0; i<v2.length;i++){
		System.out.print(v2[i]+" ");
		
	}
	for(int i = 0;i<v1.length;i++){
		System.out.println("Introduce un valor diferente de cero: ");
		v1[i]= S.nextInt();
	}
	for(int i= 0; i<v1.length;i++){
		if(v1[i]==v2[i]){
			
			System.out.println("El numero de la posisicion "+i+" es igual; "+v1[i]);
			
		}
		
	}
	}
	
	}

