/**
 * ContaCorrente
 */
public class CheckingAccount extends Account {

    public CheckingAccount(Customer customer) {
        super(customer);
    }

    public void printStatement() {
       System.out.println("==== CHECKING ACCOUNT ====");
       super.printInfos();
    }
}