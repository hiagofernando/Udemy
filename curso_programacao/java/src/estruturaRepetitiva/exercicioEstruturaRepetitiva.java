package estruturaRepetitiva;

import java.util.Scanner;

public class exercicioEstruturaRepetitiva {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = sc.nextInt();

		while (senha != 2002) {
			System.out.println("Senha Invalida!");
			senha = sc.nextInt();

		}

		System.out.print("Acesso Permitido");

		sc.close();

	}

}
