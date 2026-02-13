public class bankaccounttester { 
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        acc1.deposit(10000);
        acc1.withdraw(500);
        System.out.println("Account 1 balance: " + acc1.getBalance());

        BankAccount acc2 = new BankAccount(20000);
        acc2.deposit(1000);
        acc2.withdraw(1500);
        System.out.println("Account 2 balance: " + acc2.getBalance());
    }
}

