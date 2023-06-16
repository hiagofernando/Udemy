package aulas;

import java.util.Locale;
import java.util.Scanner;

public class operadoresAtribuicaoCumulativa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt(); 
		
		double valor = 50.0;
		
		if (minutos <= 100) {
			
			System.out.println("Valor da fatura R$50");
			
		}
		
		else {
			valor = valor + (minutos - 100) * 2;
			//valor += (minutos - 100) * 2; tambem da certo.
			System.out.printf("Minutos escedidos, Valor da fatura: R$:%.2f%n", valor);
		}

	}

}
