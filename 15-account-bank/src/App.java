public class App {
    public static void main(String[] args) {
        Customer mirian = new Customer("Mirian");
        CheckingAccount checkinAccount = new CheckingAccount(mirian);
        SavingsAccount savingsAccount = new SavingsAccount(mirian);

        checkinAccount.deposit(500);
        checkinAccount.transfer(100, savingsAccount);

        checkinAccount.printStatement();
        savingsAccount.printStatement();
    }
}
