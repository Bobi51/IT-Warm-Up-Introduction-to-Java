package basics_of_scd;

import java.util.Scanner;

public class Task_c_6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char input;
        while(true) {
            input = scn.next().charAt(0);
            System.out.println((int) input);
        }
    }
}
