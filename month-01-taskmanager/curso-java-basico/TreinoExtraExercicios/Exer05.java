package TreinoExtraExercicios;

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite seu primeiro número:" );
        int num1 = scan.nextInt();

        System.out.println("Digite seu segundo número:" );
        int num2 = scan.nextInt();

        int soma = num1 + num2;
        int sub = num1 - num2;
        int mult = num1 * num2;
        int div = num1 / num1;

        System.out.println("A soma dos número que escollheu é: " + soma);
        System.out.println("A subtração dos número que escollheu é: " + sub);
        System.out.println("A multiplicação dos número que escollheu é: " + mult);
        System.out.println("A divisão dos número que escollheu é: " + div);


    
    }
    
}
