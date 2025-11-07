package TreinoExtraExercicios;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

      System.out.println("Digite um número de sua escolha: ");
      double numero = scan.nextDouble();
      System.out.println("Você digitou: " + numero);
      
      double dobro = numero * 2;
      System.out.println("O dobro é: " + dobro);

      
    }
    
}
