package za.ac.cput;
import java.util.*;

public class AverageCalc {
    static Scanner console =new Scanner(System.in);


    public static void main(String[] args) {

        double mark=0 ;
        double count=0;
        double total=0;
        double average=0;
        System.out.println("Enter a mark ( enter -1 to cancel prompt )");
        mark=console.nextDouble();

        while (mark !=-1){
            total=total+mark;
            System.out.println("Enter a mark ( enter -1 to cancel prompt )");
            mark=console.nextDouble();

            count++;
        }
        average=total/count;
        System.out.println("your average is "+average);
    }
}
