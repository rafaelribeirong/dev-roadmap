import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args){
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com o valor/hora");
    double valorHora = scan.nextDouble();

    System.out.println("Entre com a quantidade de hora trabalhada no mês:");
    double horas =scan.nextDouble();

    double salario = valorHora * horas;

    System.out.println("O salário é de:" + salario);
    
    //todas variaveis que estamos criando significam algo, ajuda na leitura para quem for ler/manutenção.
    }
}
