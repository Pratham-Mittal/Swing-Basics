package Lab3;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Textapp extends JFrame {

    private JTextField inp, res;

    public Textapp() {
        JLabel prompt = new JLabel("Type number, press return");
        inp = new JTextField(5);
        res = new JTextField(25);
        res.setEditable(false);
        setLayout(new FlowLayout());
        add(prompt);
        add(inp);
        add(res);
        inp.addActionListener(new ActionListener() {
            public void actionPerformed( ActionEvent e) {
                res.setText(""+Integer.parseInt(inp.getText()) *2 +"");
            }
        });
    }
    public static void main( String[] args ) {
        Textapp a = new Textapp();
        a.setSize(400,400);
        a.setVisible(true);
    }

}
