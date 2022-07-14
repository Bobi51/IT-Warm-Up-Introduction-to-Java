package basics_of_scd;

import java.util.Scanner;
import java.lang.Math;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double a,b,c,res;
        a = scn.nextDouble();
        b = scn.nextDouble();
        c = scn.nextDouble();
        res = (b + Math.sqrt(b*b + 4*a*c))/(2*a) - a*a*a*c + 1D/(2*2);
        System.out.printf("%.4f\n",res);
    }
}
