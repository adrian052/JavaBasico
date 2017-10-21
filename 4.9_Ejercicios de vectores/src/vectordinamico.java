import java.util.Scanner;
import java.util.ArrayList;
public class vectordinamico {
	public static void main(String[] args) {
		Scanner S= new Scanner(System.in);
		ArrayList<Integer> vd= new ArrayList<Integer>();
		
		int equis;
		
		do{
			System.out.println("Escribe un numero:(0 para terminar)");
			equis =S.nextInt();
			if(equis!=0){
							vd.add(equis);
			}
			
		}while(equis!=0);
System.out.println("El vector dinamico tiene los valores: ");
System.out.println(vd);

System.out.println("Eliminando los valores repetidos.");

	for(int i =0;i<vd.size();i++){
		for (int j=0;j<vd.size();j++){
			if(vd.get(i)==vd.get(j)){
				vd.remove(j);
			}
		}
	}
	System.out.println(vd);

	}

}
