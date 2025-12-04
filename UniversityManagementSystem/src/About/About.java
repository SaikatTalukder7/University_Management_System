package About;

import Academics.Academics;
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

public class About {
    public About() {
        JFrame frame = new JFrame("About MU");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);

        SubButtons btn = new SubButtons(frame);


        JLabel lbl1 = new JLabel("Navigation Menu", SwingConstants.CENTER);
        lbl1.setBounds(20, 200, 180,35);
        lbl1.setFont(new Font("Arial",Font.BOLD,20));
        lbl1.setBackground(Color.LIGHT_GRAY);
        lbl1.setForeground(Color.BLACK);
        lbl1.setOpaque(false);
        frame.add(lbl1);

        JButton button1 = new JButton("BRIEF HISTORY");
        button1.setFont(new Font("Arial", Font.BOLD, 16));
        button1.setBounds(20, 240, 180, 35);
        button1.setBackground(Color.WHITE);
        button1.setForeground(Color.BLACK);
        button1.setOpaque(false);
        frame.add(button1);

        JButton button2 = new JButton("HISTORY");
        button2.setFont(new Font("Arial", Font.BOLD, 16));
        button2.setBounds(20, 280, 180, 35);
        button2.setBackground(Color.WHITE);
        button2.setForeground(Color.BLACK);
        button2.setOpaque(false);
        frame.add(button2);

        JButton button3 = new JButton("Vision and Mission");
        button3.setFont(new Font("Arial", Font.BOLD, 16));
        button3.setBounds(20, 320, 180, 35);
        button3.setBackground(Color.WHITE);
        button3.setForeground(Color.BLACK);
        button3.setOpaque(false);
        frame.add(button3);

        JButton button4 = new JButton("Our Core Values");
        button4.setFont(new Font("Arial", Font.BOLD, 16));
        button4.setBounds(20, 360, 180, 35);
        button4.setBackground(Color.WHITE);
        button4.setForeground(Color.BLACK);
        button4.setOpaque(false);
        frame.add(button4);



        //Berif History
        JPanel pnl = new JPanel();
        pnl.setBounds(250, 240, 1260, 40);
        pnl.setLayout(null);
        JLabel el1 = new JLabel("Brief History");
        el1.setBounds(10, 5, 400, 35);
        el1.setFont(new Font("Arial", Font.BOLD, 25));
        el1.setForeground(Color.BLACK);
        pnl.add(el1);
        pnl.setVisible(false);
        frame.add(pnl);
        JPanel pnl1 = new JPanel();
        pnl1.setBounds(250, 285, 1260, 110);
        pnl1.setLayout(null);
        JLabel el2 = new JLabel("Commencement of the WTO regime along with the incredible advancements of information & communication technology (ICT) and the Internet had brought forth diversified opportunities");
        el2.setBounds(10, 10, 1250, 20);
        el2.setFont(new Font("Arial", Font.PLAIN, 15));
        el2.setForeground(Color.BLACK);
        pnl1.add(el2);
        JLabel el3 = new JLabel("and challenges especially for the developing countries of the world. In a response to the changing landscape of knowledge and education, the then government of Bangladesh, during the");
        el3.setBounds(10, 30, 1250, 20);
        el3.setFont(new Font("Arial", Font.PLAIN, 15));
        el3.setForeground(Color.BLACK);
        pnl1.add(el3);
        JLabel el4 = new JLabel("1990s, had revised its education policy to privatise tertiary education in order to make-up the supply deficit of skilled manpower in the country. And the concomitant shift in government’s");
        el4.setBounds(10, 50, 1250, 20);
        el4.setFont(new Font("Arial", Font.PLAIN, 15));
        el4.setForeground(Color.BLACK);
        pnl1.add(el4);
        JLabel el5 = new JLabel("education policy, which came into effect with the enactment of the Private University Act (PUA)-1992 (later repealed by the PUA-2010), had resulted in mushrooming of private universities");
        el5.setBounds(10, 70, 1250, 20);
        el5.setFont(new Font("Arial", Font.PLAIN, 15));
        el5.setForeground(Color.BLACK);
        pnl1.add(el5);
        JLabel el6 = new JLabel("in the positioned in the capital Dhaka.");
        el6.setBounds(10, 90, 1250, 20);
        el6.setFont(new Font("Arial", Font.PLAIN, 15));
        el6.setForeground(Color.BLACK);
        pnl1.add(el6);
        pnl1.setVisible(false);
        frame.add(pnl1);
        JPanel pnl2 = new JPanel();
        pnl2.setBounds(250, 400, 1260, 100);
        pnl2.setLayout(null);
        JLabel el7 = new JLabel("During that period, there was only one state-funded university for the vast population of Sylhet—the north-eastern administrative division of the country. Due to its limited capacity that lone");
        el7.setBounds(10, 10, 1250, 20);
        el7.setFont(new Font("Arial", Font.PLAIN, 15));
        el7.setForeground(Color.BLACK);
        pnl2.add(el7);
        JLabel el8 = new JLabel("university could not accommodate all the aspirant students into its undergraduate and Master’s programmes as a result of which students from the economically solvent families had");
        el8.setBounds(10, 30, 1250, 20);
        el8.setFont(new Font("Arial", Font.PLAIN, 15));
        el8.setForeground(Color.BLACK);
        pnl2.add(el8);
        JLabel el9 = new JLabel("either been going abroad  or to the private universities in Dhaka to pursue tertiary education. But the high costs of overseas educationand the exorbitant fee structures of the then Dhaka-");
        el9.setBounds(10, 50, 1250, 20);
        el9.setFont(new Font("Arial", Font.PLAIN, 15));
        el9.setForeground(Color.BLACK);
        pnl2.add(el9);
        JLabel el10 = new JLabel("based private universities had left majority of the tudents of Sylhet region outside the purview of the then-existing tertiary education system.");
        el10.setBounds(10, 70, 1250, 20);
        el10.setFont(new Font("Arial", Font.PLAIN, 15));
        el10.setForeground(Color.BLACK);
        pnl2.add(el10);
        pnl2.setVisible(false);
        frame.add(pnl2);
        JPanel pnl3 = new JPanel();
        pnl3.setBounds(250, 505, 1260, 120);
        pnl3.setLayout(null);
        JLabel el11 = new JLabel("In such a backdrop, Dr. Toufique Rahman Chowdhury , a renowned banker and an entrepreneur, in conjunction with a number of renowned educationists from both home and abroad, had");
        el11.setBounds(10, 10, 1250, 20);
        el11.setFont(new Font("Arial", Font.PLAIN,15));
        el11.setForeground(Color.BLACK);
        pnl3.add(el11);
        JLabel el12 = new JLabel("initiated the establishment of Metropolitan University with a vision to offer quality tertiary education at an affordable cost. The university had started its journey on 3rd May 2003 with only");
        el12.setBounds(10, 30, 1250, 20);
        el12.setFont(new Font("Arial", Font.PLAIN,15));
        el12.setForeground(Color.BLACK);
        pnl3.add(el12);
        JLabel el13 = new JLabel("seventeen students enrolled in two departments, BAdmission Administration and Computer Science & Engineering; the former offering undergraduate (BBA) and Master’s (MBA) degrees");
        el13.setBounds(10, 50, 1250, 20);
        el13.setFont(new Font("Arial", Font.PLAIN,15));
        el13.setForeground(Color.BLACK);
        pnl3.add(el13);
        JLabel el14 = new JLabel("while the latter offering only undergraduate (B.Sc.) degree programme. With the passage of time, however, some 3000 students have already been graduated from different departments");
        el14.setBounds(10, 70, 1250, 20);
        el14.setFont(new Font("Arial", Font.PLAIN,15));
        el14.setForeground(Color.BLACK);
        pnl3.add(el14);
        JLabel el15 = new JLabel("and programmes while around 3500 students are currently pursuing undergraduate and Master’s degrees.");
        el15.setBounds(10, 90, 1250, 20);
        el15.setFont(new Font("Arial", Font.PLAIN,15));
        el15.setForeground(Color.BLACK);
        pnl3.add(el15);
        pnl3.setVisible(false);
        frame.add(pnl3);
        JPanel pnl4 = new JPanel();
        pnl4.setBounds(250, 630, 1260, 110);
        pnl4.setLayout(null);
        JLabel el16 = new JLabel("Initially, the university started its operation in its city campus located at the heart of Sylhet city. With a space of 50,000+ sft. the city campus at present houses six academic departments");
        el16.setBounds(10, 10, 1250, 20);
        el16.setFont(new Font("Arial", Font.PLAIN,15));
        el16.setForeground(Color.BLACK);
        pnl4.add(el16);
        JLabel el17 = new JLabel("and eight undergraduate and Master’s programmes.");
        el17.setBounds(10, 30, 1250, 20);
        el17.setFont(new Font("Arial", Font.PLAIN,15));
        el17.setForeground(Color.BLACK);
        pnl4.add(el17);
        JLabel el18 = new JLabel("However, in a bid to keep pace with the burgeoning numbers of students, the university’s permanent campus is being built on a land area of 8.5 acres. Situated outside the city, the ");
        el18.setBounds(10, 60, 1250, 20);
        el18.setFont(new Font("Arial", Font.PLAIN,15));
        el18.setForeground(Color.BLACK);
        pnl4.add(el18);
        JLabel el19 = new JLabel("permanent campus would be the most comprehensive and architecturally iconic campus in the region, and is expected to be operational by December 2018.");
        el19.setBounds(10, 80, 1250, 20);
        el19.setFont(new Font("Arial", Font.PLAIN,15));
        el19.setForeground(Color.BLACK);
        pnl4.add(el19);
        JLabel el20 = new JLabel("");
        el20.setBounds(10, 90, 1250, 20);
        el20.setFont(new Font("Arial", Font.PLAIN,15));
        el20.setForeground(Color.BLACK);
        pnl4.add(el20);
        pnl4.setVisible(false);
        frame.add(pnl4);



        //History
        JPanel pnl5 = new JPanel();
        pnl5.setLayout(null);
        pnl5.setBounds(250, 240, 1260, 40);
        pnl5.setOpaque(true);
        pnl5.setBackground(Color.white);
        JLabel el21 = new JLabel("History");
        el21.setBounds(10, 5, 400, 35);
        el21.setFont(new Font("Arial", Font.BOLD, 25));
        el21.setForeground(Color.BLACK);
        pnl5.add(el21);
        pnl5.setVisible(false);
        frame.add(pnl5);

        JPanel pnl6 = new JPanel();
        pnl6.setLayout(null);
        pnl6.setBounds(250, 285, 1260, 210);
        pnl6.setOpaque(true);
        pnl6.setBackground(Color.white);
        JLabel el22 = new JLabel("A remarkable fact about Bangladesh is that its economy is growing rapidly as is its large youthful population. 34 percent of its 160 million people are aged 15 or younger, and the country ");
        el22.setBounds(10, 5, 1250, 20);
        el22.setFont(new Font("Arial", Font.PLAIN, 15));
        el22.setForeground(Color.BLACK);
        pnl6.add(el22);
        JLabel el23 = new JLabel("has an opportunity to realize the full benefit of this “demographic dividend’ in the years ahead — but only if it can provide education and training to the millions of students who need it.");
        el23.setBounds(10, 25, 1250, 20);
        el23.setFont(new Font("Arial", Font.PLAIN, 15));
        el23.setForeground(Color.BLACK);
        pnl6.add(el23);
        JLabel el24 = new JLabel("Indeed, the country has seen a tremendous increase in enrolment over the last decade or so. Total tertiary enrolment has more than tripled since 2000. The strength of public universities");
        el24.setBounds(10, 45, 1250, 20);
        el24.setFont(new Font("Arial", Font.PLAIN, 15));
        el24.setForeground(Color.BLACK);
        pnl6.add(el24);
        JLabel el25 = new JLabel("was direly insufficient to keep up with this phenomenal increase in the demand for higher education. Against this backdrop, there was a change in the age-old notion that the state alone is");
        el25.setBounds(10, 65, 1250, 20);
        el25.setFont(new Font("Arial", Font.PLAIN, 15));
        el25.setForeground(Color.BLACK);
        pnl6.add(el25);
        JLabel el26 = new JLabel("to shoulder the burden of tertiary education and accommodating the private universities to share this national duty, of course, without making any compromise in academic excellence and");
        el26.setBounds(10, 85, 1250, 20);
        el26.setFont(new Font("Arial", Font.PLAIN, 15));
        el26.setForeground(Color.BLACK);
        pnl6.add(el26);
        JLabel el27 = new JLabel("other matrices of higher university education. Metropolitan University joins this historic shift to bring quality higher education at affordable cost to the doorsteps of the students.");
        el27.setBounds(10, 105, 1250, 20);
        el27.setFont(new Font("Arial", Font.PLAIN, 15));
        el27.setForeground(Color.BLACK);
        pnl6.add(el27);
        JLabel el28 = new JLabel("With the approval of the Ministry of Education under the Private University Act of 1992 (which was amended first in 1998 and then again in 2010), Metropolitan University came into being ");
        el28.setBounds(10, 125, 1250, 20);
        el28.setFont(new Font("Arial", Font.PLAIN, 15));
        el28.setForeground(Color.BLACK);
        pnl6.add(el28);
        JLabel el29 = new JLabel("on 3rd May 2003.");
        el29.setBounds(10, 145, 1250, 20);
        el29.setFont(new Font("Arial", Font.PLAIN, 15));
        el29.setForeground(Color.BLACK);
        pnl6.add(el29);
        JLabel el30 = new JLabel("Dr. Toufique Rahman Chowdhury, an educationist and a promising entrepreneur of the country initiated the idea of founding Metropolitan University with the direct participation and ");
        el30.setBounds(10, 165, 1250, 20);
        el30.setFont(new Font("Arial", Font.PLAIN, 15));
        el30.setForeground(Color.BLACK);
        pnl6.add(el30);
        JLabel el31 = new JLabel("assistance of a few of his close friends, acquaintances, and associates.");
        el31.setBounds(10, 185, 1250, 20);
        el31.setFont(new Font("Arial", Font.PLAIN, 15));
        el31.setForeground(Color.BLACK);
        pnl6.add(el31);
        pnl6.setVisible(false);
        frame.add(pnl6);

        JPanel pnl7 = new JPanel();
        pnl7.setLayout(null);
        pnl7.setBounds(250, 500, 1260, 240);
        pnl7.setOpaque(true);
        pnl7.setBackground(Color.white);
        JLabel el32 = new JLabel(" “2018” Celebrating Fifteen Years of Success in Quality Education.");
        el32.setBounds(10, 5, 630, 25);
        el32.setFont(new Font("Arial", Font.PLAIN, 15));
        el32.setForeground(Color.BLACK);
        pnl7.add(el32);
        JLabel el33 = new JLabel(" “2017” Inauguration of Permanent Campus.");
        el33.setBounds(10, 25, 630, 25);
        el33.setFont(new Font("Arial", Font.PLAIN, 15));
        el33.setForeground(Color.BLACK);
        pnl7.add(el33);
        JLabel el34 = new JLabel(" “2016” Celebrated  thirteen years of Excellence in Education.");
        el34.setBounds(10, 45, 630, 25);
        el34.setFont(new Font("Arial", Font.PLAIN, 15));
        el34.setForeground(Color.BLACK);
        pnl7.add(el34);
        JLabel el35 = new JLabel(" “2015” Second Convocation of the University.");
        el35.setBounds(10, 65, 630, 25);
        el35.setFont(new Font("Arial", Font.PLAIN, 15));
        el35.setForeground(Color.BLACK);
        pnl7.add(el35);
        JLabel el36 = new JLabel(" “2014” Membership of the Accreditation Service for International Schools, Colleges &");
        el36.setBounds(10, 85, 630, 25);
        el36.setFont(new Font("Arial", Font.PLAIN, 15));
        el36.setForeground(Color.BLACK);
        pnl7.add(el36);
        JLabel el37 = new JLabel("              Universities.");
        el37.setBounds(10, 105, 650, 25);
        el37.setFont(new Font("Arial", Font.PLAIN, 15));
        el37.setForeground(Color.BLACK);
        pnl7.add(el37);
        JLabel el38 = new JLabel(" “2013” Celebrated Ten years of Serving the country through ensuring quality higher education");
        el38.setBounds(10, 125, 630, 25);
        el38.setFont(new Font("Arial", Font.PLAIN, 15));
        el38.setForeground(Color.BLACK);
        pnl7.add(el38);
        JLabel el39 = new JLabel(" “2012” Opening of Department of Electrical & Electronic Engineering");
        el39.setBounds(10, 145, 630, 25);
        el39.setFont(new Font("Arial", Font.PLAIN, 15));
        el39.setForeground(Color.BLACK);
        pnl7.add(el39);
        JLabel el40 = new JLabel(" “2011” Land procurement for permanent campus of the University, within Sylhet city");
        el40.setBounds(10, 165, 630, 25);
        el40.setFont(new Font("Arial", Font.PLAIN, 15));
        el40.setForeground(Color.BLACK);
        pnl7.add(el40);

        JLabel el41 = new JLabel(" “2010” The First Convocation of the University held.");
        el41.setBounds(660, 5, 630, 20);
        el41.setFont(new Font("Arial", Font.PLAIN, 15));
        el41.setForeground(Color.BLACK);
        pnl7.add(el41);
        JLabel el42 = new JLabel(" “2009” Membership of the Association of Commonwealth Universities.");
        el42.setBounds(660, 25, 630, 20);
        el42.setFont(new Font("Arial", Font.PLAIN, 15));
        el42.setForeground(Color.BLACK);
        pnl7.add(el42);
        JLabel el43 = new JLabel(" “2008” Collaboration with Birmingham City University, UK.");
        el43.setBounds(660, 45, 630, 20);
        el43.setFont(new Font("Arial", Font.PLAIN, 15));
        el43.setForeground(Color.BLACK);
        pnl7.add(el43);
        JLabel el44 = new JLabel(" “2007” Over 1000 regular students in four schools and five departments.");
        el44.setBounds(660, 65, 630, 20);
        el44.setFont(new Font("Arial", Font.PLAIN, 15));
        el44.setForeground(Color.BLACK);
        pnl7.add(el44);
        JLabel el45 = new JLabel(" “2006” High-Powered Government Team: One of the most prospective Universities in");
        el45.setBounds(660, 85, 630, 20);
        el45.setFont(new Font("Arial", Font.PLAIN, 15));
        el45.setForeground(Color.BLACK);
        pnl7.add(el45);
        JLabel el46 = new JLabel("              Bangladesh & ranked among top 15 in Bangladesh.");
        el46.setBounds(660, 105, 630, 20);
        el46.setFont(new Font("Arial", Font.PLAIN, 15));
        el46.setForeground(Color.BLACK);
        pnl7.add(el46);
        JLabel el47 = new JLabel(" “2005” Opening of Faculty of Humanities & Social Sciences and Law.");
        el47.setBounds(660, 125, 630, 20);
        el47.setFont(new Font("Arial", Font.PLAIN, 15));
        el47.setForeground(Color.BLACK);
        pnl7.add(el47);
        JLabel el48 = new JLabel(" “2004” Opening of most modern and facilitated campus with high-speed campus");
        el48.setBounds(660, 145, 630, 20);
        el48.setFont(new Font("Arial", Font.PLAIN, 15));
        el48.setForeground(Color.BLACK);
        pnl7.add(el48);
        JLabel el49 = new JLabel("              backbone network.");
        el49.setBounds(660, 165, 630, 20);
        el49.setFont(new Font("Arial", Font.PLAIN, 15));
        el49.setForeground(Color.BLACK);
        pnl7.add(el49);
        JLabel el50 = new JLabel(" “2003” Establishment of the University, approved by the UGC & Government of the ");
        el50.setBounds(660, 185, 630, 20);
        el50.setFont(new Font("Arial", Font.PLAIN, 15));
        el50.setForeground(Color.BLACK);
        pnl7.add(el50);
        JLabel el51 = new JLabel("              People’s Republic of Bangladesh.");
        el51.setBounds(660, 205, 630, 20);
        el51.setFont(new Font("Arial", Font.PLAIN, 15));
        el51.setForeground(Color.BLACK);
        pnl7.add(el51);
        pnl7.setVisible(false);
        frame.add(pnl7);



        //Vision And Mission
        JPanel pnl8 = new JPanel();
        pnl8.setLayout(null);
        pnl8.setBounds(250, 240, 1260, 40);
        pnl8.setOpaque(true);
        pnl8.setBackground(Color.white);
        JLabel el52 = new JLabel("Vision And Mission");
        el52.setBounds(10, 5, 400, 35);
        el52.setFont(new Font("Arial", Font.BOLD, 25));
        el52.setForeground(Color.BLACK);
        pnl8.add(el52);
        pnl8.setVisible(false);
        frame.add(pnl8);

        JPanel pnl9 = new JPanel();
        pnl9.setLayout(null);
        pnl9.setBounds(250, 285, 1260, 80);
        pnl9.setOpaque(true);
        pnl9.setBackground(Color.white);
        JLabel el53 = new JLabel("Vision");
        el53.setBounds(10, 10, 1250, 20);
        el53.setFont(new Font("Arial", Font.BOLD, 20));
        el53.setForeground(Color.BLACK);
        pnl9.add(el53);
        JLabel el54 = new JLabel("To emerge as a distinguished teaching and research university recognized around the globe through innovative education, creation and application of knowledge, and community");
        el54.setBounds(10, 35, 1250, 20);
        el54.setFont(new Font("Arial", Font.PLAIN, 15));
        el54.setForeground(Color.BLACK);
        pnl9.add(el54);
        JLabel el55 = new JLabel("engagement.");
        el55.setBounds(10, 55, 1250, 20);
        el55.setFont(new Font("Arial", Font.PLAIN, 15));
        el55.setForeground(Color.BLACK);
        pnl9.add(el55);
        pnl9.setVisible(false);
        frame.add(pnl9);

        JPanel pnl10 = new JPanel();
        pnl10.setLayout(null);
        pnl10.setBounds(250, 370, 1260, 110);
        pnl10.setOpaque(true);
        pnl10.setBackground(Color.white);
        JLabel el56 = new JLabel("Mission");
        el56.setBounds(10, 10, 1250, 20);
        el56.setFont(new Font("Arial", Font.BOLD, 20));
        el56.setForeground(Color.BLACK);
        pnl10.add(el56);
        JLabel el57 = new JLabel("To provide our students with globally compatible tertiary education characterized by academic excellence in a range of subjects pertinent to the present and future social needs. To provide");
        el57.setBounds(10, 35, 1250, 20);
        el57.setFont(new Font("Arial", Font.PLAIN, 15));
        el57.setForeground(Color.BLACK);
        pnl10.add(el57);
        JLabel el58 = new JLabel("our students with the necessary lessons on moral values, ethics, self-respect, and patriotism.");
        el58.setBounds(10, 55, 1250, 20);
        el58.setFont(new Font("Arial", Font.PLAIN, 15));
        el58.setForeground(Color.BLACK);
        pnl10.add(el58);
        JLabel el59 = new JLabel("To provide a stimulating learning environment where our students can prepare themselves for pursuing their academic, personal, and career goals.");
        el59.setBounds(10, 85, 1250, 20);
        el59.setFont(new Font("Arial", Font.PLAIN, 15));
        el59.setForeground(Color.BLACK);
        pnl10.add(el59);
        pnl10.setVisible(false);
        frame.add(pnl10);

        JPanel pnl11 = new JPanel();
        pnl11.setLayout(null);
        pnl11.setBounds(250, 485, 1260, 255);
        pnl11.setOpaque(true);
        pnl11.setBackground(Color.white);
        JLabel el60 = new JLabel("Strategies");
        el60.setBounds(10, 10, 1250, 22);
        el60.setFont(new Font("Arial", Font.BOLD, 20));
        el60.setForeground(Color.BLACK);
        pnl11.add(el60);
        JLabel el61 = new JLabel("In order to materialize the mission we pursue strategies including—but not limited to—the following:");
        el61.setBounds(10, 40, 1250, 20);
        el61.setFont(new Font("Arial", Font.PLAIN, 15));
        el61.setForeground(Color.BLACK);
        pnl11.add(el61);
        JLabel el62 = new JLabel("(i) giving our students real world industrial exposure through industry-academia collaboration and actively engaging the alumni in that regard;");
        el62.setBounds(10, 65, 1250, 20);
        el62.setFont(new Font("Arial", Font.PLAIN, 15));
        el62.setForeground(Color.BLACK);
        pnl11.add(el62);
        JLabel el63 = new JLabel("(ii) providing the students with various technological orientations that enhance their capabilities for thriving in the knowledge economy and social dynamism;");
        el63.setBounds(10, 85, 1250, 20);
        el63.setFont(new Font("Arial", Font.PLAIN, 15));
        el63.setForeground(Color.BLACK);
        pnl11.add(el63);
        JLabel el64 = new JLabel("(iii) promoting co-curricular and extra-curricular activities to ensure comprehensive development of the students;");
        el64.setBounds(10, 105, 1250, 20);
        el64.setFont(new Font("Arial", Font.PLAIN, 15));
        el64.setForeground(Color.BLACK);
        pnl11.add(el64);
        JLabel el65 = new JLabel("(iv) engaging the faculty members in active research as well as other pedagogic programs in order to harness their teaching and research potentials;");
        el65.setBounds(10, 125, 1250, 20);
        el65.setFont(new Font("Arial", Font.PLAIN, 15));
        el65.setForeground(Color.BLACK);
        pnl11.add(el65);
        JLabel el66 = new JLabel("(v) maintaining ideal research & development facilities suitable for postgraduate and doctoral research as well as other development projects and initiatives; and");
        el66.setBounds(10, 145, 1250, 20);
        el66.setFont(new Font("Arial", Font.PLAIN, 15));
        el66.setForeground(Color.BLACK);
        pnl11.add(el66);
        JLabel el67 = new JLabel("(vi) updating the curriculum and other requisites to accommodate the changing national priorities and global developments on a progressive basis.");
        el67.setBounds(10, 165, 1250, 20);
        el67.setFont(new Font("Arial", Font.PLAIN, 15));
        el67.setForeground(Color.BLACK);
        pnl11.add(el67);
        pnl11.setVisible(false);
        frame.add(pnl11);



        //Our Core Values
        JPanel pnl12 = new JPanel();
        pnl12.setLayout(null);
        pnl12.setBounds(250, 240, 1260, 40);
        pnl12.setOpaque(true);
        pnl12.setBackground(Color.white);
        JLabel el68 = new JLabel("Our Core Values");
        el68.setBounds(10, 5, 400, 35);
        el68.setFont(new Font("Arial", Font.BOLD, 25));
        el68.setForeground(Color.BLACK);
        pnl12.add(el68);
        pnl12.setVisible(false);
        frame.add(pnl12);

        JPanel pnl13 = new JPanel();
        pnl13.setLayout(null);
        pnl13.setBounds(250, 285, 627, 85);
        pnl13.setOpaque(true);
        pnl13.setBackground(Color.white);
        JLabel el69 = new JLabel("Integrity", SwingConstants.CENTER);
        el69.setBounds(10, 10, 627, 25);
        el69.setFont(new Font("Arial", Font.BOLD, 25));
        el69.setForeground(Color.BLACK);
        pnl13.add(el69);
        JLabel el70 = new JLabel("Ethical and moral uprightness.", SwingConstants.CENTER);
        el70.setBounds(10, 50, 627, 20);
        el70.setFont(new Font("Arial", Font.PLAIN, 18));
        el70.setForeground(Color.BLACK);
        pnl13.add(el70);
        pnl13.setVisible(false);
        frame.add(pnl13);

        JPanel pnl14 = new JPanel();
        pnl14.setLayout(null);
        pnl14.setBounds(883, 285, 627, 85);
        pnl14.setOpaque(true);
        pnl14.setBackground(Color.white);
        JLabel el71 = new JLabel("Discipline", SwingConstants.CENTER);
        el71.setBounds(10, 10, 630, 25);
        el71.setFont(new Font("Arial", Font.BOLD, 25));
        el71.setForeground(Color.BLACK);
        pnl14.add(el71);
        JLabel el72 = new JLabel("Discipline in Life.", SwingConstants.CENTER);
        el72.setBounds(10, 50, 630, 25);
        el72.setFont(new Font("Arial", Font.PLAIN, 18));
        el72.setForeground(Color.BLACK);
        pnl14.add(el72);
        pnl14.setVisible(false);
        frame.add(pnl14);

        JPanel pnl15 = new JPanel();
        pnl15.setLayout(null);
        pnl15.setBounds(250, 375, 627, 85);
        pnl15.setOpaque(true);
        pnl15.setBackground(Color.white);
        JLabel el73 = new JLabel("Creativity", SwingConstants.CENTER);
        el73.setBounds(10, 10, 630, 25);
        el73.setFont(new Font("Arial", Font.BOLD, 25));
        el73.setForeground(Color.BLACK);
        pnl15.add(el73);
        JLabel el74 = new JLabel("Creativity in all spheres.", SwingConstants.CENTER);
        el74.setBounds(10, 50, 630, 25);
        el74.setFont(new Font("Arial", Font.PLAIN, 18));
        el74.setForeground(Color.BLACK);
        pnl15.add(el74);
        pnl15.setVisible(false);
        frame.add(pnl15);

        JPanel pnl16 = new JPanel();
        pnl16.setLayout(null);
        pnl16.setBounds(883, 375, 627, 85);
        pnl16.setOpaque(true);
        pnl16.setBackground(Color.white);
        JLabel el75 = new JLabel("Commitment", SwingConstants.CENTER);
        el75.setBounds(10, 10, 630, 25);
        el75.setFont(new Font("Arial", Font.BOLD, 25));
        el75.setForeground(Color.BLACK);
        pnl16.add(el75);
        JLabel el76 = new JLabel("Quality academic standards.", SwingConstants.CENTER);
        el76.setBounds(10, 50, 630, 25);
        el76.setFont(new Font("Arial", Font.PLAIN, 18));
        el76.setForeground(Color.BLACK);
        pnl16.add(el76);
        pnl16.setVisible(false);
        frame.add(pnl16);

        JPanel pnl17 = new JPanel();
        pnl17.setLayout(null);
        pnl17.setBounds(250, 465, 627, 85);
        pnl17.setOpaque(true);
        pnl17.setBackground(Color.white);
        JLabel el77 = new JLabel("Wisdom", SwingConstants.CENTER);
        el77.setBounds(10, 10, 630, 25);
        el77.setFont(new Font("Arial", Font.BOLD, 25));
        el77.setForeground(Color.BLACK);
        pnl17.add(el77);
        JLabel el78 = new JLabel("Enhanced education and research.", SwingConstants.CENTER);
        el78.setBounds(10, 50, 630, 25);
        el78.setFont(new Font("Arial", Font.PLAIN, 18));
        el78.setForeground(Color.BLACK);
        pnl17.add(el78);
        pnl17.setVisible(false);
        frame.add(pnl17);

        JPanel pnl18 = new JPanel();
        pnl18.setLayout(null);
        pnl18.setBounds(883, 465, 627, 85);
        pnl18.setOpaque(true);
        pnl18.setBackground(Color.white);
        JLabel el79 = new JLabel("Patriotism", SwingConstants.CENTER);
        el79.setBounds(10, 10, 630, 25);
        el79.setFont(new Font("Arial", Font.BOLD, 25));
        el79.setForeground(Color.BLACK);
        pnl18.add(el79);
        JLabel el80 = new JLabel("Loving the Country by heart.", SwingConstants.CENTER);
        el80.setBounds(10, 50, 630, 25);
        el80.setFont(new Font("Arial", Font.PLAIN, 18));
        el80.setForeground(Color.BLACK);
        pnl18.add(el80);
        pnl18.setVisible(false);
        frame.add(pnl18);


        ImageIcon icon2 = new ImageIcon("image/F.png");
        Image image2 = icon2.getImage();
        Image newImage2 = image2.getScaledInstance(1291, 540, Image.SCALE_SMOOTH);
        JPanel pnl19 = new JPanel();
        pnl19.setLayout(null);
        pnl19.setBounds(220, 200, 1291, 540);
        pnl19.setVisible(true);
        JLabel lbl52 = new JLabel(new ImageIcon(newImage2));
        lbl52.setBounds(0, 0, 1291, 540);
        pnl19.add(lbl52);
        pnl19.setVisible(true);
        frame.add(pnl19);




        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(false);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);

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


            }
        });
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(false);
                button3.setEnabled(true);
                button4.setEnabled(true);


                pnl5.setVisible(true);
                pnl6.setVisible(true);
                pnl7.setVisible(true);

                pnl.setVisible(false);
                pnl1.setVisible(false);
                pnl2.setVisible(false);
                pnl3.setVisible(false);
                pnl4.setVisible(false);
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

            }
        });
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(false);
                button4.setEnabled(true);


                pnl8.setVisible(true);
                pnl9.setVisible(true);
                pnl10.setVisible(true);
                pnl11.setVisible(true);

                pnl.setVisible(false);
                pnl1.setVisible(false);
                pnl2.setVisible(false);
                pnl3.setVisible(false);
                pnl4.setVisible(false);
                pnl5.setVisible(false);
                pnl6.setVisible(false);
                pnl7.setVisible(false);
                pnl12.setVisible(false);
                pnl13.setVisible(false);
                pnl14.setVisible(false);
                pnl15.setVisible(false);
                pnl16.setVisible(false);
                pnl17.setVisible(false);
                pnl18.setVisible(false);
                pnl19.setVisible(false);

            }
        });
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(false);


                pnl12.setVisible(true);
                pnl13.setVisible(true);
                pnl14.setVisible(true);
                pnl15.setVisible(true);
                pnl16.setVisible(true);
                pnl17.setVisible(true);
                pnl18.setVisible(true);

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
                pnl19.setVisible(false);
            }
        });


        // About
        JButton btn1 = new JButton("About");
        btn1.setFont(new Font("Arial", Font.BOLD, 23));
        btn1.setBounds(20, 140, 150, 40);
        btn1.setBackground(Color.LIGHT_GRAY);
        btn1.setForeground(Color.GRAY);
        btn1.setOpaque(false);
        btn1.setBorderPainted(false);
        frame.add(btn1);
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);

                pnl19.setVisible(true);


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
        btn3.setForeground(Color.WHITE);
        btn3.setBorderPainted(false);
        btn3.setOpaque(false);
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
