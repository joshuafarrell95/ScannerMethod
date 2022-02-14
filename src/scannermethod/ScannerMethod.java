package scannermethod;
import java.util.Scanner;
public class ScannerMethod {
    public static void main(String[] args) {
        // creating Scanner class object
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter the number: ");
        int num = scan.nextInt();
        findEvenOdd(num);
    }
    
    public static void findEvenOdd(int num){
        // method body
        if (num % 2 == 0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
    }
}
