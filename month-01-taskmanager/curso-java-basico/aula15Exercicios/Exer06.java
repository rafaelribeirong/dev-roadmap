package aula15Exercicios;

import java.util.Scanner;

public class Exer06 {
       public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primiero número:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo número:");
        int num2 = scan.nextInt();

        System.out.println("Entre com o terceiro número:");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("Numero um é maior!" + num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("Número 2 é maior!" + num2);
        } else if (num3 >= num1 && num3 >= num2){
            System.out.println("Número 3 é maior!" + num3);
        }

        
}
}