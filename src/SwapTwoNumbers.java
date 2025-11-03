import java.sql.SQLOutput;
import java.util.Scanner;
public class SwapTwoNumbers {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Value For 'A': ");
        int a=sc.nextInt();
        System.out.println("Enter Value For 'B': ");
        int b=sc.nextInt();
        System.out.println("Before Swapping Values: A = "+a+", B = "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping Values: A = "+a+", B = "+b);
    }
}
