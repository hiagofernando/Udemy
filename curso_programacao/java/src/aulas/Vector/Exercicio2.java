package aulas.Vector;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.printf("Quantas pessoas Serao Digitadas?");
        int n = sc.nextInt();

        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Dados da" + (i+1) + "a pessoa: ");
            System.out.print("Nome: ");
            nome[i] = sc.next();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();   
            
        }

        double soma = 0.0;
        for (int i=0; i<n; i++) {
            soma = soma + altura[i];
        }

        double mediaAltura = soma / n;

        System.out.println();
        System.out.printf("Altura media %.2f%n",mediaAltura);

        int cont = 0;
        for (int i=0; i<n; i++){
            if(idade[i] < 16){
                cont = cont = 1;
            }
        }

        double percent = cont * 100 / n;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percent);    

        for(int i=0; i<n; i++){
            if (idade[i]<16) {
                System.out.println(nome[i]);
                
            }
        }
        sc.close();
    }
    
}
