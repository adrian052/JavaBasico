
public class comparacion {
	public static void main (String[]args){
		//declaraciones
		int m1[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9},

		};
		
		int m2[][]={
				{1,2,3},
				{4,5,6},
				{7,4,9},
		};
		
		boolean igual=true;
		
		
		if (m1.length!=m2.length){
			igual =false;
		}
		else{
			for(int i=0;i<m1.length&&!igual;i++){
				for(int j=0;j<m1[0].length;j++){
					if(m1[i][j]!=m2[i][j]){
						igual=false;
					}
				}
			}
		}
		
		
		
		
		
		if(igual){
			System.out.println("Las matrices son iguales");
		}
		else{
			System.out.println("Las matrices son diferentes");
		}
		
		
		
		
	}
}
