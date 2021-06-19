package ProjetoLP2;

import java.util.List;
import java.util.ArrayList;

//A classe herda os métodos e atributos da classe Funcionário e implementa os métodos da interface FuncaoFuncionario:

public class Medico extends Funcionario implements FuncaoFuncionario {
	
	//Relacionamento 1,* com a classe Paciente:
	
	List<Paciente> pacientes = new ArrayList<Paciente>();
	
	//Construtor da classe com os atributos herdados da superclasse Funcionario:
	
	public Medico(String nome, String especialidade, int cpf) {
		
		super(nome, especialidade, cpf);	
	}
	
	//Implementação dos métodos da interface FuncaoFuncionario:
	
	public void Dados() {
		
		System.out.println("Especialidade: " + especialidade);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + getCPF());
		
	}

	public void AvaliarEvolucao() {
		
		System.out.println("Médico avaliando a evolução do paciente");
	}
	
	public void MedirPressao() {
		
		System.out.println("Médico medindo a pressão do paciente");
		
	}
	
	public void Medicar() {
		
		System.out.println("Médico prescrevendo a medicação do paciente");
	}

}

