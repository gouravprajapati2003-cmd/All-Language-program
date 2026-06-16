// WAP to check the charcter is upper, lower, special, space, digit also.
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character : ");
        char ch = sc.nextLine().charAt(0);
        if(ch >= 65 && ch <= 90 ) {
            System.out.println("Upper Character");
        } else if(ch >= 97 && ch <= 122) {
            System.out.println("Lower Character");
        } else if(ch >= 48 && ch <= 57) {
            System.out.println("Digit");
        } else if(ch == 32) {
            System.out.println("Space");
        } else {
            System.out.println("Special Character");
        }
        sc.close();
    }
}
