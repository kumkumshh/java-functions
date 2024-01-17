import java.util.Scanner;

public class greaterOf2 {
    
    // Write a function which takes in 2 numbers and returns the greater of those two.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int res = greater(a,b);
        System.out.println(res);
    }

    public static int greater(int a , int b){
        if (a>b) {
            return a;
        }else{
            return b;
        }
    }
}
