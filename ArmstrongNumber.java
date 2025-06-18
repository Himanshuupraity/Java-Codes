public class ArmstrongNumber {
    public static void main(String[] args) {
        
        // 1^3 + 5^3 + 3^3 = 153

        int num = 153, temp = num, sum = 0;

        while(temp != 0){
            int digit = temp % 10;
            int cube = digit * digit * digit;
            sum += cube;
            temp /= 10;
        }
        System.out.println(sum == num ? "Armstrong" : "Not Armstrong");
    }
}
