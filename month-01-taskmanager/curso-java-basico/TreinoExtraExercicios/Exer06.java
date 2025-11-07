package TreinoExtraExercicios;

import java.util.Scanner;

public class Exer06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();

        System.out.println("Digite o segundo número: ");
        int num3 = scan.nextInt();

        System.out.println("A soma de seus números são: " + (num1 + num2 + num3));
        int media = (+ num1 + num2 + num3) / 3;
        System.out.println("A média aritmética dele é: " + media);

    }
    
}
