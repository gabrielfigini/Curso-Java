import java.util.Scanner;

public class precoPeca {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigoPeca1, numeroPecas1, codigoPeca2, numeroPecas2;
		codigoPeca1 = sc.nextInt();
		numeroPecas1 = sc.nextInt();
		double valorPeca1 = sc.nextDouble();

		codigoPeca2 = sc.nextInt();
		numeroPecas2 = sc.nextInt();
		double valorPeca2 = sc.nextDouble();

		double valorTotal = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

		sc.close();
	}
}
