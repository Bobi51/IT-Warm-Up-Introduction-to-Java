package basics_of_scd;

import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b,c,z;
        a = scn.nextInt();
        b = scn.nextInt();
        c = scn.nextInt();
        z = ((a-3)*b/2)+c;
        System.out.println(z);
    }
}
