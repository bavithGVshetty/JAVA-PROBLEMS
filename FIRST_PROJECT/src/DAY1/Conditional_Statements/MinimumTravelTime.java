package DAY1.Conditional_Statements;

import java.util.Scanner;

// TIME TAKEN FOR STAIRS
//  45 degree 
// Length of stairs=sqrt(2)*N
// H=sqrt(N^2+N^2)=sqrt(2N^2)=N*sqrt(2);
// Velocity =v1 m/s

// TIME_STAIRS= sqrt(2)*N/v1

// ELEVATOR=2*N/V2



public class MinimumTravelTime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();//Number of floors
        int V1=sc.nextInt();//Stairs velocity
        int V2=sc.nextInt();//Elevator Velocity

        double ST=(Math.sqrt(2)*N)/V1;
        double ET=(2.0*N)/V2;
        // System.err.println(ET);

        if(ET<=ST){
            System.out.println("Elevator");
        }
        else{
            System.out.println("Stairs");
        }
        sc.close();
    }
}
