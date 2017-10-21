import java.util.Scanner;
public class fibonacci {
	public static void main (String[]arg){
	int n,n1,res,nx,z, r;
	Scanner S= new Scanner (System.in);

	System.out.println("Escribe el numero n de la sucecion: ");
	z= S.nextInt();
	res=2;
	n1=1;
	nx=0;
	n=z-2;
	if (z==1||z==2){
		System.out.println("El numero n de la serie es: 1");
	}else{
		while(n>0){	
	nx=res;
	res=res+n1;	

	n1=nx;
	n--;	
	}
	System.out.println("El numero n de la serie es: "+res);
	}}
}
