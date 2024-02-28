import java.util.Scanner;

public class positivoNegativo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite um número:");
		n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		sc.close();
	}

}
