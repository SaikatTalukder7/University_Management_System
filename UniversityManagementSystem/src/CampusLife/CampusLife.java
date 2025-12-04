package CampusLife;

import About.About;
import Academics.Academics;
import Admission.Admission;
import Contact.Contact;
import Home.Home;
import LogIn.LogIn;
import Programme.Programme;
import Reasearch.Reasearch;
import Useless.Error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CampusLife {
    public CampusLife() {

        JFrame frame = new JFrame("Campus Life");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setPreferredSize(new Dimension(1500, 4405));

        // University Logo
        ImageIcon icu = new ImageIcon("image/Logo.png");
        Image imageu = icu.getImage();
        Image newImageu = imageu.getScaledInstance(797, 170, Image.SCALE_SMOOTH);
        JLabel u = new JLabel(new ImageIcon(newImageu));
        u.setBounds(0, 0, 797, 170);
        panel.add(u);

        // Home Button
        JButton btnH = new JButton("Home");
        btnH.setFont(new Font("Arial", Font.BOLD, 23));
        btnH.setBounds(1380, 20, 120, 30);
        btnH.setForeground(Color.BLACK);
        btnH.setFocusPainted(false);
        btnH.setContentAreaFilled(false);
        btnH.setOpaque(false);
        panel.add(btnH);
        btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Home();
                frame.dispose();
            }
        });

        // WebMail Button
        JButton btnW = new JButton("Webmail");
        btnW.setFont(new Font("Arial", Font.BOLD, 23));
        btnW.setBounds(1370, 60, 130, 30);
        btnW.setForeground(Color.BLACK);
        btnW.setFocusPainted(false);
        btnW.setContentAreaFilled(false);
        btnW.setOpaque(false);
        panel.add(btnW);
        btnW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Error();
                frame.dispose();
            }
        });

        // Founder label
        JLabel lblC = new JLabel("Founder Dr. Toufique Rahman Chowdhury");
        lblC.setBounds(1030, 95, 480, 30);
        lblC.setFont(new Font("Arial", Font.BOLD, 23));
        lblC.setBackground(Color.LIGHT_GRAY);
        lblC.setForeground(Color.BLACK);
        panel.add(lblC);


        // About
        JButton btn1 = new JButton("About");
        btn1.setFont(new Font("Arial", Font.BOLD, 23));
        btn1.setBounds(20, 140, 150, 40);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.WHITE);
        btn1.setOpaque(false);
        btn1.setBorderPainted(false);
        panel.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new About();
                frame.dispose();
            }
        });

        // Programmes
        JButton btn2 = new JButton("Programmes");
        btn2.setFont(new Font("Arial", Font.BOLD, 23));
        btn2.setBounds(190, 140, 180, 40);
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn2.setBorderPainted(false);
        btn2.setOpaque(false);
        panel.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Programme();
                frame.dispose();
            }
        });

        // Academics
        JButton btn3 = new JButton("Academics");
        btn3.setFont(new Font("Arial", Font.BOLD, 23));
        btn3.setBounds(390, 140, 170, 40);
        btn3.setBackground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn3.setBorderPainted(false);
        btn3.setOpaque(false);
        panel.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Academics();
                frame.dispose();
            }
        });

        // Admission
        JButton btn4 = new JButton("Admission");
        btn4.setFont(new Font("Arial", Font.BOLD, 23));
        btn4.setBounds(580, 140, 170, 40);
        btn4.setBackground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn4.setOpaque(false);
        btn4.setBorderPainted(false);
        panel.add(btn4);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Admission();
                frame.dispose();
            }
        });

        // Research
        JButton btn5 = new JButton("Research");
        btn5.setFont(new Font("Arial", Font.BOLD, 23));
        btn5.setBounds(770, 140, 160, 40);
        btn5.setBackground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        btn5.setOpaque(false);
        btn5.setBorderPainted(false);
        panel.add(btn5);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reasearch();
                frame.dispose();
            }
        });

        // Campus Life
        JButton btn6 = new JButton("Campus Life");
        btn6.setFont(new Font("Arial", Font.BOLD, 23));
        btn6.setBounds(950, 140, 180, 40);
        btn6.setBackground(Color.WHITE);
        btn6.setForeground(Color.GRAY);
        btn6.setOpaque(false);
        btn6.setBorderPainted(false);
        panel.add(btn6);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        // Contact
        JButton btn7 = new JButton("Contact");
        btn7.setFont(new Font("Arial", Font.BOLD, 23));
        btn7.setBounds(1150, 140, 170, 40);
        btn7.setBackground(Color.WHITE);
        btn7.setForeground(Color.WHITE);
        btn7.setOpaque(false);
        btn7.setBorderPainted(false);
        panel.add(btn7);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Contact();
                frame.dispose();
            }
        });

        // Log in
        JButton btn8 = new JButton("Log in");
        btn8.setFont(new Font("Arial", Font.BOLD, 23));
        btn8.setBounds(1340, 140, 170, 40);
        btn8.setBackground(Color.WHITE);
        btn8.setForeground(Color.WHITE);
        btn8.setOpaque(false);
        btn8.setBorderPainted(false);
        panel.add(btn8);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LogIn();
                frame.dispose();
            }
        });
        JLabel lbl = new JLabel();
        lbl.setBounds(10, 135, 1515, 50);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setOpaque(true);
        lbl.setBackground(new Color(0, 17, 88));
        lbl.setForeground(Color.WHITE);
        panel.add(lbl);




        JLabel lbl1 = new JLabel("CSE Fest 2025",SwingConstants.CENTER);
        lbl1.setBounds(-20, 210, 1515, 50);
        lbl1.setFont(new Font("Arial", Font.BOLD, 30));
        lbl1.setOpaque(true);
        lbl1.setBackground(Color.WHITE);
        lbl1.setForeground(Color.BLACK);
        lbl1.setOpaque(false);
        panel.add(lbl1);

        ImageIcon i1 = new ImageIcon("src/CampusLife/P/1.jpg");
        Image image1 = i1.getImage();
        Image newImage1 = image1.getScaledInstance(533, 800, Image.SCALE_SMOOTH);
        JLabel p1 = new JLabel(new ImageIcon(newImage1));
        p1.setBounds(20, 290, 533, 800);
        panel.add(p1);

        ImageIcon i2 = new ImageIcon("src/CampusLife/P/2.jpg");
        Image image2 = i2.getImage();
        Image newImage2 = image2.getScaledInstance(935, 625, Image.SCALE_SMOOTH);
        JLabel p2 = new JLabel(new ImageIcon(newImage2));
        p2.setBounds(563, 290, 935, 625);
        panel.add(p2);

        ImageIcon i3 = new ImageIcon("src/CampusLife/P/3.jpg");
        Image image3 = i3.getImage();
        Image newImage3 = image3.getScaledInstance(902, 548, Image.SCALE_SMOOTH);
        JLabel p3 = new JLabel(new ImageIcon(newImage3));
        p3.setBounds(20, 1100, 902, 548);
        panel.add(p3);

        ImageIcon i4 = new ImageIcon("src/CampusLife/P/4.jpg");
        Image image4 = i4.getImage();
        Image newImage4 = image4.getScaledInstance(566, 800, Image.SCALE_SMOOTH);
        JLabel p4 = new JLabel(new ImageIcon(newImage4));
        p4.setBounds(932, 925, 566, 800);
        panel.add(p4);

        ImageIcon i5 = new ImageIcon("src/CampusLife/P/5.jpg");
        Image image5 = i5.getImage();
        Image newImage5 = image5.getScaledInstance(533, 750, Image.SCALE_SMOOTH);
        JLabel p5 = new JLabel(new ImageIcon(newImage5));
        p5.setBounds(20, 1658, 533, 702);
        panel.add(p5);

        ImageIcon i6 = new ImageIcon("src/CampusLife/P/6.jpg");
        Image image6 = i6.getImage();
        Image newImage6 = image6.getScaledInstance(935, 625, Image.SCALE_SMOOTH);
        JLabel p6 = new JLabel(new ImageIcon(newImage6));
        p6.setBounds(563, 1735, 935, 625);
        panel.add(p6);

        ImageIcon i7 = new ImageIcon("src/CampusLife/P/7.jpg");
        Image image7 = i7.getImage();
        Image newImage7 = image7.getScaledInstance(1478, 987, Image.SCALE_SMOOTH);
        JLabel p7 = new JLabel(new ImageIcon(newImage7));
        p7.setBounds(20, 2370, 1478, 987);
        panel.add(p7);

        ImageIcon i8 = new ImageIcon("src/CampusLife/P/8.jpg");
        Image image8 = i8.getImage();
        Image newImage8 = image8.getScaledInstance(1478, 987, Image.SCALE_SMOOTH);
        JLabel p8 = new JLabel(new ImageIcon(newImage8));
        p8.setBounds(20, 3367, 1478, 987);
        panel.add(p8);



        // Footer stays the same
        JLabel lbl50 = new JLabel("© Metropolitan University 2025   Legal   Privacy Policy    Cookie Statement    FOLLOW US   Facebook    YouTube", SwingConstants.CENTER);
        lbl50.setBounds(10, 4360, 1515, 40);
        lbl50.setFont(new Font("Arial", Font.BOLD, 18));
        lbl50.setOpaque(true);
        lbl50.setBackground(new Color(0, 17, 88));
        lbl50.setForeground(Color.WHITE);
        panel.add(lbl50);

        // Legal
        JButton btn9 = new JButton("Legal");
        btn9.setFont(new Font("Arial", Font.BOLD, 18));
        btn9.setBounds(544, 4360, 90, 40);
        btn9.setOpaque(false);
        btn9.setBackground(Color.BLUE);
        btn9.setForeground(Color.WHITE);
        btn9.setFocusPainted(false);
        btn9.setBorderPainted(false);
        panel.add(btn9);
        btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // Cookie Statement
        JButton btn11 = new JButton("Cookie Statement");
        btn11.setFont(new Font("Arial", Font.BOLD, 18));
        btn11.setBounds(751, 4360, 195, 40);
        btn11.setOpaque(false);
        btn11.setBackground(Color.BLUE);
        btn11.setForeground(Color.WHITE);
        btn11.setFocusPainted(false);
        btn11.setBorderPainted(false);
        panel.add(btn11);
        btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // Facebook
        JButton btn12 = new JButton("Facebook");
        btn12.setFont(new Font("Arial", Font.BOLD, 18));
        btn12.setBounds(1046, 4360, 135, 40);
        btn12.setOpaque(false);
        btn12.setBackground(Color.BLUE);
        btn12.setForeground(Color.WHITE);
        btn12.setFocusPainted(false);
        btn12.setBorderPainted(false);
        panel.add(btn12);
        btn12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        // YouTube
        JButton btn13 = new JButton("YouTube");
        btn13.setFont(new Font("Arial", Font.BOLD, 18));
        btn13.setBounds(1145, 4360, 140, 40);
        btn13.setOpaque(false);
        btn13.setBackground(Color.BLUE);
        btn13.setForeground(Color.WHITE);
        btn13.setFocusPainted(false);
        btn13.setBorderPainted(false);
        panel.add(btn13);
        btn13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Error();
                frame.dispose();
            }
        });

        // Privacy Policy
        JButton btn10 = new JButton("Privacy Policy");
        btn10.setFont(new Font("Arial", Font.BOLD, 18));
        btn10.setBounds(604, 4360, 170, 40);
        btn10.setOpaque(false);
        btn10.setBackground(Color.BLUE);
        btn10.setForeground(Color.WHITE);
        btn10.setFocusPainted(false);
        btn10.setBorderPainted(false);
        panel.add(btn10);
        btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Useless.Error();
                frame.dispose();
            }
        });

        //boder
        JLabel lbl111 = new JLabel();
        lbl111.setBounds(0, 0,1920,14);
        lbl111.setFont(new Font("Arial", Font.BOLD, 18));
        lbl111.setOpaque(true);
        lbl111.setBackground(new Color(0, 17, 88));
        lbl111.setForeground(Color.WHITE);
        panel.add(lbl111);
        JLabel lbl112 = new JLabel();
        lbl112.setBounds(0, 0,14,4400);
        lbl112.setFont(new Font("Arial", Font.BOLD, 18));
        lbl112.setOpaque(true);
        lbl112.setBackground(new Color(0, 17, 88));
        lbl112.setForeground(Color.WHITE);
        panel.add(lbl112);
        JLabel lbl113 = new JLabel();
        lbl113.setBounds(1505, 0,14,4400);
        lbl113.setFont(new Font("Arial", Font.BOLD, 18));
        lbl113.setOpaque(true);
        lbl113.setBackground(new Color(0, 17, 88));
        lbl113.setForeground(Color.WHITE);
        panel.add(lbl113);




        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.setContentPane(scrollPane);

        frame.setVisible(true);
    }
}
