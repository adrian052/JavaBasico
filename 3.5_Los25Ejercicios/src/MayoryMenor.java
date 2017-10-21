import java.util.Scanner;
public class MayoryMenor {
	public static void main(String[]arg){
		int a,b,c,e,m,n;
		Scanner S= new Scanner(System.in);
		a=0;
		b=0;
		c=0;
		e=0;
		n=0;
		m=0;		
		
		while(a<1){
			System.out.println("Escribe primer numero POSITIVO: ");
			a=S.nextInt();
		}
		while(b<1 || e==1){
			e=0;
			System.out.println("Escribe segundo numero POSITIVO: ");
			b=S.nextInt();
			if(b==a){
				System.out.println("Deben de ser numeros diferentes");
				e=1;
			}
			 
		}
		while(c<1||e==1){
			e=0;
			System.out.println("Escribe tercer numero POSITIVO: ");
			c=S.nextInt();
			if(c==b||c==a){
				System.out.println("Deben de ser numeros diferentes");
				e=1;
			}
		}
		System.out.println("Hola");
		
		if(a>b&&a>c){
			System.out.println("El numero mayor es: "+a);
		}
		else if(b>c){
			System.out.println("El numero mayor es: "+b);
		}
		else{
			System.out.println("EL numero mayor es:"+c);
		}
		
		if(a<b&&a<c){
			System.out.println("El numero menor es: "+a);
		}
		else if(b<c){
			System.out.println("El numero menor es: "+b);
		}
		else{
			System.out.println("EL numero menor es:"+c);
		}
	}
}
