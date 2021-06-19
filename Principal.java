package ProjetoLP2;

public class Principal {
	
public static void main(String[] args) {
		
		Medico medico = new Medico("Joao", "Médico", 43210);
		Enfermeiro enfermeiro = new Enfermeiro("Jose", "Enfermeiro", 78910);
		Fisio fisio = new Fisio("Maria", "Fisioterapeuta", 98765);
		Paciente paciente1 = new Paciente("Joana", 15, 12345);
		
		Funcionario.id(1);
		
		medico.Dados();
		medico.AvaliarEvolucao();
		medico.MedirPressao();
		medico.Medicar();
		
		enfermeiro.Dados();
		enfermeiro.AvaliarEvolucao();
		enfermeiro.MedirPressao();
		enfermeiro.Medicar();
		
		fisio.Dados();
		fisio.AvaliarEvolucao();
		fisio.MedirPressao();
		fisio.Medicar();
		
		paciente1.Prontuario();
		paciente1.Leito();
		
	}
}
