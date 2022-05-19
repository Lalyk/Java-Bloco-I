package orientacaoObjeto;

public class ClassePaciente {
	
	String nome;
	String sexo;
	int idade;
	String stdCivil;
	String sintomas;
	
	public void falar()
	{
		System.out.println();
	}
	
	public void status() {
		
		System.out.println("\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSexo: " + this.sexo + "\nEstado civil: " + this.stdCivil + "\nSintomas: " + this.sintomas);
		
	}
	

}
