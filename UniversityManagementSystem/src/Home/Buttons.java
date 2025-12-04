package Home;

import About.About;
import Academics.Academics;
import Admission.Admission;
import CampusLife.CampusLife;
import Contact.Contact;
import Contact.Webmail;
import LogIn.LogIn;
import Programme.Programme;
import Reasearch.Reasearch;
import Useless.Error;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons {

    public Buttons(JFrame frame) {



        // Home Button
        JButton btnH = new JButton("Home");
        btnH.setFont(new Font("Arial", Font.BOLD, 23));
        btnH.setBounds(1400, 25, 120, 30);
        btnH.setForeground(Color.BLACK);
        btnH.setFocusPainted(false);
        btnH.setContentAreaFilled(false);
        btnH.setOpaque(false);
        frame.add(btnH);
        btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });

        // WebMail Button
        JButton btnW = new JButton("Webmail");
        btnW.setFont(new Font("Arial", Font.BOLD, 23));
        btnW.setBounds(1390, 75, 130, 30);
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

        // About
        JButton btn1 = new JButton("About");
        btn1.setFont(new Font("Arial", Font.BOLD, 23));
        btn1.setBounds(20, 210, 150, 40);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.WHITE);
        btn1.setOpaque(false);
        btn1.setBorderPainted(false);
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new About();
                frame.dispose();
            }
        });

        // Programmes
        JButton btn2 = new JButton("Programmes");
        btn2.setFont(new Font("Arial", Font.BOLD, 23));
        btn2.setBounds(190, 210, 180, 40);
        btn2.setBackground(Color.WHITE);
        btn2.setForeground(Color.WHITE);
        btn2.setOpaque(false);
        btn2.setBorderPainted(false);
        frame.add(btn2);
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Programme();
                frame.dispose();
            }
        });

        // Academics
        JButton btn3 = new JButton("Academics");
        btn3.setFont(new Font("Arial", Font.BOLD, 23));
        btn3.setBounds(390, 210, 170, 40);
        btn3.setBackground(Color.WHITE);
        btn3.setForeground(Color.WHITE);
        btn3.setOpaque(false);
        btn3.setBorderPainted(false);
        frame.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Academics();
                frame.dispose();
            }
        });

        // Admission
        JButton btn4 = new JButton("Admission");
        btn4.setFont(new Font("Arial", Font.BOLD, 23));
        btn4.setBounds(580, 210, 170, 40);
        btn4.setBackground(Color.WHITE);
        btn4.setForeground(Color.WHITE);
        btn4.setOpaque(false);
        btn4.setBorderPainted(false);
        frame.add(btn4);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Admission();
                frame.dispose();
            }
        });

        // Research
        JButton btn5 = new JButton("Research");
        btn5.setFont(new Font("Arial", Font.BOLD, 23));
        btn5.setBounds(770, 210, 160, 40);
        btn5.setBackground(Color.WHITE);
        btn5.setForeground(Color.WHITE);
        btn5.setOpaque(false);
        btn5.setBorderPainted(false);
        frame.add(btn5);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Reasearch();
                frame.dispose();
            }
        });

        // Campus Life
        JButton btn6 = new JButton("Campus Life");
        btn6.setFont(new Font("Arial", Font.BOLD, 23));
        btn6.setBounds(950, 210, 180, 40);
        btn6.setBackground(Color.WHITE);
        btn6.setForeground(Color.WHITE);
        btn6.setOpaque(false);
        btn6.setBorderPainted(false);
        frame.add(btn6);
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new CampusLife();
                frame.dispose();
            }
        });

        // Contact
        JButton btn7 = new JButton("Contact");
        btn7.setFont(new Font("Arial", Font.BOLD, 23));
        btn7.setBounds(1150, 210, 170, 40);
        btn7.setBackground(Color.WHITE);
        btn7.setForeground(Color.WHITE);
        btn7.setOpaque(false);
        btn7.setBorderPainted(false);
        frame.add(btn7);
        btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Contact();
                frame.dispose();
            }
        });

        // Log in
        JButton btn8 = new JButton("Log in");
        btn8.setFont(new Font("Arial", Font.BOLD, 23));
        btn8.setBounds(1340, 210, 170, 40);
        btn8.setBackground(Color.WHITE);
        btn8.setForeground(Color.WHITE);
        btn8.setOpaque(false);
        btn8.setBorderPainted(false);
        frame.add(btn8);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LogIn();
                frame.dispose();
            }
        });
        JLabel lbl = new JLabel();
        lbl.setBounds(10, 205, 1515, 50);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setOpaque(true);
        lbl.setBackground(new Color(0, 17, 88));
        lbl.setForeground(Color.WHITE);
        frame.add(lbl);


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
                new Error();
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
                new Error();
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
                new Error();
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
                new Error();
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

    }
}
