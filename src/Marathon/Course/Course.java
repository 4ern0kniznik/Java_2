package Marathon.Course;

import Marathon.Team.*;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... _obstacles){
        this.obstacles = _obstacles;
    }

    public void doIt(Team team) {
        team.doIt(obstacles);
    }

}
