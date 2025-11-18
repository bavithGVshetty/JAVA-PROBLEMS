package DAY4.Exception_handling;
import java.util.Scanner;
public class BankException {
    public static void main(String[] args) {        
        Scanner sc=new Scanner(System.in);
        int amount=0;
        while(true){
            System.out.println("Enter the amount to deposit");
            String input=sc.nextLine();
            try{
                amount=Integer.parseInt(input);
                break;
            }
            catch(NumberFormatException e){
                System.out.println("Invalid input. Try again\n");
            }
        }
        System.out.println("Success Deposit: "+amount);
        sc.close();
    }
    
}
