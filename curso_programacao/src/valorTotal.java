import java.util.Scanner;

public class valorTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int codigo1, codigo2, codigo3, codigo4, codigo5;
		String cachorroQuente, xSalada, xBacon, torradaSimples, refrigerante;
		double preco1, preco2, preco3, preco4, preco5;
		
		codigo1 = 1;
		preco1 = 4.00;
		codigo2 = 2;
		preco2 = 4.50;
		codigo3 = 3;
		preco3 = 5.00;
		codigo4 = 4;
		preco4 = 2.00;
		codigo5 = 5;
		preco5 = 1.50;
		
		int quantidade, codigo;
		double total;
		
		System.out.println("Qual o código do item?");
		codigo = sc.nextInt();
		System.out.println("Qual a quantidade?");
		quantidade = sc.nextInt();
		
		if (codigo == 1) {
			total = quantidade * preco1;
		} else if (codigo == 2) {
			total = quantidade * preco2;
		} else if (codigo == 3) {
			total = quantidade * preco3;
		} else if (codigo == 4) {
			total = quantidade * preco4;
		} else {
			total = quantidade * preco5;
		}
		System.out.printf("Total: R$ %.2f.", total);
		sc.close();
	}

}
