package za.ac.cput;
import java.util.*;

public class AverageCalc {
    static Scanner console =new Scanner(System.in);


    public static void main(String[] args) {

        int mark=0 ;
        int count=0;
        int total=0;
        int average=0;
        System.out.println("Enter a mark ( enter -1 to cancel prompt )");
        mark=console.nextInt();

        while (mark !=-1){
            total=total+mark;
            System.out.println("Enter a mark ( enter -1 to cancel prompt )");
            mark=console.nextInt();

            count++;
        }
        average=total/count;
        System.out.println("your average is "+average);
    }
}
