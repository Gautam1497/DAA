import java.util.*;
public class Exp2 {
    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double temp = power(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            if (n > 0) {
                return x * temp * temp;
            } else {
                return (temp * temp) / x;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter base value: ");
        double base = sc.nextInt();
        System.out.print("Enter power: ");
        int exponent = sc.nextInt();

        double result = power(base, exponent);
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}
