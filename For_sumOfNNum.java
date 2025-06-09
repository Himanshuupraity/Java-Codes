
import java.util.Scanner;

public class For_sumOfNNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=n; i++){
            sum = sum + i;
        }

        System.out.println("Sum of your number is " + sum);
    }
}
