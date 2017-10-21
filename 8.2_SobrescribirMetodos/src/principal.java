
public class principal {

	public static void main(String[] args) {
		personaje p= new personaje("Adrián",50,10,1);
		Guerrero g = new Guerrero("MacGregor",50,10,1,5);
		
		System.out.println("El personaje "+p.getNombre()+" realiza "+p.lucha()+" puntos de lucha");
		System.out.println("El personaje "+g.getNombre()+" realiza "+g.lucha()+" Puntos de lucha");
		
		p.daño(g.lucha());
		g.daño(p.lucha());
		
		System.out.println("El personaje "+p.getNombre()+" tiene "+p.getHp()+" puntos de daño");
		System.out.println("El personaje "+g.getNombre()+" tiene "+g.getHp()+" puntos de daño");
		

	}

}
