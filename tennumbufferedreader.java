import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tennumbufferedreader {
    public static void main(String[] args) throws IOException {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        int highest = 0;
        int lowest = 0;

        for (int x = 1 ; x <= 10 ; x++ ){
            System.out.print("Enter number " + x + ": ");
            int num = Integer.parseInt(dataIn.readLine());

            if (x == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num>highest){
                    highest = num;
                }
                if (num<lowest){
                    lowest = num;
                }
            }
        }
        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);
    }
}