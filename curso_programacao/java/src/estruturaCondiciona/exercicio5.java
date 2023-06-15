package estruturaCondiciona;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int codigo, qtd;
		double valor;
		
		codigo = sc.nextInt();
		qtd = sc.nextInt();
		
		
		if (codigo == 1) {
			valor = qtd * 4.0;
			System.out.println("Valor a pagar = " + valor);
		}
		else if (codigo == 2) {
			valor = qtd * 4.5;
			System.out.println("Valor a pagar = " + valor);
		}
		else if (codigo == 3) {
			valor = qtd * 5.0;
			System.out.println("Valor a pagar = " + valor);
		}
		else if (codigo == 4) {
			valor = qtd * 2.0;
			System.out.println("Valor a pagar = " + valor);
		}
		else {
			valor = qtd * 1.5;
			System.out.println("Valor a pagar = " + valor);
		}
		
		sc.close();
	}
}