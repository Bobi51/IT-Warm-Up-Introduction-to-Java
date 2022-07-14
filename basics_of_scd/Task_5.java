package basics_of_scd;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int T, h, m, s;
        T = new Scanner(System.in).nextInt();
        h = T/3600;
        m = (T-(h*3600)) / 60;
        s = T-(h*3600)-(m*60);
        System.out.printf("%02dч %02dмин %02dс",h,m,s);
    }
}
