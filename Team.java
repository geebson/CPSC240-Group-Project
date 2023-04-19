import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * represents a team
 */
public class Team {
    private String name;
    private int wins;
    private int losses;
    public Team(String name,int wins,int losses){
        this.name=name;
        this.wins=wins;
        this.losses=losses;
    }
    public void incrementWins(){
        wins++;
    }
    public void incrementLosses(){
        losses--;
    }

    /**
     * calculates the chance of winning
     * @return chance of winning
     */
    public double win(){
        return 0.0;
    }

    /**
     * Team writes itself to file
     */
    public void save(FileWriter myWriter){
        try {
        myWriter.write(name+" ("+wins+"-"+losses+")\n");}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
