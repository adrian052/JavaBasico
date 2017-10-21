import java.util.Scanner;
public class Matriz {
	public static void main(String[]arg){
		
		Scanner S= new Scanner(System.in);
		
		int[][] matriz=new int[2][2];
		 
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[0].length;j++){
				System.out.println("Introudce el numero para la matriz[ "+i+"]["+j+"]");
				matriz[i][j]=S.nextInt();
				
			}	
		}
		
		for(int i=0;i<matriz.length;i++){
			for(int j =0;j<matriz[0].length;j++){
				System.out.print(matriz[i][j]+" ");
			}System.out.println("");
		}
		
		
		
		
	}
}
