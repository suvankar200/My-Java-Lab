import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main2 {

    public static void main(String[] args) {
        JFrame f = new JFrame("Show Name");
        f.setSize(200, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new FlowLayout());

        JLabel jl = new JLabel("Extra Text"); 
        JLabel jl1 = new JLabel();
        JTextField jt = new JTextField(20);
        JButton jb = new JButton("Ok");

        jb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) { 
                String n = jt.getText();
                jl1.setText(n);
            }
        });

        f.add(jl); 
        f.add(jt); 
        f.add(jb); 
        f.add(jl1);

        f.setVisible(true); 
    }
}
