import java.util.Scanner;
public class repeticiones {
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		
		System.out.println("Escribe una cadena: ");
		String cad=S.nextLine();
		
		int[] veces=new int[cad.length()];
		
		for(int i=0;i<cad.length();i++){int cont=0;
			for(int j=0;j<cad.length();j++){

				if(cad.charAt(i)==cad.charAt(j)){
					cont++;
				}

			}
			veces[i]=cont;
		}
		 



		
		int mayor=0;;
		for(int i=0;i<cad.length();i++){
			if(mayor<veces[i]){
				mayor=veces[i];
			}
		}
		
		boolean buscando=true;
		for(int i=0;i<cad.length()&&buscando;i++){
			if(veces[i]==mayor){
				System.out.println(cad.charAt(i)+" es el que se repite mas veces con "+veces[i]+" veces");
				buscando=false;
			}
		}

	}

	
}
