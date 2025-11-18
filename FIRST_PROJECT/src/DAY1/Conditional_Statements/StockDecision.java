package DAY1.Conditional_Statements;

import java.util.Scanner;

public class StockDecision{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        float previousPrice=sc.nextFloat();
        float currentPrice=sc.nextFloat();

        float percentage=((currentPrice-previousPrice)/previousPrice)*100;

        if(percentage>10){
            System.out.println("BUY");
        }
        else if(percentage>=-5&& percentage<=10){
            System.out.println("HOLD");
        }
        else{
            System.out.printf("SELL");
        }
        sc.close();
    }
}