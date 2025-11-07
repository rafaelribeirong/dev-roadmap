package TreinoExtraExercicios;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: "); 
        double nota1 = scan.nextDouble();
        
        System.out.println("Digite sua segunda nota: "); 
        double nota2 = scan.nextDouble();

        System.out.println("Digite sua terceira nota: "); 
        double nota3 = scan.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Sua média é : " + media);

        if ( nota1 > nota2 && nota1 > nota3){
            System.out.println("Sua maior nota é: " + nota1);
        } else if ( nota2 > nota1 && nota2 > nota3){
            System.out.println("Sua maior nota é: " + nota2);
        } else {
            System.out.println("Sua maior nota é: " +nota3);
        }

    }
    
}
