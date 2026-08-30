package Anexo_7;

import java.util.Scanner;

public class intervalo_numerico {
    static void main(String[] args) {
        float numero;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o seu número:");
        numero = scan.nextFloat();

        if ( numero > 100 || 200 > numero) {
            System.out.println("Seu número está no intervalo.");
        } else {
            System.out.println("Seu número não está no intervalo.");
        }

    }
}
