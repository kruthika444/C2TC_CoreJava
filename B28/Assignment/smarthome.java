import java.util.Scanner;

public class smarthome {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the time");
            int time = input.nextInt();
            if (time > 0 && time <= 24) {
                if ((time < 6) || (time < 17 && time > 9)) {
                    System.out.println("lights OFF");
                } else if (time >= 6 && time <= 9) {
                    System.out.println("lights ON");
                } else {
                    System.out.println("lights ON");
                }
            }
        }
    }
}
