package Vendedores;



public class Compañia {
	Vendedor[] vendedor=new Vendedor[25];
	int vendedoresRegistrados=0;

	
	public void nuevoVendedor(String nombre,String apellidos,int dni,int ventas){
		vendedor[vendedoresRegistrados]= new Vendedor(nombre,apellidos,dni,ventas); 
		vendedoresRegistrados++;
	}
	
	public int buscarPersona(int dni){
		int ventas=-1;
		
		for(int i=0;i<vendedoresRegistrados;i++){
			if(dni==vendedor[i].getDni()){
				ventas=vendedor[i].getVenta();

			}
		}
		ventas=ventas*1000;
		return ventas;
	}
	
	public String buscarNombre(int dni){
		String name=null;
		
		for(int i=0;i<vendedoresRegistrados;i++){
			if(dni==vendedor[i].getDni()){
				name=vendedor[i].getNombre();
			}
		}
		
		return name;
	}
	
	public int ventasTotales(){
		int totales=0;
		
		for(int i =0;i<vendedoresRegistrados;i++){
		totales+=vendedor[i].getVenta();
		}
		totales=totales*1000;
		return totales;
	}
	
	public void mejoresVendedores(){
		int[]dos={0,0};
		for(int i =0; i<vendedoresRegistrados;i++){
			if(vendedor[i].getVenta()>dos[0]){
				dos[1]=dos[0];
				dos[0]=vendedor[i].getVenta();	
			}
		}
		
		for(int i=0;i<vendedoresRegistrados;i++){
			if(vendedor[i].getVenta()==dos[0]){
				System.out.println(vendedor[i].getNombre()+" Tiene las mayores ventas");
				System.out.println("con "+vendedor[i].getVenta()+" ventas"+" y "+vendedor[i].getVenta()*1000+" dolares");
				System.out.println();
			}
		}

		for(int i=0;i<vendedoresRegistrados;i++){
			if(vendedor[i].getVenta()==dos[1]){
				System.out.println(vendedor[i].getNombre()+" Tiene las segundas mayores ventas");
				System.out.println("con "+vendedor[i].getVenta()+" ventas"+" y "+vendedor[i].getVenta()*1000+" dolares");
			}
		}
	}
	
	
}
