		package VetMat;

		import java.util.Scanner;

		public class vetMat1 
	{

		public static void main(String[] args) 
	{
		float[] vetor;
		float maior;
		
		while (true) 
	{
			vetor = new float[5];
			maior = 0;
			
		for (int i = 0; i < vetor.length; i++ ) 
	{
				
				System.out.println("\nDigite o " + (i + 1) + "� valor: ");
				vetor[i] = new Scanner(System.in) .nextFloat ();
				
		if (vetor[i] > maior) 
	{
			maior = vetor[i];
					
	}
	}
			
			System.out.println("O maior valor �: " + maior);
			
			
	}
				

	}

	}