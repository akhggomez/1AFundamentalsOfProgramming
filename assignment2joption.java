import javax.swing.JOptionPane;

public class assignment2joption {
    public static void main(String[] args) {

        double rate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hourly pay rate: Php ")
        );

        double hours = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hours worked: ")
        );

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        String result = String.format(
                "Gross Pay: Php %.2f\n" +
                        "Withholding Tax: Php %.2f\n" +
                        "Net Pay: Php %.2f",
                grossPay, withholdingTax, netPay
        );

        JOptionPane.showMessageDialog(null, result, "Payroll Result",
                JOptionPane.INFORMATION_MESSAGE);
    }
}