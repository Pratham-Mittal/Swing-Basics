package Lab2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FilledFrame extends JFrame {
    int size = 400;
    public FilledFrame()
    {
        JButton Small = new JButton("Small");

        JButton Medium = new JButton("Medium");

        JButton Large = new JButton("Large");
        //butLarge.addActionListener(new ButtonHandler(this));
        JButton Message = new JButton("Say Hi!");
        SquarePanel panel = new SquarePanel(this);
        JPanel Panel = new JPanel();
        Panel.add(Small);
        Panel.add(Medium);
        Panel.add(Large);
        Panel.add(Message);
        add(Panel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setSize( size+100, size+100 );

        Message.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"HIII");

            }
        });

        Small.addActionListener(new ButtonHandler(this, 100));
        Medium.addActionListener(new ButtonHandler(this, 200));
        Large.addActionListener(new ButtonHandler(this, 400));
    }


}
