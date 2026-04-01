import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int original, rem, sum = 0, n = 0;
        original = num;
        while (original != 0) {
            original = original/10;
            n++;
        }
        original =num;
        while (num != 0) {
            rem = num % 10;
            sum = sum + Math.powExact(rem, n);
            num = num /10;
        }
        if(sum == original) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is Not Armstrong");
        }
        sc.close();
    }
}
