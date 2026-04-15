package level_exam.app;

import level_exam.domain.*;
import level_exam.report.ResistanceReportPrinter;
import level_exam.service.RobotRegistration;

import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {

        RobotRegistration robot = new RobotRegistration();

        robot.addRobot(new LandRobot("Optimus", "TESLA", Year.of(2026), LocalDate.now(), 60, TractionType.TRACK));
        robot.addRobot(new LandRobot("T71", "TESLA", Year.of(2026), LocalDate.now(), 55, TractionType.WHEEL));
        robot.addRobot(new AirRobot("A2", "Agibot", Year.of(2025), LocalDate.now(), 200, 120));
        robot.addRobot(new AirRobot("B4", "Agibot", Year.of(2026), LocalDate.now(), 200, 20));
        robot.addRobot(new WaterRobot("BlueROVE2", "BlueRobotics", Year.of(2024), LocalDate.now(), 150, PropulsionType.JET));


        System.out.println(" === List of Registered Robots === ");
        robot.listRobots();

        System.out.println(" === List of Land Robots with Speed greater than 50km/hr === ");
        robot.filterByMaxSpeed(50).forEach(r -> System.out.println(r.getName() + " | " + r.getManufacturer()));

        System.out.println(" === List of Robots by Manufacturer === ");
        robot.filterByManufacturer("TESLA").forEach(r -> System.out.println(r.getName() + " | " + r.getManufacturer()));

        ResistanceReportPrinter printer = new ResistanceReportPrinter();
        printer.printReport(robot.getEvaluableRobots());
    }
}
