package ProjetoLP2;

import java.util.ArrayList;
import java.util.List;

//A classe herda os m�todos e atributos da classe Funcion�rio e implementa os m�todos da interface FuncaoFuncionario:

public class Fisio extends Funcionario implements FuncaoFuncionario { 
	
	//Relacionamento 1,* com a classe Paciente:
	
	List<Paciente> pacientes = new ArrayList<Paciente>(); 
	
	//Construtor da classe com os atributos herdados da superclasse Funcionario:

	public Fisio(String nome, String especialidade, int cpf) { 
		
		super(nome, especialidade, cpf);	
	}
	
	//Implementa��o dos m�todos da interface FuncaoFuncionario:
	
	public void Dados() {
		
		System.out.println("Especialidade: " + especialidade);
		System.out.println("Nome: " + nome);	
		System.out.println("CPF: " + getCPF());
	}

	public void AvaliarEvolucao() {
		
		System.out.println("Fisio avaliando a evolu��o do paciente");
	}
	
	public void MedirPressao() {
		
		System.out.println("Fisio medindo a press�o do paciente");
		
	}
	
	public void Medicar() {
		
		System.out.println("Fisio medicando o paciente");
	}
}

