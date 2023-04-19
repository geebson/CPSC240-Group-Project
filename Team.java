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

    /**
     * calculates the chance of winning
     * @return chance of winning
     */
    public double win(){
        return 0.0;
    }

    /**
     * Team writes itself to file
     * @param filename
     */
    public void save(String filename){

    }
}
