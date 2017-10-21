
public class Simetrica {
	public static void main(String[] args) {

	int mat[][]={
			{8,1,3},
			{1,7,4},
			{3,4,2},	
	};
	
	int trans[][]=new int[3][3];
	boolean igual =true;
	

		for(int i=0;i<mat.length;i++){
	for(int j=0;j<mat[0].length;j++){
		trans[i][j]=mat[j][i];
	}}
	
		
		
		
		for(int i=0;i<mat.length;i++){
	for(int j=0;j<mat[0].length;j++){
		System.out.print(mat[i][j]+"  ");
	}
	System.out.println();}
		System.out.println();
		
		
		
		for(int i=0;i<mat.length;i++){
	for(int j=0;j<mat[0].length;j++){
		System.out.print(trans[i][j]+"  ");
	}
	System.out.println();}	
		System.out.println();
		
		if(mat.length==trans.length){
			if(mat[0].length==trans[0].length){
				for(int i=0;i<mat.length;i++){
					for(int j=0;j<mat[0].length&&igual;j++){
						
						if(mat[i][j]!=trans[i][j]){
							igual=false;
						}
						
						
						
					}
				}
			}else{
				igual=false;
			}
		}else{
			igual=false;
		}
			
			
			if(igual){
				System.out.println("La matriz es simetrica");
			}else{
				System.out.println("La matriz no es simetrica");
			}
			
			
	}


	
}
