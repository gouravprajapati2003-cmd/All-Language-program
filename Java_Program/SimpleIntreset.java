// WAP to calculate the Simple Intreset.
import java.util.Scanner;

public class SimpleIntreset {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Principal(P) : ");
    float P = sc.nextFloat();
    System.out.println("Enter the Rate(R) : ");
    float R = sc.nextFloat();
    System.out.println("Enter the Time(T) : ");
    float T = sc.nextFloat();
    float SI = (P*R*T)/100;
    System.out.println("Simple Intreset : "+SI);

    sc.close();;
    
    }
}