package DAY1.Conditional_Statements;

import java.util.Scanner;

public class Keprekar {
    public static void main(String[] args) {      
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        long sq=n*n;
        String s=Long.toString(sq);
        boolean Kp=false;
        for(int i=1;i<s.length();i++){
            long  left =Long.parseLong(s.substring(0, i));
            long  right =Long.parseLong(s.substring(i));
            if(left!=0&& right!=0){
                if(left+right==n){
                Kp=true;
                break;}
            }
        }
        if(Kp){
            System.out.println("Yes");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
