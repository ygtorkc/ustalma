import java.util.Scanner;
public class Main {
    static int power(int base,int exponent) {
        if (exponent == 0)
            return 1;
        else
            return base * power(base, exponent - 1);
    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your number's base:");
            int base = input.nextInt();
            System.out.println("Enter your number's exponent:");
            int exponent = input.nextInt();
            int result = power(base,exponent);
            System.out.println("Result:"+result);

    }
}