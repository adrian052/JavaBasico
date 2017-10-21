import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class paridadenVector {
	public static void main(String[] args) {
		Random rnd = new Random(System.nanoTime());
		Scanner S = new Scanner(System.in);
		ArrayList <Integer> lista =new ArrayList <Integer>();
		int cont=0;
		
		System.out.println("Escribe los elementos de tu array: ");
		int n =S.nextInt();
		
		for(int i=0;i<n;i++){
			lista.add(rnd.nextInt(2));
		}
		
		for(int i=0;i<n;i++){
			System.out.println(lista.get(i));
			if(lista.get(i)==1){
				cont++;
			}
		}
		if(cont%2==1){
			lista.add(1);
			System.out.println("Se agregó un 1,para mantener la paridad");
		}else{
			lista.add(0);
			System.out.println("Se agregó un 0");
		}
		
		
	}

}
