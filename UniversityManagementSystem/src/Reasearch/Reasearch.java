package Reasearch;

import About.About;
import Academics.Academics;
import Admission.Admission;
import CampusLife.CampusLife;
import Contact.Contact;
import LogIn.LogIn;
import Programme.Programme;
import SubButtons.SubButtons;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reasearch {
    public Reasearch() {
        JFrame frame = new JFrame("Reasearch");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        SubButtons btn = new SubButtons(frame);

        // About
        JButton btn1 = new JButton("About");
        btn1.setFont(new Font("Arial", Font.BOLD, 23));
        btn1.setBounds(20, 140, 150, 40);
        btn1.setBackground(Color.WHITE);
        btn1.setForeground(Color.white);
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
        btn2.setBackground(Color.white);
        btn2.setForeground(Color.white);
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
        btn3.setBounds(390, 140, 170, 40);
        btn3.setBackground(Color.WHITE);
        btn3.setForeground(Color.white);
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
        btn4.setBounds(580, 140, 170, 40);
        btn4.setBackground(Color.WHITE);
        btn4.setForeground(Color.white);
        btn4.setOpaque(false);
        btn4.setBorderPainted(false);
        frame.add(btn4);
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Admission();
                frame.dispose();
            }
        });

        // Campus Life
        JButton btn6 = new JButton("Campus Life");
        btn6.setFont(new Font("Arial", Font.BOLD, 23));
        btn6.setBounds(950, 140, 180, 40);
        btn6.setBackground(Color.WHITE);
        btn6.setForeground(Color.white);
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
        btn7.setForeground(Color.white);
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
        btn8.setForeground(Color.white);
        btn8.setOpaque(false);
        btn8.setBorderPainted(false);
        frame.add(btn8);
        btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new LogIn();
                frame.dispose();
            }
        });


        JLabel lb = new JLabel("Departments", SwingConstants.CENTER);
        lb.setBounds(20, 200, 180,35);
        lb.setFont(new Font("Arial",Font.BOLD,20));
        lb.setBackground(Color.LIGHT_GRAY);
        lb.setForeground(Color.BLACK);
        lb.setOpaque(false);
        frame.add(lb);


        JButton button1 = new JButton("ENG");
        button1.setFont(new Font("Arial", Font.BOLD, 16));
        button1.setBounds(20, 240, 180, 35);
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setOpaque(false);
        frame.add(button1);

        JButton button2 = new JButton("BBA");
        button2.setFont(new Font("Arial", Font.BOLD, 16));
        button2.setBounds(20, 280, 180, 35);
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        button2.setOpaque(false);
        frame.add(button2);

        JButton button3 = new JButton("CSE");
        button3.setFont(new Font("Arial", Font.BOLD, 16));
        button3.setBounds(20, 320, 180, 35);
        button3.setBackground(Color.WHITE);
        button3.setForeground(Color.BLACK);
        button3.setOpaque(false);
        frame.add(button3);



        JPanel pnl = new JPanel();
        pnl.setLayout(null);
        pnl.setBounds(250, 240, 1270, 50);
        pnl.setBackground(Color.WHITE);
        pnl.setVisible(false);
        JLabel lbl1 = new JLabel("Research and Publications");
        lbl1.setBounds(10, 5, 1270, 40);
        lbl1.setFont(new Font("Arial", Font.BOLD, 28));
        lbl1.setForeground(Color.BLACK);
        pnl.add(lbl1);
        frame.add(pnl);

        JPanel pnl1 = new JPanel();
        pnl1.setLayout(null);
        pnl1.setBounds(250, 295, 1270, 120);
        pnl1.setBackground(Color.WHITE);
        pnl1.setVisible(false);
        JLabel lbl2 = new JLabel("Anik Biswas, Assistant Professor & Head");
        lbl2.setBounds(10, 10, 1270, 25);
        lbl2.setFont(new Font("Arial", Font.BOLD, 18));
        lbl2.setForeground(Color.BLACK);
        pnl1.add(lbl2);
        JLabel lbl3 = new JLabel("1. “Satyajit Ray’s Ganashatru: An Intersemiotic Translation of Henrik Ibsen’s An Enemy of the People” was published in vol. 7 of Crossings: ULAB Journal of EAdmission Studies");
        lbl3.setBounds(10, 40, 1270, 20);
        lbl3.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl1.add(lbl3);
        JLabel lbl4 = new JLabel("2. “Voice of God and the Spirit of One’s Own in Chetan Bhagat’s One Night at the Call Center” was published in Metropolitan University Journal of EAdmission(ISSN:2414-729X; Vol:1,2015");
        lbl4.setBounds(10, 65, 1270, 20);
        lbl4.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl1.add(lbl4);
        JLabel lbl5 = new JLabel("3. “Optimism in Nothingness: A Look on Some Major Characters of Humayun Ahmed’’ was published in the Morning Sun, the weekend magazine from The Daily Sun on 5th July 2013");
        lbl5.setBounds(10, 90, 1270, 20);
        lbl5.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl1.add(lbl5);
        frame.add(pnl1);

        JPanel pnl2 = new JPanel();
        pnl2.setLayout(null);
        pnl2.setBounds(250, 420, 1270, 160);
        pnl2.setBackground(Color.WHITE);
        pnl2.setVisible(false);
        JLabel lbl6 = new JLabel("Snigdha Das, Assistant Professor");
        lbl6.setBounds(10, 10, 1270, 25);
        lbl6.setFont(new Font("Arial", Font.BOLD, 18));
        lbl6.setForeground(Color.BLACK);
        pnl2.add(lbl6);
        JLabel lbl7 = new JLabel("1. “Disintegration of American Dream: A study on Arthur Miller’s Death of a Salesman and Saul Bellow’s Seize the Day”. (Published in International Journal of Humanities and Social ");
        lbl7.setBounds(10, 40, 1270, 20);
        lbl7.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl2.add(lbl7);
        JLabel lbl8 = new JLabel("      Science Invention, an International Peer Reviewed Research Organization).");
        lbl8.setBounds(10, 60, 1270, 20);
        lbl8.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl2.add(lbl8);
        JLabel lbl9 = new JLabel("2. “The Evil Bond in William Shakespeare’s The Merchant of Venice: The Source of Irrationality” along with Md. Ziaul Haque, Senior Lecturer, Department of EAdmission, Sylhet");
        lbl9.setBounds(10, 85, 1270, 20);
        lbl9.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl2.add(lbl9);
        JLabel lbl10 = new JLabel("      International University (Published in International Journal on Studies in EAdmission Language and Literature, an international Peer Reviewed Research Organization).");
        lbl10.setBounds(10, 105, 1270, 20);
        lbl10.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl2.add(lbl10);
        JLabel lbl11 = new JLabel("3. “Delusion of Success Myth and Its Demonic Essence in Miller’s Death of a Salesman”. (Published in Metropolitan University Journal of EAdmission (ISSN:2414-729X; Vol:1,No:1,2015).");
        lbl11.setBounds(10, 130, 1270, 20);
        lbl11.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl2.add(lbl11);
        frame.add(pnl2);

        JPanel pnl3 = new JPanel();
        pnl3.setLayout(null);
        pnl3.setBounds(250, 585, 1270, 100);
        pnl3.setBackground(Color.WHITE);
        pnl3.setVisible(false);
        JLabel lbl12 = new JLabel("Sanjida Chowdhury, Senior Lecturer");
        lbl12.setBounds(10, 10, 1270, 25);
        lbl12.setFont(new Font("Arial", Font.BOLD, 18));
        lbl12.setForeground(Color.BLACK);
        pnl3.add(lbl12);
        JLabel lbl13 = new JLabel("1. “Inheritance of Loss: An Exposition of Entrapped Identities” was published in Metropolitan University Journal of EAdmission (ISSN: 2414-729X; Vol:1, No:1, 2015)");
        lbl13.setBounds(10, 40, 1270, 20);
        lbl13.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl3.add(lbl13);
        JLabel lbl14 = new JLabel("2. “Subaltern of the Subalterns: Caste in Mulk Raj Anand’s Untouchable” was published in vol. 8 of Crossings: ULAB Journal of EAdmission Studies");
        lbl14.setBounds(10, 65, 1270, 20);
        lbl14.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl3.add(lbl14);
        frame.add(pnl3);




        JPanel pnl4 = new JPanel();
        pnl4.setLayout(null);
        pnl4.setBounds(250, 240, 1270, 50);
        pnl4.setBackground(Color.WHITE);
        pnl4.setVisible(false);
        frame.add(pnl4);
        JLabel lbl15 = new JLabel("Research and Publications");
        lbl15.setBounds(10, 5, 1270, 40);
        lbl15.setFont(new Font("Arial", Font.BOLD, 28));
        lbl15.setForeground(Color.BLACK);
        pnl4.add(lbl15);
        frame.add(pnl4);

        JPanel pnl5 = new JPanel();
        pnl5.setLayout(null);
        pnl5.setBounds(250, 295, 1270, 440);
        pnl5.setBackground(Color.WHITE);
        pnl5.setVisible(false);
        JLabel lbl16 = new JLabel("1. Uddin, M. K., Saima, U., 2015. Causal relationship between lending rate and deposit rate in Bangladesh: an econometric analysis. IOSR Journal of Economics and Finance, 6(6), 41-47.");
        lbl16.setBounds(10, 10, 1270, 20);
        lbl16.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl16);
        JLabel lbl17 = new JLabel("2. Saima, U., Uddin, M. K., 2017. The relationship between budget deficit and public debt in Bangladesh: a VECM approach. IJIR, 3(7), 623-628.");
        lbl17.setBounds(10, 35, 1270, 20);
        lbl17.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl17);
        JLabel lbl18 = new JLabel("3. Rahman, M.Z., 2017. Unique Selling Proposition: Setting Bangladesh’s tourism apart. DU Journal of BAdmission Studies, 38(1).");
        lbl18.setBounds(10, 60, 1270, 20);
        lbl18.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl18);
        JLabel lbl19 = new JLabel("4. Ahmed, S., Rahman, M.Z., Rahman, M.M., 2017. Minimizing Waiting Time in ATM Services using Queuing Model. IJIR, Vol. 3, Issue-6.");
        lbl19.setBounds(10, 85, 1270, 20);
        lbl19.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl19);
        JLabel lbl20 = new JLabel("5. Rahman, M.Z., 2018. Segmenting Supply Chain Process by Adopting Postponement. IJSCM, Vol. 7, No. 2. Scopus indexed.");
        lbl20.setBounds(10, 110, 1270, 20);
        lbl20.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl20);
        JLabel lbl21 = new JLabel("6. Ahmed, S., 2018. Finite Difference Method for Solving ODEs. IJRASET, Volume 6, Issue I, pp. 2545-2549.");
        lbl21.setBounds(10, 135, 1270, 20);
        lbl21.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl21);
        JLabel lbl22 = new JLabel("7. Ahmed, S., Rahman, M.Z., Rahman, M.M., 2017. Minimizing ATM Waiting Time using Queuing Model. IJIR, Vol. 3, Issue-6.");
        lbl22.setBounds(10, 160, 1270, 20);
        lbl22.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl22);
        JLabel lbl23 = new JLabel("8. Ahsan, M.K., 2016. Measuring Financial Performance Based on CAMEL: Islamic Banks in Bangladesh. Asian BAdmission Review, 6(1), 47-56.");
        lbl23.setBounds(10, 185, 1270, 20);
        lbl23.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl23);
        JLabel lbl24 = new JLabel("9. Ahsan, M.K., 2016. Saving Behavior: Evidence from Sylhet City. ABC Journal of Advanced Research, 5(2), 77-90.");
        lbl24.setBounds(10, 210, 1270, 20);
        lbl24.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl24);
        JLabel lbl25 = new JLabel("10. Ahsan, M.K., 2017. University Students’ Satisfaction of Banglalink & Grameen Phone: A Comparative Study. MAYFEB Journal of BAdmission and Management, 2, 35-43.");
        lbl25.setBounds(10, 235, 1270, 20);
        lbl25.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl25);
        JLabel lbl26 = new JLabel("12. Prince, E.R. (2017). Impacts of Temperature on Diarrheal Disease in Bangladesh. IJSSER, Vol.2, No.11, pp.5040-5049. Link: https://ijsser.org/more2017.php?id=322");
        lbl26.setBounds(10, 260, 1270, 20);
        lbl26.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl26);
        JLabel lbl27 = new JLabel("13. Prince, E.R. (2017). Demand for Money in Bangladesh: VEC Approach. Asian J. of Multidisciplinary Studies, Vol.7, No.10. Link: https://www.ajms.co.in/sites/ajms2015/index.php/ajms/article/view/2783");
        lbl27.setBounds(10, 285, 1270, 20);
        lbl27.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl27);
        JLabel lbl28 = new JLabel("14. Faruq, M.O. & Prince, E.R. (2015). Inclusive Growth and Financial Inclusion in Bangladesh. Bangladesh J. of Political Economy. Link: https://beabd.org/site/images/pdf/vol312.pdf");
        lbl28.setBounds(10, 310, 1270, 20);
        lbl28.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl28);
        JLabel lbl29 = new JLabel("15. Uddin, M.J. et al. (2017). SMEs to Hypermarkets: Quality Aspects in Food & Beverage Delivery. IJEM, Vol.11, Special Issue 3, pp.777–793. SCOPUS Q2.");
        lbl29.setBounds(10, 335, 1270, 20);
        lbl29.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl29);
        JLabel lbl30 = new JLabel("16. Uddin, M.J. et al. (2017). Entrepreneurship Mindset for Students. IJMASRI, Vol.1, Issue 1, pp.26-34, Nov-2017.");
        lbl30.setBounds(10, 360, 1270, 20);
        lbl30.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl30);
        JLabel lbl31 = new JLabel("17. Uddin, M.J. et al. (2017). Work-family conflict effect on job satisfaction of bank employees in Bangladesh: Does gender moderate? Independent BAdmission Review, 10(1&2), 55-70.");
        lbl31.setBounds(10, 385, 1270, 20);
        lbl31.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl31);
        JLabel lbl32 = new JLabel("18. Uddin, M.J. et al. (2017). Literature review on organizational culture and corporate performance. J. of Advanced Research in Social & Behavioural Sciences, 7(1), 83-95.");
        lbl32.setBounds(10, 410, 1270, 20);
        lbl32.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl32);
        JLabel lbl33 = new JLabel("19. Uddin, M.J. et al. (2017). Mediation role of job satisfaction on HRM-Operational performance: Three-way moderation by gender. J. of Developing Areas, 51(3), 437-452. SCOPUS Q2.");
        lbl33.setBounds(10, 435, 1270, 20);
        lbl33.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl5.add(lbl33);
        frame.add(pnl5);



        JPanel pnl6 = new JPanel();
        pnl6.setLayout(null);
        pnl6.setBounds(250, 240, 1270, 50);
        pnl6.setBackground(Color.WHITE);
        pnl6.setVisible(false);
        frame.add(pnl6);
        JLabel lbl34 = new JLabel("Research and Publications");
        lbl34.setBounds(10, 5, 1270, 40);
        lbl34.setFont(new Font("Arial", Font.BOLD, 28));
        lbl34.setForeground(Color.BLACK);
        pnl6.add(lbl34);

        JPanel pnl7 = new JPanel();
        pnl7.setLayout(null);
        pnl7.setBounds(250, 295, 1270, 440);
        pnl7.setBackground(Color.WHITE);
        pnl7.setVisible(false);
        JLabel lbl35 = new JLabel("1. C. M. Mukammel Wahid (2019). Lightning News & LIS Data Correlation. Emerging Technologies in Data Mining & Info Security, Springer.");
        lbl35.setBounds(10, 10, 1270, 20);
        lbl35.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl35);
        JLabel lbl36 = new JLabel("2. Md. Mahfujul Hasan (2014). Effects of Backscattering on OFDM Optical Wireless Communication. IJC, 3(1).");
        lbl36.setBounds(10, 35, 1270, 20);
        lbl36.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl36);
        JLabel lbl37 = new JLabel("3. Sakhawat Hossain Saimon (2025). Sachetan: Crowdsource Personal Safety App. ICE Data Mining & Info Security.");
        lbl37.setBounds(10, 60, 1270, 20);
        lbl37.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl37);
        JLabel lbl38 = new JLabel("4. Md. Mushtaq Shahriyar Rafee (2024). BanSpeech: Bangla Speech Recognition Benchmark. IEEE Access, 12, 34527–34538.");
        lbl38.setBounds(10, 85, 1270, 20);
        lbl38.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl38);
        JLabel lbl39 = new JLabel("5. Bushra Azmat Hussain (2025). DSMEC: Advanced Stacking Ensemble for Cardiovascular Disease Prediction. IEEE Access.");
        lbl39.setBounds(10, 110, 1270, 20);
        lbl39.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl39);
        JLabel lbl40 = new JLabel("6. Salma Akther (2025). The Fifteenth Amendment of Bangladesh Constitution: A Review. Higher Education of Social Science, 28(1).");
        lbl40.setBounds(10, 135, 1270, 20);
        lbl40.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl40);
        JLabel lbl41 = new JLabel("7. Samia Rahman Rima (2024). Hugging Face Models for Machine Learning & NLP in Healthcare. Under Review.");
        lbl41.setBounds(10, 160, 1270, 20);
        lbl41.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl41);
        JLabel lbl42 = new JLabel("8. Shrabanti Chowdhury (2024). Deep Learning & Explainable AI in Healthcare and NLP. Under Review.");
        lbl42.setBounds(10, 185, 1270, 20);
        lbl42.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl42);
        JLabel lbl43 = new JLabel("9. Tajbin Jahan (2025). Bangla Hate Speech Detection using NLP. Under Review.");
        lbl43.setBounds(10, 210, 1270, 20);
        lbl43.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl43);
        JLabel lbl44 = new JLabel("10. Nazrul Islam (2025). Stability Analysis of 2D Viscous Burger’s Equations by Explicit Finite Difference Method.");
        lbl44.setBounds(10, 235, 1270, 20);
        lbl44.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl44);
        JLabel lbl45 = new JLabel("11. Archi Arani Basak (2025). NLP & HCI applications: Dialect Translation & Brain Tumor Detection with Deep Learning.");
        lbl45.setBounds(10, 260, 1270, 20);
        lbl45.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl45);
        JLabel lbl46 = new JLabel("12. Ishrar Nazah Chowdhury (2025). Impact of Conversational Agent on English Speech Development of Preschoolers in Bangladesh.");
        lbl46.setBounds(10, 285, 1270, 20);
        lbl46.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl46);
        JLabel lbl47 = new JLabel("13. Muhammad Muzammil (2025). Quality of Higher Education & Student Satisfaction using SEM & SERVQUAL, SUST, Sylhet.");
        lbl47.setBounds(10, 310, 1270, 20);
        lbl47.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl47);
        JLabel lbl48 = new JLabel("14. Abdullah Al Masud (2025). Nonlinear Equations & Image Processing. Future: CFD & Storm Surge Simulation.");
        lbl48.setBounds(10, 335, 1270, 20);
        lbl48.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl48);
        JLabel lbl49 = new JLabel("15. Nasif Istiak Remon (2024). Banglish-to-Bangla Back Transliteration & NLP. Hate Speech Detection in Sylheti Language.");
        lbl49.setBounds(10, 360, 1270, 20);
        lbl49.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl49);
        JLabel lbl50 = new JLabel("16. Rishad Amin Pulok (2025). DSMEC & Deep Learning for Health, Agriculture, HCI; Bangladeshi Sign Language Recognition.");
        lbl50.setBounds(10, 385, 1270, 20);
        lbl50.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl50);
        JLabel lbl51 = new JLabel("17. Md. Fahmidur Rahman Sakib (2020). Driver Drowsiness Detection & Safety in Autonomous Car, IEEE & Springer Publications.");
        lbl51.setBounds(10, 410, 1270, 20);
        lbl51.setFont(new Font("Arial", Font.PLAIN, 15));
        pnl7.add(lbl51);
        frame.add(pnl7);



        ImageIcon icon2 = new ImageIcon("image/one.jpg");
        Image image2 = icon2.getImage();
        Image newImage2 = image2.getScaledInstance(1291, 540, Image.SCALE_SMOOTH);
        JPanel pnl8 = new JPanel();
        pnl8.setLayout(null);
        pnl8.setBounds(220, 200, 1291, 540);
        pnl8.setVisible(true);
        JLabel lbl52 = new JLabel(new ImageIcon(newImage2));
        lbl52.setBounds(0, 0, 1291, 540);
        pnl8.add(lbl52);
        frame.add(pnl8);



        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(false);
                button2.setEnabled(true);
                button3.setEnabled(true);

                pnl.setVisible(true);
                pnl1.setVisible(true);
                pnl2.setVisible(true);
                pnl3.setVisible(true);

                pnl4.setVisible(false);
                pnl5.setVisible(false);
                pnl6.setVisible(false);
                pnl7.setVisible(false);
                pnl8.setVisible(false);

            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(false);
                button3.setEnabled(true);


                pnl4.setVisible(true);
                pnl5.setVisible(true);

                pnl8.setVisible(false);
                pnl1.setVisible(false);
                pnl2.setVisible(false);
                pnl3.setVisible(false);
                pnl6.setVisible(false);
                pnl7.setVisible(false);
                pnl8.setVisible(false);

            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(false);


                pnl6.setVisible(true);
                pnl7.setVisible(true);

                pnl8.setVisible(false);
                pnl1.setVisible(false);
                pnl2.setVisible(false);
                pnl3.setVisible(false);
                pnl4.setVisible(false);
                pnl5.setVisible(false);
                pnl8.setVisible(false);

            }
        });

        // Research
        JButton btn5 = new JButton("Research");
        btn5.setFont(new Font("Arial", Font.BOLD, 23));
        btn5.setBounds(770, 140, 160, 40);
        btn5.setBackground(new Color(201,255,229));
        btn5.setBackground(Color.LIGHT_GRAY);
        btn5.setForeground(Color.GRAY);
        btn5.setOpaque(false);
        btn5.setBorderPainted(false);
        frame.add(btn5);
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);

                pnl8.setVisible(true);

                pnl.setVisible(false);
                pnl1.setVisible(false);
                pnl2.setVisible(false);
                pnl3.setVisible(false);
                pnl4.setVisible(false);
                pnl5.setVisible(false);
                pnl6.setVisible(false);
                pnl7.setVisible(false);

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
