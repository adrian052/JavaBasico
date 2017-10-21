import java.util.Scanner;
public class Matrices {
	public static void main(String[]arg){
		Scanner S= new Scanner (System.in);
		int a,b, cont =2;
		boolean iguales= true;
		
		System.out.println("Introduce un valor a por teclado: ");
		a=S.nextInt();
		System.out.println("Introduce un valor b por teclado: ");
		b=S.nextInt();
		
		
		int [][] m1= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		int[][] m2=new int[a][b];
		
		for(int i=0; i<m2.length;i++){
			for(int j=0;j<m2[0].length;j++){
				m2[i][j]=cont++;
				cont++;
			}	
		}
		if(m1.length==m2.length){
			if(m1[0].length==m2[0].length){
			for(int	i=0;i>m1.length&&iguales;i++){
				for (int j=0;j< m1[0].length&&iguales;j++){
				if(m1[i][j]!=m2[i][j]){
				iguales= false;
				}
					
				}
			}
				
				
			}
			else{
				iguales=false;
			}
		}else{
			iguales=false;
		}
		
		if(iguales){
			System.out.println("Ambas matrices son iguales");
		}
		else{
			System.out.println("Ambas matrices no son iguales");
			
		}
		
	}
}
