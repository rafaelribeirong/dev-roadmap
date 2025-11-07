package TreinoExtraExercicios;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit;

public class Exer07 {
    public  static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua primeia nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a sua segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a sua terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.println("Digite a sua quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) /4;
        System.out.println("A média da suas notas é: " + media);

        if (media >= 7  ){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
    
}
