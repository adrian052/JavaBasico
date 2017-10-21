package Vendedores2;
public class Empresa {
	private Empleado[]empleado=new Empleado[100];
	private int empleadosRegistrados=0;
	private String []dia=new String[5]; 
	
	Empresa(int i){
		dia[0]="Lunes";
		dia[1]="Martes";
		dia[2]="Miercoles";
		dia[3]="Jueves";
		dia[4]="Viernes";


	}
	
	public void nuevoEmpleado(String nombre,int dni){
		empleado[empleadosRegistrados]=new Empleado(nombre,dni);
		empleadosRegistrados++;
	}
	
	//dia mas ventas
	public void diaMasVentas(int dni){
		int masVentas=0;
		int num=0;
		for(int i=0;i<empleadosRegistrados;i++){
			if(dni==empleado[i].getDni()){
				for(int j=0;j<6;j++){
					if(masVentas<empleado[i].getVentas(j)){
						masVentas=empleado[i].getVentas(j);
						num=j;
					}
				}
			}
		}	
		System.out.println("Dia con mas ventas: "+dia[num]);
		System.out.println("Ventas: "+masVentas+" pesetas");

	}
	
	//menor Empleado
	
	public void menorEmpleado(){
		int menor=100;
		int num=-1;
		for(int i=0;i<empleadosRegistrados;i++){
			if(menor>empleado[i].getEdad()){
				menor=empleado[i].getEdad();
				num=i;
			}
		}
		System.out.println("Empleado(a) más joven: "+empleado[num].getNombre());
		System.out.println("Edad: "+menor+" Años");
	}
	//totalVentas
	
	public int totalVentas(int dni){
		int total=0;
		for(int i=0;i<empleadosRegistrados;i++){
			if(empleado[i].getDni()==dni){
				for(int j=0;j<5;j++){
					total+=empleado[i].getVentas(j);
				}
			}
		}
		return total;
	}
	
	//mismoNombre
	
	public int mismoNombre(){
		int j=0;
		for(int i=0;i<empleadosRegistrados&&j==0;i++){
			for(int k=0;k<empleadosRegistrados;k++){
				if(empleado[i].getNombre()==empleado[k].getNombre()){
					if(k!=i){
					j=1;	
					}	
				}
			}
		}
		return j;
	}//
	
}

