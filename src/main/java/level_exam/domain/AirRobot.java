package level_exam.domain;

import java.time.LocalDate;
import java.time.Year;

public class AirRobot extends Robot implements ResistanceEvaluable {

    private final int maxAltitude;
    private final int flightAutonomy;

    public AirRobot(String name, String manufacturer, Year manufacturingYear, LocalDate registrationDate, int maxAltitude, int flightAutonomy) {
        super(name, manufacturer, manufacturingYear, registrationDate);
        this.maxAltitude = maxAltitude;
        this.flightAutonomy = flightAutonomy;
    }

    public int  getMaxAltitude() {
        return maxAltitude;
    }
    public int getFlightAutonomy() {
        return flightAutonomy;
    }


    @Override
    public String getResistanceReport() {
        if (flightAutonomy >= 60) {
            return getName() + ": flight autonomy of " + getFlightAutonomy() + " minutes. Fit for competition.";
        }
        return getName() + ": flight autonomy of " + getFlightAutonomy() + " minutes. Does not meet requirements.";
    }

    @Override
    public String getTechnicalDescription() {
        return getName() + " flies up to " + getMaxAltitude() + " m for " + getFlightAutonomy() + " minutes. Manufactured in " + getManufacturingYear() + " by " + getManufacturer() + ".";
    }
}
