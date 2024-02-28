import java.util.Locale;
import java.util.Scanner;

public class tresValores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c, areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		areaTrianguloRetangulo = (a * c) / 2;
		areaCirculo = 3.14159 * Math.pow(c, 2);
		areaTrapezio = (c * (a + b)) / 2;
		areaQuadrado = Math.pow(b, 2);
		areaRetangulo = a * b;

		System.out.printf("Triângulo: %.3f.\nCírculo: %.3f.\nTrapézio: %.3f.\nQuadrado: %.3f.\nRetângulo: %.3f.",
				areaTrianguloRetangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo);
		sc.close();
	}
}
