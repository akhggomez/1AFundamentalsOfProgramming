import java.io.*;

public class assignment3bufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance examination score: ");
        double entrance = Double.parseDouble(br.readLine());

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        }
        else if (salary <= 3500 && (nsat + entrance) / 2 >= 91) {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("FOR FURTHER STUDY");
        }
    }
}