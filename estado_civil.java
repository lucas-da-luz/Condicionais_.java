package Anexo_7;

import java.util.Scanner;

public class estado_civil {
    public static void main(String[] args) {

        // Precisa atribuir um valor por conta da possibilidade do homem não precisar de pergunta.
        // então pra ter a possibilidade de sair do loop precisa atribuir um valor.

        String estadoc = "", sexo, nome;
        int opcaoEstadoCivil, tempo_casado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        nome = scanner.nextLine();

            // Do para executar o loop enquanto o While não for feito

        do {
            System.out.print("Insira seu sexo (F/M): ");
            sexo = scanner.nextLine().trim();

            if (sexo.equalsIgnoreCase("F")) {
                sexo = "Feminino";
            } else if (sexo.equalsIgnoreCase("M")) {
                sexo = "Masculino";
            } else {
                System.out.println("Opção inválida! Digite apenas F ou M.\n");
            }
        } while (!sexo.equals("Feminino") && !sexo.equals("Masculino"));

        // (!sexo.equals("Feminino") && !sexo.equals("Masculino")) Utilizado para só passar quando a String guardar aquela informação

        do {
                System.out.print("Selecione seu Estado Civil:\n1 - Casado(a)\n2 - Solteiro(a)\n3 - Viúvo(a)\nDigite o número da opção: ");
                opcaoEstadoCivil = scanner.nextInt();
                if (opcaoEstadoCivil == 1) {
                    estadoc = "Casado";
                } else if (opcaoEstadoCivil == 2) {
                    estadoc = "Solteiro";
                } else if (opcaoEstadoCivil == 3) {
                    estadoc = "Viúvo";
                } else {
                    System.out.print("Opção inválida");
                }
        }  while ( opcaoEstadoCivil < 1 || opcaoEstadoCivil > 3 );

        // Ignore case usado para não importar se for letra minuscula ou maiuscula

        if (sexo.equalsIgnoreCase("Feminino") && opcaoEstadoCivil == 1) {
            System.out.print("\nInsira o tempo de casada (em anos): ");
            tempo_casado = scanner.nextInt();
        }


        System.out.println("\n--- Resumo do Cadastro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoc +"(a)");

        if (tempo_casado > 0) {
            System.out.println("Tempo de casada: " + tempo_casado + " anos");
        }
    }
}