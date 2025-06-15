import java.util.Scanner;

public class function_GCDof2No {

    public static void GCD(int a, int b){
        int c=0;
        while(b!=0){
            c=b;
            b=a%b;
            a=c;
        }
        System.out.println(a);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number - ");
        int a = sc.nextInt();
        System.out.print("Enter the 2nd number - ");
        int b = sc.nextInt();

        GCD(a, b);
    }
}
