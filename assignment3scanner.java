import java.util.Scanner;

public class assignment3scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter NSAT score: ");
        double nsat = input.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter entrance examination score: ");
        double entrance = input.nextDouble();

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        }
        else if (salary <= 3500 && (nsat + entrance) / 2 >= 91) {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("FOR FURTHER STUDY");
        }

        input.close();
    }
}