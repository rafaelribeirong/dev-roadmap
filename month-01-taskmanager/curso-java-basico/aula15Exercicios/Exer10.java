package aula15Exercicios;

import java.util.Scanner;

public class Exer10 {
    
        public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o turno em que você estuda (M - Matutino - V - Vespetino - N - Noturno ): ");
        String turno = scan.nextLine();

        switch (turno) {
            case "m":
            case "M": System.out.println(("Bom dia!")); break;
            case "v":
            case "V": System.out.println(("Boa tarde!")); break;
            case "n":
            case "N": System.out.println(("Boa noite!")); break;
            default: System.out.println(("Valor inválido!"));
        }
    
    
    }
}
