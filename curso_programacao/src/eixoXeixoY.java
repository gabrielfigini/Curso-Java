import java.util.Locale;
import java.util.Scanner;

public class eixoXeixoY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("Digite o valor de X:");
		x = sc.nextDouble();
		System.out.println("Digite o valor de Y:");
		y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x == 0){
			System.out.println("Eixo X");
		} else if (y == 0){
			System.out.println("Eixo Y");
		}
		
		sc.close();
	}

}
