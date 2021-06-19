package ProjetoLP2;

import java.util.ArrayList;
import java.util.List;

//A classe herda os m�todos e atributos da classe Funcion�rio e implementa os m�todos da interface FuncaoFuncionario:

public class Enfermeiro extends Funcionario implements FuncaoFuncionario { 
	
	//Relacionamento 1,* com a classe Paciente:

	List<Paciente> pacientes = new ArrayList<Paciente>(); 	
	
	//Construtor da classe com os atributos herdados da superclasse Funcionario:
		
	public Enfermeiro(String nome, String especialidade, int cpf) { 
		
		super(nome, especialidade, cpf);	
	}
	
	//Implementa��o dos m�todos da interface FuncaoFuncionario:
	
	public void Dados() {
		
		System.out.println("Especialidade: " + especialidade);
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + getCPF());
	}

	public void AvaliarEvolucao() {
		
		System.out.println("Enfermeiro avaliando a evolu��o do paciente");
	}
	
	public void MedirPressao() {
		
		System.out.println("Enfermeiro medindo a press�o do paciente");
		
	}
	
	public void Medicar() {
		
		System.out.println("Enfermeiro medicando o paciente");
	}

}

