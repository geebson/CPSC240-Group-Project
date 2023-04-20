import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * represents a bracket full of teams
 */
public class Bracket {
    int numRounds = 1;
    File file = new File("winners.txt");
    BufferedWriter writer = null;
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Team> winners = new ArrayList<>();
    private String filename;

    public Bracket(String filename) {
        this.filename = filename;
    }

    public ArrayList<String> output() {
        ArrayList<String> teamString = new ArrayList<>();
        for (Team t : teams) {
            teamString.add(t.toString());
        }
        return teamString;
    }

    /**
     * reads in the teams from a file and adds them to the ArrayList
     */
    public void addTeams() {
        File teamFile = new File(filename);
        Scanner in = null;
        try {
            in = new Scanner(teamFile);
        } catch (FileNotFoundException x) {
            x.printStackTrace();
        }
        while (in.hasNext()) {
            String teamString = in.nextLine();
            int index = teamString.indexOf(" ", 2);
            String name = teamString.substring(1, index);
            int dash = teamString.indexOf("-");
            int wins = Integer.parseInt(teamString.substring(dash - 2, dash));
            int losses = Integer.parseInt(teamString.substring(dash + 1, dash + 3));
            Team team = new Team(name, wins, losses);
            teams.add(team);
        }
    }

    public void Display(Interface i, int round) {
        if (round == 2) {
            i.displayRoundTwo(output());
        }
        else if(round==3){i.displayRoundThree(output());}
        else if (round==4) {i.displayRoundFour(output());}
        else if (round==5) {i.displayRoundFive(output());}
        else if(round==6){i.displayChampionship(output());}
        else{i.displayWinner(output());
        }
    }


    /**
     * calls simulator for all the games in the bracket and writes the winners to a file
     *
     * @param s object simulator
     */
    public void simulate(Simulator s, Interface i) {

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (teams.size() > 1) {
            //simulate the round
            round(s);
            //write the winners to a file
            for (Team t : winners) {
                t.save(writer);
            }
            try {
                writer.write("\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
            //clear the teams and add the winners to it
            teams.clear();
            teams.addAll(winners);
            //display the winners to the interface
            Display(i, numRounds);
            winners.clear();
        }
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void round(Simulator s){
        for (int i = 0; i < teams.size() - 1; i += 2) {
            boolean winner = s.simulate(teams.get(i), teams.get(i + 1));
            if (winner) {
                winners.add(teams.get(i));
            } else {
                winners.add(teams.get(i + 1));
            }
        }
        numRounds++;
    }
}
