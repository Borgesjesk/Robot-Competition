package Level_Exam.domain;

import java.time.LocalDate;
import java.time.Year;

public class WaterRobot extends Robot {

    private final int maxDepth;
    private final PropulsionType propulsion;

    public WaterRobot(String name, String manufacturer, Year manufacturingYear, LocalDate registrationDate, int maxDepth, PropulsionType propulsion) {
        super(name, manufacturer, manufacturingYear, registrationDate);
        this.maxDepth = maxDepth;
        this.propulsion = propulsion;
    }

    public int getMaxDepth() {
        return maxDepth;
    }

    public PropulsionType getPropulsion() {
        return propulsion;
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + " reaches a depth of " + getMaxDepth() + " m with " + getPropulsion() + " propulsion. Manufactured by " + getManufacturer() + " in " + getManufacturingYear();
    }
}

