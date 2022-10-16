import java.util.Scanner;

public class threes_multiple {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter any number:");
            int num = input.nextInt();
            if (num % 3 == 0) {
                System.out.println("It is a multiple of 3");
            } else {
                System.out.println("Its not a multiple of 3");
            }
        }
    }

}
