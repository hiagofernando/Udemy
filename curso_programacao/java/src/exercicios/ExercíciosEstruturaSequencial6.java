package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercíciosEstruturaSequencial6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int cod1, qtd1, cod2, qtd2;
		double vlunit1, vlunit2, total;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		vlunit1 = sc.nextDouble();
		//System.out.printf("Codigo = " + cod1, "Quantidade = " + qtd1, "Valor Unitario = " + vlunit1);
		
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		vlunit2 = sc.nextDouble();
		//System.out.printf("Codigo = " + cod2, "Quantidade = " + qtd2, "Valor Unitario = " + vlunit2);
	
		total =  vlunit1 * qtd1 + vlunit2 * qtd2;

		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		System.out.println();
		
		sc.close();
	}

}
