package Marathon.Course;

import Marathon.Team.Competitor;
import Marathon.Team.Obstacle;

public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(length);
    }
}