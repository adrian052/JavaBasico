import java.util.Scanner;
public class visualizar {
	public static void main (String[]arg){
	Scanner S= new Scanner (System.in);	
	
	int[] v1=new int[5];
	
	for(int i= 0;i<v1.length;i++){
		System.out.print("Introduce un numero del vector: ");
		v1[i]=S.nextInt();
		
	}
	
	
	for(int i=0;i<v1.length;i++){
		System.out.print(v1[i]+" ");	
	}
}}
