
public class principal {

	public static void main(String[] args) {
		personaje p= new personaje("Adri�n",50,10,1);
		Guerrero g = new Guerrero("MacGregor",50,10,1,5);
		
		System.out.println("El personaje "+p.getNombre()+" realiza "+p.lucha()+" puntos de lucha");
		System.out.println("El personaje "+g.getNombre()+" realiza "+g.lucha()+" Puntos de lucha");
		
		p.da�o(g.lucha());
		g.da�o(p.lucha());
		
		System.out.println("El personaje "+p.getNombre()+" tiene "+p.getHp()+" puntos de da�o");
		System.out.println("El personaje "+g.getNombre()+" tiene "+g.getHp()+" puntos de da�o");
		

	}

}
