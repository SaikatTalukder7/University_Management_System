package Academics;

import About.About;
import Admission.Admission;
import CampusLife.CampusLife;
import Contact.Contact;
import LogIn.LogIn;
import Programme.Programme;
import Reasearch.Reasearch;
import SubButtons.SubButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Academics {
    public Academics() {

        JFrame frame = new JFrame("Academics");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        SubButtons abtn = new SubButtons(frame);

        JPanel pnl = new JPanel();
        pnl.setLayout(null);
        pnl.setBounds(250, 240, 1270, 50);
        pnl.setBackground(Color.WHITE);
        pnl.setVisible(true);
        frame.add(pnl);
        JLabel lbl1 = new JLabel("Academics Overview");
        lbl1.setBounds(10, 5, 1270, 40);
        lbl1.setFont(new Font("Arial", Font.BOLD, 28));
        lbl1.setForeground(Color.BLACK);
        pnl.add(lbl1);
        frame.add(pnl);

        JPanel pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBounds(250, 295, 1270, 90);
        pnl1.setBackground(Color.WHITE);
        pnl1.setVisible(true);
        frame.add(pnl1);
        JLabel lbl2 = new JLabel("Vision:");
        lbl2.setBounds(20, 5, 200, 30);
        lbl2.setFont(new Font("Arial", Font.BOLD, 20));
        pnl1.add(lbl2);
        JLabel lbl3 = new JLabel("To provide top-quality education across ENG, BBA, CSE, EEE, SWE, ECO, and LLB departments, fostering knowledge, innovation, ethical values, critical thinking, and leadership,");
        lbl3.setBounds(20, 35, 1250, 25);
        lbl3.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl1.add(lbl3);
        JLabel lbl4 = new JLabel("preparing students as competent global citizens.");
        lbl4.setBounds(20, 60, 1250, 25);
        lbl4.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl1.add(lbl4);
        frame.add(pnl1);

        JPanel pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBounds(250, 390, 1270, 140);
        pnl2.setBackground(Color.WHITE);
        pnl2.setVisible(true);
        frame.add(pnl2);
        JLabel lbl5 = new JLabel("Mission:");
        lbl5.setBounds(20, 5, 200, 30);
        lbl5.setFont(new Font("Arial", Font.BOLD, 20));
        pnl2.add(lbl5);
        JLabel lbl6 = new JLabel("• Deliver high-quality education across all departments with practical learning and modern teaching methods.");
        lbl6.setBounds(20, 35, 1250, 25);
        lbl6.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl2.add(lbl6);
        JLabel lbl7 = new JLabel("• Promote research, innovation, and critical thinking to ensure academic excellence and problem-solving skills.");
        lbl7.setBounds(20, 60, 1250, 25);
        lbl7.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl2.add(lbl7);
        JLabel lbl8 = new JLabel("• Prepare graduates for successful careers, higher studies, and lifelong learning in national and international contexts.");
        lbl8.setBounds(20, 85, 1250, 25);
        lbl8.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl2.add(lbl8);
        JLabel lbl9 = new JLabel("• Instill ethics, leadership, and social responsibility in students across all disciplines.");
        lbl9.setBounds(20, 110, 1250, 25);
        lbl9.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl2.add(lbl9);
        frame.add(pnl2);

        JPanel pnl3 = new JPanel();
        pnl3.setLayout(null);
        pnl3.setBounds(250, 535, 1270, 205);
        pnl3.setBackground(Color.WHITE);
        pnl3.setVisible(true);
        frame.add(pnl3);
        JLabel lbl10 = new JLabel("Future Goals:");
        lbl10.setBounds(20, 5, 200, 30);
        lbl10.setFont(new Font("Arial", Font.BOLD, 20));
        pnl3.add(lbl10);
        JLabel lbl11 = new JLabel("• Expand academic programs, modern facilities, research labs, and innovative learning environments for all departments.");
        lbl11.setBounds(20, 35, 1250, 25);
        lbl11.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl3.add(lbl11);
        JLabel lbl12 = new JLabel("• Strengthen collaborations with industries, internships, and research opportunities to enhance practical exposure and employability.");
        lbl12.setBounds(20, 60, 1250, 25);
        lbl12.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl3.add(lbl12);
        JLabel lbl13 = new JLabel("• Produce globally competent graduates from ENG, BBA, CSE, EEE, SWE, ECO, and LLB who can lead in innovation and society.");
        lbl13.setBounds(20, 85, 1250, 25);
        lbl13.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl3.add(lbl13);
        JLabel lbl14 = new JLabel("• Introduce advanced digital learning tools and smart classrooms to improve teaching and learning outcomes.");
        lbl14.setBounds(20, 110, 1250, 25);
        lbl14.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl3.add(lbl14);
        JLabel lbl15 = new JLabel("• Foster international collaborations, student exchange programs, and global research partnerships.");
        lbl15.setBounds(20, 135, 1250, 25);
        lbl15.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl3.add(lbl15);
        JLabel lbl16 = new JLabel("• Encourage entrepreneurship and startup initiatives among students across all departments.");
        lbl16.setBounds(20, 160, 1250, 25);
        lbl16.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl3.add(lbl16);
        frame.add(pnl3);




        JPanel pnl4 = new JPanel();
        pnl4.setLayout(null);
        pnl4.setBounds(250, 240, 1270, 50);
        pnl4.setBackground(Color.WHITE);
        pnl4.setVisible(false);
        JLabel lbl17 = new JLabel("English");
        lbl17.setBounds(10, 5, 1270, 40);
        lbl17.setFont(new Font("Arial", Font.BOLD, 28));
        lbl17.setForeground(Color.BLACK);
        pnl4.add(lbl17);
        frame.add(pnl4);
        JPanel pnl5 = new JPanel();
        pnl5.setLayout(null);
        pnl5.setBounds(250, 295, 1270, 60);
        pnl5.setBackground(Color.WHITE);
        pnl5.setVisible(false);
        JLabel lbl18 = new JLabel("The department of EAdmission houses a set of vibrant, devoted and diverse teachers. They provide students with an excellent education in the liberal arts—one that strikes an ");
        lbl18.setBounds(20, 5, 1250, 25);
        lbl18.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl5.add(lbl18);
        JLabel lbl19 = new JLabel("ideal balance between creativity and critical inquiry.");
        lbl19.setBounds(20, 30, 1250, 25);
        lbl19.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl5.add(lbl19);
        frame.add(pnl5);

        JPanel pnl6 = new JPanel();
        pnl6.setLayout(null);
        pnl6.setBounds(250, 360, 1270, 165);
        pnl6.setBackground(Color.WHITE);
        pnl6.setVisible(false);
        JLabel lbl20 = new JLabel("The syllabus, designed with utmost care, aims at simultaneously improving the language skills of the students and deepening their knowledge of literature. The courses have been ");
        lbl20.setBounds(20, 5, 1250, 25);
        lbl20.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl6.add(lbl20);
        JLabel lbl21 = new JLabel("selected by constantly comparing them with courses in similar programs offered at outstanding universities of home and abroad. The aim in doing so has always been to bring it ");
        lbl21.setBounds(20, 30, 1250, 25);
        lbl21.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl6.add(lbl21);
        JLabel lbl22 = new JLabel("more into line with international developments in the field. While the literature courses are mainly following an established EAdmission canon, the language and linguistics courses have ");
        lbl22.setBounds(20, 55, 1250, 25);
        lbl22.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl6.add(lbl22);
        JLabel lbl23 = new JLabel("been refurbished with the latest ideas, theories and practices in the field. The literature courses, however, in their turn, are given a focus that interfaces Anglo-American culture ");
        lbl23.setBounds(20, 80, 1250, 25);
        lbl23.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl6.add(lbl23);
        JLabel lbl24 = new JLabel("with our own. The students will also have a taste of other literatures both classical and contemporary. The principle behind it is to make students see the integrative as well as the");
        lbl24.setBounds(20, 105, 1250, 25);
        lbl24.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl6.add(lbl24);
        JLabel lbl25 = new JLabel("disintegrative aspects of different cultures, and to find out a way to a holistic understanding of literature and language.");
        lbl25.setBounds(20, 130, 1250, 25);
        lbl25.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl6.add(lbl25);
        frame.add(pnl6);




        ImageIcon icon = new ImageIcon("image/EngHead.jpg");
        Image image2 = icon.getImage();
        Image newImage2 = image2.getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JPanel pnl7 = new JPanel();
        pnl7.setLayout(null);
        pnl7.setBounds(200, 230, 1270, 342);
        pnl7.setBackground(Color.WHITE);
        pnl7.setOpaque(false);
        pnl7.setVisible(false);
        JLabel lbl26 = new JLabel(new ImageIcon(newImage2));
        lbl26.setBounds(565, 5, 150, 180);
        lbl26.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl7.add(lbl26);
        JLabel lbl27 = new JLabel("Sanjida Chowdhury", SwingConstants.CENTER);
        lbl27.setBounds(10, 195, 1270, 25);
        lbl27.setFont(new Font("Arial", Font.BOLD, 20));
        lbl27.setForeground(Color.BLACK);
        pnl7.add(lbl27);
        JLabel lbl28 = new JLabel("Assistant Professor and Head Department of EAdmission", SwingConstants.CENTER);
        lbl28.setBounds(10, 220, 1270, 25);
        lbl28.setFont(new Font("Arial", Font.BOLD, 20));
        lbl28.setForeground(Color.BLACK);
        pnl7.add(lbl28);
        JLabel lbl29 = new JLabel("Metropolitan University", SwingConstants.CENTER);
        lbl29.setBounds(10, 245, 1270, 25);
        lbl29.setFont(new Font("Arial", Font.BOLD, 20));
        lbl29.setForeground(Color.BLACK);
        pnl7.add(lbl29);
        JLabel lbl30 = new JLabel("Message ", SwingConstants.CENTER);
        lbl30.setBounds(10, 300, 1270, 16);
        lbl30.setFont(new Font("Arial", Font.BOLD, 13));
        lbl30.setForeground(Color.BLACK);
        pnl7.add(lbl30);
        JLabel lbl31 = new JLabel("Content Coming Soon ....", SwingConstants.CENTER);
        lbl31.setBounds(10, 316, 1270, 16);
        lbl31.setFont(new Font("Arial", Font.BOLD, 13));
        lbl31.setForeground(Color.BLACK);
        pnl7.add(lbl31);
        frame.add(pnl7);




        JPanel pnl8 = new JPanel();
        pnl8.setLayout(null);
        pnl8.setBounds(250, 240, 1260, 40);
        pnl8.setOpaque(true);
        pnl8.setBackground(Color.white);
        pnl8.setVisible(false);
        JLabel lbl32 = new JLabel("B.A. (Hons.) in English Admission");
        lbl32.setBounds(10, 5, 400, 35);
        lbl32.setFont(new Font("Arial", Font.BOLD, 25));
        lbl32.setForeground(Color.BLACK);
        pnl8.add(lbl32);
        frame.add(pnl8);

        JPanel pnl9 = new JPanel();
        pnl9.setLayout(null);
        pnl9.setBounds(250, 285, 1260, 60);
        pnl9.setOpaque(true);
        pnl9.setBackground(Color.white);
        pnl9.setVisible(false);
        JLabel lbl33 = new JLabel("Duration: 4 Years");
        lbl33.setBounds(10, 5, 150, 22);
        lbl33.setFont(new Font("Arial", Font.BOLD, 17));
        lbl33.setForeground(Color.BLACK);
        pnl9.add(lbl33);
        JLabel lbl34 = new JLabel("Schedule: Day");
        lbl34.setBounds(200, 5, 350, 22);
        lbl34.setFont(new Font("Arial", Font.BOLD, 17));
        lbl34.setForeground(Color.BLACK);
        pnl9.add(lbl34);
        JLabel lbl35 = new JLabel("Total Credits: 123");
        lbl35.setBounds(10, 30, 150, 22);
        lbl35.setFont(new Font("Arial", Font.BOLD, 17));
        lbl35.setForeground(Color.BLACK);
        pnl9.add(lbl35);
        JLabel lbl36 = new JLabel("Entry Time: January/May/September");
        lbl36.setBounds(200, 30, 350, 22);
        lbl36.setFont(new Font("Arial", Font.BOLD, 17));
        lbl36.setForeground(Color.BLACK);
        pnl9.add(lbl36);
        frame.add(pnl9);

        JPanel pnl10 = new JPanel();
        pnl10.setLayout(null);
        pnl10.setBounds(250, 350, 1260, 105);
        pnl10.setOpaque(true);
        pnl10.setBackground(Color.white);
        pnl10.setVisible(false);
        JLabel lbl37 = new JLabel("Programme Summary:");
        lbl37.setBounds(10, 5, 1250, 25);
        lbl37.setFont(new Font("Arial", Font.BOLD, 20));
        lbl37.setForeground(Color.BLACK);
        pnl10.add(lbl37);
        JLabel lbl38 = new JLabel("The era of post-modern EAdmission has now, more than ever, wider peripheries of needs, richer ideas to explore and better prospects to share. EAdmission now means more than a literature or");
        lbl38.setBounds(10, 35, 1250, 20);
        lbl38.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl38.setForeground(Color.BLACK);
        pnl10.add(lbl38);
        JLabel lbl39 = new JLabel("a language, and is considered a gateway to teaching, creative writing, journalism, information technology, management and administration. MU with this aim in view, offers Bachelor of Arts");
        lbl39.setBounds(10, 55, 1250, 20);
        lbl39.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl39.setForeground(Color.BLACK);
        pnl10.add(lbl39);
        JLabel lbl40 = new JLabel("in EAdmission and Masters of Arts (Preliminary & Final). The courses have been designed to equip our students with the kind of expertise they would require  to face life as global citizens.");
        lbl40.setBounds(10, 75, 1250, 20);
        lbl40.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl40.setForeground(Color.BLACK);
        pnl10.add(lbl40);
        frame.add(pnl10);

        JPanel pnl11 = new JPanel();
        pnl11.setLayout(null);
        pnl11.setBounds(250, 460, 1260, 180);
        pnl11.setOpaque(true);
        pnl11.setBackground(Color.white);
        pnl11.setVisible(false);
        JLabel lbl41 = new JLabel("Fees & Funding:");
        lbl41.setBounds(10, 5, 1250, 25);
        lbl41.setFont(new Font("Arial", Font.BOLD, 20));
        lbl41.setForeground(Color.BLACK);
        pnl11.add(lbl41);
        JLabel lbl42 = new JLabel("Metropolitan University provides financial support to the students and there is a caring tuition fee policy available to give financial aid. The students having Golden  A+ in both SSC & HSC ");
        lbl42.setBounds(10, 35, 1250, 20);
        lbl42.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl42.setForeground(Color.BLACK);
        pnl11.add(lbl42);
        JLabel lbl43 = new JLabel("will be given 50% tuition waiver.");
        lbl43.setBounds(10, 55, 1250, 20);
        lbl43.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl43.setForeground(Color.BLACK);
        pnl11.add(lbl43);
        JLabel lbl44 = new JLabel("Metropolitan University has various scholarship schemes to support the students financially.");
        lbl44.setBounds(10, 75, 1250, 20);
        lbl44.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl44.setForeground(Color.BLACK);
        pnl11.add(lbl44);
        JLabel lbl45 = new JLabel("A student who has secured A+ in all the courses in three consecutive term examinations can apply for Chairman’s Scholarship. Likewise, Vice Chancellor’s Scholarship also exists for ");
        lbl45.setBounds(10, 95, 1250, 20);
        lbl45.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl45.setForeground(Color.BLACK);
        pnl11.add(lbl45);
        JLabel lbl46 = new JLabel("the students of Metropolitan University.");
        lbl46.setBounds(10, 115, 1250, 20);
        lbl46.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl46.setForeground(Color.BLACK);
        pnl11.add(lbl46);
        JLabel lbl47 = new JLabel("Admission Fee (One time): 20,000");
        lbl47.setBounds(10, 135, 320, 17);
        lbl47.setFont(new Font("Arial", Font.BOLD, 14));
        lbl47.setForeground(Color.BLACK);
        pnl11.add(lbl47);
        JLabel lbl48 = new JLabel("Registration Fee (Per term): 10,000");
        lbl48.setBounds(10, 155, 320, 17);
        lbl48.setFont(new Font("Arial", Font.BOLD, 14));
        lbl48.setForeground(Color.BLACK);
        pnl11.add(lbl48);
        JLabel lbl49 = new JLabel("BNCC Fee (One time): 100");
        lbl49.setBounds(320, 135, 320, 17);
        lbl49.setFont(new Font("Arial", Font.BOLD, 14));
        lbl49.setForeground(Color.BLACK);
        pnl11.add(lbl49);
        JLabel lbl50 = new JLabel("Campus Activities Fee (Per Month): 1,500");
        lbl50.setBounds(320, 155, 320, 17);
        lbl50.setFont(new Font("Arial", Font.BOLD, 14));
        lbl50.setForeground(Color.BLACK);
        pnl11.add(lbl50);
        JLabel lbl51 = new JLabel("Monthly Installment of Credit Fees: 4,000");
        lbl51.setBounds(670, 135, 320, 17);
        lbl51.setFont(new Font("Arial", Font.BOLD, 14));
        lbl51.setForeground(Color.BLACK);
        pnl11.add(lbl51);
        frame.add(pnl11);

        JPanel pnl12 = new JPanel();
        pnl12.setLayout(null);
        pnl12.setBounds(250, 645, 1260, 95);
        pnl12.setOpaque(true);
        pnl12.setBackground(Color.white);
        pnl12.setVisible(false);
        JLabel lbl52 = new JLabel("How to apply:");
        lbl52.setBounds(10, 5, 320, 22);
        lbl52.setFont(new Font("Arial", Font.BOLD, 18));
        lbl52.setForeground(Color.BLACK);
        pnl12.add(lbl52);
        JLabel lbl53 = new JLabel("Submit the completed application form to the Admissions Office with the required documents:");
        lbl53.setBounds(10, 27, 1260, 20);
        lbl53.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl53.setForeground(Color.BLACK);
        pnl12.add(lbl53);
        JLabel lbl54 = new JLabel("Photocopies of Birth Certificate/ National ID/ Passport.");
        lbl54.setBounds(10, 50, 420, 17);
        lbl54.setFont(new Font("Arial", Font.BOLD, 14));
        lbl54.setForeground(Color.BLACK);
        pnl12.add(lbl54);
        JLabel lbl55 = new JLabel("Four (04) copies of Passport size colour photographs.");
        lbl55.setBounds(10, 70, 420, 16);
        lbl55.setFont(new Font("Arial", Font.BOLD, 14));
        lbl55.setForeground(Color.BLACK);
        pnl12.add(lbl55);
        JLabel lbl56 = new JLabel("Blood Group.");
        lbl56.setBounds(430, 50, 500, 17);
        lbl56.setFont(new Font("Arial", Font.BOLD, 14));
        lbl56.setForeground(Color.BLACK);
        pnl12.add(lbl56);
        JLabel lbl57 = new JLabel("Original and one set of Photocopy of all Educational Certificates & Mark sheets.");
        lbl57.setBounds(430, 70, 570, 17);
        lbl57.setFont(new Font("Arial", Font.BOLD, 14));
        lbl57.setForeground(Color.BLACK);
        pnl12.add(lbl57);
        frame.add(pnl12);




        JPanel pnl13 = new JPanel();
        pnl13.setLayout(null);
        pnl13.setBounds(50, 230, 1290, 500);
        pnl13.setOpaque(false);
        pnl13.setVisible(false);
        frame.add(pnl13);
        ImageIcon icon58 = new ImageIcon("src/Academics/All/Eng/ePhoto/e1.png");
        Image newImage58 = icon58.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl58 = new JLabel(new ImageIcon(newImage58));
        lbl58.setBounds(320, 20, 150, 180);
        lbl58.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl58);
        JLabel lbl59 = new JLabel("Dr. Suresh Ranjan Basak", SwingConstants.CENTER);
        lbl59.setBounds(300, 210, 200, 20);
        lbl59.setFont(new Font("Arial", Font.BOLD, 15));
        lbl59.setForeground(Color.BLACK);
        pnl13.add(lbl59);
        JLabel lbl60 = new JLabel("Professor", SwingConstants.CENTER);
        lbl60.setBounds(300, 230, 200, 20);
        lbl60.setFont(new Font("Arial", Font.BOLD, 15));
        lbl60.setForeground(Color.BLACK);
        pnl13.add(lbl60);
        ImageIcon icon61 = new ImageIcon("src/Academics/All/Eng/ePhoto/e2.jpg");
        Image newImage61 = icon61.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl61 = new JLabel(new ImageIcon(newImage61));
        lbl61.setBounds(570, 20, 150, 180);
        lbl61.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl61);
        JLabel lbl62 = new JLabel("Anik Biswas", SwingConstants.CENTER);
        lbl62.setBounds(550, 210, 200, 20);
        lbl62.setFont(new Font("Arial", Font.BOLD, 15));
        lbl62.setForeground(Color.BLACK);
        pnl13.add(lbl62);
        JLabel lbl63 = new JLabel("Associate Professor", SwingConstants.CENTER);
        lbl63.setBounds(550, 230, 200, 20);
        lbl63.setFont(new Font("Arial", Font.BOLD, 15));
        lbl63.setForeground(Color.BLACK);
        pnl13.add(lbl63);
        ImageIcon icon64 = new ImageIcon("src/Academics/All/Eng/ePhoto/e3.jpeg");
        Image newImage64 = icon64.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl64 = new JLabel(new ImageIcon(newImage64));
        lbl64.setBounds(820, 20, 150, 180);
        lbl64.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl64);
        JLabel lbl65 = new JLabel("Dr. Mohammad Mostak Ahmed", SwingConstants.CENTER);
        lbl65.setBounds(780, 210, 230, 20);
        lbl65.setFont(new Font("Arial", Font.BOLD, 15));
        lbl65.setForeground(Color.BLACK);
        pnl13.add(lbl65);
        JLabel lbl66 = new JLabel("Associate Professor", SwingConstants.CENTER);
        lbl66.setBounds(800, 230, 200, 20);
        lbl66.setFont(new Font("Arial", Font.BOLD, 15));
        lbl66.setForeground(Color.BLACK);
        pnl13.add(lbl66);
        ImageIcon icon67 = new ImageIcon("image/EngHead.jpg");
        Image newImage67 = icon67.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl67 = new JLabel(new ImageIcon(newImage67));
        lbl67.setBounds(1090, 20, 150, 180);
        lbl67.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl67);
        JLabel lbl68 = new JLabel("Sanjida Chowdhury", SwingConstants.CENTER);
        lbl68.setBounds(1070, 210, 200, 20);
        lbl68.setFont(new Font("Arial", Font.BOLD, 15));
        lbl68.setForeground(Color.BLACK);
        pnl13.add(lbl68);
        JLabel lbl69 = new JLabel("Assistant Professor and Head", SwingConstants.CENTER);
        lbl69.setBounds(1060, 230, 230, 20);
        lbl69.setFont(new Font("Arial", Font.BOLD, 15));
        lbl69.setForeground(Color.BLACK);
        pnl13.add(lbl69);
        ImageIcon icon70 = new ImageIcon("src/Academics/All/Eng/ePhoto/e5.jpg");
        Image newImage70 = icon70.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl70 = new JLabel(new ImageIcon(newImage70));
        lbl70.setBounds(320, 250, 150, 180);
        lbl70.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl70);
        JLabel lbl71 = new JLabel("Syed Nakib Sadi", SwingConstants.CENTER);
        lbl71.setBounds(300, 430, 200, 20);
        lbl71.setFont(new Font("Arial", Font.BOLD, 15));
        lbl71.setForeground(Color.BLACK);
        pnl13.add(lbl71);
        JLabel lbl72 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl72.setBounds(300, 450, 200, 20);
        lbl72.setFont(new Font("Arial", Font.BOLD, 15));
        lbl72.setForeground(Color.BLACK);
        pnl13.add(lbl72);
        ImageIcon icon73 = new ImageIcon("src/Academics/All/Eng/ePhoto/e6.jpg");
        Image newImage73 = icon73.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl73 = new JLabel(new ImageIcon(newImage73));
        lbl73.setBounds(570, 250, 150, 180);
        lbl73.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl73);
        JLabel lbl74 = new JLabel("Farhana Khanom Joly", SwingConstants.CENTER);
        lbl74.setBounds(550, 430, 200, 20);
        lbl74.setFont(new Font("Arial", Font.BOLD, 15));
        lbl74.setForeground(Color.BLACK);
        pnl13.add(lbl74);
        JLabel lbl75 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl75.setBounds(550, 450, 200, 20);
        lbl75.setFont(new Font("Arial", Font.BOLD, 15));
        lbl75.setForeground(Color.BLACK);
        pnl13.add(lbl75);
        ImageIcon icon76 = new ImageIcon("src/Academics/All/Eng/ePhoto/e7.jpg");
        Image newImage76 = icon76.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl76 = new JLabel(new ImageIcon(newImage76));
        lbl76.setBounds(820, 250, 150, 180);
        lbl76.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl76);
        JLabel lbl77 = new JLabel("Abdullah Al Mashud", SwingConstants.CENTER);
        lbl77.setBounds(780, 430, 230, 20);
        lbl77.setFont(new Font("Arial", Font.BOLD, 15));
        lbl77.setForeground(Color.BLACK);
        pnl13.add(lbl77);
        JLabel lbl78 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl78.setBounds(800, 450, 200, 20);
        lbl78.setFont(new Font("Arial", Font.BOLD, 15));
        lbl78.setForeground(Color.BLACK);
        pnl13.add(lbl78);
        ImageIcon icon79 = new ImageIcon("src/Academics/All/Eng/ePhoto/e8.png");
        Image newImage79 = icon79.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl79 = new JLabel(new ImageIcon(newImage79));
        lbl79.setBounds(1090, 250, 150, 180);
        lbl79.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl13.add(lbl79);
        JLabel lbl80 = new JLabel("Golam Rabbani", SwingConstants.CENTER);
        lbl80.setBounds(1070, 430, 200, 20);
        lbl80.setFont(new Font("Arial", Font.BOLD, 15));
        lbl80.setForeground(Color.BLACK);
        pnl13.add(lbl80);
        JLabel lbl81 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl81.setBounds(1060, 450, 230, 20);
        lbl81.setFont(new Font("Arial", Font.BOLD, 15));
        lbl81.setForeground(Color.BLACK);
        pnl13.add(lbl81);





        JPanel pnl14 = new JPanel();
        pnl14.setLayout(null);
        pnl14.setBounds(250, 240, 1270, 50);
        pnl14.setBackground(Color.WHITE);
        pnl14.setVisible(false);
        frame.add(pnl14);
        JLabel lbl82 = new JLabel("Research and Publications");
        lbl82.setBounds(10, 5, 1270, 40);
        lbl82.setFont(new Font("Arial", Font.BOLD, 28));
        lbl82.setForeground(Color.BLACK);
        pnl14.add(lbl82);

        JPanel pnl15 = new JPanel();
        pnl15.setLayout(null);
        pnl15.setBounds(250, 295, 1270, 120);
        pnl15.setBackground(Color.WHITE);
        pnl15.setVisible(false);
        JLabel lbl83 = new JLabel("Anik Biswas, Assistant Professor & Head");
        lbl83.setBounds(10, 10, 1270, 25);
        lbl83.setFont(new Font("Arial", Font.BOLD, 18));
        lbl83.setForeground(Color.BLACK);
        pnl15.add(lbl83);
        JLabel lbl84 = new JLabel("1. “Satyajit Ray’s Ganashatru: An Intersemiotic Translation of Henrik Ibsen’s An Enemy of the People” was published in vol. 7 of Crossings: ULAB Journal of EAdmission Studies");
        lbl84.setBounds(10, 40, 1270, 20);
        lbl84.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl15.add(lbl84);
        JLabel lbl85 = new JLabel("2. “Voice of God and the Spirit of One’s Own in Chetan Bhagat’s One Night at the Call Center” was published in Metropolitan University Journal of EAdmission (ISSN: 2414-729X; Vol:1, 2015)");
        lbl85.setBounds(10, 65, 1270, 20);
        lbl85.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl15.add(lbl85);
        JLabel lbl86 = new JLabel("3. “Optimism in Nothingness: A Look on Some Major Characters of Humayun Ahmed’’ was published in the Morning Sun, the weekend magazine from The Daily Sun on 5th July 2013");
        lbl86.setBounds(10, 90, 1270, 20);
        lbl86.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl15.add(lbl86);
        frame.add(pnl15);

        JPanel pnl16 = new JPanel();
        pnl16.setLayout(null);
        pnl16.setBounds(250, 420, 1270, 160);
        pnl16.setBackground(Color.WHITE);
        pnl16.setVisible(false);
        JLabel lbl87 = new JLabel("Snigdha Das, Assistant Professor");
        lbl87.setBounds(10, 10, 1270, 25);
        lbl87.setFont(new Font("Arial", Font.BOLD, 18));
        lbl87.setForeground(Color.BLACK);
        pnl16.add(lbl87);
        JLabel lbl88 = new JLabel("1. “Disintegration of American Dream: A study on Arthur Miller’s Death of a Salesman and Saul Bellow’s Seize the Day”. (Published in International Journal of Humanities and Social ");
        lbl88.setBounds(10, 40, 1270, 20);
        lbl88.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl16.add(lbl88);
        JLabel lbl89 = new JLabel("      Science Invention, an International Peer Reviewed Research Organization).");
        lbl89.setBounds(10, 60, 1270, 20);
        lbl89.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl16.add(lbl89);
        JLabel lbl90 = new JLabel("2. “The Evil Bond in William Shakespeare’s The Merchant of Venice: The Source of Irrationality” along with Md. Ziaul Haque, Senior Lecturer, Department of EAdmission, Sylhet International ");
        lbl90.setBounds(10, 85, 1270, 20);
        lbl90.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl16.add(lbl90);
        JLabel lbl91 = new JLabel("      University (Published in International Journal on Studies in EAdmission Language and Literature, an international Peer Reviewed Research Organization).");
        lbl91.setBounds(10, 105, 1270, 20);
        lbl91.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl16.add(lbl91);
        JLabel lbl92 = new JLabel("3. “Delusion of Success Myth and Its Demonic Essence in Miller’s Death of a Salesman”. (Published in Metropolitan University Journal of EAdmission (ISSN: 2414-729X; Vol:1, No:1, 2015).");
        lbl92.setBounds(10, 130, 1270, 20);
        lbl92.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl16.add(lbl92);
        frame.add(pnl16);

        JPanel pnl17 = new JPanel();
        pnl17.setLayout(null);
        pnl17.setBounds(250, 585, 1270, 100);
        pnl17.setBackground(Color.WHITE);
        pnl17.setVisible(false);
        JLabel lbl93 = new JLabel("Sanjida Chowdhury, Senior Lecturer");
        lbl93.setBounds(10, 10, 1270, 25);
        lbl93.setFont(new Font("Arial", Font.BOLD, 18));
        lbl93.setForeground(Color.BLACK);
        pnl17.add(lbl93);
        JLabel lbl94 = new JLabel("1. “Inheritance of Loss: An Exposition of Entrapped Identities” was published in Metropolitan University Journal of EAdmission (ISSN: 2414-729X; Vol:1, No:1, 2015)");
        lbl94.setBounds(10, 40, 1270, 20);
        lbl94.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl17.add(lbl94);
        JLabel lbl95 = new JLabel("2. “Subaltern of the Subalterns: Caste in Mulk Raj Anand’s Untouchable” was published in vol. 8 of Crossings: ULAB Journal of EAdmission Studies");
        lbl95.setBounds(10, 65, 1270, 20);
        lbl95.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl17.add(lbl95);
        frame.add(pnl17);




        JPanel pnl18 = new JPanel();
        pnl18.setLayout(null);
        pnl18.setBounds(250, 240, 1270, 50);
        pnl18.setBackground(Color.WHITE);
        pnl18.setVisible(false);
        JLabel lbl96 = new JLabel("Business Administration");
        lbl96.setBounds(10, 5, 1270, 40);
        lbl96.setFont(new Font("Arial", Font.BOLD, 28));
        lbl96.setForeground(Color.BLACK);
        pnl18.add(lbl96);
        frame.add(pnl18);

        JPanel pnl19 = new JPanel();
        pnl19.setLayout(null);
        pnl19.setBounds(250, 295, 1270, 85);
        pnl19.setBackground(Color.WHITE);
        pnl19.setVisible(false);
        frame.add(pnl19);
        JLabel lbl97 = new JLabel("We generate an atmosphere of learning for our students who seek knowledge, be impactful business leaders of tomorrow through scholarly pursuits of our qualified faculty ");
        lbl97.setBounds(20, 5, 1250, 25);
        lbl97.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl19.add(lbl97);
        JLabel lbl98 = new JLabel("members; and nurturing wisdom, integrity and equity for being a responsible stakeholder in society. The BAdmission Administration Department, Metropolitan University provides ");
        lbl98.setBounds(20, 30, 1250, 25);
        lbl98.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl19.add(lbl98);
        JLabel lbl99 = new JLabel("students with various teaching students how to become financially literate, responsible consumers and productive young members of society.");
        lbl99.setBounds(20, 55, 1250, 25);
        lbl99.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl19.add(lbl99);

        JPanel pnl20 = new JPanel();
        pnl20.setLayout(null);
        pnl20.setBounds(250, 385, 1270, 165);
        pnl20.setBackground(Color.WHITE);
        pnl20.setVisible(false);
        frame.add(pnl20);
        JLabel lbl100 = new JLabel("Department’s Objectives");
        lbl100.setBounds(20, 5, 1250, 25);
        lbl100.setFont(new Font("Arial", Font.BOLD, 18));
        lbl100.setForeground(Color.BLACK);
        pnl20.add(lbl100);
        JLabel lbl101 = new JLabel(" To provide business graduates with professional attitudes aligned with modern technology. ");
        lbl101.setBounds(20, 35, 1250, 25);
        lbl101.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl20.add(lbl101);
        JLabel lbl102 = new JLabel(" To create ethical sense to operate businesses in the society that can lead the nation to a role model for others. ");
        lbl102.setBounds(20, 60, 1250, 25);
        lbl102.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl20.add(lbl102);
        JLabel lbl103 = new JLabel(" To facilitate research works for faculty members and students. ");
        lbl103.setBounds(20, 85, 1250, 25);
        lbl103.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl20.add(lbl103);
        JLabel lbl104 = new JLabel(" To create mobility of the students through state of the art curriculum and learning system compatible work of the recent trends. ");
        lbl104.setBounds(20, 110, 1250, 25);
        lbl104.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl20.add(lbl104);
        JLabel lbl105 = new JLabel(" To enhance opportunities for co-curriculum, extra curriculum, real-life experiences, professional development and career placement.");
        lbl105.setBounds(20, 135, 1250, 25);
        lbl105.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl20.add(lbl105);




        ImageIcon iconBH = new ImageIcon("src/Academics/All/Bba/bPhoto/b1.png");
        Image imageBH = iconBH.getImage();
        Image newImageBH = imageBH.getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JPanel pnl21 = new JPanel();
        pnl21.setLayout(null);
        pnl21.setBounds(200, 230, 1270, 342);
        pnl21.setBackground(Color.WHITE);
        pnl21.setOpaque(false);
        pnl21.setVisible(false);
        JLabel lbl106 = new JLabel(new ImageIcon(newImageBH));
        lbl106.setBounds(565, 5, 150, 180);
        lbl106.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl21.add(lbl106);
        JLabel lbl107 = new JLabel("Dr. Tofayel Ahmed", SwingConstants.CENTER);
        lbl107.setBounds(10, 195, 1270, 25);
        lbl107.setFont(new Font("Arial", Font.BOLD, 20));
        lbl107.setForeground(Color.BLACK);
        pnl21.add(lbl107);
        JLabel lbl108 = new JLabel("Professor and Head Department of BAdmission Administration", SwingConstants.CENTER);
        lbl108.setBounds(10, 220, 1270, 25);
        lbl108.setFont(new Font("Arial", Font.BOLD, 20));
        lbl108.setForeground(Color.BLACK);
        pnl21.add(lbl108);
        JLabel lbl109 = new JLabel("Metropolitan University", SwingConstants.CENTER);
        lbl109.setBounds(10, 245, 1270, 25);
        lbl109.setFont(new Font("Arial", Font.BOLD, 20));
        lbl109.setForeground(Color.BLACK);
        pnl21.add(lbl109);
        JLabel lbl110 = new JLabel("Message ", SwingConstants.CENTER);
        lbl110.setBounds(10, 300, 1270, 16);
        lbl110.setFont(new Font("Arial", Font.BOLD, 13));
        lbl110.setForeground(Color.BLACK);
        pnl21.add(lbl110);
        JLabel lbl111 = new JLabel("Content Coming Soon ....", SwingConstants.CENTER);
        lbl111.setBounds(10, 316, 1270, 16);
        lbl111.setFont(new Font("Arial", Font.BOLD, 13));
        lbl111.setForeground(Color.BLACK);
        pnl21.add(lbl111);
        frame.add(pnl21);





        JPanel pnl22 = new JPanel();
        pnl22.setLayout(null);
        pnl22.setBounds(250, 240, 1260, 40);
        pnl22.setOpaque(true);
        pnl22.setBackground(Color.white);
        pnl22.setVisible(false);
        JLabel lbl112 = new JLabel("Bachelor of Business Administration Admission");
        lbl112.setBounds(10, 5, 1250, 35);
        lbl112.setFont(new Font("Arial", Font.BOLD, 25));
        lbl112.setForeground(Color.BLACK);
        pnl22.add(lbl112);
        frame.add(pnl22);

        JPanel pnl23 = new JPanel();
        pnl23.setLayout(null);
        pnl23.setBounds(250, 285, 1260, 60);
        pnl23.setOpaque(true);
        pnl23.setBackground(Color.white);
        pnl23.setVisible(false);
        JLabel lbl113 = new JLabel("Duration: 4 Years");
        lbl113.setBounds(10, 5, 150, 22);
        lbl113.setFont(new Font("Arial", Font.BOLD, 17));
        lbl113.setForeground(Color.BLACK);
        pnl23.add(lbl113);
        JLabel lbl114 = new JLabel("Schedule: Day");
        lbl114.setBounds(200, 5, 350, 22);
        lbl114.setFont(new Font("Arial", Font.BOLD, 17));
        lbl114.setForeground(Color.BLACK);
        pnl23.add(lbl114);
        JLabel lbl115 = new JLabel("Total Credits: 123");
        lbl115.setBounds(10, 30, 150, 22);
        lbl115.setFont(new Font("Arial", Font.BOLD, 17));
        lbl115.setForeground(Color.BLACK);
        pnl23.add(lbl115);
        JLabel lbl116 = new JLabel("Entry Time: January/May/September");
        lbl116.setBounds(200, 30, 350, 22);
        lbl116.setFont(new Font("Arial", Font.BOLD, 17));
        lbl116.setForeground(Color.BLACK);
        pnl23.add(lbl116);
        frame.add(pnl23);

        JPanel pnl24 = new JPanel();
        pnl24.setLayout(null);
        pnl24.setBounds(250, 350, 1260, 105);
        pnl24.setOpaque(true);
        pnl24.setBackground(Color.white);
        pnl24.setVisible(false);
        JLabel lbl117 = new JLabel("Programme Summary:");
        lbl117.setBounds(10, 5, 1250, 25);
        lbl117.setFont(new Font("Arial", Font.BOLD, 20));
        lbl117.setForeground(Color.BLACK);
        pnl24.add(lbl117);
        JLabel lbl118 = new JLabel("BAdmission Administration Department offers a 4-year Bachelor degree called ‘Bachelor of BAdmission Administration’. To become a graduate in this field, one has to complete 123 credits.");
        lbl118.setBounds(10, 35, 1250, 20);
        lbl118.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl118.setForeground(Color.BLACK);
        pnl24.add(lbl118);
        JLabel lbl119 = new JLabel("This program equips students with essential business and management skills to become effective leaders, innovators, and entrepreneurs. It provides strong academic training along with ");
        lbl119.setBounds(10, 55, 1250, 20);
        lbl119.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl119.setForeground(Color.BLACK);
        pnl24.add(lbl119);
        JLabel lbl120 = new JLabel("broad knowledge in related fields, preparing graduates to perform successfully in diverse environments including private, public, and NGO sectors, small and medium enterprises.");
        lbl120.setBounds(10, 75, 1250, 20);
        lbl120.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl120.setForeground(Color.BLACK);
        pnl24.add(lbl120);
        frame.add(pnl24);

        JPanel pnl25 = new JPanel();
        pnl25.setLayout(null);
        pnl25.setBounds(250, 460, 1260, 180);
        pnl25.setOpaque(true);
        pnl25.setBackground(Color.white);
        pnl25.setVisible(false);
        JLabel lbl121 = new JLabel("Fees & Funding:");
        lbl121.setBounds(10, 5, 1250, 25);
        lbl121.setFont(new Font("Arial", Font.BOLD, 20));
        lbl121.setForeground(Color.BLACK);
        pnl25.add(lbl121);
        JLabel lbl122 = new JLabel("Metropolitan University provides financial support to the students and there is a caring tuition fee policy available to give financial aid. The students having Golden  A+ in both SSC & HSC ");
        lbl122.setBounds(10, 35, 1250, 20);
        lbl122.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl122.setForeground(Color.BLACK);
        pnl25.add(lbl122);
        JLabel lbl123 = new JLabel("will be given 50% tuition waiver.");
        lbl123.setBounds(10, 55, 1250, 20);
        lbl123.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl123.setForeground(Color.BLACK);
        pnl25.add(lbl123);
        JLabel lbl124 = new JLabel("Metropolitan University has various scholarship schemes to support the students financially.");
        lbl124.setBounds(10, 75, 1250, 20);
        lbl124.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl124.setForeground(Color.BLACK);
        pnl25.add(lbl124);
        JLabel lbl125 = new JLabel("A student who has secured A+ in all the courses in three consecutive term examinations can apply for Chairman’s Scholarship. Likewise, Vice Chancellor’s Scholarship also exists for ");
        lbl125.setBounds(10, 95, 1250, 20);
        lbl125.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl125.setForeground(Color.BLACK);
        pnl25.add(lbl125);
        JLabel lbl126 = new JLabel("the students of Metropolitan University.");
        lbl126.setBounds(10, 115, 1250, 20);
        lbl126.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl126.setForeground(Color.BLACK);
        pnl25.add(lbl126);
        JLabel lbl127 = new JLabel("Admission Fee (One time): 20,000");
        lbl127.setBounds(10, 135, 320, 17);
        lbl127.setFont(new Font("Arial", Font.BOLD, 14));
        lbl127.setForeground(Color.BLACK);
        pnl25.add(lbl127);
        JLabel lbl128 = new JLabel("Registration Fee (Per term): 10,000");
        lbl128.setBounds(10, 155, 320, 17);
        lbl128.setFont(new Font("Arial", Font.BOLD, 14));
        lbl128.setForeground(Color.BLACK);
        pnl25.add(lbl128);
        JLabel lbl129 = new JLabel("BNCC Fee (One time): 100");
        lbl129.setBounds(320, 135, 320, 17);
        lbl129.setFont(new Font("Arial", Font.BOLD, 14));
        lbl129.setForeground(Color.BLACK);
        pnl25.add(lbl129);
        JLabel lbl130 = new JLabel("Campus Activities Fee (Per Month): 1,500");
        lbl130.setBounds(320, 155, 320, 17);
        lbl130.setFont(new Font("Arial", Font.BOLD, 14));
        lbl130.setForeground(Color.BLACK);
        pnl25.add(lbl130);
        JLabel lbl131 = new JLabel("Monthly Installment of Credit Fees: 5,000");
        lbl131.setBounds(670, 135, 320, 17);
        lbl131.setFont(new Font("Arial", Font.BOLD, 14));
        lbl131.setForeground(Color.BLACK);
        pnl25.add(lbl131);
        frame.add(pnl25);

        JPanel pnl26 = new JPanel();
        pnl26.setLayout(null);
        pnl26.setBounds(250, 645, 1260, 95);
        pnl26.setOpaque(true);
        pnl26.setBackground(Color.white);
        pnl26.setVisible(false);
        JLabel lbl132 = new JLabel("How to apply:");
        lbl132.setBounds(10, 5, 320, 22);
        lbl132.setFont(new Font("Arial", Font.BOLD, 18));
        lbl132.setForeground(Color.BLACK);
        pnl26.add(lbl132);
        JLabel lbl133 = new JLabel("Submit the completed application form to the Admissions Office with the required documents:");
        lbl133.setBounds(10, 27, 1260, 20);
        lbl133.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl133.setForeground(Color.BLACK);
        pnl26.add(lbl133);
        JLabel lbl134 = new JLabel("Photocopies of Birth Certificate/ National ID/ Passport.");
        lbl134.setBounds(10, 50, 420, 17);
        lbl134.setFont(new Font("Arial", Font.BOLD, 14));
        lbl134.setForeground(Color.BLACK);
        pnl26.add(lbl134);
        JLabel lbl135 = new JLabel("Four (04) copies of Passport size colour photographs.");
        lbl135.setBounds(10, 70, 420, 16);
        lbl135.setFont(new Font("Arial", Font.BOLD, 14));
        lbl135.setForeground(Color.BLACK);
        pnl26.add(lbl135);
        JLabel lbl136 = new JLabel("Blood Group.");
        lbl136.setBounds(430, 50, 500, 17);
        lbl136.setFont(new Font("Arial", Font.BOLD, 14));
        lbl136.setForeground(Color.BLACK);
        pnl26.add(lbl136);
        JLabel lbl137 = new JLabel("Original and one set of Photocopy of all Educational Certificates & Mark sheets.");
        lbl137.setBounds(430, 70, 570, 17);
        lbl137.setFont(new Font("Arial", Font.BOLD, 14));
        lbl137.setForeground(Color.BLACK);
        pnl26.add(lbl137);
        frame.add(pnl26);




        JPanel pnl27 = new JPanel();
        pnl27.setLayout(null);
        pnl27.setBounds(50, 230, 1290, 500);
        pnl27.setOpaque(false);
        pnl27.setVisible(false);
        frame.add(pnl27);
        ImageIcon icon138 = new ImageIcon("src/Academics/All/Bba/bPhoto/b1.png");
        Image newImage138 = icon138.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl138 = new JLabel(new ImageIcon(newImage138));
        lbl138.setBounds(320, 20, 150, 180);
        lbl138.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl138);
        JLabel lbl139 = new JLabel("Dr. Tofayel Ahmed", SwingConstants.CENTER);
        lbl139.setBounds(300, 210, 200, 20);
        lbl139.setFont(new Font("Arial", Font.BOLD, 15));
        lbl139.setForeground(Color.BLACK);
        pnl27.add(lbl139);
        JLabel lbl140 = new JLabel("Professor and Head", SwingConstants.CENTER);
        lbl140.setBounds(300, 230, 200, 20);
        lbl140.setFont(new Font("Arial", Font.BOLD, 15));
        lbl140.setForeground(Color.BLACK);
        pnl27.add(lbl140);
        ImageIcon icon141 = new ImageIcon("src/Academics/All/Bba/bPhoto/b2.jpg");
        Image newImage141 = icon141.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl141 = new JLabel(new ImageIcon(newImage141));
        lbl141.setBounds(570, 20, 150, 180);
        lbl141.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl141);
        JLabel lbl142 = new JLabel("Md. Alaul Haque", SwingConstants.CENTER);
        lbl142.setBounds(550, 210, 200, 20);
        lbl142.setFont(new Font("Arial", Font.BOLD, 15));
        lbl142.setForeground(Color.BLACK);
        pnl27.add(lbl142);
        JLabel lbl143 = new JLabel("Associate Professor", SwingConstants.CENTER);
        lbl143.setBounds(550, 230, 200, 20);
        lbl143.setFont(new Font("Arial", Font.BOLD, 15));
        lbl143.setForeground(Color.BLACK);
        pnl27.add(lbl143);
        ImageIcon icon144 = new ImageIcon("src/Academics/All/Bba/bPhoto/b3.jpg");
        Image newImage144 = icon144.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl144 = new JLabel(new ImageIcon(newImage144));
        lbl144.setBounds(820, 20, 150, 180);
        lbl144.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl144);
        JLabel lbl145 = new JLabel("Nishath Anjum", SwingConstants.CENTER);
        lbl145.setBounds(780, 210, 230, 20);
        lbl145.setFont(new Font("Arial", Font.BOLD, 15));
        lbl145.setForeground(Color.BLACK);
        pnl27.add(lbl145);
        JLabel lbl146 = new JLabel("Associate Professor", SwingConstants.CENTER);
        lbl146.setBounds(800, 230, 200, 20);
        lbl146.setFont(new Font("Arial", Font.BOLD, 15));
        lbl146.setForeground(Color.BLACK);
        pnl27.add(lbl146);
        ImageIcon icon147 = new ImageIcon("src/Academics/All/Bba/bPhoto/b4.jpg");
        Image newImage147 = icon147.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl147 = new JLabel(new ImageIcon(newImage147));
        lbl147.setBounds(1090, 20, 150, 180);
        lbl147.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl147);
        JLabel lbl148 = new JLabel("Md. Afsarul Islam", SwingConstants.CENTER);
        lbl148.setBounds(1070, 210, 200, 20);
        lbl148.setFont(new Font("Arial", Font.BOLD, 15));
        lbl148.setForeground(Color.BLACK);
        pnl27.add(lbl148);
        JLabel lbl149 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl149.setBounds(1060, 230, 230, 20);
        lbl149.setFont(new Font("Arial", Font.BOLD, 15));
        lbl149.setForeground(Color.BLACK);
        pnl27.add(lbl149);
        ImageIcon icon150 = new ImageIcon("src/Academics/All/Bba/bPhoto/b5.jpg");
        Image newImage150 = icon150.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl150 = new JLabel(new ImageIcon(newImage150));
        lbl150.setBounds(320, 250, 150, 180);
        lbl150.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl150);
        JLabel lbl151 = new JLabel("Zarin Tasnim Ahmed Mahi", SwingConstants.CENTER);
        lbl151.setBounds(300, 430, 200, 20);
        lbl151.setFont(new Font("Arial", Font.BOLD, 15));
        lbl151.setForeground(Color.BLACK);
        pnl27.add(lbl151);
        JLabel lbl152 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl152.setBounds(300, 450, 200, 20);
        lbl152.setFont(new Font("Arial", Font.BOLD, 15));
        lbl152.setForeground(Color.BLACK);
        pnl27.add(lbl152);
        ImageIcon icon153 = new ImageIcon("src/Academics/All/Bba/bPhoto/b6.jpg");
        Image newImage153 = icon153.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl153 = new JLabel(new ImageIcon(newImage153));
        lbl153.setBounds(570, 250, 150, 180);
        lbl153.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl153);
        JLabel lbl154 = new JLabel("Chowdhury Mujaddid Ahmed", SwingConstants.CENTER);
        lbl154.setBounds(530, 430, 220, 20);
        lbl154.setFont(new Font("Arial", Font.BOLD, 15));
        lbl154.setForeground(Color.BLACK);
        pnl27.add(lbl154);
        JLabel lbl155 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl155.setBounds(550, 450, 200, 20);
        lbl155.setFont(new Font("Arial", Font.BOLD, 15));
        lbl155.setForeground(Color.BLACK);
        pnl27.add(lbl155);
        ImageIcon icon156 = new ImageIcon("src/Academics/All/Bba/bPhoto/b7.png");
        Image newImage156 = icon156.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl156 = new JLabel(new ImageIcon(newImage156));
        lbl156.setBounds(820, 250, 150, 180);
        lbl156.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl156);
        JLabel lbl157 = new JLabel("Professor Md. Taher Billal Khalifa Ph D", SwingConstants.CENTER);
        lbl157.setBounds(760, 430, 290, 20);
        lbl157.setFont(new Font("Arial", Font.BOLD, 15));
        lbl157.setForeground(Color.BLACK);
        pnl27.add(lbl157);
        JLabel lbl158 = new JLabel("Professor", SwingConstants.CENTER);
        lbl158.setBounds(800, 450, 200, 20);
        lbl158.setFont(new Font("Arial", Font.BOLD, 15));
        lbl158.setForeground(Color.BLACK);
        pnl27.add(lbl158);
        ImageIcon icon159 = new ImageIcon("src/Academics/All/Bba/bPhoto/b8.png");
        Image newImage159 = icon159.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl159 = new JLabel(new ImageIcon(newImage159));
        lbl159.setBounds(1090, 250, 150, 180);
        lbl159.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl27.add(lbl159);
        JLabel lbl160 = new JLabel("Md. Ziaur Rahman", SwingConstants.CENTER);
        lbl160.setBounds(1070, 430, 200, 20);
        lbl160.setFont(new Font("Arial", Font.BOLD, 15));
        lbl160.setForeground(Color.BLACK);
        pnl27.add(lbl160);
        JLabel lbl161 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl161.setBounds(1060, 450, 230, 20);
        lbl161.setFont(new Font("Arial", Font.BOLD, 15));
        lbl161.setForeground(Color.BLACK);
        pnl27.add(lbl161);




        JPanel pnl28 = new JPanel();
        pnl28.setLayout(null);
        pnl28.setBounds(250, 240, 1270, 50);
        pnl28.setBackground(Color.WHITE);
        pnl28.setVisible(false);
        frame.add(pnl28);
        JLabel lbl162 = new JLabel("Research and Publications");
        lbl162.setBounds(10, 5, 1270, 40);
        lbl162.setFont(new Font("Arial", Font.BOLD, 28));
        lbl162.setForeground(Color.BLACK);
        pnl28.add(lbl162);

        JPanel pnl29 = new JPanel();
        pnl29.setLayout(null);
        pnl29.setBounds(250, 295, 1270, 440);
        pnl29.setBackground(Color.WHITE);
        pnl29.setVisible(false);
        frame.add(pnl29);
        JLabel lbl163 = new JLabel("1. Uddin, M. K., Saima, U., 2015. Causal relationship between lending rate and deposit rate in Bangladesh: an econometric analysis. IOSR Journal of Economics and Finance, 6(6), 41-47.");
        lbl163.setBounds(10, 10, 1270, 20);
        lbl163.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl163);
        JLabel lbl164 = new JLabel("2. Saima, U., Uddin, M. K., 2017. The relationship between budget deficit and public debt in Bangladesh: a VECM approach. IJIR, 3(7), 623-628.");
        lbl164.setBounds(10, 35, 1270, 20);
        lbl164.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl164);
        JLabel lbl165 = new JLabel("3. Rahman, M.Z., 2017. Unique Selling Proposition: Setting Bangladesh’s tourism apart. DU Journal of BAdmission Studies, 38(1).");
        lbl165.setBounds(10, 60, 1270, 20);
        lbl165.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl165);
        JLabel lbl166 = new JLabel("4. Ahmed, S., Rahman, M.Z., Rahman, M.M., 2017. Minimizing Waiting Time in ATM Services using Queuing Model. IJIR, Vol. 3, Issue-6.");
        lbl166.setBounds(10, 85, 1270, 20);
        lbl166.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl166);
        JLabel lbl167 = new JLabel("5. Rahman, M.Z., 2018. Segmenting Supply Chain Process by Adopting Postponement. IJSCM, Vol. 7, No. 2. Scopus indexed.");
        lbl167.setBounds(10, 110, 1270, 20);
        lbl167.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl167);
        JLabel lbl168 = new JLabel("6. Ahmed, S., 2018. Finite Difference Method for Solving ODEs. IJRASET, Volume 6, Issue I, pp. 2545-2549.");
        lbl168.setBounds(10, 135, 1270, 20);
        lbl168.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl168);
        JLabel lbl169 = new JLabel("7. Ahmed, S., Rahman, M.Z., Rahman, M.M., 2017. Minimizing ATM Waiting Time using Queuing Model. IJIR, Vol. 3, Issue-6.");
        lbl169.setBounds(10, 160, 1270, 20);
        lbl169.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl169);
        JLabel lbl170 = new JLabel("8. Ahsan, M.K., 2016. Measuring Financial Performance Based on CAMEL: Islamic Banks in Bangladesh. Asian BAdmission Review, 6(1), 47-56.");
        lbl170.setBounds(10, 185, 1270, 20);
        lbl170.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl170);
        JLabel lbl171 = new JLabel("9. Ahsan, M.K., 2016. Saving Behavior: Evidence from Sylhet City. ABC Journal of Advanced Research, 5(2), 77-90.");
        lbl171.setBounds(10, 210, 1270, 20);
        lbl171.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl171);
        JLabel lbl172 = new JLabel("10. Ahsan, M.K., 2017. University Students’ Satisfaction of Banglalink & Grameen Phone: A Comparative Study. MAYFEB Journal of BAdmission and Management, 2, 35-43.");
        lbl172.setBounds(10, 235, 1270, 20);
        lbl172.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl172);
        JLabel lbl173 = new JLabel("12. Prince, E.R. (2017). Impacts of Temperature on Diarrheal Disease in Bangladesh. IJSSER, Vol.2, No.11, pp.5040-5049. Link: https://ijsser.org/more2017.php?id=322");
        lbl173.setBounds(10, 260, 1270, 20);
        lbl173.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl173);
        JLabel lbl174 = new JLabel("13. Prince, E.R. (2017). Demand for Money in Bangladesh: VEC Approach. Asian J. of Multidisciplinary Studies, Vol.7, No.10. Link: https://www.ajms.co.in/sites/ajms2015/index.php/ajms/article/view/2783");
        lbl174.setBounds(10, 285, 1270, 20);
        lbl174.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl174);
        JLabel lbl175 = new JLabel("14. Faruq, M.O. & Prince, E.R. (2015). Inclusive Growth and Financial Inclusion in Bangladesh. Bangladesh J. of Political Economy. Link: https://beabd.org/site/images/pdf/vol312.pdf");
        lbl175.setBounds(10, 310, 1270, 20);
        lbl175.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl175);
        JLabel lbl176 = new JLabel("15. Uddin, M.J. et al. (2017). SMEs to Hypermarkets: Quality Aspects in Food & Beverage Delivery. IJEM, Vol.11, Special Issue 3, pp.777–793. SCOPUS Q2.");
        lbl176.setBounds(10, 335, 1270, 20);
        lbl176.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl176);
        JLabel lbl177 = new JLabel("16. Uddin, M.J. et al. (2017). Entrepreneurship Mindset for Students. IJMASRI, Vol.1, Issue 1, pp.26-34, Nov-2017.");
        lbl177.setBounds(10, 360, 1270, 20);
        lbl177.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl177);
        JLabel lbl178 = new JLabel("17. Uddin, M.J. et al. (2017). Work-family conflict effect on job satisfaction of bank employees in Bangladesh: Does gender moderate? Independent BAdmission Review, 10(1&2), 55-70.");
        lbl178.setBounds(10, 385, 1270, 20);
        lbl178.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl178);
        JLabel lbl179 = new JLabel("18. Uddin, M.J. et al. (2017). Literature review on organizational culture and corporate performance. J. of Advanced Research in Social & Behavioural Sciences, 7(1), 83-95.");
        lbl179.setBounds(10, 410, 1270, 20);
        lbl179.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl179);
        JLabel lbl180 = new JLabel("19. Uddin, M.J. et al. (2017). Mediation role of job satisfaction on HRM-Operational performance: Three-way moderation by gender. J. of Developing Areas, 51(3), 437-452. SCOPUS Q2.");
        lbl180.setBounds(10, 435, 1270, 20);
        lbl180.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl29.add(lbl180);



        JPanel pnl30 = new JPanel();
        pnl30.setLayout(null);
        pnl30.setBounds(250, 240, 1270, 50);
        pnl30.setBackground(Color.WHITE);
        pnl30.setVisible(false);
        JLabel lbl181 = new JLabel("Computer Science & Engineering");
        lbl181.setBounds(10, 5, 1270, 40);
        lbl181.setFont(new Font("Arial", Font.BOLD, 28));
        lbl181.setForeground(Color.BLACK);
        pnl30.add(lbl181);
        frame.add(pnl30);

        JPanel pnl31 = new JPanel();
        pnl31.setLayout(null);
        pnl31.setBounds(250, 295, 1270, 60);
        pnl31.setBackground(Color.WHITE);
        pnl31.setVisible(false);
        JLabel lbl182 = new JLabel("The Department of CSE offers students a dynamic, challenging and innovative environment, preparing them for careers in computing, software engineering, and emerging technologies.");
        lbl182.setBounds(20, 5, 1250, 25);
        lbl182.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl31.add(lbl182);
        JLabel lbl183 = new JLabel("Students gain both theoretical and practical knowledge, balancing strong fundamentals with hands-on experience.");
        lbl183.setBounds(20, 30, 1250, 25);
        lbl183.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl31.add(lbl183);
        frame.add(pnl31);

        JPanel pnl32 = new JPanel();
        pnl32.setLayout(null);
        pnl32.setBounds(250, 360, 1270, 165);
        pnl32.setBackground(Color.WHITE);
        pnl32.setVisible(false);
        JLabel lbl184 = new JLabel("The curriculum is designed to provide students with a solid foundation in computer science principles and practical skills in programming, algorithms, and system design.");
        lbl184.setBounds(20, 5, 1250, 25);
        lbl184.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl32.add(lbl184);
        JLabel lbl185 = new JLabel("Courses are constantly updated to incorporate modern technologies such as artificial intelligence, data science, cybersecurity, and cloud computing,");
        lbl185.setBounds(20, 30, 1250, 25);
        lbl185.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl32.add(lbl185);
        JLabel lbl186 = new JLabel("ensuring graduates are prepared for both research and industry challenges.");
        lbl186.setBounds(20, 55, 1250, 25);
        lbl186.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl32.add(lbl186);
        JLabel lbl187 = new JLabel("The department emphasizes project-based learning, collaboration, and problem-solving skills to equip students for real-world computing challenges.");
        lbl187.setBounds(20, 80, 1250, 25);
        lbl187.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl32.add(lbl187);
        JLabel lbl188 = new JLabel("Students also explore emerging topics like IoT, blockchain, and human-computer interaction, preparing them to adapt to future technological advances.");
        lbl188.setBounds(20, 105, 1250, 25);
        lbl188.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl32.add(lbl188);
        JLabel lbl189 = new JLabel("Overall, the CSE department provides a comprehensive, globally competitive education that fosters creativity, innovation, and leadership in technology.");
        lbl189.setBounds(20, 130, 1250, 25);
        lbl189.setFont(new Font("Arial", Font.PLAIN, 16));
        pnl32.add(lbl189);
        frame.add(pnl32);





        ImageIcon icon190 = new ImageIcon("src/Academics/All/Cse/cPhoto/c1.jpg");
        Image image190 = icon190.getImage();
        Image newImage190 = image190.getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JPanel pnl33 = new JPanel();
        pnl33.setLayout(null);
        pnl33.setBounds(200, 230, 1270, 342);
        pnl33.setBackground(Color.WHITE);
        pnl33.setOpaque(false);
        pnl33.setVisible(false);
        JLabel lbl190 = new JLabel(new ImageIcon(newImage190));
        lbl190.setBounds(565, 5, 150, 180);
        lbl190.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl33.add(lbl190);
        JLabel lbl191 = new JLabel("Md. Mahfujul Hasan", SwingConstants.CENTER);
        lbl191.setBounds(10, 195, 1270, 25);
        lbl191.setFont(new Font("Arial", Font.BOLD, 20));
        lbl191.setForeground(Color.BLACK);
        pnl33.add(lbl191);
        JLabel lbl192 = new JLabel("Head, Department of Computer Science & Engineering", SwingConstants.CENTER);
        lbl192.setBounds(10, 220, 1270, 25);
        lbl192.setFont(new Font("Arial", Font.BOLD, 20));
        lbl192.setForeground(Color.BLACK);
        pnl33.add(lbl192);
        JLabel lbl193 = new JLabel("Metropolitan University", SwingConstants.CENTER);
        lbl193.setBounds(10, 245, 1270, 25);
        lbl193.setFont(new Font("Arial", Font.BOLD, 20));
        lbl193.setForeground(Color.BLACK);
        pnl33.add(lbl193);
        JLabel lbl194 = new JLabel("Message", SwingConstants.CENTER);
        lbl194.setBounds(10, 300, 1270, 16);
        lbl194.setFont(new Font("Arial", Font.BOLD, 13));
        lbl194.setForeground(Color.BLACK);
        pnl33.add(lbl194);
        JLabel lbl195 = new JLabel("Content Coming Soon ....", SwingConstants.CENTER);
        lbl195.setBounds(10, 316, 1270, 16);
        lbl195.setFont(new Font("Arial", Font.BOLD, 13));
        lbl195.setForeground(Color.BLACK);
        pnl33.add(lbl195);
        frame.add(pnl33);




        JPanel pnl34 = new JPanel();
        pnl34.setLayout(null);
        pnl34.setBounds(250, 240, 1260, 40);
        pnl34.setOpaque(true);
        pnl34.setBackground(Color.white);
        pnl34.setVisible(false);
        JLabel lbl196 = new JLabel("BSc. in Computer Science & Engineering");
        lbl196.setBounds(10, 5, 1250, 35);
        lbl196.setFont(new Font("Arial", Font.BOLD, 25));
        lbl196.setForeground(Color.BLACK);
        pnl34.add(lbl196);
        frame.add(pnl34);
        JPanel pnl35 = new JPanel();
        pnl35.setLayout(null);
        pnl35.setBounds(250, 285, 1260, 60);
        pnl35.setOpaque(true);
        pnl35.setBackground(Color.white);
        pnl35.setVisible(false);
        JLabel lbl197 = new JLabel("Duration: 4 Years");
        lbl197.setBounds(10, 5, 150, 22);
        lbl197.setFont(new Font("Arial", Font.BOLD, 17));
        lbl197.setForeground(Color.BLACK);
        pnl35.add(lbl197);
        JLabel lbl198 = new JLabel("Schedule: Day/Evening");
        lbl198.setBounds(200, 5, 350, 22);
        lbl198.setFont(new Font("Arial", Font.BOLD, 17));
        lbl198.setForeground(Color.BLACK);
        pnl35.add(lbl198);
        JLabel lbl199 = new JLabel("Total Credits: 150");
        lbl199.setBounds(10, 30, 150, 22);
        lbl199.setFont(new Font("Arial", Font.BOLD, 17));
        lbl199.setForeground(Color.BLACK);
        pnl35.add(lbl199);
        JLabel lbl200 = new JLabel("Entry Time: January/May/September");
        lbl200.setBounds(200, 30, 350, 22);
        lbl200.setFont(new Font("Arial", Font.BOLD, 17));
        lbl200.setForeground(Color.BLACK);
        pnl35.add(lbl200);
        frame.add(pnl35);

        JPanel pnl36 = new JPanel();
        pnl36.setLayout(null);
        pnl36.setBounds(250, 350, 1260, 105);
        pnl36.setOpaque(true);
        pnl36.setBackground(Color.white);
        pnl36.setVisible(false);
        JLabel lbl201 = new JLabel("Programme Summary:");
        lbl201.setBounds(10, 5, 1250, 25);
        lbl201.setFont(new Font("Arial", Font.BOLD, 20));
        lbl201.setForeground(Color.BLACK);
        pnl36.add(lbl201);
        JLabel lbl202 = new JLabel("The B.Sc. in Computer Science and Engineering (CSE) is a 4-year program consisting of 8 semesters, requiring at least 150 credits for graduation. It is designed to provide students with");
        lbl202.setBounds(10, 35, 1250, 20);
        lbl202.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl202.setForeground(Color.BLACK);
        pnl36.add(lbl202);
        JLabel lbl203 = new JLabel("strong theoretical and technical knowledge in computer science. The demand for skilled professionals in Computer Science and Information Technology is rapidly growing in Bangladesh");
        lbl203.setBounds(10, 55, 1250, 20);
        lbl203.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl203.setForeground(Color.BLACK);
        pnl36.add(lbl203);
        JLabel lbl204 = new JLabel("and across the world. As technology continues to evolve, computer scientists will play a vital role in shaping the future and transforming the way we live and work.");
        lbl204.setBounds(10, 75, 1250, 20);
        lbl204.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl204.setForeground(Color.BLACK);
        pnl36.add(lbl204);
        frame.add(pnl36);

        JPanel pnl37 = new JPanel();
        pnl37.setLayout(null);
        pnl37.setBounds(250, 460, 1260, 180);
        pnl37.setOpaque(true);
        pnl37.setBackground(Color.white);
        pnl37.setVisible(false);
        JLabel lbl205 = new JLabel("Fees & Funding:");
        lbl205.setBounds(10, 5, 1250, 25);
        lbl205.setFont(new Font("Arial", Font.BOLD, 20));
        lbl205.setForeground(Color.BLACK);
        pnl37.add(lbl205);
        JLabel lbl206 = new JLabel("Metropolitan University provides financial support to the students and there is a caring tuition fee policy available to give financial aid. The students having Golden  A+ in both SSC & HSC ");
        lbl206.setBounds(10, 35, 1250, 20);
        lbl206.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl206.setForeground(Color.BLACK);
        pnl37.add(lbl206);
        JLabel lbl207 = new JLabel("will be given 50% tuition waiver.");
        lbl207.setBounds(10, 55, 1250, 20);
        lbl207.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl207.setForeground(Color.BLACK);
        pnl37.add(lbl207);
        JLabel lbl208 = new JLabel("Metropolitan University has various scholarship schemes to support the students financially.");
        lbl208.setBounds(10, 75, 1250, 20);
        lbl208.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl208.setForeground(Color.BLACK);
        pnl37.add(lbl208);
        JLabel lbl209 = new JLabel("A student who has secured A+ in all the courses in three consecutive term examinations can apply for Chairman’s Scholarship. Likewise, Vice Chancellor’s Scholarship also exists for ");
        lbl209.setBounds(10, 95, 1250, 20);
        lbl209.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl209.setForeground(Color.BLACK);
        pnl37.add(lbl209);
        JLabel lbl210 = new JLabel("the students of Metropolitan University.");
        lbl210.setBounds(10, 115, 1250, 20);
        lbl210.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl210.setForeground(Color.BLACK);
        pnl37.add(lbl210);
        JLabel lbl211 = new JLabel("Admission Fee (One time): 20,000");
        lbl211.setBounds(10, 135, 320, 17);
        lbl211.setFont(new Font("Arial", Font.BOLD, 14));
        lbl211.setForeground(Color.BLACK);
        pnl37.add(lbl211);
        JLabel lbl212 = new JLabel("Registration Fee (Per term): 10,000");
        lbl212.setBounds(10, 155, 320, 17);
        lbl212.setFont(new Font("Arial", Font.BOLD, 14));
        lbl212.setForeground(Color.BLACK);
        pnl37.add(lbl212);
        JLabel lbl213 = new JLabel("BNCC Fee (One time): 100");
        lbl213.setBounds(320, 135, 320, 17);
        lbl213.setFont(new Font("Arial", Font.BOLD, 14));
        lbl213.setForeground(Color.BLACK);
        pnl37.add(lbl213);
        JLabel lbl214 = new JLabel("Campus Activities Fee (Per Month): 1,500");
        lbl214.setBounds(320, 155, 320, 17);
        lbl214.setFont(new Font("Arial", Font.BOLD, 14));
        lbl214.setForeground(Color.BLACK);
        pnl37.add(lbl214);
        JLabel lbl215 = new JLabel("Monthly Installment of Credit Fees: 6,000");
        lbl215.setBounds(670, 135, 320, 17);
        lbl215.setFont(new Font("Arial", Font.BOLD, 14));
        lbl215.setForeground(Color.BLACK);
        pnl37.add(lbl215);
        frame.add(pnl37);

        JPanel pnl38 = new JPanel();
        pnl38.setLayout(null);
        pnl38.setBounds(250, 645, 1260, 95);
        pnl38.setOpaque(true);
        pnl38.setBackground(Color.white);
        pnl38.setVisible(false);
        JLabel lbl216 = new JLabel("How to apply:");
        lbl216.setBounds(10, 5, 320, 22);
        lbl216.setFont(new Font("Arial", Font.BOLD, 18));
        lbl216.setForeground(Color.BLACK);
        pnl38.add(lbl216);
        JLabel lbl217 = new JLabel("Submit the completed application form to the Admissions Office with the required documents:");
        lbl217.setBounds(10, 27, 1260, 20);
        lbl217.setFont(new Font("Arial", Font.PLAIN, 15));
        lbl217.setForeground(Color.BLACK);
        pnl38.add(lbl217);
        JLabel lbl218 = new JLabel("Photocopies of Birth Certificate/ National ID/ Passport.");
        lbl218.setBounds(10, 50, 420, 17);
        lbl218.setFont(new Font("Arial", Font.BOLD, 14));
        lbl218.setForeground(Color.BLACK);
        pnl38.add(lbl218);
        JLabel lbl219 = new JLabel("Four (04) copies of Passport size colour photographs.");
        lbl219.setBounds(10, 70, 420, 16);
        lbl219.setFont(new Font("Arial", Font.BOLD, 14));
        lbl219.setForeground(Color.BLACK);
        pnl38.add(lbl219);
        JLabel lbl220 = new JLabel("Blood Group.");
        lbl220.setBounds(430, 50, 500, 17);
        lbl220.setFont(new Font("Arial", Font.BOLD, 14));
        lbl220.setForeground(Color.BLACK);
        pnl38.add(lbl220);
        JLabel lbl221 = new JLabel("Original and one set of Photocopy of all Educational Certificates & Mark sheets.");
        lbl221.setBounds(430, 70, 570, 17);
        lbl221.setFont(new Font("Arial", Font.BOLD, 14));
        lbl221.setForeground(Color.BLACK);
        pnl38.add(lbl221);
        frame.add(pnl38);




        JPanel pnl39 = new JPanel();
        pnl39.setLayout(null);
        pnl39.setBounds(50, 230, 1290, 500);
        pnl39.setOpaque(false);
        pnl39.setVisible(false);
        frame.add(pnl39);
        ImageIcon icon222 = new ImageIcon("src/Academics/All/Cse/cPhoto/c1.jpg");
        Image newImage222 = icon222.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl222 = new JLabel(new ImageIcon(newImage222));
        lbl222.setBounds(320, 20, 150, 180);
        lbl222.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl222);
        JLabel lbl223 = new JLabel("Md. Mahfujul Hasan", SwingConstants.CENTER);
        lbl223.setBounds(300, 210, 200, 20);
        lbl223.setFont(new Font("Arial", Font.BOLD, 15));
        lbl223.setForeground(Color.BLACK);
        pnl39.add(lbl223);
        JLabel lbl224 = new JLabel("Associate Professor Head,CSE", SwingConstants.CENTER);
        lbl224.setBounds(300, 230, 200, 20);
        lbl224.setFont(new Font("Arial", Font.BOLD, 15));
        lbl224.setForeground(Color.BLACK);
        pnl39.add(lbl224);
        ImageIcon icon225 = new ImageIcon("src/Academics/All/Cse/cPhoto/c2.png");
        Image newImage225 = icon225.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl225 = new JLabel(new ImageIcon(newImage225));
        lbl225.setBounds(570, 20, 150, 180);
        lbl225.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl225);
        JLabel lbl226 = new JLabel("Md. Mushtaq Shahriyar Rafee", SwingConstants.CENTER);
        lbl226.setBounds(550, 210, 200, 20);
        lbl226.setFont(new Font("Arial", Font.BOLD, 15));
        lbl226.setForeground(Color.BLACK);
        pnl39.add(lbl226);
        JLabel lbl227 = new JLabel("Assistant Professor", SwingConstants.CENTER);
        lbl227.setBounds(550, 230, 200, 20);
        lbl227.setFont(new Font("Arial", Font.BOLD, 15));
        lbl227.setForeground(Color.BLACK);
        pnl39.add(lbl227);
        ImageIcon icon228 = new ImageIcon("src/Academics/All/Cse/cPhoto/c3.jpg");
        Image newImage228 = icon228.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl228 = new JLabel(new ImageIcon(newImage228));
        lbl228.setBounds(820, 20, 150, 180);
        lbl228.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl228);
        JLabel lbl229 = new JLabel("Archi Arani Basak", SwingConstants.CENTER);
        lbl229.setBounds(780, 210, 230, 20);
        lbl229.setFont(new Font("Arial", Font.BOLD, 15));
        lbl229.setForeground(Color.BLACK);
        pnl39.add(lbl229);
        JLabel lbl230 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl230.setBounds(800, 230, 200, 20);
        lbl230.setFont(new Font("Arial", Font.BOLD, 15));
        lbl230.setForeground(Color.BLACK);
        pnl39.add(lbl230);
        ImageIcon icon231 = new ImageIcon("src/Academics/All/Cse/cPhoto/c4.jpg");
        Image newImage231 = icon231.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl231 = new JLabel(new ImageIcon(newImage231));
        lbl231.setBounds(1090, 20, 150, 180);
        lbl231.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl231);
        JLabel lbl232 = new JLabel("Abu Jafar Md Jakaria", SwingConstants.CENTER);
        lbl232.setBounds(1070, 210, 200, 20);
        lbl232.setFont(new Font("Arial", Font.BOLD, 15));
        lbl232.setForeground(Color.BLACK);
        pnl39.add(lbl232);
        JLabel lbl233 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl233.setBounds(1060, 230, 230, 20);
        lbl233.setFont(new Font("Arial", Font.BOLD, 15));
        lbl233.setForeground(Color.BLACK);
        pnl39.add(lbl233);
        ImageIcon icon234 = new ImageIcon("src/Academics/All/Cse/cPhoto/c5.png");
        Image newImage234 = icon234.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl234 = new JLabel(new ImageIcon(newImage234));
        lbl234.setBounds(320, 250, 150, 180);
        lbl234.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl234);
        JLabel lbl235 = new JLabel("Khudeja Khanom Anwara", SwingConstants.CENTER);
        lbl235.setBounds(300, 430, 200, 20);
        lbl235.setFont(new Font("Arial", Font.BOLD, 15));
        lbl235.setForeground(Color.BLACK);
        pnl39.add(lbl235);
        JLabel lbl236 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl236.setBounds(300, 450, 200, 20);
        lbl236.setFont(new Font("Arial", Font.BOLD, 15));
        lbl236.setForeground(Color.BLACK);
        pnl39.add(lbl236);
        ImageIcon icon237 = new ImageIcon("src/Academics/All/Cse/cPhoto/c6.jpg");
        Image newImage237 = icon237.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl237 = new JLabel(new ImageIcon(newImage237));
        lbl237.setBounds(570, 250, 150, 180);
        lbl237.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl237);
        JLabel lbl238 = new JLabel("Ruhul Amin", SwingConstants.CENTER);
        lbl238.setBounds(530, 430, 220, 20);
        lbl238.setFont(new Font("Arial", Font.BOLD, 15));
        lbl238.setForeground(Color.BLACK);
        pnl39.add(lbl238);
        JLabel lbl239 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl239.setBounds(550, 450, 200, 20);
        lbl239.setFont(new Font("Arial", Font.BOLD, 15));
        lbl239.setForeground(Color.BLACK);
        pnl39.add(lbl239);
        ImageIcon icon240 = new ImageIcon("src/Academics/All/Cse/cPhoto/c7.jpg");
        Image newImage240 = icon240.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl240 = new JLabel(new ImageIcon(newImage240));
        lbl240.setBounds(820, 250, 150, 180);
        lbl240.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl240);
        JLabel lbl241 = new JLabel("Nowshin Sharmin", SwingConstants.CENTER);
        lbl241.setBounds(760, 430, 290, 20);
        lbl241.setFont(new Font("Arial", Font.BOLD, 15));
        lbl241.setForeground(Color.BLACK);
        pnl39.add(lbl241);
        JLabel lbl242 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl242.setBounds(800, 450, 200, 20);
        lbl242.setFont(new Font("Arial", Font.BOLD, 15));
        lbl242.setForeground(Color.BLACK);
        pnl39.add(lbl242);
        ImageIcon icon243 = new ImageIcon("src/Academics/All/Cse/cPhoto/c8.jpg");
        Image newImage243 = icon243.getImage().getScaledInstance(150, 180, Image.SCALE_SMOOTH);
        JLabel lbl243 = new JLabel(new ImageIcon(newImage243));
        lbl243.setBounds(1090, 250, 150, 180);
        lbl243.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        pnl39.add(lbl243);
        JLabel lbl244 = new JLabel("Muhammad Muzammil", SwingConstants.CENTER);
        lbl244.setBounds(1070, 430, 200, 20);
        lbl244.setFont(new Font("Arial", Font.BOLD, 15));
        lbl244.setForeground(Color.BLACK);
        pnl39.add(lbl244);
        JLabel lbl245 = new JLabel("Lecturer", SwingConstants.CENTER);
        lbl245.setBounds(1060, 450, 230, 20);
        lbl245.setFont(new Font("Arial", Font.BOLD, 15));
        lbl245.setForeground(Color.BLACK);
        pnl39.add(lbl245);




        JPanel pnl40 = new JPanel();
        pnl40.setLayout(null);
        pnl40.setBounds(250, 240, 1270, 50);
        pnl40.setBackground(Color.WHITE);
        pnl40.setVisible(false);
        frame.add(pnl40);
        JLabel lbl246 = new JLabel("Research and Publications");
        lbl246.setBounds(10, 5, 1270, 40);
        lbl246.setFont(new Font("Arial", Font.BOLD, 28));
        lbl246.setForeground(Color.BLACK);
        pnl40.add(lbl246);
        JPanel pnl41 = new JPanel();
        pnl41.setLayout(null);
        pnl41.setBounds(250, 295, 1270, 440);
        pnl41.setBackground(Color.WHITE);
        pnl41.setVisible(false);
        frame.add(pnl41);
        JLabel lbl247 = new JLabel("1. C. M. Mukammel Wahid (2019). Lightning News & LIS Data Correlation. Emerging Technologies in Data Mining & Info Security, Springer.");
        lbl247.setBounds(10, 10, 1270, 20);
        lbl247.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl247);
        JLabel lbl248 = new JLabel("2. Md. Mahfujul Hasan (2014). Effects of Backscattering on OFDM Optical Wireless Communication. IJC, 3(1).");
        lbl248.setBounds(10, 35, 1270, 20);
        lbl248.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl248);
        JLabel lbl249 = new JLabel("3. Sakhawat Hossain Saimon (2025). Sachetan: Crowdsource Personal Safety App. ICE Data Mining & Info Security.");
        lbl249.setBounds(10, 60, 1270, 20);
        lbl249.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl249);
        JLabel lbl250 = new JLabel("4. Md. Mushtaq Shahriyar Rafee (2024). BanSpeech: Bangla Speech Recognition Benchmark. IEEE Access, 12, 34527–34538.");
        lbl250.setBounds(10, 85, 1270, 20);
        lbl250.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl250);
        JLabel lbl251 = new JLabel("5. Bushra Azmat Hussain (2025). DSMEC: Advanced Stacking Ensemble for Cardiovascular Disease Prediction. IEEE Access.");
        lbl251.setBounds(10, 110, 1270, 20);
        lbl251.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl251);
        JLabel lbl252 = new JLabel("6. Salma Akther (2025). The Fifteenth Amendment of Bangladesh Constitution: A Review. Higher Education of Social Science, 28(1).");
        lbl252.setBounds(10, 135, 1270, 20);
        lbl252.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl252);
        JLabel lbl253 = new JLabel("7. Samia Rahman Rima (2024). Hugging Face Models for Machine Learning & NLP in Healthcare. Under Review.");
        lbl253.setBounds(10, 160, 1270, 20);
        lbl253.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl253);
        JLabel lbl254 = new JLabel("8. Shrabanti Chowdhury (2024). Deep Learning & Explainable AI in Healthcare and NLP. Under Review.");
        lbl254.setBounds(10, 185, 1270, 20);
        lbl254.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl254);
        JLabel lbl255 = new JLabel("9. Tajbin Jahan (2025). Bangla Hate Speech Detection using NLP. Under Review.");
        lbl255.setBounds(10, 210, 1270, 20);
        lbl255.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl255);
        JLabel lbl256 = new JLabel("10. Nazrul Islam (2025). Stability Analysis of 2D Viscous Burger’s Equations by Explicit Finite Difference Method.");
        lbl256.setBounds(10, 235, 1270, 20);
        lbl256.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl256);
        JLabel lbl257 = new JLabel("11. Archi Arani Basak (2025). NLP & HCI applications: Dialect Translation & Brain Tumor Detection with Deep Learning.");
        lbl257.setBounds(10, 260, 1270, 20);
        lbl257.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl257);
        JLabel lbl258 = new JLabel("12. Ishrar Nazah Chowdhury (2025). Impact of Conversational Agent on English Speech Development of Preschoolers in Bangladesh.");
        lbl258.setBounds(10, 285, 1270, 20);
        lbl258.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl258);
        JLabel lbl259 = new JLabel("13. Muhammad Muzammil (2025). Quality of Higher Education & Student Satisfaction using SEM & SERVQUAL, SUST, Sylhet.");
        lbl259.setBounds(10, 310, 1270, 20);
        lbl259.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl259);
        JLabel lbl260 = new JLabel("14. Abdullah Al Masud (2025). Nonlinear Equations & Image Processing. Future: CFD & Storm Surge Simulation.");
        lbl260.setBounds(10, 335, 1270, 20);
        lbl260.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl260);
        JLabel lbl261 = new JLabel("15. Nasif Istiak Remon (2024). Banglish-to-Bangla Back Transliteration & NLP. Hate Speech Detection in Sylheti Language.");
        lbl261.setBounds(10, 360, 1270, 20);
        lbl261.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl261);
        JLabel lbl262 = new JLabel("16. Rishad Amin Pulok (2025). DSMEC & Deep Learning for Health, Agriculture, HCI; Bangladeshi Sign Language Recognition.");
        lbl262.setBounds(10, 385, 1270, 20);
        lbl262.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl262);
        JLabel lbl263 = new JLabel("17. Md. Fahmidur Rahman Sakib (2020). Driver Drowsiness Detection & Safety in Autonomous Car, IEEE & Springer Publications.");
        lbl263.setBounds(10, 410, 1270, 20);
        lbl263.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl41.add(lbl263);




        JPanel pnl42 = new JPanel();
        pnl42.setLayout(null);
        pnl42.setBounds(250, 390, 1270, 150);
        pnl42.setBackground(Color.WHITE);
        pnl42.setOpaque(false);
        pnl42.setVisible(false);
        frame.add(pnl42);
        JLabel lbl264 = new JLabel("Uploading soon....Developer is busy now.",SwingConstants.CENTER);
        lbl264.setBounds(-50, 5, 1270, 40);
        lbl264.setFont(new Font("Arial", Font.BOLD, 30));
        lbl264.setForeground(Color.BLACK);
        pnl42.add(lbl264);
        JLabel lbl265 = new JLabel("Label Panel banani amar brain e ar der nah.");
        lbl265.setBounds(560, 60, 500, 25);
        lbl265.setFont(new Font("Arial", Font.PLAIN, 17));
        lbl265.setForeground(Color.BLACK);
        pnl42.add(lbl265);
        JLabel lbl266 = new JLabel("~Saikat Talukder");
        lbl266.setBounds(760, 85, 500, 25);
        lbl266.setFont(new Font("Arial", Font.PLAIN, 17));
        lbl266.setForeground(Color.BLACK);
        pnl42.add(lbl266);




        JButton button1 = new JButton("Messages from Head");
        button1.setFont(new Font("Arial", Font.BOLD, 15));
        button1.setBounds(20, 250, 220, 35);
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        frame.add(button1);

        JButton button2 = new JButton("Admission");
        button2.setFont(new Font("Arial", Font.BOLD, 15));
        button2.setBounds(20, 290, 220, 35);
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        frame.add(button2);

        JButton button3 = new JButton("Faculty");
        button3.setFont(new Font("Arial", Font.BOLD, 15));
        button3.setBounds(20, 330, 220, 35);
        button3.setBackground(Color.WHITE);
        button3.setForeground(Color.BLACK);
        frame.add(button3);

        JButton button4 = new JButton("Research and Publications");
        button4.setFont(new Font("Arial", Font.BOLD, 14));
        button4.setBounds(20, 370, 220, 35);
        button4.setBackground(Color.WHITE);
        button4.setForeground(Color.BLACK);
        frame.add(button4);

        JButton button5 = new JButton("Messages from Head");
        button5.setFont(new Font("Arial", Font.BOLD, 15));
        button5.setBounds(20, 250, 220, 35);
        button5.setBackground(Color.WHITE);
        button5.setForeground(Color.BLACK);
        frame.add(button5);

        JButton button6 = new JButton("Admission");
        button6.setFont(new Font("Arial", Font.BOLD, 15));
        button6.setBounds(20, 290, 220, 35);
        button6.setBackground(Color.WHITE);
        button6.setForeground(Color.BLACK);
        frame.add(button6);

        JButton button7 = new JButton("Faculty");
        button7.setFont(new Font("Arial", Font.BOLD, 15));
        button7.setBounds(20, 330, 220, 35);
        button7.setBackground(Color.WHITE);
        button7.setForeground(Color.BLACK);
        frame.add(button7);

        JButton button8 = new JButton("Research and Publications");
        button8.setFont(new Font("Arial", Font.BOLD, 14));
        button8.setBounds(20, 370, 220, 35);
        button8.setBackground(Color.WHITE);
        button8.setForeground(Color.BLACK);
        frame.add(button8);

        JButton button9 = new JButton("Messages from Head");
        button9.setFont(new Font("Arial", Font.BOLD, 15));
        button9.setBounds(20, 250, 220, 35);
        button9.setBackground(Color.WHITE);
        button9.setForeground(Color.BLACK);
        frame.add(button9);

        JButton button10 = new JButton("Admission");
        button10.setFont(new Font("Arial", Font.BOLD, 15));
        button10.setBounds(20, 290, 220, 35);
        button10.setBackground(Color.WHITE);
        button10.setForeground(Color.BLACK);
        frame.add(button10);

        JButton button11 = new JButton("Faculty");
        button11.setFont(new Font("Arial", Font.BOLD, 15));
        button11.setBounds(20, 330, 220, 35);
        button11.setBackground(Color.WHITE);
        button11.setForeground(Color.BLACK);
        frame.add(button11);

        JButton button12 = new JButton("Research and Publications");
        button12.setFont(new Font("Arial", Font.BOLD, 14));
        button12.setBounds(20, 370, 220, 35);
        button12.setBackground(Color.WHITE);
        button12.setForeground(Color.BLACK);
        frame.add(button12);







        button1.setVisible(false);
        button2.setVisible(false);
        button3.setVisible(false);
        button4.setVisible(false);

        button5.setVisible(false);
        button6.setVisible(false);
        button7.setVisible(false);
        button8.setVisible(false);

        button9.setVisible(false);
        button10.setVisible(false);
        button11.setVisible(false);
        button12.setVisible(false);




        String[] courses = {"Departments", "ENG", "BBA", "CSE", "EEE", "SWE", "ECO", "LLB"};
        JComboBox<String> comboBox = new JComboBox<>(courses);
        comboBox.setBounds(20, 200, 220, 40);
        comboBox.setFont(new Font("Arial", Font.BOLD, 18));
        comboBox.setBackground(Color.WHITE);
        comboBox.setForeground(Color.BLACK);
        frame.add(comboBox);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selected = (String) comboBox.getSelectedItem();

                if (selected.equals("Departments"))
                {
                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);

                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);

                    button9.setVisible(false);
                    button10.setVisible(false);
                    button11.setVisible(false);
                    button12.setVisible(false);


                    comboBox.setSelectedIndex(0);


                    pnl.setVisible(true);
                    pnl1.setVisible(true);
                    pnl2.setVisible(true);
                    pnl3.setVisible(true);
                    pnl4.setVisible(true);


                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);
                    pnl42.setVisible(false);




                }
                else if(selected.equals("ENG")) {

                    pnl4.setVisible(true);
                    pnl5.setVisible(true);
                    pnl6.setVisible(true);

                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);
                    pnl42.setVisible(false);





                    button1.setVisible(true);
                    button2.setVisible(true);
                    button3.setVisible(true);
                    button4.setVisible(true);

                    button1.setEnabled(true);
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                    button4.setEnabled(true);

                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);



                    button1.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button1.setEnabled(false);
                            button2.setEnabled(true);
                            button3.setEnabled(true);
                            button4.setEnabled(true);


                            pnl7.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });
                    button2.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button1.setEnabled(true);
                            button2.setEnabled(false);
                            button3.setEnabled(true);
                            button4.setEnabled(true);


                            pnl8.setVisible(true);
                            pnl9.setVisible(true);
                            pnl10.setVisible(true);
                            pnl11.setVisible(true);
                            pnl12.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);






                        }
                    });
                    button3.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button1.setEnabled(true);
                            button2.setEnabled(true);
                            button3.setEnabled(false);
                            button4.setEnabled(true);


                            pnl13.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });
                    button4.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {


                            button1.setEnabled(true);
                            button2.setEnabled(true);
                            button3.setEnabled(true);
                            button4.setEnabled(false);

                            pnl14.setVisible(true);
                            pnl15.setVisible(true);
                            pnl16.setVisible(true);
                            pnl17.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });

                }

                else if(selected.equals("BBA")) {


                    pnl18.setVisible(true);
                    pnl19.setVisible(true);
                    pnl20.setVisible(true);

                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl4.setVisible(false);
                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);
                    pnl42.setVisible(false);






                    button5.setVisible(true);
                    button6.setVisible(true);
                    button7.setVisible(true);
                    button8.setVisible(true);

                    button5.setEnabled(true);
                    button6.setEnabled(true);
                    button7.setEnabled(true);
                    button8.setEnabled(true);

                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);

                    button5.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button5.setEnabled(false);
                            button6.setEnabled(true);
                            button7.setEnabled(true);
                            button8.setEnabled(true);


                            pnl21.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);




                        }
                    });
                    button6.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button5.setEnabled(true);
                            button6.setEnabled(false);
                            button7.setEnabled(true);
                            button8.setEnabled(true);


                            pnl22.setVisible(true);
                            pnl23.setVisible(true);
                            pnl24.setVisible(true);
                            pnl25.setVisible(true);
                            pnl26.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);






                        }
                    });
                    button7.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button5.setEnabled(true);
                            button6.setEnabled(true);
                            button7.setEnabled(false);
                            button8.setEnabled(true);


                            pnl27.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);






                        }
                    });
                    button8.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {


                            button5.setEnabled(true);
                            button6.setEnabled(true);
                            button7.setEnabled(true);
                            button8.setEnabled(false);

                            pnl28.setVisible(true);
                            pnl29.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });
                }

                else if(selected.equals("CSE")) {

                    pnl30.setVisible(true);
                    pnl31.setVisible(true);
                    pnl32.setVisible(true);

                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl4.setVisible(false);
                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);
                    pnl42.setVisible(false);





                    button9.setVisible(true);
                    button10.setVisible(true);
                    button11.setVisible(true);
                    button12.setVisible(true);

                    button9.setEnabled(true);
                    button10.setEnabled(true);
                    button11.setEnabled(true);
                    button12.setEnabled(true);

                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);
                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);

                    button9.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button9.setEnabled(false);
                            button10.setEnabled(true);
                            button11.setEnabled(true);
                            button12.setEnabled(true);

                            pnl33.setVisible(true);


                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });
                    button10.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button9.setEnabled(true);
                            button10.setEnabled(false);
                            button11.setEnabled(true);
                            button12.setEnabled(true);


                            pnl34.setVisible(true);
                            pnl35.setVisible(true);
                            pnl36.setVisible(true);
                            pnl37.setVisible(true);
                            pnl38.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl39.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });
                    button11.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {

                            button9.setEnabled(true);
                            button10.setEnabled(true);
                            button11.setEnabled(false);
                            button12.setEnabled(true);


                            pnl39.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl40.setVisible(false);
                            pnl41.setVisible(false);
                            pnl42.setVisible(false);





                        }
                    });
                    button12.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {


                            button9.setEnabled(true);
                            button10.setEnabled(true);
                            button11.setEnabled(true);
                            button12.setEnabled(false);

                            pnl40.setVisible(true);
                            pnl41.setVisible(true);

                            pnl.setVisible(false);
                            pnl1.setVisible(false);
                            pnl2.setVisible(false);
                            pnl3.setVisible(false);
                            pnl4.setVisible(false);
                            pnl5.setVisible(false);
                            pnl6.setVisible(false);
                            pnl7.setVisible(false);
                            pnl8.setVisible(false);
                            pnl9.setVisible(false);
                            pnl10.setVisible(false);
                            pnl11.setVisible(false);
                            pnl12.setVisible(false);
                            pnl13.setVisible(false);
                            pnl14.setVisible(false);
                            pnl15.setVisible(false);
                            pnl16.setVisible(false);
                            pnl17.setVisible(false);
                            pnl18.setVisible(false);
                            pnl19.setVisible(false);
                            pnl20.setVisible(false);
                            pnl21.setVisible(false);
                            pnl22.setVisible(false);
                            pnl23.setVisible(false);
                            pnl24.setVisible(false);
                            pnl25.setVisible(false);
                            pnl26.setVisible(false);
                            pnl27.setVisible(false);
                            pnl28.setVisible(false);
                            pnl29.setVisible(false);
                            pnl30.setVisible(false);
                            pnl31.setVisible(false);
                            pnl32.setVisible(false);
                            pnl33.setVisible(false);
                            pnl34.setVisible(false);
                            pnl35.setVisible(false);
                            pnl36.setVisible(false);
                            pnl37.setVisible(false);
                            pnl38.setVisible(false);
                            pnl39.setVisible(false);
                            pnl42.setVisible(false);



                        }
                    });

                }
                else if(selected.equals("EEE")) {


                    pnl42.setVisible(true);

                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl4.setVisible(false);
                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);



                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);
                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);
                    button9.setVisible(false);
                    button10.setVisible(false);
                    button11.setVisible(false);
                    button12.setVisible(false);

                }
                else if(selected.equals("SWE")) {


                    pnl42.setVisible(true);

                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl4.setVisible(false);
                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);



                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);
                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);
                    button9.setVisible(false);
                    button10.setVisible(false);
                    button11.setVisible(false);
                    button12.setVisible(false);

                }
                else if(selected.equals("ECO")) {


                    pnl42.setVisible(true);

                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl4.setVisible(false);
                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);


                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);
                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);
                    button9.setVisible(false);
                    button10.setVisible(false);
                    button11.setVisible(false);
                    button12.setVisible(false);

                }
                else if(selected.equals("LLB")) {


                    pnl42.setVisible(true);


                    pnl.setVisible(false);
                    pnl1.setVisible(false);
                    pnl2.setVisible(false);
                    pnl3.setVisible(false);
                    pnl4.setVisible(false);
                    pnl5.setVisible(false);
                    pnl6.setVisible(false);
                    pnl7.setVisible(false);
                    pnl8.setVisible(false);
                    pnl9.setVisible(false);
                    pnl10.setVisible(false);
                    pnl11.setVisible(false);
                    pnl12.setVisible(false);
                    pnl13.setVisible(false);
                    pnl14.setVisible(false);
                    pnl15.setVisible(false);
                    pnl16.setVisible(false);
                    pnl17.setVisible(false);
                    pnl18.setVisible(false);
                    pnl19.setVisible(false);
                    pnl20.setVisible(false);
                    pnl21.setVisible(false);
                    pnl22.setVisible(false);
                    pnl23.setVisible(false);
                    pnl24.setVisible(false);
                    pnl25.setVisible(false);
                    pnl26.setVisible(false);
                    pnl27.setVisible(false);
                    pnl28.setVisible(false);
                    pnl29.setVisible(false);
                    pnl30.setVisible(false);
                    pnl31.setVisible(false);
                    pnl32.setVisible(false);
                    pnl33.setVisible(false);
                    pnl34.setVisible(false);
                    pnl35.setVisible(false);
                    pnl36.setVisible(false);
                    pnl37.setVisible(false);
                    pnl38.setVisible(false);
                    pnl39.setVisible(false);
                    pnl40.setVisible(false);
                    pnl41.setVisible(false);


                    button1.setVisible(false);
                    button2.setVisible(false);
                    button3.setVisible(false);
                    button4.setVisible(false);
                    button5.setVisible(false);
                    button6.setVisible(false);
                    button7.setVisible(false);
                    button8.setVisible(false);
                    button9.setVisible(false);
                    button10.setVisible(false);
                    button11.setVisible(false);
                    button12.setVisible(false);
                }

            }
        });






        // Academics
        JButton btn3 = new JButton("Academics");
        btn3.setFont(new Font("Arial", Font.BOLD, 23));
        btn3.setBounds(390, 140, 170, 40);
        btn3.setBackground(Color.CYAN);
        btn3.setForeground(Color.GRAY);
        btn3.setOpaque(false);
        btn3.setBorderPainted(false);
        frame.add(btn3);
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setVisible(false);
                button2.setVisible(false);
                button3.setVisible(false);
                button4.setVisible(false);

                button5.setVisible(false);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);

                comboBox.setSelectedIndex(0);


                pnl.setVisible(true);
                pnl1.setVisible(true);
                pnl2.setVisible(true);
                pnl3.setVisible(true);

                pnl4.setVisible(false);
                pnl5.setVisible(false);
                pnl6.setVisible(false);
                pnl7.setVisible(false);
                pnl8.setVisible(false);
                pnl9.setVisible(false);
                pnl10.setVisible(false);
                pnl11.setVisible(false);
                pnl12.setVisible(false);
                pnl13.setVisible(false);
                pnl14.setVisible(false);
                pnl15.setVisible(false);
                pnl16.setVisible(false);
                pnl17.setVisible(false);
                pnl18.setVisible(false);
                pnl19.setVisible(false);
                pnl20.setVisible(false);
                pnl21.setVisible(false);
                pnl22.setVisible(false);
                pnl23.setVisible(false);
                pnl24.setVisible(false);
                pnl25.setVisible(false);
                pnl26.setVisible(false);
                pnl27.setVisible(false);
                pnl28.setVisible(false);
                pnl29.setVisible(false);
                pnl30.setVisible(false);
                pnl31.setVisible(false);
                pnl32.setVisible(false);
                pnl33.setVisible(false);
                pnl34.setVisible(false);
                pnl35.setVisible(false);
                pnl36.setVisible(false);
                pnl37.setVisible(false);
                pnl38.setVisible(false);
                pnl39.setVisible(false);
                pnl40.setVisible(false);
                pnl41.setVisible(false);
                pnl42.setVisible(false);



            }
        });
        // About
        JButton btn1 = new JButton("About");
        btn1.setFont(new Font("Arial", Font.BOLD, 23));
        btn1.setBounds(20, 140, 150, 40);
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
        btn2.setBounds(190, 140, 180, 40);
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

        // Admission
        JButton btn4 = new JButton("Admission");
        btn4.setFont(new Font("Arial", Font.BOLD, 23));
        btn4.setBounds(580, 140, 170, 40);
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
        btn5.setBounds(770, 140, 160, 40);
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
        btn6.setBounds(950, 140, 180, 40);
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
        btn7.setBounds(1150, 140, 170, 40);
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
        btn8.setBounds(1340, 140, 170, 40);
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
        lbl.setBounds(10, 135, 1515, 50);
        lbl.setFont(new Font("Arial", Font.BOLD, 18));
        lbl.setOpaque(true);
        lbl.setBackground(new Color(0, 17, 88));
        lbl.setForeground(Color.WHITE);
        lbl.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));
        frame.add(lbl);


        frame.setVisible(true);

    }
}