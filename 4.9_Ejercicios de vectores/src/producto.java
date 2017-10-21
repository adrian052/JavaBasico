import java.util.Scanner;
public class producto {
public static void main(String[]arg){
	int [][] m1= {
			{1,2,3},
			{4,5,6},
			{7,8,9}
	};
	int [][] m2= {
			{1,2,3},
			{4,5,6},
			{7,8,9,}
	};
	int sum=0;
	int k=-1;
	int m=0;
	int r=0;

	int i=0;
	
	int[][] m3=new int[3][3];
	
	
	
	
	for(int s=0; s<m3[0].length;s++){
		m=0;
	for(r=0;r<m3[0].length;r++){
	sum=0;
	k=0;
	for(int j=0;j<m1[0].length;j++){
		//System.out.println(""+i+" "+j);
		//System.out.println(m1[s][j]+"*"+m2[k][m]);
		sum+=m1[s][j]*m2[k][m];
		k++;

	}
	m++;
		System.out.print(sum+"\t");

	m3[r][s]=sum;

	}
	System.out.println();
	}
	
	for(int f=0; i<m3.length;i++){
		for(int g=0; i<m3[0].length;i++){
		
			
		}
	}

	
}
}
