package Level_Exam.app;

import Level_Exam.domain.*;
import Level_Exam.report.ResistanceReportPrinter;
import Level_Exam.service.RobotRegistration;

import java.time.LocalDate;
import java.time.Year;
import java.util.List;

import static java.util.Locale.filter;

public class Main {
    public static void main(String[] args) {

        RobotRegistration robot = new RobotRegistration();

        robot.addRobot(new LandRobot("Optimus", "TESLA", Year.of(2026), LocalDate.now(), 60, TractionType.TRACK));
        robot.addRobot(new LandRobot("T71", "TESLA", Year.of(2026), LocalDate.now(), 55, TractionType.WHEEL));
        robot.addRobot(new AirRobot("A2", "Agibot", Year.of(2025), LocalDate.now(), 200, 120));
        robot.addRobot(new AirRobot("B4", "Agibot", Year.of(2026), LocalDate.now(), 200, 20));
        robot.addRobot(new WaterRobot("BlueROVE2", "BlueRobotics", Year.of(2024), LocalDate.now(), 150, PropulsionType.JET));


        System.out.println(" === List of Robots === ");

        robot.listRobots();

        System.out.println(" === List of Land Robots with Speed greater than 50km/hr === ");
        robot.filterByMaxSpeed(50).forEach(r -> System.out.println(r.getName() + " | " + r.getManufacturer()));

        System.out.println(" === List of Robots by Manufacturer === ");
        robot.filterByManufacturer("TESLA").forEach(r -> System.out.println(r.getName() + " | " + r.getManufacturer()));

        ResistanceReportPrinter printer = new ResistanceReportPrinter();
        printer.printReport(robot.getEvaluableRobots());
    }
}
