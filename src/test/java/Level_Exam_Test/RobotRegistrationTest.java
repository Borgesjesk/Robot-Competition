package Level_Exam_Test;

import Level_Exam.domain.*;
import Level_Exam.service.RobotRegistration;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Year;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RobotRegistrationTest {

    @Test
    void filterByMaxSpeed() {

        RobotRegistration robot = new RobotRegistration();

        robot.addRobot(new LandRobot("Optimus", "TESLA", Year.of(2026), LocalDate.now(), 80, TractionType.TRACK));
        robot.addRobot(new LandRobot("T71", "TESLA", Year.of(2026), LocalDate.now(), 30, TractionType.WHEEL));
        robot.addRobot(new AirRobot("A2", "Agibot", Year.of(2025), LocalDate.now(), 200, 120));
        robot.addRobot(new AirRobot("B4", "Agibot", Year.of(2026), LocalDate.now(), 200, 20));
        robot.addRobot(new WaterRobot("BlueROVE2", "BlueRobotics", Year.of(2024), LocalDate.now(), 150, PropulsionType.JET));

        System.out.println(" === List of Robots Max Speed above 50 km/h === ");
        robot.filterByMaxSpeed(50).forEach(r -> System.out.println(r.getName() + " | " + r.getManufacturer()));

        assertEquals(1, robot.filterByMaxSpeed(50).size());
    }
}
