public class Main {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Jakub", 99.99);

        BankAccount.deposit(b1, 1000);
        b1.withdraw(10);
    }
}
