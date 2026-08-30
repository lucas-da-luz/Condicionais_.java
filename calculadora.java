package Anexo_7;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        int A, B, opcao;
        float resultado = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero A: ");
        A = scan.nextInt();

        System.out.print("Digite o numero B: ");
        B = scan.nextInt();

        // Loop de validacao da opcao da operacao (1 a 4)
        do {
            System.out.println("Selecione a operacao:");
            System.out.println("1 - Adicao (+)");
            System.out.println("2 - Subtracao (-)");
            System.out.println("3 - Multiplicacao (*)");
            System.out.println("4 - Divisao (/)");
            System.out.print("Digite o numero da opcao: ");
            opcao = scan.nextInt();

            if (opcao == 1) {
                resultado = A + B;
            } else if (opcao == 2) {
                resultado = A - B;
            } else if (opcao == 3) {
                resultado = A * B;
            } else if (opcao == 4) {
                if (B != 0) {
                    resultado =  A / B;
                } else {
                    System.out.println("Erro: Nao e possivel dividir por zero!");
                }
            } else {
                System.out.println("Opcao invalida! Digite um numero de 1 a 4.");
            }

        } while (opcao < 1 || opcao > 4);

        if (opcao != 4 || B != 0) {
            System.out.printf("Resultado da operacao: %f", resultado);
        }
    }
}