/**
 * simulates a game between two team objects
 */
import java.util.Random;
public class Simulator {
    Random random = new Random();
    /**
     * simulates a game between two teams
     * @param a 1st Team object
     * @param b 2nd Team object
     * @return whether team a wins (there are no ties)
     */
    public boolean simulate(Team a,Team b){
        if(a.win()>b.win()){
            a.incrementWins();
            b.incrementLosses();
            return true;
        }
        else if(a.win()<b.win()){
            b.incrementWins();
            a.incrementLosses();
            return false;
        }
        else{
            if (random.nextBoolean()){
                a.incrementWins();
                b.incrementLosses();
                return true;
            }
            else{
                b.incrementWins();
                a.incrementLosses();
                return false;
            }
        }
    }
}
