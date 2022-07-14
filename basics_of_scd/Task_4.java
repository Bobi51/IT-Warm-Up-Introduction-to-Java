package basics_of_scd;

import java.util.Scanner;
import java.lang.Math;

public class Task_4 {
    public static void main(String[] args) {
        double r,res;
        r = new Scanner(System.in).nextDouble();
        res = (r * 1000) % 1000 + (int) r / 1000.0;
        System.out.println(res);
    }
}
