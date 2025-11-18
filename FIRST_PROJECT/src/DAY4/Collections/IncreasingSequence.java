package DAY4.Collections;

import java.util.*;

public class IncreasingSequence{
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            System.out.println("Enter N");
            int N=sc.nextInt();
            int prev=Integer.MIN_VALUE;
            // System.out.println(prev);
            System.out.println("Enter "+ N +"Integers: ");
            for(int i=0;i<N;i++){
                int num=sc.nextInt();
                if(num>prev){
                    list.add(num);
                    prev=num;
                }
            }            
        System.out.println(list);
        sc.close();
        }
}