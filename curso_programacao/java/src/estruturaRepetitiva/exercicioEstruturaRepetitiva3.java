package estruturaRepetitiva;

import java.util.Scanner;

public class exercicioEstruturaRepetitiva3 {

	public static void main(String[] args) {

		System.out.println("Selecione o conbustivel preferido " + "1-Alcool, 2-Gasolina, 3-Diesel, 4-Sair");

		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		while (cod != 4) {
			if (cod == 1) {

				alcool = alcool + 1;

			} else if (cod == 2) {

				gasolina = gasolina + 1;

			} else if (cod == 3) {

				diesel = diesel + 1;

			} else {

				System.out.println("Digite uma opção valida!");

			}
			cod = sc.nextInt();

		}
		System.out.println("Muito Obriago!");
		System.out.printf("Alcool:%d%n", alcool);
		System.out.printf("Gasolina:%d%n", gasolina);
		System.out.printf("Diesel:%d%n", diesel);

		sc.close();
	}
}