import java.util.Scanner;
public class Parent {

    String surname;
    String givenName;
    String dateOfBirth;

    String email;
    String homePhone;
    String cellPhone;
    String workPhone;

    String martialStatus;

    int registreeNumber;
    String[] children;

    public Parent(int number) {
        Scanner input = new Scanner(System.in);
        System.out.println();

        System.out.print("Given Name: ");
        this.givenName = input.next();
        System.out.println();

        System.out.print("Surname: ");
        this.surname = input.next();
        System.out.println();

        System.out.print("Date of Birth: ");
        this.dateOfBirth = input.next();
        System.out.println();

        // Contact Information
        System.out.println("Contact Information");
        System.out.print("Email Address: ");
        this.email = input.next();
        System.out.println();

        System.out.print("Home Phone Number: ");
        this.homePhone = input.next();
        System.out.println();

        System.out.print("Cell Phone Number: ");
        this.cellPhone = input.next();
        System.out.println();

        System.out.print("Work Phone Number: ");
        this.workPhone = input.next();
        System.out.println();
        // end of Contact Information

        System.out.print("Marital Status: ");
        this.martialStatus = input.next();
        System.out.println();

        System.out.println(this.givenName + " Registered");

        this.registreeNumber = number;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public String getMartialStatus() {
        return martialStatus;
    }

    public void setMartialStatus(String martialStatus) {
        this.martialStatus = martialStatus;
    }
}
