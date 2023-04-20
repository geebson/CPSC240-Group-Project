import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        String filename = "teams.txt";
        Simulator s = new Simulator();
        Bracket b = new Bracket(filename);
        Interface i = new Interface();
        b.addTeams();
        ArrayList<String> a = b.output();
        i.displayRoundOne(a);

        for(int j=1;j<8;j++){
            int rounds = b.simulate(s);
            if (rounds<8){
                a = b.output();
                i.Display(a,rounds);
                i.cosmetic();
                i.addSimulateButton();
                i.addShuffleButton();
            }
        }
    }
}
