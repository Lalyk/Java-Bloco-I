package orientacaoObjeto;

public class MainPaciente {

	public static void main(String[] args) {
		
		ClassePaciente paciente = new ClassePaciente();
		paciente.falar();
		paciente.nome = "Renan";
		paciente.idade = 26;
		paciente.sexo = "Masculino";
		paciente.stdCivil = "Solteiro";
		paciente.sintomas = "Tosse, coriza, febre";
		
		System.out.println();
		
		paciente.status();
		
		

	}

}
