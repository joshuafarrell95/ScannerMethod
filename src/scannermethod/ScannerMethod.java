package scannermethod;
import java.util.Scanner;
public class ScannerMethod {
    public static void main(String[] args) {
        // creating Scanner class object
        Scanner scan = new Scanner (System.in);
        // reading value from the user
        System.out.print("Enter the number: ");
        int num = scan.nextInt(); // method calling
        findEvenOdd(num); // pass parameter num
    }
    
    // user defined method
    public static void findEvenOdd(int num){
        // method body
        if (num % 2 == 0){
            System.out.println(num+" is even");
        }
        else {
            System.out.println(num+" is odd");
        }
    }
}
