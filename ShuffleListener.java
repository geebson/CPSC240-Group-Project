import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShuffleListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        String filename = "teams.txt";
        Simulator s = new Simulator();
        Bracket b = new Bracket(filename);
        Interface i = new Interface();
        b.addTeams();
        b.shuffle();
        ArrayList<String> a = b.output();
        i.displayRoundOne(a);
        i.displayBoard();
        i.addSimulateButton();
        i.addShuffleButton();

    }
}
