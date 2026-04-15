package Level_Exam.domain;

import java.time.LocalDate;
import java.time.Year;

public abstract class Robot {

    private final String name;
    private final String manufacturer;
    private final Year manufacturingYear;
    private final LocalDate registrationDate;

    public Robot(String name, String manufacturer, Year manufacturingYear, LocalDate registrationDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Year getManufacturingYear() {
        return manufacturingYear;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public abstract String getTechnicalDescription();
}
