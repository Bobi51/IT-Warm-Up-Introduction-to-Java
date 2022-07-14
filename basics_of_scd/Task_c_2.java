package basics_of_scd;

import java.util.Scanner;

public class Task_c_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,h,y;
        a = scn.nextInt();
        b = scn.nextInt();
        h = scn.nextInt();
        for(int i=a; i<=b; i+=h) {
            if(i<=2)
                System.out.print(-i+" ");
            else
                System.out.print(i+" ");
        }
    }
}
