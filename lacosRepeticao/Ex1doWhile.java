package lacosRepeticao;

import java.util.Scanner;

public class Ex1doWhile 
		{

	public static void main(String[] args) 
		{
		
		Scanner sc = new Scanner(System.in);
		
		int n, soma=0;
		
		do 
		{
			System.out.println("Informe v�rios n�meros e veja a soma deles! ");
			n = sc.nextInt();
			soma+=n;
		}while(n!=0);
		
		System.out.println("A soma dos n�meros �: " + soma);
		
		sc.close();

		}

		}