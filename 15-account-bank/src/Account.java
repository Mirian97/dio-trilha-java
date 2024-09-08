public abstract class Account implements IAccount {
    private int agency;
    private int number;
    private double balance;
    private Customer customer;

    private static final int AGENCY = 1;
    private static int SEQUENTIAL = 1;

    public Account(Customer customer){
        this.number = SEQUENTIAL++;
        this.agency = AGENCY;
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    protected void printInfos(){
        System.out.println(String.format("Customer name: %s", customer.getName()));
        System.out.println(String.format("Agency: %d", agency));
        System.out.println(String.format("Number: %d", number));
        System.out.println(String.format("Balance: %.2f", balance));
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void transfer(double value, Account destinationAccount) {
        withdraw(value);
        destinationAccount.deposit(value);
    }
}
