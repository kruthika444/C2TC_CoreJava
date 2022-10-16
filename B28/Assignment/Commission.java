import java.util.Scanner;

public class Commission {
    String Name;
    String Address;
    int Phone;
    double amount;
    double commission;

    void accept() {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the employee name: ");
            Name = input.nextLine();
            System.out.print("Enter the employee address: ");
            Address = input.nextLine();
            System.out.print("Enter employee's phone number:");
            Phone = input.nextInt();
            System.out.print("Enter the Sales amount: ");
            amount = input.nextInt();
        }
    }

    double calculate() {
        if (amount >= 100000) {
            commission = (10.0 / 100.0) * amount;
        } else if ((amount >= 50000) && (amount < 100000)) {
            commission = (5.0 / 100.0) * amount;
        } else if ((amount >= 30000) && (amount < 50000)) {
            commission = (3.0 / 100.0) * amount;
        } else {
            commission = 0;
        }
        return commission;
    }

    public static void main(String args[]) {
        Commission c = new Commission();
        c.accept();
        System.out.println(c.calculate());
    }
}
