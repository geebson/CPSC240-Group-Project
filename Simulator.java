/**
 * simulates a game between two team objects
 */
import java.util.Random;
public class Simulator {
    /**
     * simulates a game between two teams
     * @param a 1st Team object
     * @param b 2nd Team object
     * @return whether team a wins (there are no ties)
     */
    public boolean simulate(Team a,Team b){
        if(a.win()>b.win()){
            return true;
        }
        else if(a.win()<b.win()){
            return false;
        }
        else{

        }
    }
}
