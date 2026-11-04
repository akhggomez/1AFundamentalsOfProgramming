import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class muchobufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("// Mucho Dinero Savings Account //\n" +
                "// Enter a positive number (+) to deposit //\n" +
                "// Enter a negative number (-) to withdraw //\n" +
                "// Enter a 0 to end transaction //");
        double balance = 20000.00;
        double amount;

        System.out.println("Starting balance: P" + String.format("%.2f", balance));

        do {
            System.out.print("Enter amount: ");
            amount = Double.parseDouble(br.readLine());

            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful.");
            } else if (amount < 0) {
                if (balance + amount < 0) {
                    System.out.println("INSUFFICIENT FUNDS!");
                } else {
                    balance += amount;
                    System.out.println("Withdrawal successful.");
                }
            }

            if (amount != 0) {
                System.out.println("Current balance: P" + String.format("%.2f", balance));
            }
        } while (amount != 0);

        System.out.println("Final balance: P" + String.format("%.2f", balance));
    }
}