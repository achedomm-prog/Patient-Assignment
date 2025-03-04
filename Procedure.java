package PatientDriverApp;

/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description: Represents a medical procedure performed on a patient.
 * Due: 07/27/2024
 * Platform/Compiler: IntelliJ IDEA
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Ange Danielle Chedom Machegah
 */
public class Procedure {
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    public Procedure() {
    }

    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }

    public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.charges = charges;
    }

    public String getProcedureName() { return procedureName; }
    public String getProcedureDate() { return procedureDate; }
    public String getPractitionerName() { return practitionerName; }
    public double getCharges() { return charges; }

    public void setProcedureName(String procedureName) { this.procedureName = procedureName; }
    public void setProcedureDate(String procedureDate) { this.procedureDate = procedureDate; }
    public void setPractitionerName(String practitionerName) { this.practitionerName = practitionerName; }
    public void setCharges(double charges) { this.charges = charges; }

    @Override
    public String toString() {
        return "Procedure Information:\n" +
                "Procedure Name: " + procedureName + "\n" +
                "Procedure Date: " + procedureDate + "\n" +
                "Practitioner Name: " + practitionerName + "\n" +
                "Charges: $" + String.format("%.2f", charges);
    }
}
