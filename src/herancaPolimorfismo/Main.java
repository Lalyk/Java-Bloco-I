package herancaPolimorfismo;

public class Main {
	
	public static void main (String args[]) {

		Animal animal = new Animal();
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		
		animal.nome = "Jubileu";
		animal.idade = 12;
	

		cachorro.nome = "Vanilla";
		cachorro.idade = 6;
		
		
		cavalo.nome = "Pocotó";
		cavalo.idade = 10;
		
		preguica.nome = "Sleepyhead";
		preguica.idade = 9;
		
		
		System.out.println();
		
		System.out.println(cachorro.nome);
		System.out.println(cachorro.idade);
		cachorro.emitirSom();
		cachorro.correr();
		
		System.out.println();
		
		System.out.println(cavalo.nome);
		System.out.println(cavalo.idade);
		cavalo.emitirSom();
		cavalo.correr();
		
		System.out.println();
		
		System.out.println(preguica.nome);
		System.out.println(preguica.idade);
		preguica.emitirSom();
		preguica.correr();
	
	}
	
}