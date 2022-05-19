package orientacaoObjeto;

public class ClasseEletronico {
	
	String modelo;
	String cor;
	int geracao;
	int polegadas;
	int mp; 
		
	public void ligar()
	{
		System.out.println("\nAlexa?");
		System.out.println("\nLigando..."); 
	}
	

	public void status()
	{
		System.out.println("Modelo: " + this.modelo + "\nCor: " + this.cor + "\nGeração: " + this.geracao + "\nPolegadas: " + this.polegadas + "\nMegapixels: " + this.mp );
		
	}
}
	
	


