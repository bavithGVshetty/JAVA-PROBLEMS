package DAY2.Control_Statements;

import java.util.Scanner;

public class EncryptionKey {
    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int num=sc.nextInt();
            int sum=0;
            while(num>0){
                int digit=num%10;

                // 0,1,4,6,8,9
                if(digit==0||digit==1||digit==4||digit==6||digit==8||digit==9){
                    sum=sum+digit;
                }
                num=num/10;
            }
            System.out.println(sum);
            sc.close();

    }
    
}
