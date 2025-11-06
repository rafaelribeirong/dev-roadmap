package aula15Exercicios;

import java.util.Scanner;

public class Exer23 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o tipo de carne (F-File Duplo, A-Alcatra, P-Picanha): ");
        String tipo = scan.next();

        System.out.println("Informe a quantidade (em Kg): ");
        double kg = scan.nextDouble();

        System.out.println("A compra será feita com o cartão Tabajara? (S/N): ");
        String cartao = scan.next();

        double precoKg = 0;
        String nomeCarne = "";

        if (tipo.equalsIgnoreCase("F")) {
            nomeCarne = "File Duplo";
            if (kg <= 5) {
                precoKg = 4.90;
            } else {
                precoKg = 5.80;
            }

        } else if (tipo.equalsIgnoreCase("A")) {
            nomeCarne = "Alcatra";
            if (kg <= 5) {
                precoKg = 5.90;
            } else {
                precoKg = 6.80;
            }

        } else if (tipo.equalsIgnoreCase("P")) {
            nomeCarne = "Picanha";
            if (kg <= 5) {
                precoKg = 6.90;
            } else {
                precoKg = 7.80;
            }

        } else {
            System.out.println("Tipo de carne inválido!");
            return;
        }

        double total = kg * precoKg;
        double desconto = 0;
        String tipoPagamento;

        if (cartao.equalsIgnoreCase("S")) {
            desconto = total * 0.05;
            tipoPagamento = "Cartão Tabajara";
        } else {
            tipoPagamento = "Outro";
        }

        double valorFinal = total - desconto;

        System.out.println("----- CUPOM FISCAL -----");
        System.out.println("Tipo de carne: " + nomeCarne);
        System.out.println("Quantidade: " + kg + " Kg");
        System.out.println("Preço total: R$ " + total);
        System.out.println("Tipo de pagamento: " + tipoPagamento);
        System.out.println("Valor do desconto: R$ " + desconto);
        System.out.println("Valor a pagar: R$ " + valorFinal);
    }
}
