import javax.swing.JOptionPane;
public class evennumberJOption{
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Enter to display all even numbers from 2 to 100");

        String output = "";

        for (int i = 2; i <= 100; i += 2) {
            output += i + " ";

            if (i % 20 == 0) {
                output += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}