package DAY2.Classes_Objects;

import java.util.Scanner;

class Student{
    int rollno;
    int mark1,mark2,mark3;
    public Student(int rollno,int m1,int m2,int m3){
        this.mark1=m1;
        this.mark2=m2;
        this.mark3=m3;      
    }
    public int totalMarks(){
        return mark1+mark2+mark3;
    }
}

public class StudentManagement {

    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int n=sc.nextInt();
       Student[] arr=new Student[n];
    //    int[] ar=new int[n];
    
    }
}
