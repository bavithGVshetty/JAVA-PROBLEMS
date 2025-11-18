package DAY2.Inheritence;

import java.util.Scanner;

class EmployeeDetails{
    public int empId;
    float salary;
    EmployeeDetails(int empId,float salary){
        this.empId=empId;
        this.salary=salary;
    }
}
class Emplevel extends EmployeeDetails{
   
    Emplevel(int empId,float salary){
        super(empId, salary);
    }
    // empId=1000;
  public int getLevel(){
    if(salary>1000){
        return 1;
    }
    else{
        return 2;
    }
  }
  public void display(){
    System.out.println(empId);
    System.out.println(salary);
    System.out.println(getLevel());
  } 
}


public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int empId=sc.nextInt();
        float salary=sc.nextFloat();
        Emplevel emp=new Emplevel(empId,salary);
        emp.display();
        sc.close();
    }
}
