package lacosDecisao;

import java.util.Scanner;

public class Exercicio4 
		{

	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.print("Informe um número: ");
		n = sc.nextInt();

		if(n%2==0) 
		{
			System.out.println("\nO número "+n+" é par.");
			System.out.println("A raiz quadrada de "+n+" é "+Math.sqrt(n));

		}else 
		{
			System.out.println("\nEste número é ímpar "+n);
			System.out.println("O número "+n+" elevado ao quadrado é: "+Math.pow(n, 2));
		}

		sc.close();
	}

}