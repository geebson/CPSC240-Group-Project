import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * represents a bracket full of teams
 */
public class Bracket {
    ArrayList<Team> teams = new ArrayList<>();
    ArrayList<Team> winners = new ArrayList<>();
    private String filename;
    public Bracket(String filename){
        this.filename=filename;
    }

    /**
     * reads in the teams from a file and adds them to the ArrayList
     */
    public void addTeams(){
        File teamFile=new File(filename);
        Scanner in=null;
        try{
            in = new Scanner (teamFile);}
        catch(FileNotFoundException x){
            x.printStackTrace();
        }
        while(in.hasNext()){
            String teamString = in.nextLine();
            String[] teamArray = teamString.split(" ",2);
            String name = teamArray[0];
            int index = teamArray[1].indexOf("(");
            int wins = Integer.parseInt(teamArray[1].substring(index+1,index+2));
            int losses = Integer.parseInt(teamArray[1].substring(index+4,index+5));
            Team team = new Team(name,wins,losses);
            teams.add(team);
        }
    }
    public void saveWinners(){
        File file = new File("winners.txt");
        FileWriter myWriter = null;
        try {
            file.createNewFile();
            myWriter=new FileWriter(file);
            for (Team t:winners){
                t.save(myWriter);
            }
            myWriter.write("\n");}
        catch (IOException e) {
            e.printStackTrace();
        }
    }

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
            teams=winners;
        }
    }
}
