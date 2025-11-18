package DAY3.Absract_Classes_Interfaces;

import java.util.Scanner;
import java.time.LocalDate;

interface MaintenanceCharge {
    double computeMaintennaceCharge(int years);
}

class Account {
    String name;
    long number;
    double balance;
    LocalDate startDate;

    Account(String name, long number, double balance, LocalDate startDate) {
        this.name = name;
        this.number = number;
        this.balance = balance;
        this.startDate = startDate;
    }

}

class CurrentAccount extends Account implements MaintenanceCharge {
    CurrentAccount(String name, long number, double balance, LocalDate startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double computeMaintennaceCharge(int years){
        int m=100;
        return (m*years)+200;
    }
}

class SavingsAccount extends Account implements MaintenanceCharge {
    SavingsAccount(String name, long number, double balance, LocalDate startDate) {
        super(name, number, balance, startDate);
    }

    @Override
    public double computeMaintennaceCharge(int years){
        int m=50;
        return (2*m*years)+50;
    }
}

public class Bank_Returns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // INPUT SECTION
        System.out.println("1.Current Account\n2.Savings Account");

        int choice = sc.nextInt();
        sc.nextLine();// Consume newline

        System.out.println("Name");
        String name = sc.nextLine();

        System.out.println("Account Number");
        long Number = sc.nextLong();

        System.out.println("Account Balance");
        double balance = sc.nextDouble();
        sc.nextLine();
        System.out.println("Enter the Start Date(yyyy-mm-dd)");
        LocalDate startDate = LocalDate.parse(sc.nextLine());

        System.out.println("Enter the number of Years");
        int years = sc.nextInt();

        if(choice==1){
            CurrentAccount ca=new CurrentAccount(name, Number, balance, startDate);
            double charge=ca.computeMaintennaceCharge(years);
            System.out.println("MaintainanceCharge: "+charge);
        }
        else if(choice==2){
            SavingsAccount ca=new SavingsAccount(name, Number, balance, startDate);
            double charge=ca.computeMaintennaceCharge(years);
            System.out.println("MaintainanceCharge: "+charge);
        }
        else{
            System.out.println("Inavlid choice");
        }

    }


}
