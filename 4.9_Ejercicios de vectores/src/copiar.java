
import java.util.Scanner;
public class copiar {
	public static void main(String[] args) {

		int m1[][]= new int[3][3];
		int m2[][]= new int[3][3];
		Scanner S = new Scanner(System.in);
		
		for(int i=0; i<m1.length;i++){
			for(int j= 0;j<m1[0].length;j++){
				System.out.println("Escribe el numero de "+i+" "+j);
				m1[i][j]= S.nextInt();
			}
		}
		
		for(int i=0; i<m1.length;i++){
			for(int j= 0;j<m1[0].length;j++){
				System.out.print(m1[i][j]+"  ");
			}
			System.out.println();
		}

		
		for(int i= 0; i<m1.length;i++){
			for(int j= 0;j<m1[0].length;j++){
				m2[i][j]=m1[i][j];
			}
		}
		
						System.out.println("El vector secundario es: ");
		for(int i= 0; i<m1.length;i++){
			for(int j= 0;j<m1[0].length;j++){
				System.out.print(m2[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	
		
	}

}
