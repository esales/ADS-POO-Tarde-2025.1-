package exercicio04;

public class Principal {
	public static void main(String[] args) {
		Funcionario func01 = new Funcionario("Teste 1", 30, 4000);
		Funcionario func02 = new Funcionario("Teste 2", 20, 5000);
		Funcionario func03 = new Funcionario("Teste 3", 40, 2000);

		func01.imprimirInfo();
		func02.imprimirInfo();
		func03.imprimirInfo();
		
		Funcionario[] funcionarios = new Funcionario[5];
		
		funcionarios[0] = func01;
		funcionarios[1] = func02;
		funcionarios[2] = func03;
		funcionarios[3] = new Funcionario("Teste 4", 25, 2500);
		funcionarios[4] = new Funcionario("Teste 5", 35, 3500);
		
		funcionarios[0].imprimirInfo();
		
		func01.setIdade(99);
		
		funcionarios[0].imprimirInfo();
	}
}