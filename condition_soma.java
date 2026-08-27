package Anexo_7;

import java.util.Scanner;

public class condition_soma {
    public static void main(String[] args){

        float a, b, c, d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira os valores de A, B e para C");

        a = scanner.nextFloat();
        b = scanner.nextFloat();
        c = scanner.nextFloat();

        scanner.close();

        d = a + b;

        if ( c > d ){
            System.out.printf("O seu novo número é maior que %.2f: %.2f", c, d);
        } else {
            System.out.printf("O seu novo número é menor que %.2f: ", c);
        }


    }
}
