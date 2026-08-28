import java.util.Scanner;

public class nota_condicional{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float n1, n2, media;
        String condition;
        System.out.print("Insira a nota 1:\n");
        n1 = scan.nextFloat();

        System.out.print("Insira a nota 1:\n");
        n2 = scan.nextFloat();

        media = ( n1 + n2 ) / 2;

        if ( media >= 5) {
            condition = "Aprovado!";
            System.out.printf("Parabéns sua nota foi: %.1f \n Condição: %s", media, condition);
        } else if ( media >= 3 ) {
            condition = "Recuperação.";
            System.out.printf("Infelizmente sua nota foi: %.1f \nCondição: %s", media, condition);
        } else {
            condition = "Reprovado";
            System.out.printf("infelizmente sua nota foi: %.1f \nCondição: %s", media, condition);
        }
    }
}
