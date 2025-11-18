package DAY3.Inheritence;

import java.util.Scanner;

class Account{
    protected int accountID;
    protected String holdername;
    public double balance;

    public Account(int accountID,String holdername,double balance){

        if(accountID>=100&& accountID<=999){
            this.accountID=accountID;
        }
        else{
            this.accountID=-1;
        }
        this.holdername=holdername;

        if(balance>=0){
            this.balance=balance;
        }
        else{
            this.balance=0;
        }
    }
    public void setAccountBalance(double balance){
         if(balance>=0){
            this.balance=balance;
        }
        else{
            this.balance=0;
        }
        System.out.println(this.balance);

    }

    public double credit(double amount){
        balance+=amount;
        return balance;
    }
    public void printDetails(){
        System.out.println(accountID +" "+ holdername+" "+" "+balance);
    }

}
class VIPAccount extends Account{

    public VIPAccount(int accountID,String holdername,double balance){
        super(accountID, holdername, balance);
    }
    @Override
    public void setAccountBalance(double balance){
        if(balance>=-10000){
            this.balance=balance;
        }
        else{
            this.balance=-10000;
        }
        System.out.println("The balance can be negative but no less than -10000\n");

    }

}

public class BankAccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        sc.nextLine();
        String name=sc.nextLine();
        double balance=sc.nextDouble();
        double CreadAmount=sc.nextDouble();
        double negativeB=sc.nextDouble();


        // Instance of base class
        Account acc=new Account(id, name, balance);
        acc.printDetails();

        // Credit Amount
        double newBal=acc.credit(CreadAmount);
        System.out.println(newBal);

        // Base Class SetAccountBalance
        acc.setAccountBalance(newBal);

        // Deriverd class instance
        VIPAccount vip=new VIPAccount(id, name, balance);
        vip.setAccountBalance(negativeB);
        sc.close();
        
    }
    
}
