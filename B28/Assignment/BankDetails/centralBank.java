public class centralBank extends Bank {
    String name;
    int Account_No;
    String Account_type;
    String Branch;

    centralBank(String name, int Account_No, String Account_type, String Branch) {
        System.out.println("Welcome to Central Bank");
        this.name = name;
        this.Account_No = Account_No;
        this.Account_type = Account_type;
        this.Branch = Branch;
    }

    void withdraw() {
        System.out.println("Dear " + name + ",\n" + "   The Maximum withdraw ammount is Rs.10,000");
    }

    void deposit() {
        System.out.println("Dear " + name + ",\n" + "   The Maximum deposit is Rs.20,000");
    }

    void getinterest() {
        System.out.println("The rate of Interest is 4%");
    }
}
