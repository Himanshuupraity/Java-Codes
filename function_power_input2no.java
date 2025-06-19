import java.util.Scanner;

public class function_power_input2no {


    public static void square(int x, int n){
        double sq= Math.pow(x, n);
        System.out.println(sq);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x - ");
        int x= sc.nextInt();
        System.out.print("Enter the value of n - ");
        int n= sc.nextInt();

        square(x, n);
    }
}
