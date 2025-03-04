package PatientDriverApp;

/*
 * Class: CMSC203 
 * Instructor: Prof. Grinberg
 * Description: Driver class to test Patient and Procedure classes.
 * Due: 07/27/2024
 * Platform/Compiler: IntelliJ IDEA
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Ange Danielle Chedom Machegah
 */
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter patient's first name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter patient's middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter patient's last name:");
        String lastName = scanner.nextLine();
        System.out.println("Enter street address:");
        String streetAddress = scanner.nextLine();
        System.out.println("Enter city:");
        String city = scanner.nextLine();
        System.out.println("Enter state:");
        String state = scanner.nextLine();
        System.out.println("Enter ZIP code:");
        String zipCode = scanner.nextLine();
        System.out.println("Enter phone number (e.g., 301-123-4567):");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter emergency contact name:");
        String emergencyContactName = scanner.nextLine();
        System.out.println("Enter emergency contact phone number:");
        String emergencyContactPhone = scanner.nextLine();

        Patient patient = new Patient(firstName, middleName, lastName, streetAddress, city, state, zipCode, phoneNumber, emergencyContactName, emergencyContactPhone);

        Procedure procedure1 = new Procedure("Physical Exam", "03/03/25");
        procedure1.setPractitionerName("Dr. Smith");
        procedure1.setCharges(250.00);

        Procedure procedure2 = new Procedure("X-ray", "03/03/25", "Dr. Johnson", 500.00);

        Procedure procedure3 = new Procedure();
        procedure3.setProcedureName("Blood Test");
        procedure3.setProcedureDate("03/03/25");
        procedure3.setPractitionerName("Dr. Lee");
        procedure3.setCharges(150.00);

        displayPatient(patient);
        System.out.println();
        displayProcedure(procedure1);
        System.out.println();
        displayProcedure(procedure2);
        System.out.println();
        displayProcedure(procedure3);
        System.out.println();

        double totalCharges = calculateTotalCharges(procedure1, procedure2, procedure3);
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        System.out.println("\nThe program was developed by a Student: Ange Danielle Chedom Machegah 03/03/25");
    }

    public static void displayPatient(Patient patient) {
        System.out.println(patient);
    }

    public static void displayProcedure(Procedure procedure) {
        System.out.println(procedure);
    }

    public static double calculateTotalCharges(Procedure p1, Procedure p2, Procedure p3) {
        return p1.getCharges() + p2.getCharges() + p3.getCharges();
    }
}
