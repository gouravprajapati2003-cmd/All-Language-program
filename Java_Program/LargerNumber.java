// WAP Take 3 Numbers and Print the Largest one.
import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        x = sc.nextInt();
        System.out.println("Enter Second Number : ");
        y = sc.nextInt();
        System.out.println("Enter Third Number : "); 
        z = sc.nextInt();
        if(x>y && x>z) {
            System.out.println("Largest Number = "+x);
        } else if(y>x && y>z) {
            System.out.println("Largest Number = "+y);
        } else {
            System.out.println("Largest Number = "+z);
        }
        sc.close();
    }
}
