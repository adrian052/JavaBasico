import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		int hora, min, seg;
		Scanner S= new Scanner(System.in);
		
		System.out.print("Introduce la hora ");
		hora= S.nextInt();
		System.out.print("Introduce los minutos ");
		min= S.nextInt();
		System.out.print("Introduce los segundo ");
		seg= S.nextInt();
		
		if (hora<24 && min<60 && seg<60 && hora>-1 && min>-1 && seg>-1){
			seg+=1;
			if (seg ==60){
				min+=1;
				seg=0;
			}
			if (min ==60){
				hora+=1;
				min=0;
			}
			if (hora==24){
				hora=0;
			}
			
			System.out.println("La hora es: "+hora+":"+min+":"+seg);
		}
		else{
		System.out.println("La hora es incorrecta");
	}
	}

}
