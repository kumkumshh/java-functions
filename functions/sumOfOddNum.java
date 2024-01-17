import java.util.Scanner;

public class sumOfOddNum {
    
    // Write a function to print the sum of all odd numbers from 1 to n.
    public static void main(String[] args) {
        Scanner sss = new Scanner(System.in);
        int num = sss.nextInt();
        int sum = sumOfOdd(num);
        System.out.println(sum);
    }

    public static int sumOfOdd(int num) {
        int sum=0;
        for(int i=1; i<=num; i++){
            sum = sum +i;
        } 
        return sum;  
     }
}
