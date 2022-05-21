package lacosRepeticao;

import java.util.Scanner;

public class Ex2while 
	{

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		int i=0, idade, sexo, opcao, qtdPessoasCalmas=0, qtdMulheresNervosas=0,
		qtdHomensAgressivos=0, qtdOutrosCalmos=0, qtdPessoasNervosasMaior40=0,
		qtdPessoasCalmasMenor18=0;
		
		while(i<150) 
	{
			System.out.println("Informe a idade do indivíduo: ");
			idade = sc.nextInt();
			System.out.println("Informe o sexo do indivíduo: 1 - Feminino 2 - Masculino 3 - Outros ");
			sexo = sc.nextInt();
			System.out.println("Escolha uma das opções: 1 - Pessoa calma 2 - Pessoa nervosa 3 - Pessoa agressiva");
			opcao = sc.nextInt();
			
			if(opcao == 1)qtdPessoasCalmas++;
			if(sexo == 1 && opcao == 2)qtdMulheresNervosas++;
			if(sexo == 2 && opcao == 3)qtdHomensAgressivos++;
			if(sexo == 3 && opcao == 1)qtdOutrosCalmos++;
			if(opcao == 2 && idade > 40)qtdPessoasNervosasMaior40++;
			if(opcao == 1 && idade < 18)qtdPessoasCalmasMenor18++;
			
			i++;
	}
		
		System.out.println("O número de pessoas calmas é: "+ qtdPessoasCalmas);
		System.out.println("O número de mulheres nervosas é: "+ qtdMulheresNervosas);
		System.out.println("O número de homens agressivos é: "+ qtdHomensAgressivos);
		System.out.println("O número de outros calmos é: "+ qtdOutrosCalmos);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+ qtdPessoasNervosasMaior40);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: "+ qtdPessoasCalmasMenor18);
		
		
		sc.close();
	}

	}