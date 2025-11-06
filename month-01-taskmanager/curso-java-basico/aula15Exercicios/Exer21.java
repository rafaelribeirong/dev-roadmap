package aula15Exercicios;

import java.util.Scanner;

public class Exer21 {
    
     public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        System.out.println("Entre com a quantidade de litros vendidos: ");
        double litros = scan.nextDouble();

        System.out.println("Entre com tipo de combustível: ");
        String tipo = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percDesconto = 0;
        double total = 0;
        double totalDesc = 0;

        if (tipo.equalsIgnoreCase("a")){
            total = litros * precoAlc;

            if (litros <= 20){
                percDesconto =3;
            } else {
                percDesconto =5;
            }
        } else if (tipo.equalsIgnoreCase("g")) {
            total = litros * precoGas;
            
            if (litros <= 20){
                percDesconto =4;

            } else {
                percDesconto = 6;
            }
        }
         else {
            System.out.println("Tipo de combustível inválido!");
            return;
         }

            totalDesc = (total / 100) * percDesconto;

            double precoAPagar = total - totalDesc;

            System.out.println("Valor a ser pago: " + precoAPagar);
            
        }

    

     }



