package Almacenar;

public class Personas {
	Persona[] personas = new Persona[20];
	int personasRegistradas;
	
	public Personas(){
		personasRegistradas = 0;
	}
	
	public void nuevaPersona(String nombre, String apellidos, int edad, int dni){
		personas[personasRegistradas] = new Persona(nombre,apellidos,edad,dni);
		personasRegistradas++;
	}
	
	public int buscaPersona(int dni){
		int edad = -1;
		

		for(int i=0;i<20;i++){
			if(dni==personas[i].getDni()){
				edad=personas[i].getEdad();
			}
		}
		
		return edad;
	}
	
}
