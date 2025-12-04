package Contact;

import javax.swing.*;
import java.awt.*;

public class CPhotos {
    public CPhotos(JFrame frame){
        ImageIcon icon1 = new ImageIcon("image/AdminBuilding.png");
        Image image1 = icon1.getImage();
        Image newImage3 = image1.getScaledInstance(1920, 640, Image.SCALE_SMOOTH);
        JLabel p1 = new JLabel(new ImageIcon(newImage3));
        p1.setBounds(0, -50, 1920, 640);
        frame.add(p1);

    }
}
