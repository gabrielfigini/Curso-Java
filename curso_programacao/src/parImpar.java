import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Digite um número:");
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Ímpar");
		}
		sc.close();

	}

}
