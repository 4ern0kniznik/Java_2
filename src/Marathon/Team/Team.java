package Marathon.Team;

public class Team{
    private Competitor[] team;

    public Team(Competitor... _team){
        this.team = _team;
    }

    public void doIt(Obstacle[] obstacles) {
        for (Competitor c : team) {
            for (Obstacle o : obstacles) {
                o.doIt(c);
                if (!c.isOnDistance()) break;
            }
        }
         for (Competitor c : team) {
             c.info();
        }
    }

    public  void showResults(){
        for (Competitor c : team)
            c.info();
    }
}
