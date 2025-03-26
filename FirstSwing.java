import java.awt.*;
import javax.swing.*;

public class FirstSwing {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Swing Example");
        jf.setLayout(new FlowLayout()); // Setting FlowLayout to arrange components

        JLabel jl = new JLabel("Extra Text"); // Component
        JTextField jt = new JTextField(20);
        JButton jb = new JButton("Ok");

        jf.add(jl);
        jf.add(jt);
        jf.add(jb);

        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}



