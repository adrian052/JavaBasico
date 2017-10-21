import java.util.Scanner;
public class lectura {
	public static void main(String[]arg){
		Scanner S= new Scanner(System.in);
		int[]v1={1,2,3,4,4,5,5,1,5,5,5};
		int[]v2=new int[0];
		int[]v3=new int[0];
		
		for(int i= 0;i<v1.length;i++){
			int pos=-1;
			for(int j = 0;j<v2.length;j++){
				if(v2[j]==v1[i]){
					pos=j;
				}
			}
			if(pos ==-1){
				int[] aux= new int[v2.length+1];
				int[] aux2= new int[v3.length+1];
				for(int k=0;k<v2.length;k++){
					aux[k]=v2[k];
					aux2[k] = v3[k];
				}
				v2 = aux;
				v3 = aux2;
				v2[v2.length-1] = v1[i];
				pos = v2.length - 1;
			}
			v3[pos] ++;
		}
		for(int i= 0;i<v2.length;i++){
			System.out.println(v2[i]+"\t"+v3[i]);
		}
}

			
		
		
		
		
		
	}

