import java.util.Scanner;
public class multiplos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b;
		System.out.println("Digite um número:");
		a = sc.nextInt();
		System.out.println("Digite outro número:");
		b = sc.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("São multíplos");
		} else {
			System.out.println("Não são multíplos");
		}
		sc.close();
	}

}
