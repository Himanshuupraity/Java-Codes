import java.util.Scanner;

public class function_multiply2numbers {

    public static int multipleNum(int a, int b){
        return a*b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(multipleNum(a, b));
    }
}
