
import java.util.Scanner;

public class function_Average3No {

    public static void average(int a, int b, int c){
        int sum = a+b+c;
        int av = sum/3;
        System.out.println("Average is - " + av);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st integer - ");
        int a=sc.nextInt();
        System.out.print("Enter 2nd integer - ");
        int b=sc.nextInt();
        System.out.print("Enter 3rd integer - ");
        int c=sc.nextInt();

        average(a, b, c);
        
    }
}
