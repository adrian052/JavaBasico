import java.util.Scanner;
public class hora {

	public static void main(String[] args) {
		int h,m,se,c;
		Scanner S= new Scanner(System.in);
		c=0;
	System.out.println("Escribe la hora: ");
		h= S.nextInt();
		
		System.out.println("Escribe los minutos: ");
		m= S.nextInt();
		
		System.out.println("Escribe los segundos: ");
		se= S.nextInt();

		
		if(h<24 && m<60 && se<60 && h>=0 && m>=0 && se>=0){
					se++;
			if (se==60){
				
				se=0;
				m++;
			}
			if (m==60){
				m=0;
				h++;
			}
			if (h==24){
				
				h=0;
			}
			
	System.out.println(h+":"+m+":"+se);
			
		}else{
			
			System.out.println("La hora es incorrecta");
		}
		
		
		
		

}}
