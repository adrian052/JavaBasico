import java.util.Scanner;
public class desviacion {
public static void main (String[]arg){
	Scanner S= new Scanner (System.in);
	int[]v1=new int[10];
	double[]v2=new double[10];
	double[]v3=new double[10];
	double med= 0;
	double suma2=0;
	double var = 0;
	
	System.out.println("Escribe 10 valores por teclado:");
	for (int i= 0; i<v1.length;i++){
		v1[i]=S.nextInt();
	}
	
	for (int i= 0; i<v1.length;i++){
		med+=v1[i];
	}
	med/=10;
	System.out.println("la media es: "+med);
	
	for(int i= 0; i<v1.length;i++){
		v2[i]=(double) (v1[i]-med);

	}
	
	for(int i= 0; i<v1.length;i++){
		v3[i]=v2[i]*v2[i];

	}
	
	
	
	

	System.out.println();
	for(int i= 0; i<v3.length;i++){
		suma2+=v3[i];
	}

	System.out.println("La varianza es: "+suma2/9);
}
}
