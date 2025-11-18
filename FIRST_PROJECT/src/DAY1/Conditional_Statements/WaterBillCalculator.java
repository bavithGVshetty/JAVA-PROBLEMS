package DAY1.Conditional_Statements;

import java.util.Scanner;

public class WaterBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of litres consumed");
        double litres = sc.nextDouble();
        double bill = 0;
        if (litres <= 100) {
            bill = litres * 2;
        } else if (litres <= 500) {
            bill = (100 * 2) + ((litres - 100) * 1.5);
        } else {
            bill = (100 * 2) + (400 * 1.5) + ((litres - 500) * 1);
        }
        System.out.println("TOTAL BILL: " + bill);
        sc.close();
    }

}
