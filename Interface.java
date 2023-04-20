import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.ArrayList;

/***********************************************************************************
 ***********************************************************************************
 *
 * Date: April 19th CPSC 240 - Spring 2023. I pledge.
 * 
 * @author Josh Williams
 * 
 *         - GUI class file for the March Madness Tournament. Adds a bunch of
 *         cool cosmetic stuff for the program. Displays the results of the
 *         winners of every round in the output text fields. Includes two
 *         buttons that simulate results/shuffle teams.
 * 
 ***********************************************************************************
 ***********************************************************************************/

public class Interface{
	JFrame frame;
	JFrame frame2;
	JButton submit;
	JButton cancel;
	JButton shuffle;
	JButton simulate;
	JButton addTeam;
	JTextField nameField;
	JTextField winField;
	JTextField lossField;
	private FileWriter myWriter;

	// default constructor
	public Interface() {
		JFrame frame = new JFrame();
		frame = new JFrame("March Madness");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
		frame.setVisible(true);
		this.frame = frame;
	}

	/*******************************************************************************
	 * 
	 * [1]... passes default ArrayList of teams outputs and displays results to the
	 *        interface.
	 * 
	 *******************************************************************************/
	public void displayRoundOne(ArrayList<String> list) {

		// left columns (32 teams)
		JTextField team1 = new JTextField(list.get(0));
		team1.setBounds(0, 0, 100, 20);
		team1.setEditable(false);
		frame.add(team1);

		JTextField team2 = new JTextField(list.get(1));
		team2.setBounds(0, 25, 100, 20);
		team2.setEditable(false);
		frame.add(team2);

		JTextField team3 = new JTextField(list.get(2));
		team3.setBounds(0, 50, 100, 20);
		team3.setEditable(false);
		frame.add(team3);

		JTextField team4 = new JTextField(list.get(3));
		team4.setBounds(0, 75, 100, 20);
		team4.setEditable(false);
		frame.add(team4);

		JTextField team5 = new JTextField(list.get(4));
		team5.setBounds(0, 100, 100, 20);
		team5.setEditable(false);
		frame.add(team5);

		JTextField team6 = new JTextField(list.get(5));
		team6.setBounds(0, 125, 100, 20);
		team6.setEditable(false);
		frame.add(team6);

		JTextField team7 = new JTextField(list.get(6));
		team7.setBounds(0, 150, 100, 20);
		team7.setEditable(false);
		frame.add(team7);

		JTextField team8 = new JTextField(list.get(7));
		team8.setBounds(0, 175, 100, 20);
		team8.setEditable(false);
		frame.add(team8);

		JTextField team9 = new JTextField(list.get(8));
		team9.setBounds(0, 200, 100, 20);
		team9.setEditable(false);
		frame.add(team9);

		JTextField team10 = new JTextField(list.get(9));
		team10.setBounds(0, 225, 100, 20);
		team10.setEditable(false);
		frame.add(team10);

		JTextField team11 = new JTextField(list.get(10));
		team11.setBounds(0, 250, 100, 20);
		team11.setEditable(false);
		frame.add(team11);

		JTextField team12 = new JTextField(list.get(11));
		team12.setBounds(0, 275, 100, 20);
		team12.setEditable(false);
		frame.add(team12);

		JTextField team13 = new JTextField(list.get(12));
		team13.setBounds(0, 300, 100, 20);
		team13.setEditable(false);
		frame.add(team13);

		JTextField team14 = new JTextField(list.get(13));
		team14.setBounds(0, 325, 100, 20);
		team14.setEditable(false);
		frame.add(team14);

		JTextField team15 = new JTextField(list.get(14));
		team15.setBounds(0, 350, 100, 20);
		team15.setEditable(false);
		frame.add(team15);

		JTextField team16 = new JTextField(list.get(15));
		team16.setBounds(0, 375, 100, 20);
		team16.setEditable(false);
		frame.add(team16);

		JTextField team17 = new JTextField(list.get(16));
		team17.setBounds(0, 400, 100, 20);
		team17.setEditable(false);
		frame.add(team17);

		JTextField team18 = new JTextField(list.get(17));
		team18.setBounds(0, 425, 100, 20);
		team18.setEditable(false);
		frame.add(team18);

		JTextField team19 = new JTextField(list.get(18));
		team19.setBounds(0, 450, 100, 20);
		team19.setEditable(false);
		frame.add(team19);

		JTextField team20 = new JTextField(list.get(19));
		team20.setBounds(0, 475, 100, 20);
		team20.setEditable(false);
		frame.add(team20);

		JTextField team21 = new JTextField(list.get(20));
		team21.setBounds(0, 500, 100, 20);
		team21.setEditable(false);
		frame.add(team21);

		JTextField team22 = new JTextField(list.get(21));
		team22.setBounds(0, 525, 100, 20);
		team22.setEditable(false);
		frame.add(team22);

		JTextField team23 = new JTextField(list.get(22));
		team23.setBounds(0, 550, 100, 20);
		team23.setEditable(false);
		frame.add(team23);

		JTextField team24 = new JTextField(list.get(23));
		team24.setBounds(0, 575, 100, 20);
		team24.setEditable(false);
		frame.add(team24);

		JTextField team25 = new JTextField(list.get(24));
		team25.setBounds(0, 600, 100, 20);
		team25.setEditable(false);
		frame.add(team25);

		JTextField team26 = new JTextField(list.get(25));
		team26.setBounds(0, 625, 100, 20);
		team26.setEditable(false);
		frame.add(team26);

		JTextField team27 = new JTextField(list.get(26));
		team27.setBounds(0, 650, 100, 20);
		team27.setEditable(false);
		frame.add(team27);

		JTextField team28 = new JTextField(list.get(27));
		team28.setBounds(0, 675, 100, 20);
		team28.setEditable(false);
		frame.add(team28);

		JTextField team29 = new JTextField(list.get(28));
		team29.setBounds(0, 700, 100, 20);
		team29.setEditable(false);
		frame.add(team29);

		JTextField team30 = new JTextField(list.get(29));
		team30.setBounds(0, 725, 100, 20);
		team30.setEditable(false);
		frame.add(team30);

		JTextField team31 = new JTextField(list.get(30));
		team31.setBounds(0, 750, 100, 20);
		team31.setEditable(false);
		frame.add(team31);

		JTextField team32 = new JTextField(list.get(31));
		team32.setBounds(0, 775, 100, 20);
		team32.setEditable(false);
		frame.add(team32);

		// right column (32 teams)
		JTextField team33 = new JTextField(list.get(32));
		team33.setBounds(1410, 0, 100, 20);
		team33.setEditable(false);
		frame.add(team33);

		JTextField team34 = new JTextField(list.get(33));
		team34.setBounds(1410, 25, 100, 20);
		team34.setEditable(false);
		frame.add(team34);

		JTextField team35 = new JTextField(list.get(34));
		team35.setBounds(1410, 50, 100, 20);
		team35.setEditable(false);
		frame.add(team35);

		JTextField team36 = new JTextField(list.get(35));
		team36.setBounds(1410, 75, 100, 20);
		team36.setEditable(false);
		frame.add(team36);

		JTextField team37 = new JTextField(list.get(36));
		team37.setBounds(1410, 100, 100, 20);
		team37.setEditable(false);
		frame.add(team37);

		JTextField team38 = new JTextField(list.get(37));
		team38.setBounds(1410, 125, 100, 20);
		team38.setEditable(false);
		frame.add(team38);

		JTextField team39 = new JTextField(list.get(38));
		team39.setBounds(1410, 150, 100, 20);
		team39.setEditable(false);
		frame.add(team39);

		JTextField team40 = new JTextField(list.get(39));
		team40.setBounds(1410, 175, 100, 20);
		team40.setEditable(false);
		frame.add(team40);

		JTextField team41 = new JTextField(list.get(40));
		team41.setBounds(1410, 200, 100, 20);
		team41.setEditable(false);
		frame.add(team41);

		JTextField team42 = new JTextField(list.get(41));
		team42.setBounds(1410, 225, 100, 20);
		team42.setEditable(false);
		frame.add(team42);

		JTextField team43 = new JTextField(list.get(42));
		team43.setBounds(1410, 250, 100, 20);
		team43.setEditable(false);
		frame.add(team43);

		JTextField team44 = new JTextField(list.get(43));
		team44.setBounds(1410, 275, 100, 20);
		team44.setEditable(false);
		frame.add(team44);

		JTextField team45 = new JTextField(list.get(44));
		team45.setBounds(1410, 300, 100, 20);
		team45.setEditable(false);
		frame.add(team45);

		JTextField team46 = new JTextField(list.get(45));
		team46.setBounds(1410, 325, 100, 20);
		team46.setEditable(false);
		frame.add(team46);

		JTextField team47 = new JTextField(list.get(46));
		team47.setBounds(1410, 350, 100, 20);
		team47.setEditable(false);
		frame.add(team47);

		JTextField team48 = new JTextField(list.get(47));
		team48.setBounds(1410, 375, 100, 20);
		team48.setEditable(false);
		frame.add(team48);

		JTextField team49 = new JTextField(list.get(48));
		team49.setBounds(1410, 400, 100, 20);
		team49.setEditable(false);
		frame.add(team49);

		JTextField team50 = new JTextField(list.get(49));
		team50.setBounds(1410, 425, 100, 20);
		team50.setEditable(false);
		frame.add(team50);

		JTextField team51 = new JTextField(list.get(50));
		team51.setBounds(1410, 450, 100, 20);
		team51.setEditable(false);
		frame.add(team51);

		JTextField team52 = new JTextField(list.get(51));
		team52.setBounds(1410, 475, 100, 20);
		team52.setEditable(false);
		frame.add(team52);

		JTextField team53 = new JTextField(list.get(52));
		team53.setBounds(1410, 500, 100, 20);
		team53.setEditable(false);
		frame.add(team53);

		JTextField team54 = new JTextField(list.get(53));
		team54.setBounds(1410, 525, 100, 20);
		team54.setEditable(false);
		frame.add(team54);

		JTextField team55 = new JTextField(list.get(54));
		team55.setBounds(1410, 550, 100, 20);
		team55.setEditable(false);
		frame.add(team55);

		JTextField team56 = new JTextField(list.get(55));
		team56.setBounds(1410, 575, 100, 20);
		team56.setEditable(false);
		frame.add(team56);

		JTextField team57 = new JTextField(list.get(56));
		team57.setBounds(1410, 600, 100, 20);
		team57.setEditable(false);
		frame.add(team57);

		JTextField team58 = new JTextField(list.get(57));
		team58.setBounds(1410, 625, 100, 20);
		team58.setEditable(false);
		frame.add(team58);

		JTextField team59 = new JTextField(list.get(58));
		team59.setBounds(1410, 650, 100, 20);
		team59.setEditable(false);
		frame.add(team59);

		JTextField team60 = new JTextField(list.get(59));
		team60.setBounds(1410, 675, 100, 20);
		team60.setEditable(false);
		frame.add(team60);

		JTextField team61 = new JTextField(list.get(60));
		team61.setBounds(1410, 700, 100, 20);
		team61.setEditable(false);
		frame.add(team61);

		JTextField team62 = new JTextField(list.get(61));
		team62.setBounds(1410, 725, 100, 20);
		team62.setEditable(false);
		frame.add(team62);

		JTextField team63 = new JTextField(list.get(62));
		team63.setBounds(1410, 750, 100, 20);
		team63.setEditable(false);
		frame.add(team63);

		JTextField team64 = new JTextField(list.get(63));
		team64.setBounds(1410, 775, 100, 20);
		team64.setEditable(false);
		frame.add(team64);
	}

	/*******************************************************************************
	 * 
	 * [2]... passes updated ArrayList of teams outputs and displays round two
	 *        teams.
	 * 
	 *******************************************************************************/
	public void displayRoundTwo(ArrayList<String> list) {
		
		// round two (16 teams) left side
		JTextArea textArea1 = new JTextArea(list.get(0));
		textArea1.setBounds(144, 13, 100, 20);
		textArea1.setEditable(false);
		frame.add(textArea1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea2 = new JTextArea(list.get(1));
		textArea2.setBounds(144, 63, 100, 20);
		textArea2.setEditable(false);
		frame.add(textArea2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea3 = new JTextArea(list.get(2));
		textArea3.setBounds(144, 113, 100, 20);
		textArea3.setEditable(false);
		frame.add(textArea3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea4 = new JTextArea(list.get(3));
		textArea4.setBounds(144, 163, 100, 20);
		textArea4.setEditable(false);
		frame.add(textArea4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea5 = new JTextArea(list.get(4));
		textArea5.setBounds(144, 213, 100, 20);
		textArea5.setEditable(false);
		frame.add(textArea5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea6 = new JTextArea(list.get(5));
		textArea6.setBounds(144, 263, 100, 20);
		textArea6.setEditable(false);
		frame.add(textArea6);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea7 = new JTextArea(list.get(6));
		textArea7.setBounds(144, 313, 100, 20);
		textArea7.setEditable(false);
		frame.add(textArea7);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea8 = new JTextArea(list.get(7));
		textArea8.setBounds(144, 363, 100, 20);
		textArea8.setEditable(false);
		frame.add(textArea8);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea9 = new JTextArea(list.get(8));
		textArea9.setBounds(144, 413, 100, 20);
		textArea9.setEditable(false);
		frame.add(textArea9);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea10 = new JTextArea(list.get(9));
		textArea10.setBounds(144, 463, 100, 20);
		textArea10.setEditable(false);
		frame.add(textArea10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea11 = new JTextArea(list.get(10));
		textArea11.setBounds(144, 513, 100, 20);
		textArea11.setEditable(false);
		frame.add(textArea11);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea12 = new JTextArea(list.get(11));
		textArea12.setBounds(144, 563, 100, 20);
		textArea12.setEditable(false);
		frame.add(textArea12);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea13 = new JTextArea(list.get(12));
		textArea13.setBounds(144, 613, 100, 20);
		textArea13.setEditable(false);
		frame.add(textArea13);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea14 = new JTextArea(list.get(13));;
		textArea14.setBounds(144, 663, 100, 20);
		textArea14.setEditable(false);
		frame.add(textArea14);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea15 = new JTextArea(list.get(14));
		textArea15.setBounds(144, 713, 100, 20);
		textArea15.setEditable(false);
		frame.add(textArea15);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea16 = new JTextArea(list.get(15));
		textArea16.setBounds(144, 763, 100, 20);
		textArea16.setEditable(false);
		frame.add(textArea16);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// round two (16 teams) right side
		JTextArea textArea17 = new JTextArea(list.get(16));
		textArea17.setBounds(1268, 13, 100, 20);
		textArea17.setEditable(false);
		frame.add(textArea17);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea18 = new JTextArea(list.get(17));
		textArea18.setBounds(1268, 63, 100, 20);
		textArea18.setEditable(false);
		frame.add(textArea18);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea19 = new JTextArea(list.get(18));
		textArea19.setBounds(1268, 113, 100, 20);
		textArea19.setEditable(false);
		frame.add(textArea19);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea20 = new JTextArea(list.get(19));
		textArea20.setBounds(1268, 163, 100, 20);
		textArea20.setEditable(false);
		frame.add(textArea20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea21 = new JTextArea(list.get(20));
		textArea21.setBounds(1268, 213, 100, 20);
		textArea21.setEditable(false);
		frame.add(textArea21);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea22 = new JTextArea(list.get(21));
		textArea22.setBounds(1268, 263, 100, 20);
		textArea22.setEditable(false);
		frame.add(textArea22);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea23 = new JTextArea(list.get(22));
		textArea23.setBounds(1268, 313, 100, 20);
		textArea23.setEditable(false);
		frame.add(textArea23);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea24 = new JTextArea(list.get(23));
		textArea24.setBounds(1268, 363, 100, 20);
		textArea24.setEditable(false);
		frame.add(textArea24);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea25 = new JTextArea(list.get(24));
		textArea25.setBounds(1268, 413, 100, 20);
		textArea25.setEditable(false);
		frame.add(textArea25);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea26 = new JTextArea(list.get(25));
		textArea26.setBounds(1268, 463, 100, 20);
		textArea26.setEditable(false);
		frame.add(textArea26);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea27 = new JTextArea(list.get(26));
		textArea27.setBounds(1268, 513, 100, 20);
		textArea27.setEditable(false);
		frame.add(textArea27);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea28 = new JTextArea(list.get(27));
		textArea28.setBounds(1268, 563, 100, 20);
		textArea28.setEditable(false);
		frame.add(textArea28);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea29 = new JTextArea(list.get(28));
		textArea29.setBounds(1268, 613, 100, 20);
		textArea29.setEditable(false);
		frame.add(textArea29);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea30 = new JTextArea(list.get(29));
		textArea30.setBounds(1268, 663, 100, 20);
		textArea30.setEditable(false);
		frame.add(textArea30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea31 = new JTextArea(list.get(30));
		textArea31.setBounds(1268, 713, 100, 20);
		textArea31.setEditable(false);
		frame.add(textArea31);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea32 = new JTextArea(list.get(31));
		textArea32.setBounds(1268, 763, 100, 20);
		textArea32.setEditable(false);
		frame.add(textArea32);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	/*******************************************************************************
	 * 
	 * [3]... passes updated ArrayList of teams outputs and displays round three
	 *        teams.
	 * 
	 *******************************************************************************/
	public void displayRoundThree(ArrayList<String> list) {
		// round three (8 teams) left side
		JTextArea textArea34 = new JTextArea(list.get(0));
		textArea34.setBounds(285, 40, 100, 20);
		textArea34.setEditable(false);
		frame.add(textArea34);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea35 = new JTextArea(list.get(1));
		textArea35.setBounds(285, 140, 100, 20);
		textArea35.setEditable(false);
		frame.add(textArea35);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea36 = new JTextArea(list.get(2));;
		textArea36.setBounds(285, 240, 100, 20);
		textArea36.setEditable(false);
		frame.add(textArea36);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea37 = new JTextArea(list.get(3));
		textArea37.setBounds(285, 340, 100, 20);
		textArea37.setEditable(false);
		frame.add(textArea37);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea38 = new JTextArea(list.get(4));
		textArea38.setBounds(285, 440, 100, 20);
		textArea38.setEditable(false);
		frame.add(textArea38);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea39 = new JTextArea(list.get(5));
		textArea39.setBounds(285, 540, 100, 20);
		textArea39.setEditable(false);
		frame.add(textArea39);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea40 = new JTextArea(list.get(6));
		textArea40.setBounds(285, 640, 100, 20);
		textArea40.setEditable(false);
		frame.add(textArea40);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea41 = new JTextArea(list.get(7));
		textArea41.setBounds(285, 740, 100, 20);
		textArea41.setEditable(false);
		frame.add(textArea41);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// round three (8 teams) right side
		JTextArea textArea42 = new JTextArea(list.get(8));
		textArea42.setBounds(1127, 40, 100, 20);
		textArea42.setEditable(false);
		frame.add(textArea42);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea43 = new JTextArea(list.get(9));
		textArea43.setBounds(1127, 140, 100, 20);
		textArea43.setEditable(false);
		frame.add(textArea43);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea44 = new JTextArea(list.get(10));
		textArea44.setBounds(1127, 240, 100, 20);
		textArea44.setEditable(false);
		frame.add(textArea44);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea45 = new JTextArea(list.get(11));
		textArea45.setBounds(1127, 340, 100, 20);
		textArea45.setEditable(false);
		frame.add(textArea45);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea46 = new JTextArea(list.get(12));
		textArea46.setBounds(1127, 440, 100, 20);
		textArea46.setEditable(false);
		frame.add(textArea46);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea47 = new JTextArea(list.get(13));
		textArea47.setBounds(1127, 540, 100, 20);
		textArea47.setEditable(false);
		frame.add(textArea47);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea48 = new JTextArea(list.get(14));
		textArea48.setBounds(1127, 640, 100, 20);
		textArea48.setEditable(false);
		frame.add(textArea48);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea49 = new JTextArea(list.get(15));
		textArea49.setBounds(1127, 740, 100, 20);
		textArea49.setEditable(false);
		frame.add(textArea49);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	/*******************************************************************************
	 * 
	 * [4]... passes updated ArrayList of teams outputs and displays round four
	 *        teams.
	 * 
	 *******************************************************************************/
	public void displayRoundFour(ArrayList<String> list) {
		// round four (4 teams) left side
		JTextArea textArea50 = new JTextArea(list.get(0));
		textArea50.setBounds(425, 95, 100, 20);
		textArea50.setEditable(false);
		frame.add(textArea50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea51 = new JTextArea(list.get(1));
		textArea51.setBounds(425, 295, 100, 20);
		textArea51.setEditable(false);
		frame.add(textArea51);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea52 = new JTextArea(list.get(2));
		textArea52.setBounds(425, 495, 100, 20);
		textArea52.setEditable(false);
		frame.add(textArea52);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea53 = new JTextArea(list.get(3));
		textArea53.setBounds(425, 695, 100, 20);
		textArea53.setEditable(false);
		frame.add(textArea53);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// round four (4 teams) right side
		JTextArea textArea54 = new JTextArea(list.get(4));
		textArea54.setBounds(987, 95, 100, 20);
		textArea54.setEditable(false);
		frame.add(textArea54);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea55 = new JTextArea(list.get(5));
		textArea55.setBounds(987, 295, 100, 20);
		textArea55.setEditable(false);
		frame.add(textArea55);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea56 = new JTextArea(list.get(6));
		textArea56.setBounds(987, 495, 100, 20);
		textArea56.setEditable(false);
		frame.add(textArea56);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea57 = new JTextArea(list.get(7));
		textArea57.setBounds(987, 695, 100, 20);
		textArea57.setEditable(false);
		frame.add(textArea57);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	/*******************************************************************************
	 * 
	 * [5]... passes updated ArrayList of teams outputs and displays round five
	 *        teams.
	 * 
	 *******************************************************************************/
	public void displayRoundFive(ArrayList<String> list) {
		// round five (2 teams) left side
		JTextArea textArea58 = new JTextArea(list.get(0));
		textArea58.setBounds(565, 210, 100, 20);
		textArea58.setEditable(false);
		frame.add(textArea58);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea59 = new JTextArea(list.get(1));
		textArea59.setBounds(565, 590, 100, 20);
		textArea59.setEditable(false);
		frame.add(textArea59);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// round five (2 teams) right side
		JTextArea textArea60 = new JTextArea(list.get(2));
		textArea60.setBounds(845, 210, 100, 20);
		textArea60.setEditable(false);
		frame.add(textArea60);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JTextArea textArea61 = new JTextArea(list.get(3));
		textArea61.setBounds(845, 590, 100, 20);
		textArea61.setEditable(false);
		frame.add(textArea61);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	/*******************************************************************************
	 * 
	 * [6]... passes updated ArrayList of teams outputs and displays national
	 *        championship
	 * 
	 *******************************************************************************/
	public void displayChampionship(ArrayList<String> list) {

		// championship team left
		JTextArea textArea62 = new JTextArea(list.get(0));
		textArea62.setBounds(705, 493, 100, 20);
		textArea62.setEditable(false);
		frame.add(textArea62);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// championship team right
		JTextArea textArea63 = new JTextArea(list.get(1));
		textArea63.setBounds(705, 253, 100, 20);
		textArea63.setEditable(false);
		frame.add(textArea63);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	/*******************************************************************************
	 * 
	 * [7]... passes updated ArrayList of teams outputs and displays winner!
	 * 
	 *******************************************************************************/
	public void displayWinner(ArrayList<String> list) {
		JTextArea textArea64 = new JTextArea(" " + list.get(0));
		textArea64.setBounds(705, 373, 100, 40);
		textArea64.setEditable(false);
		frame.add(textArea64);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

	}

	/*******************************************************************************
	 * 
	 * [8]... Adds shuffle button
	 * 
	 *******************************************************************************/
	public void addShuffleButton() {
		JButton shuffle = new JButton("Shuffle");
		shuffle.setBounds(705, 800, 100, 40);
		this.shuffle = shuffle;
		shuffle.addActionListener(new ShuffleListener());
		frame.add(shuffle);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	/***********************************************************************
	 * 
	 * [9]... Adds simulate button
	 * 
	 ***********************************************************************/
	public void addSimulateButton() {
		JButton simulate = new JButton("Simulate");
		simulate.setBounds(705, 700, 100, 40);
		this.simulate = simulate;
		simulate.addActionListener(new ButtonListener());
		frame.add(simulate);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);


	}

	/*******************************************************************************
	 * 
	 * [10]... this method prints a bunch of cool lines for the GUI
	 * 
	 *******************************************************************************/

	public void cosmetic() {

		JLabel label1 = new JLabel("---");
		label1.setBounds(100, 0, 50, 20);
		frame.add(label1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label2 = new JLabel("---");
		label2.setBounds(100, 25, 50, 20);
		frame.add(label2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label3 = new JLabel("---");
		label3.setBounds(100, 50, 50, 20);
		frame.add(label3);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label4 = new JLabel("---");
		label4.setBounds(100, 75, 50, 20);
		frame.add(label4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label5 = new JLabel("---");
		label5.setBounds(100, 100, 50, 20);
		frame.add(label5);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label6 = new JLabel("---");
		label6.setBounds(100, 125, 50, 20);
		frame.add(label6);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label7 = new JLabel("---");
		label7.setBounds(100, 150, 50, 20);
		frame.add(label7);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label8 = new JLabel("---");
		label8.setBounds(100, 175, 50, 20);
		frame.add(label8);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label9 = new JLabel("---");
		label9.setBounds(100, 200, 50, 20);
		frame.add(label9);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label10 = new JLabel("---");
		label10.setBounds(100, 225, 50, 20);
		frame.add(label10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label11 = new JLabel("---");
		label11.setBounds(100, 250, 50, 20);
		frame.add(label11);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label12 = new JLabel("---");
		label12.setBounds(100, 275, 50, 20);
		frame.add(label12);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label13 = new JLabel("---");
		label13.setBounds(100, 300, 50, 20);
		frame.add(label13);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label14 = new JLabel("---");
		label14.setBounds(100, 325, 50, 20);
		frame.add(label14);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label15 = new JLabel("---");
		label15.setBounds(100, 350, 50, 20);
		frame.add(label15);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label16 = new JLabel("---");
		label16.setBounds(100, 375, 50, 20);
		frame.add(label16);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label17 = new JLabel("---");
		label17.setBounds(100, 400, 50, 20);
		frame.add(label17);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label18 = new JLabel("---");
		label18.setBounds(100, 425, 50, 20);
		frame.add(label18);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label19 = new JLabel("---");
		label19.setBounds(100, 450, 50, 20);
		frame.add(label19);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label20 = new JLabel("---");
		label20.setBounds(100, 475, 50, 20);
		frame.add(label20);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label21 = new JLabel("---");
		label21.setBounds(100, 500, 50, 20);
		frame.add(label21);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label22 = new JLabel("---");
		label22.setBounds(100, 525, 50, 20);
		frame.add(label22);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label23 = new JLabel("---");
		label23.setBounds(100, 550, 50, 20);
		frame.add(label23);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label24 = new JLabel("---");
		label24.setBounds(100, 575, 50, 20);
		frame.add(label24);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label25 = new JLabel("---");
		label25.setBounds(100, 600, 50, 20);
		frame.add(label25);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label26 = new JLabel("---");
		label26.setBounds(100, 625, 50, 20);
		frame.add(label26);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label27 = new JLabel("---");
		label27.setBounds(100, 650, 50, 20);
		frame.add(label27);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label28 = new JLabel("---");
		label28.setBounds(100, 675, 50, 20);
		frame.add(label28);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label29 = new JLabel("---");
		label29.setBounds(100, 700, 50, 20);
		frame.add(label29);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label30 = new JLabel("---");
		label30.setBounds(100, 725, 50, 20);
		frame.add(label30);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label31 = new JLabel("---");
		label31.setBounds(100, 750, 50, 20);
		frame.add(label31);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label32 = new JLabel("---");
		label32.setBounds(100, 775, 50, 20);
		frame.add(label32);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label33 = new JLabel("---");
		label33.setBounds(1388, 0, 50, 20);
		frame.add(label33);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label34 = new JLabel("---");
		label34.setBounds(1388, 25, 50, 20);
		frame.add(label34);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label35 = new JLabel("---");
		label35.setBounds(1388, 50, 50, 20);
		frame.add(label35);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label36 = new JLabel("---");
		label36.setBounds(1388, 75, 50, 20);
		frame.add(label36);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label37 = new JLabel("---");
		label37.setBounds(1388, 100, 50, 20);
		frame.add(label37);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label38 = new JLabel("---");
		label38.setBounds(1388, 125, 50, 20);
		frame.add(label38);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label39 = new JLabel("---");
		label39.setBounds(1388, 150, 50, 20);
		frame.add(label39);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label40 = new JLabel("---");
		label40.setBounds(1388, 175, 50, 20);
		frame.add(label40);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label41 = new JLabel("---");
		label41.setBounds(1388, 200, 50, 20);
		frame.add(label41);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label42 = new JLabel("---");
		label42.setBounds(1388, 225, 50, 20);
		frame.add(label42);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label43 = new JLabel("---");
		label43.setBounds(1388, 250, 50, 20);
		frame.add(label43);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label44 = new JLabel("---");
		label44.setBounds(1388, 275, 50, 20);
		frame.add(label44);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label45 = new JLabel("---");
		label45.setBounds(1388, 300, 50, 20);
		frame.add(label45);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label46 = new JLabel("---");
		label46.setBounds(1388, 325, 50, 20);
		frame.add(label46);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label47 = new JLabel("---");
		label47.setBounds(1388, 350, 50, 20);
		frame.add(label47);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label48 = new JLabel("---");
		label48.setBounds(1388, 375, 50, 20);
		frame.add(label48);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label49 = new JLabel("---");
		label49.setBounds(1388, 400, 50, 20);
		frame.add(label49);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label50 = new JLabel("---");
		label50.setBounds(1388, 425, 50, 20);
		frame.add(label50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label51 = new JLabel("---");
		label51.setBounds(1388, 450, 50, 20);
		frame.add(label51);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label52 = new JLabel("---");
		label52.setBounds(1388, 475, 50, 20);
		frame.add(label52);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label53 = new JLabel("---");
		label53.setBounds(1388, 500, 50, 20);
		frame.add(label53);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label54 = new JLabel("---");
		label54.setBounds(1388, 525, 50, 20);
		frame.add(label54);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label55 = new JLabel("---");
		label55.setBounds(1388, 550, 50, 20);
		frame.add(label55);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label56 = new JLabel("---");
		label56.setBounds(1388, 575, 50, 20);
		frame.add(label56);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label57 = new JLabel("---");
		label57.setBounds(1388, 600, 50, 20);
		frame.add(label57);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label58 = new JLabel("---");
		label58.setBounds(1388, 625, 50, 20);
		frame.add(label58);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label59 = new JLabel("---");
		label59.setBounds(1388, 650, 50, 20);
		frame.add(label59);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label60 = new JLabel("---");
		label60.setBounds(1388, 675, 50, 20);
		frame.add(label60);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label61 = new JLabel("---");
		label61.setBounds(1388, 700, 50, 20);
		frame.add(label61);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label62 = new JLabel("---");
		label62.setBounds(1388, 725, 50, 20);
		frame.add(label62);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label63 = new JLabel("---");
		label63.setBounds(1388, 750, 50, 20);
		frame.add(label63);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label64 = new JLabel("---");
		label64.setBounds(1388, 775, 50, 20);
		frame.add(label64);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label65 = new JLabel("|--");
		label65.setBounds(122, 13, 100, 20);
		frame.add(label65);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label66 = new JLabel("|--");
		label66.setBounds(122, 63, 100, 20);
		frame.add(label66);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label67 = new JLabel("|--");
		label67.setBounds(122, 113, 100, 20);
		frame.add(label67);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label68 = new JLabel("|--");
		label68.setBounds(122, 163, 100, 20);
		frame.add(label68);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label69 = new JLabel("|--");
		label69.setBounds(122, 213, 100, 20);
		frame.add(label69);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label70 = new JLabel("|--");
		label70.setBounds(122, 263, 100, 20);
		frame.add(label70);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label71 = new JLabel("|--");
		label71.setBounds(122, 313, 100, 20);
		frame.add(label71);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label72 = new JLabel("|--");
		label72.setBounds(122, 363, 100, 20);
		frame.add(label72);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label73 = new JLabel("|--");
		label73.setBounds(122, 413, 100, 20);
		frame.add(label73);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label74 = new JLabel("|--");
		label74.setBounds(122, 463, 100, 20);
		frame.add(label74);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label75 = new JLabel("|--");
		label75.setBounds(122, 513, 100, 20);
		frame.add(label75);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label76 = new JLabel("|--");
		label76.setBounds(122, 563, 100, 20);
		frame.add(label76);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label77 = new JLabel("|--");
		label77.setBounds(122, 613, 100, 20);
		frame.add(label77);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label78 = new JLabel("|--");
		label78.setBounds(122, 663, 100, 20);
		frame.add(label78);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label79 = new JLabel("|--");
		label79.setBounds(122, 713, 100, 20);
		frame.add(label79);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label80 = new JLabel("|--");
		label80.setBounds(122, 763, 100, 20);
		frame.add(label80);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label81 = new JLabel("--|");
		label81.setBounds(1370, 13, 100, 20);
		frame.add(label81);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label82 = new JLabel("--|");
		label82.setBounds(1370, 63, 100, 20);
		frame.add(label82);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label83 = new JLabel("--|");
		label83.setBounds(1370, 113, 100, 20);
		frame.add(label83);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label84 = new JLabel("--|");
		label84.setBounds(1370, 163, 100, 20);
		frame.add(label84);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label85 = new JLabel("--|");
		label85.setBounds(1370, 213, 100, 20);
		frame.add(label85);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label86 = new JLabel("--|");
		label86.setBounds(1370, 263, 100, 20);
		frame.add(label86);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label87 = new JLabel("--|");
		label87.setBounds(1370, 313, 100, 20);
		frame.add(label87);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label88 = new JLabel("--|");
		label88.setBounds(1370, 363, 100, 20);
		frame.add(label88);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label89 = new JLabel("--|");
		label89.setBounds(1370, 413, 100, 20);
		frame.add(label89);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label90 = new JLabel("--|");
		label90.setBounds(1370, 463, 100, 20);
		frame.add(label90);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label91 = new JLabel("--|");
		label91.setBounds(1370, 513, 100, 20);
		frame.add(label91);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label92 = new JLabel("--|");
		label92.setBounds(1370, 563, 100, 20);
		frame.add(label92);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label93 = new JLabel("--|");
		label93.setBounds(1370, 613, 100, 20);
		frame.add(label93);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label94 = new JLabel("--|");
		label94.setBounds(1370, 663, 100, 20);
		frame.add(label94);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label95 = new JLabel("--|");
		label95.setBounds(1370, 713, 100, 20);
		frame.add(label95);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label96 = new JLabel("--|");
		label96.setBounds(1370, 763, 100, 20);
		frame.add(label96);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label97 = new JLabel("---");
		label97.setBounds(245, 13, 100, 20);
		frame.add(label97);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label98 = new JLabel("---");
		label98.setBounds(245, 63, 100, 20);
		frame.add(label98);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label99 = new JLabel("---");
		label99.setBounds(245, 113, 100, 20);
		frame.add(label99);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label100 = new JLabel("---");
		label100.setBounds(245, 163, 100, 20);
		frame.add(label100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label101 = new JLabel("---");
		label101.setBounds(245, 213, 100, 20);
		frame.add(label101);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label102 = new JLabel("---");
		label102.setBounds(245, 263, 100, 20);
		frame.add(label102);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label103 = new JLabel("---");
		label103.setBounds(245, 313, 100, 20);
		frame.add(label103);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label104 = new JLabel("---");
		label104.setBounds(245, 363, 100, 20);
		frame.add(label104);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label05 = new JLabel("---");
		label05.setBounds(245, 413, 100, 20);
		frame.add(label05);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label106 = new JLabel("---");
		label106.setBounds(245, 463, 100, 20);
		frame.add(label106);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label107 = new JLabel("---");
		label107.setBounds(245, 513, 100, 20);
		frame.add(label107);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label108 = new JLabel("---");
		label108.setBounds(245, 563, 100, 20);
		frame.add(label108);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label109 = new JLabel("---");
		label109.setBounds(245, 613, 100, 20);
		frame.add(label109);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label110 = new JLabel("---");
		label110.setBounds(245, 663, 100, 20);
		frame.add(label110);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label111 = new JLabel("---");
		label111.setBounds(245, 713, 100, 20);
		frame.add(label111);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label112 = new JLabel("---");
		label112.setBounds(245, 763, 100, 20);
		frame.add(label112);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label113 = new JLabel("---");
		label113.setBounds(1245, 13, 100, 20);
		frame.add(label113);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label114 = new JLabel("---");
		label114.setBounds(1245, 63, 100, 20);
		frame.add(label114);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label115 = new JLabel("---");
		label115.setBounds(1245, 113, 100, 20);
		frame.add(label115);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label116 = new JLabel("---");
		label116.setBounds(1245, 163, 100, 20);
		frame.add(label116);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label117 = new JLabel("---");
		label117.setBounds(1245, 213, 100, 20);
		frame.add(label117);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label118 = new JLabel("---");
		label118.setBounds(1245, 263, 100, 20);
		frame.add(label118);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label119 = new JLabel("---");
		label119.setBounds(1245, 313, 100, 20);
		frame.add(label119);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label120 = new JLabel("---");
		label120.setBounds(1245, 363, 100, 20);
		frame.add(label120);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label121 = new JLabel("---");
		label121.setBounds(1245, 413, 100, 20);
		frame.add(label121);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label122 = new JLabel("---");
		label122.setBounds(1245, 463, 100, 20);
		frame.add(label122);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label123 = new JLabel("---");
		label123.setBounds(1245, 513, 100, 20);
		frame.add(label123);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label124 = new JLabel("---");
		label124.setBounds(1245, 563, 100, 20);
		frame.add(label124);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label125 = new JLabel("---");
		label125.setBounds(1245, 613, 100, 20);
		frame.add(label125);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label126 = new JLabel("---");
		label126.setBounds(1245, 663, 100, 20);
		frame.add(label126);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label127 = new JLabel("---");
		label127.setBounds(1245, 713, 100, 20);
		frame.add(label127);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label128 = new JLabel("---");
		label128.setBounds(1245, 763, 100, 20);
		frame.add(label128);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label129 = new JLabel("|");
		label129.setBounds(265, 20, 100, 20);
		frame.add(label129);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label130 = new JLabel("|--");
		label130.setBounds(265, 40, 100, 20);
		frame.add(label130);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label131 = new JLabel("|");
		label131.setBounds(265, 57, 100, 20);
		frame.add(label131);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label132 = new JLabel("|");
		label132.setBounds(265, 120, 100, 20);
		frame.add(label132);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label133 = new JLabel("|--");
		label133.setBounds(265, 140, 100, 20);
		frame.add(label133);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label134 = new JLabel("|");
		label134.setBounds(265, 157, 100, 20);
		frame.add(label134);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label135 = new JLabel("|");
		label135.setBounds(265, 220, 100, 20);
		frame.add(label135);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label136 = new JLabel("|--");
		label136.setBounds(265, 240, 100, 20);
		frame.add(label136);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label137 = new JLabel("|");
		label137.setBounds(265, 257, 100, 20);
		frame.add(label137);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label138 = new JLabel("|");
		label138.setBounds(265, 357, 100, 20);
		frame.add(label138);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label139 = new JLabel("|--");
		label139.setBounds(265, 340, 100, 20);
		frame.add(label139);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label140 = new JLabel("|");
		label140.setBounds(265, 357, 100, 20);
		frame.add(label140);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label141 = new JLabel("|");
		label141.setBounds(265, 420, 100, 20);
		frame.add(label141);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label142 = new JLabel("|--");
		label142.setBounds(265, 440, 100, 20);
		frame.add(label142);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label143 = new JLabel("|");
		label143.setBounds(265, 457, 100, 20);
		frame.add(label143);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label144 = new JLabel("|");
		label144.setBounds(265, 320, 100, 20);
		frame.add(label144);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label145 = new JLabel("|");
		label145.setBounds(265, 520, 100, 20);
		frame.add(label145);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label146 = new JLabel("|--");
		label146.setBounds(265, 540, 100, 20);
		frame.add(label146);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label147 = new JLabel("|");
		label147.setBounds(265, 557, 100, 20);
		frame.add(label147);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label148 = new JLabel("|");
		label148.setBounds(265, 620, 100, 20);
		frame.add(label148);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label149 = new JLabel("|--");
		label149.setBounds(265, 640, 100, 20);
		frame.add(label149);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label150 = new JLabel("|");
		label150.setBounds(265, 657, 100, 20);
		frame.add(label150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label151 = new JLabel("|");
		label151.setBounds(265, 720, 100, 20);
		frame.add(label151);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label152 = new JLabel("|--");
		label152.setBounds(265, 740, 100, 20);
		frame.add(label152);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label153 = new JLabel("|");
		label153.setBounds(265, 757, 100, 20);
		frame.add(label153);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		// fix this

		JLabel label154 = new JLabel("|");
		label154.setBounds(1244, 20, 100, 20);
		frame.add(label154);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label155 = new JLabel("--|");
		label155.setBounds(1228, 40, 100, 20);
		frame.add(label155);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label156 = new JLabel("|");
		label156.setBounds(1244, 57, 100, 20);
		frame.add(label156);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label157 = new JLabel("|");
		label157.setBounds(1244, 120, 100, 20);
		frame.add(label157);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label158 = new JLabel("--|");
		label158.setBounds(1228, 140, 100, 20);
		frame.add(label158);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label159 = new JLabel("|");
		label159.setBounds(1244, 157, 100, 20);
		frame.add(label159);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label160 = new JLabel("|");
		label160.setBounds(1244, 220, 100, 20);
		frame.add(label160);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label161 = new JLabel("--|");
		label161.setBounds(1228, 240, 100, 20);
		frame.add(label161);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label162 = new JLabel("|");
		label162.setBounds(1244, 257, 100, 20);
		frame.add(label162);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label163 = new JLabel("|");
		label163.setBounds(1244, 357, 100, 20);
		frame.add(label163);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label164 = new JLabel("--|");
		label164.setBounds(1228, 340, 100, 20);
		frame.add(label164);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label165 = new JLabel("|");
		label165.setBounds(1244, 357, 100, 20);
		frame.add(label165);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label166 = new JLabel("|");
		label166.setBounds(1244, 420, 100, 20);
		frame.add(label166);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label167 = new JLabel("--|");
		label167.setBounds(1228, 440, 100, 20);
		frame.add(label167);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label168 = new JLabel("|");
		label168.setBounds(1244, 457, 100, 20);
		frame.add(label168);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label169 = new JLabel("|");
		label169.setBounds(1244, 320, 100, 20);
		frame.add(label169);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label170 = new JLabel("|");
		label170.setBounds(1244, 520, 100, 20);
		frame.add(label170);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label171 = new JLabel("--|");
		label171.setBounds(1228, 540, 100, 20);
		frame.add(label171);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label172 = new JLabel("|");
		label172.setBounds(1244, 557, 100, 20);
		frame.add(label172);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label173 = new JLabel("|");
		label173.setBounds(1244, 620, 100, 20);
		frame.add(label173);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label174 = new JLabel("--|");
		label174.setBounds(1228, 640, 100, 20);
		frame.add(label174);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label175 = new JLabel("|");
		label175.setBounds(1244, 657, 100, 20);
		frame.add(label175);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label176 = new JLabel("|");
		label176.setBounds(1244, 720, 100, 20);
		frame.add(label176);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label177 = new JLabel("--|");
		label177.setBounds(1228, 740, 100, 20);
		frame.add(label177);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label178 = new JLabel("|");
		label178.setBounds(1244, 757, 100, 20);
		frame.add(label178);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label179 = new JLabel("---");
		label179.setBounds(385, 40, 100, 20);
		frame.add(label179);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label180 = new JLabel("---");
		label180.setBounds(385, 140, 100, 20);
		frame.add(label180);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label181 = new JLabel("---");
		label181.setBounds(385, 240, 100, 20);
		frame.add(label181);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label182 = new JLabel("---");
		label182.setBounds(385, 340, 100, 20);
		frame.add(label182);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label183 = new JLabel("---");
		label183.setBounds(385, 440, 100, 20);
		frame.add(label183);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label184 = new JLabel("---");
		label184.setBounds(385, 540, 100, 20);
		frame.add(label184);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label185 = new JLabel("---");
		label185.setBounds(385, 640, 100, 20);
		frame.add(label185);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label186 = new JLabel("---");
		label186.setBounds(385, 740, 100, 20);
		frame.add(label186);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label187 = new JLabel("|");
		label187.setBounds(405, 55, 100, 20);
		frame.add(label187);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label188 = new JLabel("|");
		label188.setBounds(405, 75, 100, 20);
		frame.add(label188);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label189 = new JLabel("|--");
		label189.setBounds(405, 95, 100, 20);
		frame.add(label189);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label190 = new JLabel("|");
		label190.setBounds(405, 115, 100, 20);
		frame.add(label190);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label191 = new JLabel("|");
		label191.setBounds(405, 133, 100, 20);
		frame.add(label191);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label192 = new JLabel("|");
		label192.setBounds(405, 255, 100, 20);
		frame.add(label192);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label193 = new JLabel("|");
		label193.setBounds(405, 275, 100, 20);
		frame.add(label193);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label194 = new JLabel("|--");
		label194.setBounds(405, 295, 100, 20);
		frame.add(label194);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label195 = new JLabel("|");
		label195.setBounds(405, 315, 100, 20);
		frame.add(label195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label196 = new JLabel("|");
		label196.setBounds(405, 333, 100, 20);
		frame.add(label196);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label197 = new JLabel("|");
		label197.setBounds(405, 455, 100, 20);
		frame.add(label197);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label198 = new JLabel("|");
		label198.setBounds(405, 475, 100, 20);
		frame.add(label198);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label199 = new JLabel("|--");
		label199.setBounds(405, 495, 100, 20);
		frame.add(label199);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label200 = new JLabel("|");
		label200.setBounds(405, 515, 100, 20);
		frame.add(label200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label201 = new JLabel("|");
		label201.setBounds(405, 533, 100, 20);
		frame.add(label201);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label202 = new JLabel("|");
		label202.setBounds(405, 655, 100, 20);
		frame.add(label202);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label203 = new JLabel("|");
		label203.setBounds(405, 675, 100, 20);
		frame.add(label203);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label204 = new JLabel("|--");
		label204.setBounds(405, 695, 100, 20);
		frame.add(label204);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label205 = new JLabel("|");
		label205.setBounds(405, 715, 100, 20);
		frame.add(label205);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label206 = new JLabel("|");
		label206.setBounds(405, 733, 100, 20);
		frame.add(label206);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label207 = new JLabel("---");
		label207.setBounds(1103, 40, 100, 20);
		frame.add(label207);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label208 = new JLabel("---");
		label208.setBounds(1103, 140, 100, 20);
		frame.add(label208);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label209 = new JLabel("---");
		label209.setBounds(1103, 240, 100, 20);
		frame.add(label209);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label210 = new JLabel("---");
		label210.setBounds(1103, 340, 100, 20);
		frame.add(label210);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label211 = new JLabel("---");
		label211.setBounds(1103, 440, 100, 20);
		frame.add(label211);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label212 = new JLabel("---");
		label212.setBounds(1103, 540, 100, 20);
		frame.add(label212);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label213 = new JLabel("---");
		label213.setBounds(1103, 640, 100, 20);
		frame.add(label213);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label214 = new JLabel("---");
		label214.setBounds(1103, 740, 100, 20);
		frame.add(label214);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label215 = new JLabel("|");
		label215.setBounds(1103, 55, 100, 20);
		frame.add(label215);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label216 = new JLabel("|");
		label216.setBounds(1103, 75, 100, 20);
		frame.add(label216);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label217 = new JLabel("--|");
		label217.setBounds(1087, 95, 100, 20);
		frame.add(label217);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label218 = new JLabel("|");
		label218.setBounds(1103, 115, 100, 20);
		frame.add(label218);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label219 = new JLabel("|");
		label219.setBounds(1103, 133, 100, 20);
		frame.add(label219);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label220 = new JLabel("|");
		label220.setBounds(1103, 255, 100, 20);
		frame.add(label220);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label221 = new JLabel("|");
		label221.setBounds(1103, 275, 100, 20);
		frame.add(label221);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label222 = new JLabel("--|");
		label222.setBounds(1087, 295, 100, 20);
		frame.add(label222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label223 = new JLabel("|");
		label223.setBounds(1103, 315, 100, 20);
		frame.add(label223);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label224 = new JLabel("|");
		label224.setBounds(1103, 333, 100, 20);
		frame.add(label224);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label225 = new JLabel("|");
		label225.setBounds(1103, 455, 100, 20);
		frame.add(label225);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label226 = new JLabel("|");
		label226.setBounds(1103, 475, 100, 20);
		frame.add(label226);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label227 = new JLabel("--|");
		label227.setBounds(1087, 495, 100, 20);
		frame.add(label227);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label228 = new JLabel("|");
		label228.setBounds(1103, 515, 100, 20);
		frame.add(label228);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label229 = new JLabel("|");
		label229.setBounds(1103, 533, 100, 20);
		frame.add(label229);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label230 = new JLabel("|");
		label230.setBounds(1103, 655, 100, 20);
		frame.add(label230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label231 = new JLabel("|");
		label231.setBounds(1103, 675, 100, 20);
		frame.add(label231);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label232 = new JLabel("--|");
		label232.setBounds(1087, 695, 100, 20);
		frame.add(label232);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label233 = new JLabel("|");
		label233.setBounds(1103, 715, 100, 20);
		frame.add(label233);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label234 = new JLabel("|");
		label234.setBounds(1103, 733, 100, 20);
		frame.add(label234);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label235 = new JLabel("---");
		label235.setBounds(525, 95, 100, 20);
		frame.add(label235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label236 = new JLabel("---");
		label236.setBounds(525, 295, 100, 20);
		frame.add(label236);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label237 = new JLabel("---");
		label237.setBounds(525, 495, 100, 20);
		frame.add(label237);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label238 = new JLabel("---");
		label238.setBounds(525, 695, 100, 20);
		frame.add(label238);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label239 = new JLabel("|");
		label239.setBounds(545, 110, 100, 20);
		frame.add(label239);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label240 = new JLabel("|");
		label240.setBounds(545, 130, 100, 20);
		frame.add(label240);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label241 = new JLabel("|");
		label241.setBounds(545, 150, 100, 20);
		frame.add(label241);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label242 = new JLabel("|");
		label242.setBounds(545, 170, 100, 20);
		frame.add(label242);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label243 = new JLabel("|");
		label243.setBounds(545, 190, 100, 20);
		frame.add(label243);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label244 = new JLabel("|--");
		label244.setBounds(545, 210, 100, 20);
		frame.add(label244);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label245 = new JLabel("|");
		label245.setBounds(545, 230, 100, 20);
		frame.add(label245);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label246 = new JLabel("|");
		label246.setBounds(545, 250, 100, 20);
		frame.add(label246);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label247 = new JLabel("|");
		label247.setBounds(545, 270, 100, 20);
		frame.add(label247);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label248 = new JLabel("|");
		label248.setBounds(545, 290, 100, 20);
		frame.add(label248);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label249 = new JLabel("|");
		label249.setBounds(545, 510, 100, 20);
		frame.add(label249);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label250 = new JLabel("|");
		label250.setBounds(545, 530, 100, 20);
		frame.add(label250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label251 = new JLabel("|");
		label251.setBounds(545, 550, 100, 20);
		frame.add(label251);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label252 = new JLabel("|");
		label252.setBounds(545, 570, 100, 20);
		frame.add(label252);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label253 = new JLabel("|--");
		label253.setBounds(545, 590, 100, 20);
		frame.add(label253);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label254 = new JLabel("|");
		label254.setBounds(545, 610, 100, 20);
		frame.add(label254);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label255 = new JLabel("|");
		label255.setBounds(545, 630, 100, 20);
		frame.add(label255);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label256 = new JLabel("|");
		label256.setBounds(545, 650, 100, 20);
		frame.add(label256);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label257 = new JLabel("|");
		label257.setBounds(545, 670, 100, 20);
		frame.add(label257);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label258 = new JLabel("|");
		label258.setBounds(545, 690, 100, 20);
		frame.add(label258);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label259 = new JLabel("---");
		label259.setBounds(963, 95, 100, 20);
		frame.add(label259);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label260 = new JLabel("---");
		label260.setBounds(963, 295, 100, 20);
		frame.add(label260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label261 = new JLabel("---");
		label261.setBounds(963, 495, 100, 20);
		frame.add(label261);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label262 = new JLabel("---");
		label262.setBounds(963, 695, 100, 20);
		frame.add(label262);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label263 = new JLabel("|");
		label263.setBounds(963, 110, 100, 20);
		frame.add(label263);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label264 = new JLabel("|");
		label264.setBounds(963, 130, 100, 20);
		frame.add(label264);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label265 = new JLabel("|");
		label265.setBounds(963, 150, 100, 20);
		frame.add(label265);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label266 = new JLabel("|");
		label266.setBounds(963, 170, 100, 20);
		frame.add(label266);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label267 = new JLabel("|");
		label267.setBounds(963, 190, 100, 20);
		frame.add(label267);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label268 = new JLabel("--|");
		label268.setBounds(947, 210, 100, 20);
		frame.add(label268);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label269 = new JLabel("|");
		label269.setBounds(963, 230, 100, 20);
		frame.add(label269);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label270 = new JLabel("|");
		label270.setBounds(963, 250, 100, 20);
		frame.add(label270);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label271 = new JLabel("|");
		label271.setBounds(963, 270, 100, 20);
		frame.add(label271);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label272 = new JLabel("|");
		label272.setBounds(963, 290, 100, 20);
		frame.add(label272);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label273 = new JLabel("|");
		label273.setBounds(963, 510, 100, 20);
		frame.add(label273);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label274 = new JLabel("|");
		label274.setBounds(963, 530, 100, 20);
		frame.add(label274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label275 = new JLabel("|");
		label275.setBounds(963, 550, 100, 20);
		frame.add(label275);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label276 = new JLabel("|");
		label276.setBounds(963, 570, 100, 20);
		frame.add(label276);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label277 = new JLabel("--|");
		label277.setBounds(947, 590, 100, 20);
		frame.add(label277);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label278 = new JLabel("|");
		label278.setBounds(963, 610, 100, 20);
		frame.add(label278);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label279 = new JLabel("|");
		label279.setBounds(963, 630, 100, 20);
		frame.add(label279);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label280 = new JLabel("|");
		label280.setBounds(963, 650, 100, 20);
		frame.add(label280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label281 = new JLabel("|");
		label281.setBounds(963, 670, 100, 20);
		frame.add(label281);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label282 = new JLabel("|");
		label282.setBounds(963, 690, 100, 20);
		frame.add(label282);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label283 = new JLabel("---");
		label283.setBounds(665, 208, 100, 20);
		frame.add(label283);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label284 = new JLabel("|");
		label284.setBounds(687, 233, 100, 20);
		frame.add(label284);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label284a = new JLabel("|");
		label284a.setBounds(687, 213, 100, 20);
		frame.add(label284a);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label285 = new JLabel("|");
		label285.setBounds(687, 253, 100, 20);
		frame.add(label285);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label286 = new JLabel("|");
		label286.setBounds(687, 273, 100, 20);
		frame.add(label286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label287 = new JLabel("|");
		label287.setBounds(687, 293, 100, 20);
		frame.add(label287);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label288 = new JLabel("|");
		label288.setBounds(687, 313, 100, 20);
		frame.add(label288);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label289 = new JLabel("|");
		label289.setBounds(687, 333, 100, 20);
		frame.add(label289);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label290 = new JLabel("|");
		label290.setBounds(687, 353, 100, 20);
		frame.add(label290);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label291 = new JLabel("|");
		label291.setBounds(687, 373, 100, 20);
		frame.add(label291);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label292 = new JLabel("|");
		label292.setBounds(687, 393, 100, 20);
		frame.add(label292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label294 = new JLabel("|");
		label294.setBounds(687, 412, 100, 20);
		frame.add(label294);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label295 = new JLabel("|");
		label295.setBounds(687, 432, 100, 20);
		frame.add(label295);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label296 = new JLabel("|");
		label296.setBounds(687, 452, 100, 20);
		frame.add(label296);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label297 = new JLabel("|");
		label297.setBounds(687, 472, 100, 20);
		frame.add(label297);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label298 = new JLabel("|--");
		label298.setBounds(687, 492, 100, 20);
		frame.add(label298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label299 = new JLabel("|");
		label299.setBounds(687, 512, 100, 20);
		frame.add(label299);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label300 = new JLabel("|");
		label300.setBounds(687, 532, 100, 20);
		frame.add(label300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label301 = new JLabel("|");
		label301.setBounds(687, 552, 100, 20);
		frame.add(label301);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label302 = new JLabel("|");
		label302.setBounds(687, 572, 100, 20);
		frame.add(label302);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label303 = new JLabel("---");
		label303.setBounds(668, 587, 100, 20);
		frame.add(label303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label304 = new JLabel("|");
		label304.setBounds(820, 213, 100, 20);
		frame.add(label304);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label305 = new JLabel("---");
		label305.setBounds(822, 208, 100, 20);
		frame.add(label305);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label306 = new JLabel("|");
		label306.setBounds(820, 233, 100, 20);
		frame.add(label306);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label306a = new JLabel("|");
		label306a.setBounds(820, 213, 100, 20);
		frame.add(label306a);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label3067 = new JLabel("--|");
		label3067.setBounds(804, 253, 100, 20);
		frame.add(label3067);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label308 = new JLabel("|");
		label308.setBounds(820, 273, 100, 20);
		frame.add(label308);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label309 = new JLabel("|");
		label309.setBounds(820, 293, 100, 20);
		frame.add(label309);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label310 = new JLabel("|");
		label310.setBounds(820, 313, 100, 20);
		frame.add(label310);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label311 = new JLabel("|");
		label311.setBounds(820, 333, 100, 20);
		frame.add(label311);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label312 = new JLabel("|");
		label312.setBounds(820, 353, 100, 20);
		frame.add(label312);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label313 = new JLabel("|");
		label313.setBounds(820, 373, 100, 20);
		frame.add(label313);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label314 = new JLabel("|");
		label314.setBounds(820, 393, 100, 20);
		frame.add(label314);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label315 = new JLabel("|");
		label315.setBounds(820, 412, 100, 20);
		frame.add(label315);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label316 = new JLabel("|");
		label316.setBounds(820, 432, 100, 20);
		frame.add(label316);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label317 = new JLabel("|");
		label317.setBounds(820, 452, 100, 20);
		frame.add(label317);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label318 = new JLabel("|");
		label318.setBounds(820, 472, 100, 20);
		frame.add(label318);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label319 = new JLabel("|");
		label319.setBounds(820, 492, 100, 20);
		frame.add(label319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label320 = new JLabel("|");
		label320.setBounds(820, 512, 100, 20);
		frame.add(label320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label321 = new JLabel("|");
		label321.setBounds(820, 532, 100, 20);
		frame.add(label321);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label322 = new JLabel("|");
		label322.setBounds(820, 552, 100, 20);
		frame.add(label322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label323 = new JLabel("|");
		label323.setBounds(820, 572, 100, 20);
		frame.add(label323);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label324 = new JLabel("---");
		label324.setBounds(820, 587, 100, 20);
		frame.add(label324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);

		JLabel label325 = new JLabel("    Champion");
		label325.setBounds(705, 353, 100, 20);
		frame.add(label325);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public void addNewTeam() {
		JFrame newTeamWindow = new JFrame();
		frame2 = new JFrame("New Team");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame2.setPreferredSize(new Dimension(400, 400));
		frame2.setVisible(true);
		this.frame2 = frame2;

		JLabel label1 = new JLabel("Team Name: ");
		JLabel label2 = new JLabel("Wins: ");
		JLabel label3 = new JLabel("Losses: ");

		JTextField nameField = new JTextField();
		JTextField winField = new JTextField();
		JTextField lossField = new JTextField();

		JButton submit = new JButton("Submit");
		JButton cancel = new JButton("Cancel");

		//submit.addActionListener(this);
		//cancel.addActionListener(this);

		this.nameField = nameField;
		this.winField = winField;
		this.lossField = lossField;
		this.submit = submit;
		this.cancel = cancel;
		GridLayout layout = new GridLayout(0, 2);

		frame2.setLayout(layout);
		frame2.add(label1);
		frame2.add(nameField);
		frame2.add(label2);
		frame2.add(winField);
		frame2.add(label3);
		frame2.add(lossField);
		frame2.add(submit);
		frame2.add(cancel);
	}


	public void Display(ArrayList<String> a, int round) {
		if(round ==1){
			displayRoundOne(a);
		}
		if (round == 2) {
			displayRoundTwo(a);
		}
		else if(round==3){displayRoundThree(a);}
		else if (round==4) {displayRoundFour(a);}
		else if (round==5) {displayRoundFive(a);}
		else if(round==6){displayChampionship(a);}
		else{displayWinner(a);
		}
	}
	public static void main(String[] args){
		String filename = "teams.txt";
		Simulator s = new Simulator();
		Bracket b = new Bracket(filename);
		Interface i = new Interface();

		JFrame frame = new JFrame();
		frame = new JFrame("March Madness");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		//frame.setSize(screenSize.width, screenSize.height);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		i.addSimulateButton();
		frame.setVisible(true);
		//this.frame = frame;

		b.addTeams();
		ArrayList<String> teamString=b.output();
		i.cosmetic();
		i.addSimulateButton();
		i.addShuffleButton();
		i.displayRoundOne(teamString);
	}
}
