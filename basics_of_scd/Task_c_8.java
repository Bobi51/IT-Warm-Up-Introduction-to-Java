package basics_of_scd;

import java.util.Scanner;

public class Task_c_8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a,b;
        a=scn.nextInt();
        b=scn.nextInt();
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        for(int i=0; i < Math.max(aStr.length(), bStr.length()); i++) {
            try {
                System.out.println(bStr.charAt(i));
            } catch(StringIndexOutOfBoundsException e) {
                break;
            }
        }
    }
}
