import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class Interface {
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

	public Interface() {
		JFrame frame = new JFrame();
		frame = new JFrame("March Madness");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(screenSize.width, screenSize.height);
		frame.setVisible(true);
		this.frame = frame;
	}

	public void displayRoundOne(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int x = (i < 32) ? 0 : 1410;  // Hardcoded column positions
			int y = (i % 32) * 25;        // Hardcoded row spacing
	
			JTextField teamField = new JTextField(list.get(i));
			teamField.setBounds(x, y, 100, 20);
			teamField.setEditable(false);
			frame.add(teamField);
		}
	}

	public void displayRoundTwo(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int x = (i < 16) ? 144 : 1268;  // Hardcoded left and right column positions
			int y = 13 + (i % 16) * 50;     // Hardcoded row spacing
	
			JTextArea textArea = new JTextArea(list.get(i));
			textArea.setBounds(x, y, 100, 20);
			textArea.setEditable(false);
			frame.add(textArea);
		}
	}
	
	public void displayRoundThree(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int x = (i < 8) ? 285 : 1127;  // Hardcoded startXLeft and startXRight
			int y = 40 + (i % 8) * 100;   // Hardcoded startY, teamsPerColumn, and gapY
	
			JTextArea textArea = new JTextArea(list.get(i));
			textArea.setBounds(x, y, 100, 20);
			textArea.setEditable(false);
			frame.add(textArea);
		}
	}
	
	public void displayRoundFour(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int x = (i < 4) ? 425 : 987;
			int y = 95 + (i % 4) * 200;

			JTextArea textArea = new JTextArea(list.get(i));
			textArea.setBounds(x, y, 100, 20);
			textArea.setEditable(false);
			frame.add(textArea);
		}
	}

	public void displayRoundFive(ArrayList<String> list) {
		int[] startX = { 565, 845 };
		int[] startY = { 210, 590 };

		for (int i = 0; i < list.size(); i++) {
			int column = i / 2;
			int row = i % 2;

			JTextArea textArea = new JTextArea(list.get(i));
			textArea.setBounds(startX[column], startY[row], 100, 20);
			textArea.setEditable(false);
			frame.add(textArea);
		}
	}

	public void displayChampionship(ArrayList<String> list) {
		int[] startY = { 493, 253 };

		for (int i = 0; i < list.size(); i++) {
			JTextArea textArea = new JTextArea(list.get(i));
			textArea.setBounds(705, startY[i], 100, 20);
			textArea.setEditable(false);
			frame.add(textArea);
		}
	}

	public void displayWinner(ArrayList<String> list) {
		if (!list.isEmpty()) { // Ensure list has a winner
			JTextArea textArea = new JTextArea(" " + list.get(0));
			textArea.setBounds(705, 373, 100, 40);
			textArea.setEditable(false);
			frame.add(textArea);
		}
	}

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

	public void addSideBracketLines(int startX, int startY, int gapY, int width, int height, int totalLabels,
			String labelText) {
		for (int i = 0; i < totalLabels; i++) {
			JLabel label = new JLabel(labelText);
			label.setBounds(startX, startY + (i * gapY), width, height);
			frame.add(label);
		}
	}

	public void addSideBracketLines(int startX, int[] yPositions, int width, int height, String[] labels) {
		for (int i = 0; i < yPositions.length; i++) {
			JLabel label = new JLabel(labels[i]);
			label.setBounds(startX, yPositions[i], width, height);
			frame.add(label);
		}
	}

	public void addSideBracketLines(int startX, int[] yPositions, int width, int height, String[] labels, int altX) {
		for (int i = 0; i < yPositions.length; i++) {
			int labelX = labels[i].equals("--|") ? altX : startX; // Shift "--|" labels left
			JLabel label = new JLabel(labels[i]);
			label.setBounds(labelX, yPositions[i], width, height);
			frame.add(label);
		}
	}

	// Wrapper function for Round 1 Advance to Round 2
	public void displayAdvanceRound2() {
		// Left Side Labels
		addSideBracketLines(100, 0, 25, 50, 20, 32, "--");

		// Right Side Labels
		addSideBracketLines(1388, 0, 25, 50, 20, 32, "--");

		// Left Side Bracket Lines
		addSideBracketLines(114, 13, 50, 100, 20, 16, "|--");

		// Right Side Bracket Lines
		addSideBracketLines(1370, 13, 50, 100, 20, 16, "--|");
	}

	public void displayAdvanceRound3() {
		// Middle Left Horizontal Bracket Lines
		addSideBracketLines(245, 13, 50, 100, 20, 16, "---");

		// Middle Right Horizontal Bracket Lines
		addSideBracketLines(1245, 13, 50, 100, 20, 16, "---");

		// Left Vertical Bracket Lines
		addSideBracketLines(265, new int[] { 20, 40, 57, 120, 140, 157, 220, 240, 257,
				320, 340, 357, 420, 440, 457, 520, 540,
				557, 620, 640, 657, 720, 740, 757 }, 100, 20,
				new String[] { "|", "|--", "|", "|", "|--", "|", "|", "|--", "|",
						"|", "|--", "|", "|", "|--", "|", "|", "|--", "|",
						"|", "|--", "|", "|", "|--", "|" });

		// Right Vertical Bracket Lines (Shift "--|" slightly left)
		addSideBracketLines(1244, new int[] { 20, 40, 57, 120, 140, 157, 220, 240, 257,
				320, 340, 357, 420, 440, 457, 520, 540,
				557, 620, 640, 657, 720, 740, 757 }, 100, 20,
				new String[] { "|", "--|", "|", "|", "--|", "|", "|", "--|", "|",
						"|", "--|", "|", "|", "--|", "|", "|", "--|", "|",
						"|", "--|", "|", "|", "--|", "|" },
				1228);
	}

	public void displayAdvanceRound4() {
		// Left Side Horizontal Bracket Lines
		addSideBracketLines(385, 40, 100, 100, 20, 8, "---");

		// Right Side Horizontal Bracket Lines
		addSideBracketLines(1103, 40, 100, 100, 20, 8, "---");

		// Left Side Vertical Bracket Lines
		addSideBracketLines(405, new int[] { 55, 75, 115, 133, 255, 275, 315, 333,
				455, 475, 515, 533, 655, 675, 715, 733 },
				100, 20, new String[] { "|", "|", "|", "|", "|", "|", "|", "|",
						"|", "|", "|", "|", "|", "|", "|", "|" });

		// Right Side Vertical Bracket Lines
		addSideBracketLines(1103, new int[] { 55, 75, 115, 133, 255, 275, 315, 333,
				455, 475, 515, 533, 655, 675, 715, 733 },
				100, 20, new String[] { "|", "|", "|", "|", "|", "|", "|", "|",
						"|", "|", "|", "|", "|", "|", "|", "|" });

		// Left Side Corner Brackets
		addSideBracketLines(405, new int[] { 95, 295, 495, 695 }, 100, 20, new String[] { "|--", "|--", "|--", "|--" });

		// Right Side Corner Brackets (Shifted slightly left)
		addSideBracketLines(1087, new int[] { 95, 295, 495, 695 }, 100, 20,
				new String[] { "--|", "--|", "--|", "--|" });
	}

	public void displayAdvanceRound5() {
		// Left Side Horizontal Bracket Lines
		addSideBracketLines(525, new int[] { 95, 295, 495, 695 }, 100, 20, new String[] { "---", "---", "---", "---" });

		// Left Side Vertical Bracket Lines
		addSideBracketLines(545, new int[] { 110, 130, 150, 170, 190, 230, 250, 270, 290,
				510, 530, 550, 570, 610, 630, 650, 670, 690 },
				100, 20,
				new String[] { "|", "|", "|", "|", "|", "|", "|", "|", "|",
						"|", "|", "|", "|", "|", "|", "|", "|", "|" });

		// Left Side Corner Brackets
		addSideBracketLines(545, new int[] { 210, 590 }, 100, 20, new String[] { "|--", "|--" });

		// Right Side Horizontal Bracket Lines
		addSideBracketLines(963, new int[] { 95, 295, 495, 695 }, 100, 20, new String[] { "---", "---", "---", "---" });

		// Right Side Vertical Bracket Lines
		addSideBracketLines(963, new int[] { 110, 130, 150, 170, 190, 230, 250, 270, 290,
				510, 530, 550, 570, 610, 630, 650, 670, 690 },
				100, 20,
				new String[] { "|", "|", "|", "|", "|", "|", "|", "|", "|",
						"|", "|", "|", "|", "|", "|", "|", "|", "|" });

		// Right Side Corner Brackets (Adjusted)
		addSideBracketLines(947, new int[] { 210, 590 }, 100, 20, new String[] { "--|", "--|" });

		// Update frame after adding components
		frame.revalidate();
		frame.repaint();
	}

	public void displayAdvanceRound6() {
		// Left side horizontal bracket label (Move south a bit)
		addSideBracketLines(668, new int[] { 208 }, 100, 20, new String[] { "---" }); // Moved down

		// Left side vertical bracket lines
		int[] leftYPositions = { 213, 233, 253, 273, 293, 313, 333, 353, 373, 393, 413, 433, 453, 473, 493, 513, 533,
				553, 576 };
		String[] leftLabels = new String[leftYPositions.length];
		Arrays.fill(leftLabels, "|");

		addSideBracketLines(688, leftYPositions, 100, 20, leftLabels);

		// Left side final horizontal bracket label
		addSideBracketLines(665, new int[] { 587 }, 100, 20, new String[] { "---" });

		// Right side horizontal bracket label
		addSideBracketLines(822, new int[] { 208 }, 100, 20, new String[] { "---" });

		// Right side vertical bracket lines
		int[] rightYPositions = { 213, 233, 253, 273, 293, 313, 333, 353, 373, 393, 413, 433, 453, 473, 493, 513, 533,
				553, 576 };
		String[] rightLabels = new String[rightYPositions.length];
		Arrays.fill(rightLabels, "|");

		addSideBracketLines(820, rightYPositions, 100, 20, rightLabels);

		// Right side final horizontal bracket label
		addSideBracketLines(820, new int[] { 587 }, 100, 20, new String[] { "---" });

		addSideBracketLines(804, new int[] { 253 }, 100, 20, new String[] { "--|" });
		addSideBracketLines(687, new int[] { 492 }, 100, 20, new String[] { " --" });

		// Champion label in the center
		addSideBracketLines(705, new int[] { 353 }, 100, 20, new String[] { "    Champion" });
	}

	// display the board
	public void displayBoard(){

		// round 1 advance round 2
		displayAdvanceRound2();

		// round 2 advance round 3
		displayAdvanceRound3();

		// round 3 advance to round 4
		displayAdvanceRound4();

		// round 4 advancing to round 5
		displayAdvanceRound5();

		// round 5 advancing to championship
		displayAdvanceRound6();

	}

	public void addNewTeam() {
		frame2 = new JFrame("New Team");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setPreferredSize(new Dimension(400, 400));
		frame2.setVisible(true);

		JLabel label1 = new JLabel("Team Name: ");
		JLabel label2 = new JLabel("Wins: ");
		JLabel label3 = new JLabel("Losses: ");

		JTextField nameField = new JTextField();
		JTextField winField = new JTextField();
		JTextField lossField = new JTextField();

		JButton submit = new JButton("Submit");
		JButton cancel = new JButton("Cancel");

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
		if (round == 1) {
			displayRoundOne(a);
		} else if (round == 2) {
			displayRoundTwo(a);
		} else if (round == 3) {
			displayRoundThree(a);
		} else if (round == 4) {
			displayRoundFour(a);
		} else if (round == 5) {
			displayRoundFive(a);
		} else if (round == 6) {
			displayChampionship(a);
		} else {
			displayWinner(a);
		}
	}

	public static void main(String[] args) {
		String filename = "teams.txt";
		Simulator s = new Simulator();
		Bracket b = new Bracket(filename);
		Interface i = new Interface();

		JFrame frame = new JFrame();
		frame = new JFrame("March Madness");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		i.addSimulateButton();
		frame.setVisible(true);

		b.addTeams();
		ArrayList<String> teamString = b.output();
		i.displayBoard();
		i.addSimulateButton();
		i.addShuffleButton();
		i.displayRoundOne(teamString);
	}
}
