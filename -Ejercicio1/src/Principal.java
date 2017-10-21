
public class Principal {

	public static void main(String[] args) {
		int n=105;
		int x=0,y=1;
		for(int i=1;i<=n;i++){
			x++;
			System.out.print("*");
			if(x==y){
				System.out.println();y++;
				x=0;
			}
		}
		
		

		

	}

}
