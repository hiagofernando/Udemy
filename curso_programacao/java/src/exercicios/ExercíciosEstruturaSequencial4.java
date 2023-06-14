package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercíciosEstruturaSequencial4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numF, numH;
		double salario, numVH;
		
		numF = sc.nextInt();
		numH = sc.nextInt();
		numVH = sc.nextDouble();
		
		salario = numH * numVH;
		
		System.out.println("Number = " + numF);
		System.out.printf("Salary = %.2f%n", salario);
		System.out.println();
		
		sc.close();
	}

}
