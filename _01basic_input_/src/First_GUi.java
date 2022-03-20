import javax.swing.JOptionPane;
public class First_GUi {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("whats your name dear");
        JOptionPane.showMessageDialog(null,"hello nice to meet you "+ name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("whats your age dear"));

//        /* showinputdialoge  take input as string
//        // but we need int thats why Integer.parseint method convert it */


        JOptionPane.showMessageDialog(null,"you are "+ age +" old dear");

        double height = Double.parseDouble(JOptionPane.showInputDialog("whats your height bro"));
        JOptionPane.showMessageDialog(null,"your height is "+ height);

        JOptionPane.showMessageDialog(null,"nice too meet youuuuuuuu");

      }
}

