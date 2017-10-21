import java.util.Scanner;
public class primo {
	public static void main(String[] args) {
		int a,v,c;
		Scanner S= new Scanner(System.in);
		
		System.out.println("Introuduce tu numero: ");
		a= S.nextInt();

		c=0;
		for(v=a;v>0;v--){
			
			if(a%v==0){
				
				c++;
			}

			
			
			
			
			
		}
			if (c==2){
					System.out.println("es numero primo");
			}


			else {
				System.out.println("NO es numero primo");
			}
	}

}
