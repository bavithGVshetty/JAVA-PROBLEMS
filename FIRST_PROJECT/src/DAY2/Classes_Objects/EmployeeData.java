package DAY2.Classes_Objects;

import java.util.Scanner;

class mployeeData{
    private String name;//Class variable
    private double salary;

    public void setName(String name){
        this.name=name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getName(){
       return name;
    }
    public double getSalary(){
        return salary;
    } 
    }
class EmployeeData {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        double salary=sc.nextDouble();
        double newSalary=sc.nextDouble();
        mployeeData emp=new mployeeData();
        // emp.salary=1000;
        emp.setName(name);
        emp.setSalary(newSalary);
        System.err.println("Employee Name:"+emp.getName()+"Emplyee Salary: "+emp.getSalary());
        sc.close();
    }
    

}