package ProjetoLP2;

public class Funcionario {

	public String nome;
	public String especialidade;
	private int cpf;
//	Atributo estático, pois o código será o mesmo para todos os funcionários. 
//	No caso, irei usar todos os especialistas que tem como código o número 1."
	public static int codigo;
	
	//Construtor da classe Funcionario (inicializador):
	
	public Funcionario(String nome, String especialidade, int cpf) {
		
		this.nome = nome;	
		this.especialidade = especialidade;
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
	
	//Método estático para operar sobre o atributo estático "Código":
	
	public static int id(int codigo) {
		
		System.out.println("Funcionários que têm ID = 1");
		return codigo;
	}

}
