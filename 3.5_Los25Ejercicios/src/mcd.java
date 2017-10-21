import java.util.Scanner;
public class mcd {
	public static void main(String[] args) {
		int num1,num2,var,ver;
		Scanner S=new Scanner (System.in);
		
		System.out.println("Introduce el primer numero: ");
		num1=S.nextInt();
		System.out.println("Introduce el segundo numero: ");
		num2=S.nextInt();
		if (num1>num2){
			var=num2;
		}else{
			var=num1;
		}

		for(ver=0;ver==0;var--){
		if(num1%var==0 && num2%var==0){
			ver=1;
		}	

		}
		var+=1;
		System.out.println("El maximo común divisor es: "+var);
		

	}

}
