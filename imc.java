package Anexo_7;

import java.util.Scanner;

public class imc_condicional {
    static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double imc, peso, altura;
        String nome;
        String seuIMC = "Seu imc está: ";
        System.out.println("Insira seu nome:");
        nome = scan.nextLine();

        System.out.println("insira seu peso:");
        peso = scan.nextDouble();

        System.out.println("insira sua altura (em metros):");
        altura = scan.nextDouble();

        imc = peso/(altura*altura);

        if (20 > imc) {
            System.out.println(seuIMC + "Abaixo");
        } else if ( 25 > imc){
            System.out.println(seuIMC + "Normal");
        } else if ( 30 > imc){
        System.out.println(seuIMC + "Acima do peso");
        } else if ( 40 > imc){
        System.out.println(seuIMC + "Obeso");
        } else {
        System.out.println(seuIMC + "Obeso mórbido");
        }
    }
}
