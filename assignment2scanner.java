import java.util.Scanner;

public class assignment2scanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: Php ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = input.nextDouble();

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

        System.out.printf("\nGross Pay: Php %.2f", grossPay);
        System.out.printf("\nWithholding Tax: Php %.2f", withholdingTax);
        System.out.printf("\nNet Pay: Php %.2f", netPay);

        input.close();
    }
}
