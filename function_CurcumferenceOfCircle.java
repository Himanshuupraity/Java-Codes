import java.util.Scanner;

public class function_CurcumferenceOfCircle {

    public static void curcumference(int r){
        // double cir = 2*(3.14) * r;
        // System.out.println(cir);
        System.out.println(2*(3.14) * r);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the redius of the circle - ");
        int r = sc.nextInt();

        curcumference(r);
    }
}
