package SubButtons;

import Contact.Webmail;
import Home.Home;

import Useless.Error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SubButtons {
    public SubButtons(JFrame frame){
        // University Logo
        ImageIcon icon1 = new ImageIcon("image/Logo.png");
        Image image1 = icon1.getImage();
        Image newImage1 = image1.getScaledInstance(797, 170, Image.SCALE_SMOOTH);
        JLabel p1 = new JLabel(new ImageIcon(newImage1));
        p1.setBounds(0, 0, 797, 170);
        frame.add(p1);

        // Home Button
        JButton btnH = new JButton("Home");
        btnH.setFont(new Font("Arial", Font.BOLD, 23));
        btnH.setBounds(1400, 20, 120, 30);
        btnH.setForeground(Color.BLACK);
        btnH.setFocusPainted(false);
        btnH.setContentAreaFilled(false);
        btnH.setOpaque(false);
        frame.add(btnH);
        btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Home();
                frame.dispose();
            }
        });

        // WebMail Button
        JButton btnW = new JButton("Webmail");
        btnW.setFont(new Font("Arial", Font.BOLD, 23));
        btnW.setBounds(1390, 60, 130, 30);
        btnW.setForeground(Color.BLACK);
        btnW.setFocusPainted(false);
        btnW.setContentAreaFilled(false);
        btnW.setOpaque(false);
        frame.add(btnW);
        btnW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Webmail();
                frame.dispose();
            }
        });

        // Founder label
        JLabel lblC = new JLabel("Founder Dr. Toufique Rahman Chowdhury");
        lblC.setBounds(1050, 95, 480, 30);
        lblC.setFont(new Font("Arial", Font.BOLD, 23));
        lblC.setBackground(Color.LIGHT_GRAY);
        lblC.setForeground(Color.BLACK);
        frame.add(lblC);


        // Footer stays the same
        JLabel lbl50 = new JLabel("© Metropolitan University 2025   Legal   Privacy Policy    Cookie Statement    FOLLOW US   Facebook    YouTube", SwingConstants.CENTER);
        lbl50.setBounds(10, 748, 1515, 40);
        lbl50.setFont(new Font("Arial", Font.BOLD, 18));
        lbl50.setOpaque(true);
        lbl50.setBackground(new Color(0, 17, 88));
        lbl50.setForeground(Color.WHITE);
        frame.add(lbl50);

        // Legal
        JButton btn9 = new JButton("Legal");
        btn9.setFont(new Font("Arial", Font.BOLD, 18));
        btn9.setBounds(544, 748, 90, 40);
        btn9.setOpaque(false);
        btn9.setBackground(Color.BLUE);
        btn9.setForeground(Color.WHITE);
        btn9.setFocusPainted(false);
        btn9.setBorderPainted(false);
        frame.add(btn9);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // Privacy Policy
        JButton btn10 = new JButton("Privacy Policy");
        btn10.setFont(new Font("Arial", Font.BOLD, 18));
        btn10.setBounds(604, 748, 170, 40);
        btn10.setOpaque(false);
        btn10.setBackground(Color.BLUE);
        btn10.setForeground(Color.WHITE);
        btn10.setFocusPainted(false);
        btn10.setBorderPainted(false);
        frame.add(btn10);
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // Cookie Statement
        JButton btn11 = new JButton("Cookie Statement");
        btn11.setFont(new Font("Arial", Font.BOLD, 18));
        btn11.setBounds(751, 748, 195, 40);
        btn11.setOpaque(false);
        btn11.setBackground(Color.BLUE);
        btn11.setForeground(Color.WHITE);
        btn11.setFocusPainted(false);
        btn11.setBorderPainted(false);
        frame.add(btn11);
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // Facebook
        JButton btn12 = new JButton("Facebook");
        btn12.setFont(new Font("Arial", Font.BOLD, 18));
        btn12.setBounds(1046, 748, 135, 40);
        btn12.setOpaque(false);
        btn12.setBackground(Color.BLUE);
        btn12.setForeground(Color.WHITE);
        btn12.setFocusPainted(false);
        btn12.setBorderPainted(false);
        frame.add(btn12);
        btn12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // YouTube
        JButton btn13 = new JButton("YouTube");
        btn13.setFont(new Font("Arial", Font.BOLD, 18));
        btn13.setBounds(1145, 748, 140, 40);
        btn13.setOpaque(false);
        btn13.setBackground(Color.BLUE);
        btn13.setForeground(Color.WHITE);
        btn13.setFocusPainted(false);
        btn13.setBorderPainted(false);
        frame.add(btn13);
        btn13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Error();
                frame.dispose();
            }
        });

        JLabel lbl111 = new JLabel();
        lbl111.setBounds(0, 0,1920,14);
        lbl111.setFont(new Font("Arial", Font.BOLD, 18));
        lbl111.setOpaque(true);
        lbl111.setBackground(new Color(0, 17, 88));
        lbl111.setForeground(Color.WHITE);
        frame.add(lbl111);
        JLabel lbl112 = new JLabel();
        lbl112.setBounds(0, 0,14,788);
        lbl112.setFont(new Font("Arial", Font.BOLD, 18));
        lbl112.setOpaque(true);
        lbl112.setBackground(new Color(0, 17, 88));
        lbl112.setForeground(Color.WHITE);
        frame.add(lbl112);
        JLabel lbl113 = new JLabel();
        lbl113.setBounds(1523, 0,14,788);
        lbl113.setFont(new Font("Arial", Font.BOLD, 18));
        lbl113.setOpaque(true);
        lbl113.setBackground(new Color(0, 17, 88));
        lbl113.setForeground(Color.WHITE);
        frame.add(lbl113);



    }
}

