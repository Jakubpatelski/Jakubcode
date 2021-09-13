public class BankAccount {




    private String name;
    private double balance;

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double Balance) {
        this.balance = balance;
    }

    public static void deposit(BankAccount account, int deposit) {
        account.setBalance(account.getBalance() + deposit);
        System.out.println(account.getBalance() + " DKK is on your account");
        System.out.println(deposit+" DKK amount was deposited");
        System.out.println(account.balance + deposit + " = DKK is on your account now");

    }
    public void withdraw(int withdraw) {
        setBalance(getBalance() - withdraw);
        System.out.println(getName() +" "+withdraw+"  DKK amount was withdrawn");

    }



    }


