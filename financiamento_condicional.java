package Anexo_7;

import java.util.Scanner;

public class financiamento_condicional {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salario, financiamento;

        System.out.print("Insira o valor do seu salário: R$ ");
        salario = scan.nextFloat();

        System.out.print("Insira o valor do financiamento pretendido: R$ ");
        financiamento = scan.nextFloat();

        if (financiamento <= (salario * 5)) {
            System.out.println("Financiamento Concedido");
        } else {
            System.out.println("Financiamento Negado");
        }

        scan.close();
    }
}