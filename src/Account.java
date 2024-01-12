public class Account {
    /*  UC2:-class Account to provide a method called debit that withdraws money
from an Account. Ensure that the debit amount does not exceed the Account’s
balance. If it does, the balance should be left unchanged and the method
should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.*/
double accountBalance;

    public Account(double accountBalance) { //Class constructor
        this.accountBalance = accountBalance;
        System.out.println("Account balance is:"+accountBalance);
    }

    public void debit(double amount)  //Debit method .
    {
        if(amount>accountBalance)
        {
            System.out.println("Insufficient balance to withdraw");
        }
        else {
            double balance=accountBalance-amount;
            System.out.println("Amount to be Debit:"+amount);
            System.out.println("Remaining balace in account is"+balance);
        }
    }
    public static void main(String args[])
    {
        System.out.println("Account Info Details:");
        Account account =new Account(100000);
        account.debit(23589);
        account.debit(1500000);

    }

}
