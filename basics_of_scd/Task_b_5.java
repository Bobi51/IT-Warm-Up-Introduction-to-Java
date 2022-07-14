package basics_of_scd;

import java.util.Scanner;

public class Task_b_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        if(x<=3)
            System.out.println(x*x - 3*x + 9);
        else
            System.out.println(1D/(x*x*x + 6));
    }
}
