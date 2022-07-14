package basics_of_scd;

import java.util.Scanner;

public class Task_b_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int d1,d2;
        d1 = scn.nextInt();
        d2 = scn.nextInt();
        if(d1+d2<90)
            System.out.println("Существует.");
        else if(d1+d2==90)
            System.out.println("Существует, прямоугольный.");
        else
            System.out.println("Не существует.");
    }
}
