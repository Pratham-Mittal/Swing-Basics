package Lab2;

import javax.swing.*;
import java.awt.*;

public class SquarePanel extends JPanel {
    FilledFrame App;
    SquarePanel(FilledFrame app)
    {
        App = app;
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.green);
        g.fillRect(20, 20, App.size, App.size);
    }


}
