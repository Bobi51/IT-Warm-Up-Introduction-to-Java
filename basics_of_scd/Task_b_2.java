package basics_of_scd;

import java.util.Scanner;

public class Task_b_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c,d;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        d = scn.nextInt();
        System.out.println(Math.max(Math.min(a,b), Math.min(c,d)));
    }
}
