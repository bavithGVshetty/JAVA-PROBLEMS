package DAY3.Polymorphism;

import java.util.Scanner;

class Employee{
    double salary;

    Employee(double salary){
        this.salary=salary;
    }
    double calculateBonus(){
        return salary*0.10;
    }
}

class Manager extends Employee{
    Manager(double salary){
        super(salary);
        }
        @Override
        double calculateBonus(){
            return salary*0.15;
        }
}

public class Company_Bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String role=sc.nextLine().trim();
        double salary=sc.nextDouble();

        Employee emp;

        if(role.equalsIgnoreCase("MANAGER")){
            emp=new Manager(salary);
        }
        else{
            emp=new Employee(salary);
        }

        double bonus =emp.calculateBonus();
        System.out.println("Bonus: "+bonus);


        
    }
    
}
