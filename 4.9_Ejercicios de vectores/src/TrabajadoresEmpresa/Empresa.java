package TrabajadoresEmpresa;

import java.util.Scanner;

public class Empresa {
	private Trabajador[] trabajador=new Trabajador[100];
	private int trabajadoresRegistrados=0;
	Scanner S = new Scanner(System.in);
	
	public void nuevoTrabajador(String nombre,int dni){
		trabajador[trabajadoresRegistrados]= new Trabajador(nombre,dni);
		trabajadoresRegistrados++;
	}
	
	public void mostrarTrabajador(){
		System.out.println("Introducir el dni: ");
		int dni= S.nextInt();
		for(int i=0;i<trabajadoresRegistrados;i++){
			
			if (dni==trabajador[i].getDni()){
		System.out.println("El nombre es: "+trabajador[i].getNombre());
		System.out.println("Su salario es de: "+trabajador[i].getSalario());

			}
		}
		System.out.println();

		}
	
	public void mostrarHoraSalida(){
		System.out.println("Introduce el dni:");
		int dni=S.nextInt();
		
		for(int i=0;i<trabajadoresRegistrados;i++){
			if(dni==trabajador[i].getDni()){
		System.out.println("Horas de salida de: "+trabajador[i].getNombre());
		System.out.println();
		System.out.println("El lunes salió a las: "+(trabajador[i].getSalida(0)/60)+":"+(trabajador[i].getSalida(0)%60));
		System.out.println("El martes salió a las: "+(trabajador[i].getSalida(1)/60)+":"+(trabajador[i].getSalida(1)%60));
		System.out.println("El miercoles salió a las: "+(trabajador[i].getSalida(2)/60)+":"+(trabajador[i].getSalida(2)%60));
		System.out.println("El jueves salió a las: "+(trabajador[i].getSalida(3)/60)+":"+(trabajador[i].getSalida(3)%60));
		System.out.println("El viernes salió a las: "+(trabajador[i].getSalida(4)/60)+":"+(trabajador[i].getSalida(4)%60));
		
			}
			}
	}
	
	public void mostrarDatos(){
		System.out.println("Introduce el dni: ");
		int dni=S.nextInt();
		
		for (int i=0;i<trabajadoresRegistrados;i++){
			if (dni==trabajador[i].getDni()){
				System.out.println("Nombre: "+trabajador[i].getNombre());
				System.out.println("Salario por hora: "+trabajador[i].getSalario());
				System.out.println("Horas en la semana: "+horasTrabajadas(dni));
				System.out.println("El porcentaje en el aumento de sueldo es: "+(porcentajeExtra(dni))+"%");
				System.out.println("Pago sin extras: "+salarioPagos(dni));
				System.out.println("Pago con extras: "+salarioPagos(dni)*(1+(porcentajeExtra(dni)/100)));
			}
		}
	}
	
	public double horasTrabajadas(int dni){
		double porcentaje=0;
		for(int i=0;i<trabajadoresRegistrados;i++)
			if (dni==trabajador[i].getDni()){
				porcentaje+=trabajador[i].getSalida(0);
				porcentaje+=trabajador[i].getSalida(1);
				porcentaje+=trabajador[i].getSalida(2);
				porcentaje+=trabajador[i].getSalida(3);
				porcentaje+=trabajador[i].getSalida(4);
				porcentaje-=Trabajador.getEntrada()*5;
				porcentaje=porcentaje/60;
				
			}
				return porcentaje;
	}
	
	public double porcentajeExtra(int dni){
		double porcentaje=horasTrabajadas(dni);
		
		porcentaje-=35;
		porcentaje/=5;
		porcentaje*=10;
		

		
		return porcentaje;
	}
	
	public double salarioPagos(int dni){
		double s=0;
		for(int i=0;i<trabajadoresRegistrados;i++){
			if(dni==trabajador[i].getDni()){
				s=trabajador[i].getSalario()*porcentajeExtra(dni);
			}
		}
		return s;
	}
	
	
}
