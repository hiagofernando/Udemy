package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercíciosEstruturaSequencial3{

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A, B, C, D, Diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		Diferenca = A * B - C * D; 
		
		System.out.printf("Diferencça = %d%n", Diferenca);
		System.out.println();
		
		
		sc.close();
	}

}
