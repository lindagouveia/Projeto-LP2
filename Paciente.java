package ProjetoLP2;

//A classe Paciente irá implementar os métodos da interface Hospital:

public class Paciente implements Hospital { 
	
	public String nome;
	private int cpf;
	public int idade;
	//Relacionamento 1,1 com as classes medico, fisio e enfermeiro:
	Medico medico; 
	Fisio fisio; 
	Enfermeiro enferm;
	
	//Construtor da classe Paciente:
		
	public Paciente(String nome, int idade, int cpf) { 
		
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}
	
	//Precisa-se dos modificadores de acesso, pois o atributo cpf é privado 
   //(os atributos pvd não podes ser usados por nenhuma outra classe)
	
	public int getCPF() { 
		
		return cpf;
	}
	
	public void setCPF(int cpf) {
		
		this.cpf = cpf;
	}
	
	// Implementação dos métodos da interface Hospital:
	
	public void Prontuario() { 
		
		System.out.println("Prontuário do paciente localizado: ");
		System.out.println("Nome do paciente: " + nome);
		System.out.println("Idade do paciente: " + idade + " anos");
		System.out.println("CPF do paciente: " + getCPF());
	}
	
	public void Leito() {
		
		System.out.println("Leito Localizado: ");
		System.out.println("O paciente se encontra no leito 05");
	}
}
