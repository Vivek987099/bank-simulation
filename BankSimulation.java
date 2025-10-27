public class BankSimulation {
    public static void main(String[] args) {

        // object creation and method calls
        Account acc1 = new Account("Mr. Arya", 1000.0);
        acc1.deposite(14000);
        acc1.withdraw(500);
        acc1.transactions();
    }
}
