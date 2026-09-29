import javax.swing.JOptionPane;

public class Labquiz3 {
    public static void main ( String[] args)
    {
        double price ;
        price = Double.parseDouble(JOptionPane.showInputDialog("Total Price Order"));

        double customermoney;
        customermoney = Double.parseDouble(JOptionPane.showInputDialog("please enter your customer money"));

        double servicecharge = 0.12;
        double salesctax = 0.07;
        double servicefee = price * servicecharge, salestax = price * salesctax ;

        double Netball = price + servicefee + salesctax ;
        double change = customermoney - Netball;

        String Total = "The netbill ==== " + price + "\n" +
                       "Service Charge ==== " + servicefee + "\n" +
                       "Sale Tax ==== " + salesctax + "\n" +
                       "Net Bill ==== " + Netball + "\n" +
                       "Customer Money ==== " + customermoney + "\n" + "\n" +
                       "Change ==== " + change;
        JOptionPane.showMessageDialog(null, Total);
    }
}