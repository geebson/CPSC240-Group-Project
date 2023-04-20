public class Main {

    public static void main(String[] args){
        String filename = "teams.txt";
        Simulator s = new Simulator();
        Bracket b = new Bracket(filename);
        b.addTeams();
        b.simulate(s);
    }
}
