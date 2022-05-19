package orientacaoObjeto;

public class MainEletronico {

	public static void main(String[] args) {
		
		ClasseEletronico alexa = new ClasseEletronico();
		alexa.ligar();
		alexa.cor = "Rosa";
		alexa.geracao = 2;
		alexa.modelo = "Echo Show";
		alexa.mp = 13;
		alexa.polegadas = 8;
		
		System.out.println();
		
		alexa.status();
		
		ClasseEletronico alexa2 = new ClasseEletronico();
		alexa2.ligar();
		alexa2.cor = "Preto";
		alexa2.geracao = 1;
		alexa2.modelo = "Echo Show";
		alexa2.mp = 1;
		alexa2.polegadas = 8;
		
		System.out.println();
		
		alexa2.status();
				

	}

}
