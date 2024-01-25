import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CALCULADORA");
        frame.setContentPane(new form1().calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(850,500);
        frame.setLocationRelativeTo(null);


        frame.setVisible(true);


    }
}