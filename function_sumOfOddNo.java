
import java.util.Scanner;

public class function_sumOfOddNo {

    public static int oddSum(int n){
        int a=0;

        for(int i=1; i<=n; i=i+2){
            a=a+i;
            // if(i%2!=0){
            //     a=a+i;
            // }
        }
        System.out.println(a);
        return a;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number - ");
        int n = sc.nextInt();

        oddSum(n);
    }
}
