
import java.util.Scanner;

public class average {

    // Enter 3 numbers from the user & make a function to print their average.
    public static void main(String[] args) {
        Scanner s3 = new Scanner(System.in);
        double a = s3.nextDouble();
        double b = s3.nextDouble();
        double c = s3.nextDouble();
        double avg = average1(a, b, c);
        System.out.println(avg);
        s3.close();
    }

    
    public static double average1(double a, double b, double c){
        return (a+b+c)/3;
     } 
}
