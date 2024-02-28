import java.util.Locale;
import java.util.Scanner;

public class areaDoCirculo {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double e = sc.nextDouble();
		double pi = 3.14159;
		double area = pi * Math.pow(e, 2);
		
		System.out.printf("O valor digitado foi %f e área é %.4f", e, area);
		
		sc.close();
	}
}
