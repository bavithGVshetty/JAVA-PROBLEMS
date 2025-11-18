package DAY1.Introduction;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits\n");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        System.out.println(n1 + "-" + (char) n1);
        System.out.println(n2 + "-" + (char) n2);
        System.out.println(n2 + "-" + (char) n2);
        System.out.println(n2 + "-" + (char) n2);

    }
}
