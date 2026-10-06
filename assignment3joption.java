import javax.swing.JOptionPane;

public class assignment3joption {
    public static void main(String[] args) {

        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:")
        );

        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:")
        );

        double entrance = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance examination score:")
        );

        String result;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            result = "REJECTED";
        }
        else if (salary <= 3500 && (nsat + entrance) / 2 >= 91) {
            result = "ACCEPTED";
        }
        else {
            result = "FOR FURTHER STUDY";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
