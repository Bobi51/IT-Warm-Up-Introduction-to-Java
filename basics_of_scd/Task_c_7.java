package basics_of_scd;

import java.util.Scanner;

public class Task_c_7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m,n;
        m = scn.nextInt();
        n = scn.nextInt();
        for(int i=m; i<=n; i++) {
            System.out.print(i+": ");
            for(int j=2; j<i; j++) {
                if(i%j==0)
                    System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
