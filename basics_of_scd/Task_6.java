package basics_of_scd;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x,y;
        x = scn.nextInt();
        y = scn.nextInt();
        if((x>=-2 && x<=2 && y>=0 && y<=4) || (x>=-4 && x<=4 && y>=-3 && y<=0))
            System.out.println(true);
        else
            System.out.println(false);
    }
}
