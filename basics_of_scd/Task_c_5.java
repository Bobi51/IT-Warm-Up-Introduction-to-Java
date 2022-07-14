package basics_of_scd;

import java.util.Scanner;

public class Task_c_5 {
    public static void main(String[] args) {
        double sum=0, an=1D/2+1D/3,e;
        e = new Scanner(System.in).nextDouble();
        for(int n=2;an>=e && n<102;n++) {  //максимум 100 итераций
            System.out.println(an);
            sum+=an;
            an=Math.pow(1D/2, n) + Math.pow(1D/3, n);
        }
        System.out.println("\n"+sum);
    }
}
