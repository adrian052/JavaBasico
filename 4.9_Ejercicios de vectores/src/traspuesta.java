import java.util.Scanner;
public class traspuesta {
public static void main(String[]arg){
	int [][]m1= new int [3][3];
	int [][]m2=new int [3][3];
	int aux= 0;
	Scanner S = new Scanner (System.in);
	
	for(int i=0;i<m1.length;i++){
		for(int j=0;j<m1[0].length;j++){
			System.out.println("Introudce el numero para la matriz[ "+i+"]["+j+"]");
			m1[i][j]=S.nextInt();
			
		}
		System.out.println("Matriz");
	}
	for(int i= 0;i<m1.length;i++){
		for(int j= 0;j<m1[0].length;j++){
			System.out.print(m1[i][j]+" ");
		}
		System.out.println();
	}
	
	aux= m1[0][1];	
	m1[0][1]=m1[1][0];
	m1[1][0]=aux;

	aux= m1[0][2];	
	m1[0][2]=m1[2][0];
	m1[2][0]=aux;

	aux= m1[2][1];	
	m1[2][1]=m1[1][2];
	m1[1][2]=aux;
	
	System.out.println("Matriz transpuesta");
	for(int i= 0;i<m1.length;i++){
		for(int j= 0;j<m1[0].length;j++){
			System.out.print(m1[i][j]+" ");
		}
		System.out.println();
	}
	
	
	
	}
}

