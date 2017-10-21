	import java.util.Scanner;
public class vectores {
	public static void main(String[] args) {
		int num;
		Scanner S= new Scanner(System.in);
		
		System.out.println("Introduce la longitud del vector: ");
		num=S.nextInt();
		
		double[] vec = new double [num];
		double total= 0;
		
		for(int i=0;i<num;i++){
			System.out.println("Introduce valores al vector: ");
			vec [i]= S.nextDouble();		
		}
		for(int i=0;i<num;i++){
			total+=vec[i];
		}
		total/=num;
		
		System.out.println(+total);
	}

}
