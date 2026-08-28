import java.util.Scanner;

public class soma_if_equal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float a, b, c = 0;

        System.out.println("Insert the number A:");
        a = scanner.nextFloat();

        System.out.println("Insert the number B:");
        b = scanner.nextFloat();
        
        
        if ( a == b){
            c = a + b;
        } else if ( a > b || b > a ) {
            c = a * b;
        }
        System.out.println("Your new number is: " + c);

    }
}
