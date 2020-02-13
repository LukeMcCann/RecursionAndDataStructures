import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialCalc {

    private static BufferedReader In = new BufferedReader( new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Enter a number (0 to quit): ");
        int number = Integer.parseInt(In.readLine());

        while(number != 0) {
            System.out.println("The factorial of: " + number + " is: ");
            System.out.println(recursiveFactorial(number));

            System.out.print("Enter a number (0 to quit): ");
            number = Integer.parseInt(In.readLine());
        }
    }

    private static int recursiveFactorial(int N) {
        if(N == 1) {
            return N;
        } else {
            return N * recursiveFactorial(N-1);
        }
    }

}
