/**
 * ContaPoupanca
 */
public class SavingsAccount extends Account {

    public SavingsAccount(Customer customer) {
        super(customer);
    }

    public void printStatement() {
       System.out.println("==== SAVINGS ACCOUNT ====");
       super.printInfos();
    }

}