package basics_of_scd;

public class Task_b_4 {
    public static void  main(String[] args) {
        int A=5,B=10,x=2,y=15,z=4;
        final int Sh = A*B;
        if(x*y<=Sh || y*z<=Sh || x*z<=Sh)
            System.out.println("Пройдет.");
        else
            System.out.println("Не пройдет.");
    }
}
