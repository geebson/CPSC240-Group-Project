import java.util.ArrayList;

/**
 * represents a bracket full of teams
 */
public class Bracket {
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Team> winners = new ArrayList<>();
    private String filename;

    public void simulate(Simulator s){
        while (teams.size()>1){
            for (int i = 0; i < teams.size(); i += 2) {
                boolean winner = s.simulate(teams.get(i),teams.get(i+1));
                if (winner){
                    winners.add(teams.get(i));
                }
                else{
                    winners.add(teams.get(i+1));
                }
            }
        }
    }
}
