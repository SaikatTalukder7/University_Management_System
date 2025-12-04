package Home;

import javax.swing.*;
import java.awt.*;

public class Home {
    public Home() {
        JFrame frame = new JFrame();
        frame.setTitle("Metropolitan University");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        // Add all Photos
        Photos ph = new Photos(frame);

        // Add all buttons
        Buttons btn = new Buttons(frame);

        // Add all Labels
        Labels lbl =  new Labels(frame);

        frame.setVisible(true);
    }
}
