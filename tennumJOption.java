import javax.swing.JOptionPane;
public class tennumJOption {
    public static void main(String[] args){
        int highest = 0;
        int lowest = 0;

        for (int x = 1 ; x <= 10 ; x++ ){
            String numInput = JOptionPane.showInputDialog("Enter number " + x + ": ");
            int num = Integer.parseInt(numInput);

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
        String output = ("Highest number: " + highest + "\nLowest number: " + lowest);
        JOptionPane.showMessageDialog(null, output);
    }
}

