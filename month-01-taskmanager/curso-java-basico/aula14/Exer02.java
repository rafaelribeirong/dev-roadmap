package aula14;

import java.util.Scanner;

public static class Exer02 {
    
        public void main(String[] args){

            Scanner scan = new Scanner(System.in);

            System.out.println(("Entre com um número inteiro:"));
            int numero = scan.nextInt();
            System.out.println("O número informado foi: " + numero);
        }
    }