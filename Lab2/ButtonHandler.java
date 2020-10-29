package Lab2;

import java.awt.event.*;

public class ButtonHandler implements ActionListener {
    FilledFrame App;
    int size;

    ButtonHandler(FilledFrame app, int newSize)
    {
        App = app;
        size = newSize;
        System.out.println(app.size);
    }


    public void actionPerformed(ActionEvent actionEvent) {

         App.size = size;
         App.repaint();


    }
}
