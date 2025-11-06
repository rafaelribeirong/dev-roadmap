package aula15Exercicios;

import java.util.Scanner;

public class Exer22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a quantidade (em Kg) de morangos: ");
        double kgMorango = scan.nextDouble();

        System.out.println("Informe a quantidade (em Kg) de maçãs: ");
        double kgMaca = scan.nextDouble();

        double precoMorango;
        double precoMaca;

        if (kgMorango <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double totalMorango = kgMorango * precoMorango;
        double totalMaca = kgMaca * precoMaca;
        double totalCompra = totalMorango + totalMaca;
        double totalKg = kgMorango + kgMaca;

        if (totalKg > 8 || totalCompra > 25.00) {
            totalCompra = totalCompra - (totalCompra * 0.10);
        }

        System.out.println("Valor total a pagar: R$ " + totalCompra);
    }
}
