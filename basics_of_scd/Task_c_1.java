package basics_of_scd;

import java.util.Scanner;

public class Task_c_1 {
    public static void main(String[] args) {
        int a,sum=0;
        a = new Scanner(System.in).nextInt();
        for(int i=a; i>=1; i--)
            sum+=i;
        System.out.println(sum);
    }
}
