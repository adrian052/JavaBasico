package Ficheros2;

import java.io.*;


public class metodos {
	public void copiarFichero(String existente){
		try{
			FileReader lector =new FileReader(existente);
			BufferedReader BR = new BufferedReader(lector);
			String aux=BR.readLine();
			aux+="           "+aux.length()+" caractéres.";
			FileWriter fichero =new FileWriter("Copia_"+existente+".txt");
			fichero.write(aux);		
			fichero.close();

		}catch(Exception ex){System.out.println("Error al copiar");}
		
		
	}
}
