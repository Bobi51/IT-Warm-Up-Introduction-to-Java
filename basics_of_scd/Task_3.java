package basics_of_scd;

import java.util.Scanner;
import java.lang.Math;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double x,y,res;
        x = scn.nextDouble();
        y = scn.nextDouble();
        res = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(res);
    }
}
