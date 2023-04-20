import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        String filename = "teams.txt";
        Simulator s = new Simulator();
        Interface i = new Interface();
        Bracket b = new Bracket(filename);
        b.addTeams();
        ArrayList<String> teamString=b.output();
        i.cosmetic();
        i.addShuffleButton();
        i.addSimulateButton();
        i.displayRoundOne(teamString);
        i.addNewTeam();

        b.simulate(s,i);
    }
}
