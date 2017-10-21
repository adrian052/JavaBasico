import java.util.Scanner;
public class escalar {
	public static void main(String[]arg){ 
		
		Scanner S= new Scanner (System.in);
		int []v1=new int[3];
		int []v2=new int[3];
		int []v3=new int[3];
		int res=0;
		
		System.out.println("Escribe los 3 valores del vector 1: ");
		for(int i=0;i<v1.length;i++){	
			v1[i]=S.nextInt();		
		}
		System.out.println("Escribe los 3 valores del vector 2: ");
		for(int i=0;i<v2.length;i++){	
			v2[i]=S.nextInt();		
		}
		
		for(int i= 0; i<v1.length;i++){
			v3[i]=v2[i]*v1[i];	
		}
		
		for(int i = 0; i<v3.length;i++){
			res+=v1[i]+v2[i];
		}
		System.out.println("el producto escalar es: "+res);
		
	}
}
