import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 * represents a team
 */
public class Team {
    Random random = new Random();
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
    public void output(){
        System.out.println(name+" "+wins+" "+losses);
    }

    /**
     * calculates the chance of winning
     * @return chance of winning
     */
    public double win(){
        int num = random.nextInt(-10,10);
        return (wins-losses)+num;
    }

    /**
     * Team writes itself to file
     */
    public void save(BufferedWriter myWriter){
        try {
            myWriter.write(name+" ("+wins+"-"+losses+")\n");}
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
