package DAY2.Classes_Objects;

import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Getters and Setters
    // NAME
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // BALANCE
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // FUNCTION FOR BALANCE
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

}

public class BankAccountManagement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // INPUTS
        String name = sc.nextLine();
        double InitialBalance = sc.nextDouble();
        sc.nextLine();
        String operation = sc.nextLine();

        double amount = sc.nextDouble();
        // Create instance of class
        BankAccount a=new BankAccount(name, InitialBalance);

        if(operation.equalsIgnoreCase("deposit"))
        {
            a.deposit(amount);
        }
        else if (operation.equalsIgnoreCase("withdraw")){
            a.withdraw(amount);
        }
        System.out.println("Account Holder: "+a.getAccountHolderName()+" AccountBalance: "+a.getBalance());
        sc.close();
    }
}
