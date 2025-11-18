package DAY3.Polymorphism;

import java.util.Scanner;

public class Bank {

    public double getInterestRate(String type,double amount){
        if(type.equalsIgnoreCase("Savings")){
            return amount*0.04;
        }
        else if(type.equalsIgnoreCase("FixedDeposit")){
            return amount*0.06;
        }
        else if(type.equalsIgnoreCase("ReccurringDeposit")){
            return amount*0.05;
        }
        else{
            return 0.0;
        }
    }
    public double getInterestRate(int code,double amount){
        if(code==1){
            return amount*0.04;
        }
        else if(code==2){
            return amount*0.06;
        }
        else if(code==3){
            return amount*0.05;
        }
        else{
            return 0.0;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String accountType=sc.nextLine();
        double amount=sc.nextDouble();

        Bank bank =new Bank();

        double interest=bank.getInterestRate(accountType, amount);

        System.out.println("InterestL: "+ interest);
    }
    
}
