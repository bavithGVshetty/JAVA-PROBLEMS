package DAY2.Control_Statements;

import java.util.Scanner;

public class TeamAssignment {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Registration code: ");
        int N=sc.nextInt();
        if(N<10){
            System.out.println("Invalid Input");
            sc.close();
            return;
        }
        int lastDigit=N%10;

        while(N>=10){
            N/=10;
        }
        int diff=Math.abs(N-lastDigit);
        System.out.println("The value: "+diff);
        sc.close();
    }
}
