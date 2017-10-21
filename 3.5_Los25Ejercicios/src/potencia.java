import java.util.Scanner;
public class potencia {
	public static void main(String[] args) {
		int n,p, res,con;
		Scanner S= new Scanner (System.in);
		
		System.out.println("Escribe el numero: ");
		n= S.nextInt();
		System.out.println("Escribe la potencia: ");
		p= S.nextInt();
		
		con=p;
		res=n;
		if (p>1){
			
			while(con>1){
			res =res*n;
			con--;}
		System.out.println("el resultado es: "+res);
		}	
		else if(p==1){
			System.out.println("el resultado es: " +n);
		}
		else if(p==0){
			System.out.println("El resultado es: 1");
			
		}

		}
		

		
		
		
		
		
		
	}

