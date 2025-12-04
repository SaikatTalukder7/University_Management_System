package Home;

import javax.swing.*;
import java.awt.*;

public class Photos {
    public Photos(JFrame frame){

        // University Logo
        ImageIcon icon1 = new ImageIcon("image/Logo.png");
        Image image1 = icon1.getImage();
        Image newImage1 = image1.getScaledInstance(1366, 291, Image.SCALE_SMOOTH);
        JLabel p1 = new JLabel(new ImageIcon(newImage1));
        p1.setBounds(10, -10, 1366, 291);
        frame.add(p1);

        // Founder image
        ImageIcon icon2 = new ImageIcon("image/Chairman.png");
        Image image2 = icon2.getImage();
        Image newImage2 = image2.getScaledInstance(125, 150, Image.SCALE_SMOOTH);
        JLabel p2 = new JLabel(new ImageIcon(newImage2));
        p2.setBounds(20, 430, 125, 150);
        p2.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(p2);

        // New Chairman image
        ImageIcon icon3 = new ImageIcon("image/NewChairman.jpg");
        Image image3 = icon3.getImage();
        Image newImage3 = image3.getScaledInstance(125, 150, Image.SCALE_SMOOTH);
        JLabel p3 = new JLabel(new ImageIcon(newImage3));
        p3.setBounds(535, 430, 125, 150);
        p3.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(p3);

        JLabel lbl1 = new JLabel("Our Pride", SwingConstants.CENTER);
        lbl1.setBounds(980, 265, 530, 30);
        lbl1.setFont(new Font("Arial", Font.BOLD, 27));
        lbl1.setOpaque(true);
        lbl1.setBackground(new Color(0, 17, 88));
        lbl1.setForeground(Color.WHITE);
        lbl1.setOpaque(true);
        frame.add(lbl1);

        ImageIcon icon4 = new ImageIcon("image/pr3.png");
        Image image4 = icon4.getImage();
        Image newImage4 = image4.getScaledInstance(530, 215, Image.SCALE_SMOOTH);
        JLabel p4 = new JLabel(new ImageIcon(newImage4));
        p4.setBounds(980, 300, 530, 215);
        frame.add(p4);

        ImageIcon icon5 = new ImageIcon("image/pr1.png");
        Image image5 = icon5.getImage();
        Image newImage5 = image5.getScaledInstance(392, 230, Image.SCALE_SMOOTH);
        JLabel p5 = new JLabel(new ImageIcon(newImage5));
        p5.setBounds(1050, 515, 392, 230);
        frame.add(p5);




    }
}
