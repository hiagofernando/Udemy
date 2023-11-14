package aulas.Vector;

import java.util.Locale;
import java.util.Scanner;

import aulas.Vector.Entiti.RentExercicio;


public class Exercicio3 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        RentExercicio[] vect = new RentExercicio[10];

        System.out.print("Quantos quartos! ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++){
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: "); 
            sc.nextLine();     
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new RentExercicio(name, email);
        }

        System.out.println();    
        System.out.println("Quatos alugados! ");
            for(int i=0; i<10; i++){
                if (vect[i] != null) {
                   System.out.println(i + ": " + vect[i]); 
                }
            }
            sc.close();
        }
        
    }