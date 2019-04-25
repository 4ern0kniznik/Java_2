package Marathon;

import Marathon.Team.*;
import Marathon.Course.*;

public class Main {
    public static void main(String[] args) {
        Course course = new Course(new Cross(80), new Wall(2), new Water(15), new Cross(120));
        Team team = new Team(new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"), new Dog("Вася"));

        course.doIt(team);
        team.showResults();
    }
}