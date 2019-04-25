package Marathon.Course;

import Marathon.Team.Competitor;
import Marathon.Team.Obstacle;

public class Wall extends Obstacle {
   private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}
