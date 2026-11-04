import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class evennumberbufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter to display all even numbers from 2 to 100");
        dataIn.readLine();

        for (int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
