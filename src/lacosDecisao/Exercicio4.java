package lacosDecisao;

import java.util.Scanner;

public class Exercicio4 
		{

	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Informe um n�mero: ");
		n = sc.nextInt();

		if(n%2==0) 
		{
			System.out.println("\nO n�mero "+n+" � par.");
			System.out.println("A raiz quadrada de "+n+" � "+Math.sqrt(n));

		}else 
		{
			System.out.println("\nEste n�mero � �mpar "+n);
			System.out.println("O n�mero "+n+" elevado ao quadrado �: "+Math.pow(n, 2));
		}

		sc.close();
	}

}