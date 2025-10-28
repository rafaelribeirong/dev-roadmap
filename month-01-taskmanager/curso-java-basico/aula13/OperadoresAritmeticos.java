package aula13;

import javax.print.DocFlavor.STRING;

public class OperadoresAritmeticos {
    
    public static void main(String[] args){

        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2; 
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 3;

        String primeiroNome = "Esta é: ";
        String segundoNome = "uma String concatenada.";
        String terceiroNome = primeiroNome + segundoNome;
        System.out.println(terceiroNome);
        //existem outras maneiras melhores de fazer isso, porém estamos iniciando e o conhecimento é importante!

        resultado = resultado + 1;
        System.out.println(resultado);

        resultado ++;
        System.out.println(resultado);

        //5

        System.out.println(resultado++);
        System.out.println(++resultado);

        // System.out.println(resultado++); --> Mostra o valor atual de resultado, depois soma 1. Incrementa depois de mostrar.

        //System.out.println(++resultado); --> Soma 1 primeiro, depois mostra o novo valor. Incrementa antes de mostrar.


    }

   }     
