package Level_Exam.service;

import Level_Exam.domain.LandRobot;
import Level_Exam.domain.ResistanceEvaluable;
import Level_Exam.domain.Robot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RobotRegistration {

    private final List<Robot> robots = new ArrayList<>();


    public void addRobot(Robot robot) {
        Objects.requireNonNull(robot, "Robot cannot be null");
        robots.add(robot);
    }

    public void listRobots() {
        robots.forEach(robot -> System.out.println(robot.getTechnicalDescription()));
    }

    public List<Robot> filterByMaxSpeed(int maxSpeed) {
        return robots.stream()
                .filter(r -> r instanceof LandRobot landRobot && landRobot.getMaxSpeed() > maxSpeed)
                .toList();
    }

    public List<Robot> filterByManufacturer(String manufacturer) {
        return robots.stream()
                .filter(r -> r.getManufacturer().equals(manufacturer))
                .toList();
    }

    public List<ResistanceEvaluable> getEvaluableRobots() {
        return robots.stream()
                .filter(r -> r instanceof ResistanceEvaluable)
                .map(r -> (ResistanceEvaluable) r)
                .toList();
    }
}
