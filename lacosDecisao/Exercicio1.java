package lacosDecisao;

import java.util.Scanner;

public class Exercicio1 
		{

	public static void main(String[] args) 
		{
		int n1,n2,n3;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o primeiro n�mero: ");
		n1 = sc.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		n2 = sc.nextInt();
		System.out.print("Informe o terceiro n�mero: ");
		n3 = sc.nextInt();

		if(n1>n2 && n1>n3) 
		{
			System.out.println("O primeiro n�mero � o maior.");
		} else if(n2>n1 && n2>n3) 
		{
			System.out.println("O segundo n�mero � o maior.");
		} else 
		{
			System.out.println("O terceiro n�mero � o maior");
		}

		sc.close();
	}

} 