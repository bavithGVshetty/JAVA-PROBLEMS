package DAY1.Introduction;
import java.util.Scanner;

public class NewsPaper {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int w=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();

        int profit= (w*x)-(w*y)-100;
        System.out.println(profit);
        sc.close();
    }
    
}
