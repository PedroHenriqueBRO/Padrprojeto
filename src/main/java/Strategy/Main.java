package Strategy;

public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100);
		System.out.println(umFuncionario.calcularSalarioComImposto());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.GERENTE,
				3550);
		System.out.println(outroFuncionario.calcularSalarioComImposto());
	}
}
