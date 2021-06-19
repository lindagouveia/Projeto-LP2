package ProjetoLP2;

public class Funcionario {

	public String nome;
	public String especialidade;
	private int cpf;
//	Atributo est�tico, pois o c�digo ser� o mesmo para todos os funcion�rios. 
//	No caso, irei usar todos os especialistas que tem como c�digo o n�mero 1."
	public static int codigo;
	
	//Construtor da classe Funcionario (inicializador):
	
	public Funcionario(String nome, String especialidade, int cpf) {
		
		this.nome = nome;	
		this.especialidade = especialidade;
		this.cpf = cpf;
	}

	//Precisa-se dos modificadores de acesso, pois o atributo cpf � privado 
	//(os atributos pvd n�o podes ser usados por nenhuma outra classe)
	
	public int getCPF() {
		
		return cpf;
	}
	
	public void setCPF(int cpf) {
		
		this.cpf = cpf;
	}
	
	//M�todo est�tico para operar sobre o atributo est�tico "C�digo":
	
	public static int id(int codigo) {
		
		System.out.println("Funcion�rios que t�m ID = 1");
		return codigo;
	}

}
