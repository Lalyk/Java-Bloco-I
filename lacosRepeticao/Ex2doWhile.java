package lacosRepeticao;

import java.util.Scanner;

public class Ex2doWhile 
		{

	public static void main(String[] args) 
		{
		
		Scanner sc = new Scanner(System.in);
		
		int n, soma=0, qtd=0, media;
		
		do 
		{
			
			System.out.println("Insira v�rios n�meros inteiros e para uma surpresa digite 0! ");
			n = sc.nextInt();
			
			if(n%3==0 && n!=0) 
		{
				qtd++;
				soma+= n;
			}
			
		}while(n!=0);
		
		media = soma / qtd;
		System.out.println("A m�dia dos n�meros m�ltiplos de 3 �: " + media);
		
		
		sc.close();

		}

		}

		