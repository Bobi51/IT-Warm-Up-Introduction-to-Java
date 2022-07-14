package basics_of_scd;

public class Task_b_3 {
    public static void main(String[] args) {
        int x1=1,x2=2,x3=3,y1=1,y2=2,y3=3;  //произвольные значения
        if((-x1*(y2-y1)/(x2-x1) + y1) == (-x1*(y3-y1)/(x3-x1) + y1))
            System.out.println("Точки расположены на одной прямой.");
        else                                //(X-x1)/(x2-x1) = (Y-y1)/(y2-y1), Y=((X-x1)*(y2-y1))/(x2-x1)+y1
            System.out.println("Точки не расположены на одной прямой.");
    }
}
