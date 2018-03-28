import java.util.Scanner;
public class Child {

    String surname;
    String givenName;
    String dateOfBirth;
    String healthCardNumber;
    String registDate;
    int weeksAttending;
    String medicalNotes;
    String otherNotes;
    String authorizedPeople;

    int registreeNumber;
    int parentNumber = 0;
    String[] parents = new String[2];

    public Child(int number) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("Given Name: ");
        this.givenName = input.nextLine();
        System.out.println();

        System.out.print("Surname: ");
        this.surname = input.nextLine();
        System.out.println();

        System.out.print("Date of Birth: ");
        this.dateOfBirth = input.nextLine();
        System.out.println();

        System.out.print("Health Card Number: ");
        this.healthCardNumber = input.next();
        System.out.println();

        System.out.print("Registration Date: ");
        this.registDate = input.next();
        System.out.println();

        System.out.print("Weeks Attending: ");
        this.weeksAttending = input.nextInt();
        System.out.println();

        System.out.print("Allergies and Medical Notes: ");
        this.medicalNotes = input.next();
        System.out.println();

        System.out.print("Other Notes: ");
        this.otherNotes = input.next();
        System.out.println();

        System.out.print("People Authorized to sign " + this.givenName + " out: ");
        this.authorizedPeople = input.next();
        System.out.println();

        System.out.println(this.givenName + " Registered");

        this.registreeNumber = number;
    }

    public void setParents(String parents) {
        this.parents[this.parentNumber] = parents;
        this.parentNumber++;
    }

    public String[] getParents() {
        return parents;
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHealthCardNumber() {
        return healthCardNumber;
    }

    public void setHealthCardNumber(String healthCardNumber) {
        this.healthCardNumber = healthCardNumber;
    }

    public int getWeeksAttending() {
        return weeksAttending;
    }

    public void setWeeksAttending(int weeksAttending) {
        this.weeksAttending = weeksAttending;
    }

    public String getMedicalNotes() {
        return medicalNotes;
    }

    public void setMedicalNotes(String medicalNotes) {
        this.medicalNotes = medicalNotes;
    }

    public String getOtherNotes() {
        return otherNotes;
    }

    public void setOtherNotes(String otherNotes) {
        this.otherNotes = otherNotes;
    }

    public String getAuthorizedPeople() {
        return authorizedPeople;
    }

    public void setAuthorizedPeople(String authorizedPeople) {
        this.authorizedPeople = authorizedPeople;
    }
}
