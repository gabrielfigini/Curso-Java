import java.util.Scanner;

public class salarioFuncionario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = horasTrabalhadas * valorPorHora;
		
		System.out.printf("O número do funcionário é %d e o salário dele é de R$ %.2f.", numeroFuncionario, salario);
		
		sc.close();
	}

}
