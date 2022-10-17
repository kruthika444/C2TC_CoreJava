public class BankAbstraction {
    public static void main(String[] args) {
        centralBank cb = new centralBank("Maya", 76885940, "Savings", "Hosur");
        cb.withdraw();
        cb.deposit();
        cb.getinterest();
    }
}
