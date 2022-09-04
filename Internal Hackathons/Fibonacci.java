import java.io.*;

class Fibonacci {
     static void fibonacci(int x) {
          int a = 0, b = 1;
          System.out.print(a + "\t" + b + "\t");
          do {
               a = a + b;
               System.out.print(a + "\t");
               int c = a;
               a = b;
               b = c;
               x--;
          } while (x > 0);

     }

     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter number of terms");
          int a = Integer.parseInt(br.readLine());
          fibonacci(a);
     }
}
/**
 * Enter number of terms
 * 10
 * 0 1 1 2 3 5 8 13 21 34 55 89
 */