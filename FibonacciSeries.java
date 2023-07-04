// Q2.Write a Java program to print the Fibonacci series up to a given number using a for loop.
import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {

   Scanner input = new Scanner(System.in);

   System.out.print("Enter the number of terms: ");
     int numTerms = input.nextInt();

     int firstTerm = 0;
     int secondTerm = 1;

     System.out.print("Fibonacci Series up to " + numTerms + " terms: ");

     for (int i = 1; i <= numTerms; i++) {
         System.out.print(firstTerm + " ");

         int nextTerm = firstTerm + secondTerm;
         firstTerm = secondTerm;
         secondTerm = nextTerm;
     }

     input.close();
   }
}
