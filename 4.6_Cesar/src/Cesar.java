import java.util.Scanner;
public class Cesar {
	public static void main(String[]arg){
		
		Scanner S=new Scanner (System.in);
		String min = "abcdefghijklmnopqrstuvwxyz ";
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
		String a,b;
		int desp;
		b="";
		

		System.out.println("Introduce una frase");
		a=S.nextLine();
		
		System.out.println("Introduce la clave desplasamiento");
		desp=S.nextInt();
		
		for(int i=0;i<a.length();i++){
			for(int j=0;j< min.length();j++){
				if(a.charAt(i)==min.charAt(j)){
					if (j+desp>=min.length()){
						b+=min.charAt((j+desp)%min.length());
					}
					else{
						b+=min.charAt(j+desp);
					}
					
				}
				else if (a.charAt(i)==may.charAt(j)){
					if (j+desp>=may.length()){
						b+=may.charAt((j+desp)%may.length());
					}
					else{
						b+=may.charAt(j+desp);
					}
					
				}
				
			}
			
		}
			
		
		System.out.println(a);
		System.out.println(b);

	}
}
