package aula15Exercicios;

import java.util.Scanner;
public class Exer01 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1  = scan.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2  = scan.nextDouble();

       if (num1 > num2){
       System.out.println("O número 1 é maior:" + num1);
    } else {
        System.out.println("O número 2 é maior:" + num2);

    }

    }

}
