package aula15Exercicios;

import java.util.Scanner;

public class Exer20 {
    
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para a vitima?");
        String resp1 = scan.nextLine();

        System.out.println("Esteve no local do crime?");
        String resp2 = scan.nextLine();

        System.out.println("Mora perto da vítima?");
        String resp3 = scan.nextLine();

        System.out.println("Já trabalhou com a vítima?");
        String resp4 = scan.nextLine();

        System.out.println("Devia para a vítima?");
        String resp5 = scan.nextLine();

        int cont = 0;

        if (resp1.equalsIgnoreCase("S")){
            cont++;

        }

        if (resp2.equalsIgnoreCase("S")){
            cont++;
        }
        if (resp3.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp4.equalsIgnoreCase("S")){
            cont++;
        }

        if (resp5.equalsIgnoreCase("S")){
            cont++;
        }

        if (cont == 2 ){
            System.out.println("Suspeito!");

        } else if (cont == 3 || cont == 4 ){
            System.out.println("Cumplice!");

        } else if (cont == 5 ){
            System.out.println("Assasino!");

        } else if (cont == 0 ){
            System.out.println("Inocente!");
}
}
     }
    