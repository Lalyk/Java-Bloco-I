package lacosRepeticao;

import java.util.Scanner;

public class Ex2for 
		{
	
	public static void main(String[] args) 
		{
		
		Scanner sc = new Scanner(System.in);
		
		int n, par=0, impar=0;
		
		for(int i=0;i<10;i++) 
		{
			System.out.print("Informe um número: ");
			n = sc.nextInt();
			
			if(n%2==0) 
		{
				par++;
		}	else 
		{
				impar++;
		}
		}
		
		System.out.println("O número de pares é: "+par);
		System.out.println("O número de ímpares é: "+impar);
		
		
		sc.close();
		
		
		
		
		
		
		
	}
}