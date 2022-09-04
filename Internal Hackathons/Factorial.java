
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.io.*;

class Factorial {

     public static double factorial(double x) {
          if (x >= 1)
               return x * factorial(x - 1.0);
          else
               return 1;
     }

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter a number to find its factorial:");
          double a = Double.parseDouble(br.readLine());
          System.out.println("The factorial is :" + factorial(a));
     }
}
/** */