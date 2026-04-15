package Level_Exam.domain;

import java.time.LocalDate;
import java.time.Year;

public class LandRobot extends Robot implements ResistanceEvaluable {

    private final int maxSpeed;
    private final TractionType traction;

    public LandRobot(String name, String manufacturer, Year manufacturingYear, LocalDate registrationDate, int maxSpeed, TractionType traction) {
        super(name, manufacturer, manufacturingYear, registrationDate);
        this.maxSpeed = maxSpeed;
        this.traction = traction;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public TractionType getTraction() {
        return traction;
    }

    @Override
    public String getResistanceReport() {
        if (traction.equals(TractionType.TRACK)) {
            return getName() + ": TRACK traction confirmed. Fit for competition.";
        }
        return getName() + ": No TRACK traction confirmed. Does not meet requirements.";
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + ", manufactured by " + getManufacturer() + " in  " + getManufacturingYear() + ", uses " + getTraction() + " traction and reaches up to " + getMaxSpeed() + "km/h.";
    }
}

