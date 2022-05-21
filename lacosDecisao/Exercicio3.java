package lacosDecisao;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) 
		{
		Scanner sc = new Scanner(System.in);

		int idade;

		System.out.print("Qual a sua idade?");
		idade = sc.nextInt();

		if(idade>=10 && idade <=14) 
		{
			System.out.println("Infantil");
		}else if(idade>=15 && idade<=17) 
		{
			System.out.println("Juvenil");
		}else if(idade>=18 && idade<=25) 
		{
			System.out.println("Adulto");
		}else 
		{
			System.out.println("Ops... não consegui entender. Tenta de novo!");
		}

		sc.close();
	}
}