import java.util.Scanner;

public class impostoDeRenda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double salario = sc.nextDouble();
		double imposto;

		if (salario <= 2000) {
			imposto = 0.0;
		} else if (salario <= 3000) {
			imposto = (salario - 2000.0) * 0.08;
		} else if (salario <= 4500) {
			imposto = (salario - 3000) * 0.18 + 1000.0 * 0.08;
		} else {
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}

		if (imposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("Seu salário é R$ %.2f.\nE o imposto devido é: ", salario);
			System.err.printf("R$ %.2f.", imposto);
		}

	}

}
