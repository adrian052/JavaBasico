import java.util.Scanner;
public class matrizArrayList {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		System.out.println("Escribe el numero de filas: ");
		int f= S.nextInt();
		System.out.println("Escibe el numero de columnas: ");
		int c = S.nextInt();
		
		int[][] m = new int[f][c];
		
		for(int i=0;i<f;i++){
			for(int j=0;j<c;j++){
			System.out.println("Escribe el valor de "+i+" "+j);
			m[i][j]=S.nextInt();
			}
		}
		System.out.println("Matriz");
		for(int i=0;i<f;i++){
			System.out.println();
			for(int j=0;j<c;j++){
				System.out.print(m[i][j]+" ");
			}
		}
	}

}
