package Escuela;
public class Instituto {
	private Alumno[]alumno =new Alumno[300];
	private int alumnosRegistrados;
	private String[]Materias=new String[7];
	
	
	
	 public Instituto() {
		Materias[0]="Español";
		Materias[1]="Matematicas";
		Materias[2]="Fisica";
		Materias[3]="Quimica";
		Materias[4]="Anatomía";
		Materias[5]="Ciencias Sociales";
		Materias[6]="Algebra";
		}

	public void nuevoAlumno(String nombre,int dni){
		 alumno[alumnosRegistrados]=new Alumno(nombre,dni);
		 alumnosRegistrados++;
		 
			
	 }
	 
	 public void Datos(int dni){
		 for(int i=0;i<alumnosRegistrados;i++){
			 if(dni==alumno[i].getDni()){
				 System.out.println("Nombre: "+alumno[i].getNombre());
				 System.out.println("Edad: "+alumno[i].getEdad());
				 System.out.println("Dni ingresado: "+alumno[i].getDni()); 	 
			 }
		 }	 
	 }
	 			
	 
	 public void notaGlobal(int dni){
	 for(int k=0;k<alumnosRegistrados;k++){
		if(dni==alumno[k].getDni()){
			Datos(dni);
			System.out.println();
			 double cont =0;
		 for(int i=0;i<7;i++){ 
			 cont=0;
			 System.out.println(Materias[i]);	

			 for(int j=0;j<3;j++){
				 cont+=alumno[k].getCalificacion(j, i);
				 System.out.print(alumno[k].getCalificacion(j, i)+" ");
				 
			 }	
			System.out.format("= %.1f",cont/3);
			 System.out.println();
		 }
		 
	 }
		}
	 }
	 
	 //el segundo 
	 
	 public void mayorNota(int m){
		 double mayor=-1;
		 int num=-1;
		 double cont;
		 
			 
				 System.out.println(Materias[m]);
				 for(int j=0;j<alumnosRegistrados;j++){
					 cont=0;
					 cont+=alumno[j].getCalificacion(0, m)+alumno[j].getCalificacion(1, m)+alumno[j].getCalificacion(2, m);
					 if (cont>mayor){
						 mayor=cont;
						 num=j;
					 }
				
				 }		
		System.out.print("Mayor Nota ");
		 System.out.format("= %.1f",mayor/3);
		 System.out.println();
		 System.out.println("Alumno(a): "+alumno[num].getNombre());
			 }
		 

	 }
		

	
	

