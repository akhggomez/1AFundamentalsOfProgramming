import javax.swing.JOptionPane;

public class muchoJOption {
    public static void main(String[] args) {
        double balance = 20000.00;
        double amount;

        JOptionPane.showMessageDialog(null,
                "// Mucho Dinero Savings Account // \n" +
                        "> Enter a positive number (+) to deposit\n" +
                        "> Enter a negative number (-) to withdraw\n" +
                        "> Enter 0 to end transaction");

        JOptionPane.showMessageDialog(null,
                "Starting balance: P" + String.format("%.2f", balance));

        do {
            String input = JOptionPane.showInputDialog(
                    "Enter amount:");
            amount = Double.parseDouble(input);

            if (amount > 0) {
                balance += amount;
                JOptionPane.showMessageDialog(null,
                        "Deposit successful.\nOutstanding balance: P" + String.format("%.2f", balance));
            } else if (amount < 0) {
                if (balance + amount < 0) {
                    JOptionPane.showMessageDialog(null,
                            "INSUFFICIENT FUNDS!\nOutstanding balance: P" + String.format("%.2f", balance));
                } else {
                    balance += amount;
                    JOptionPane.showMessageDialog(null,
                            "Withdrawal successful.\nOutstanding balance: P" + String.format("%.2f", balance));
                }
            }
        } while (amount != 0);

        JOptionPane.showMessageDialog(null,
                "Final balance: P" + String.format("%.2f", balance));
    }
}