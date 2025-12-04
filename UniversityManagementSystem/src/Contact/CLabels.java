package Contact;

import javax.swing.*;
import java.awt.*;

public class CLabels {
    public CLabels(JFrame Cframe){
        JLabel lbl1 = new JLabel("Campus");
        lbl1.setBounds(10, 590, 410, 30);
        lbl1.setFont(new Font("Arial", Font.BOLD, 20));
        lbl1.setOpaque(true);
        lbl1.setBackground(Color.LIGHT_GRAY);
        lbl1.setForeground(Color.BLACK);
        Cframe.add(lbl1);

        JLabel lbl2 = new JLabel("Bateshwar, Sylhet-3104, Bangladesh");
        lbl2.setBounds(10, 620, 410, 20);
        lbl2.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl2.setOpaque(true);
        lbl2.setBackground(Color.LIGHT_GRAY);
        lbl2.setForeground(Color.BLACK);
        Cframe.add(lbl2);

        JLabel lbl3 = new JLabel("Telephone: +8802996642907-09");
        lbl3.setBounds(10, 640, 410, 20);
        lbl3.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl3.setOpaque(true);
        lbl3.setBackground(Color.LIGHT_GRAY);
        lbl3.setForeground(Color.BLACK);
        Cframe.add(lbl3);

        JLabel lbl4 = new JLabel("Mobile: +8801313050044, +8801313050066");
        lbl4.setBounds(10, 660, 410, 20);
        lbl4.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl4.setOpaque(true);
        lbl4.setBackground(Color.LIGHT_GRAY);
        lbl4.setForeground(Color.BLACK);
        Cframe.add(lbl4);

        JLabel lbl5 = new JLabel("Fax: +8802996642910");
        lbl5.setBounds(10, 680, 410, 20);
        lbl5.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl5.setOpaque(true);
        lbl5.setBackground(Color.LIGHT_GRAY);
        lbl5.setForeground(Color.BLACK);
        Cframe.add(lbl5);

        JLabel lbl6 = new JLabel("Email: info@metrouni.edu.bd");
        lbl6.setBounds(10, 700, 410, 20);
        lbl6.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl6.setOpaque(true);
        lbl6.setBackground(Color.LIGHT_GRAY);
        lbl6.setForeground(Color.BLACK);
        Cframe.add(lbl6);

    }
}
