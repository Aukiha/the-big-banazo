// Author: Shane Williams
// Date: March 28, 2018
// Purpose: To create a simplified process of managing customer information for a children's camp
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

    // Serves as the registree number to keep track of how many children are registered
    static int registree = 0;

    // Lists of children and parent objects
    // Each object within the list has distinctive values(names, health card numbers, etc)
    static List<Child> children = new ArrayList<Child>();
    static List<Parent> parents = new ArrayList<Parent>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Program is in an infinite loop to allow for further accessibility
        while(1 == 1) {

            // Prompt user with menu options
            System.out.println();
            System.out.println("1 - Register a new child and parent(s)");
            System.out.println("2 - Add another offspring to a parent");
            System.out.println("3 - Edit information");
            System.out.println("4 - Browse list of children or parents");
            System.out.println("5 - Display information about a child or parent");
            System.out.println("6 - Show Statistics");
            System.out.println();

            System.out.print("Input Option: ");

            int choice = input.nextInt();
            System.out.println();

            // Register a new child and parent(s)
            if(choice == 1) {

                // Creates a new child object for the registree
                children.add(new Child(registree));

                System.out.println("Input parent's information");
                parents.add(new Parent(registree));
                children.get(registree).setParents(parents.get(registree).getGivenName());

                System.out.println("Add another parent to this child? (Y/N)");
                String anotherParentChoice = input.next();

                if(anotherParentChoice.equals("Y")) {
                    parents.add(new Parent(registree));
                    System.out.println("Family #" + registree+1 +" Registered");
                    registree++;
                }
                else {
                    System.out.println("Family #" + registree+1 +" Registered");
                    registree++;
                }

            }

            // Add another offspring to a parent
            else if(choice == 2) {
                System.out.print("Input name of parent: ");
                String parentName = input.next();
                System.out.println();
                for(int x = 0; x <= registree; x++) {
                    if(((parents.get(x)).getGivenName().equals(parentName))) {

                        // Create new child object
                        children.add(new Child(registree));

                        // Set the newly created object's parents to the given name
                        children.get(registree).setParents(parentName);
                    }
                }
            }

            // Edit information
            else if(choice == 3) {
                System.out.print("Editing child or parent's information?: ");
                String childParent = input.next();
                System.out.println();

                // Change child's information
                if(childParent.equals("child")) {

                    // Prompt user for child's first name
                    System.out.print("Input child's first name: ");
                    String childFirstName = input.next();
                    System.out.println();

                    // Prompt user for child's last name
                    System.out.println("Input child's last name: ");
                    String childLastName = input.next();
                    System.out.println();

                    for(int x = 0; x < children.size(); x++) {

                        // Search the children objects list for objects with those names
                        if(((children.get(x)).getGivenName()).equals(childFirstName) && (((children.get(x)).getSurname()).equals(childLastName))) {

                            // if one is found, prompt the user with menu options
                            System.out.println("What information would you like to edit?");
                            System.out.println("1 - Surname");
                            System.out.println("2 - Given Name");
                            System.out.println("3 - Date of Birth");
                            System.out.println("4 - Health Card Number");
                            System.out.println("5 - Week(s) Attending");
                            System.out.println("6 - Allergies and Medical Notes");
                            System.out.println("7 - Other Notes");
                            System.out.println("8 - People authorized to sign child out");

                            int changeChoice = input.nextInt();

                            // Change surname
                            if(changeChoice == 1) {
                                System.out.print("Current value is: " + (children.get(x)).getSurname());
                                System.out.println();
                                System.out.print("Input new surname: ");
                                String newSurname = input.next();
                                System.out.println();
                                children.get(x).setSurname(newSurname);
                                System.out.println("Surname changed!");
                                break;
                            }

                            // Change given name
                            if(changeChoice == 2) {
                                System.out.print("Current value is: " + (children.get(x)).getGivenName());
                                System.out.println();
                                System.out.print("Input new given name: ");
                                String newGivenName = input.next();
                                System.out.println();
                                children.get(x).setGivenName(newGivenName);
                                System.out.println("Given name changed!");
                                break;
                            }

                            // Change Date of Birth
                            if(changeChoice == 3) {
                                System.out.println("Current value is " + (children.get(x)).getDateOfBirth());
                                System.out.println();
                                System.out.print("Input new Date of Birth: ");
                                String newDateOfBirth = input.next();
                                System.out.println();
                                children.get(x).setDateOfBirth(newDateOfBirth);
                                System.out.println("Date of Birth changed!");
                                break;
                            }

                            // Change Health Card Number
                            if(changeChoice == 4) {
                                System.out.println("Current value is " + (children.get(x)).getHealthCardNumber());
                                System.out.println();
                                System.out.print("Input new Health Card Number: ");
                                String newHealthCardNumber = input.next();
                                System.out.println();
                                children.get(x).setHealthCardNumber(newHealthCardNumber);
                                System.out.println("Health Card Number changed!");
                                break;
                            }

                            // Change Weeks Attending
                            if(changeChoice == 5) {
                                System.out.println("Current value is " + (children.get(x)).getWeeksAttending());
                                System.out.println();
                                System.out.print("Input new number of weeks the child will attend: " );
                                int newWeeksAttending = input.nextInt();
                                System.out.println();
                                children.get(x).setWeeksAttending(newWeeksAttending);
                                System.out.println("Weeks Attending changed!");
                            }

                            // Change Allergies and Medical Notes
                            if(changeChoice == 6) {
                                System.out.println("Current value is " + (children.get(x)).getMedicalNotes());
                                System.out.println();
                                System.out.print("Input new Allergies and Medical Notes: ");
                                String newMedicalNotes = input.next();
                                System.out.println();
                                children.get(x).setMedicalNotes(newMedicalNotes);
                                System.out.println("Allergies and Medical Notes changed!");
                            }

                            // Change Other Notes
                            if(changeChoice == 7) {
                                System.out.println("Current value is " + (children.get(x)).getOtherNotes());
                                System.out.println();
                                System.out.print("Input new notes: ");
                                String newNotes = input.next();
                                System.out.println();
                                children.get(x).setOtherNotes(newNotes);
                                System.out.println("Child Notes changed!");
                            }

                            // Change Authorized People
                            if(changeChoice == 8) {
                                System.out.println("Current value is " + (children.get(x)).getAuthorizedPeople());
                                System.out.println();
                                System.out.print("Input new Authorized People: ");
                                String newAuthorizedPeople = input.next();
                                System.out.println();
                                children.get(x).setAuthorizedPeople(newAuthorizedPeople);
                                System.out.println("Authorized Sign-out People changed!");
                            }

                            // if the user inputs anything else
                            else {
                                System.out.println("Invalid input");
                            }
                        }

                        // if no child with that name is found
                        else {
                            System.out.println("No child with that name found.");
                        }
                    }
                }
                else if(childParent.equals("parent")) {
                    System.out.print("Input parent's first name: ");
                    String parentFirstName = input.next();
                    System.out.println();

                    System.out.println("Input parent's last name: ");
                    String parentLastName = input.next();
                    System.out.println();

                    for(int x = 0; x < parents.size(); x++) {

                        // Search the parent object lists for objects with those names
                        if (((parents.get(x)).getGivenName()).equals(parentFirstName) && (((parents.get(x)).getSurname()).equals(parentLastName))) {

                            // if one is found, prompt the user with menu options
                            System.out.println("What information would you like to edit?");
                            System.out.println("1 - Surname");
                            System.out.println("2 - Given Name");
                            System.out.println("3 - Date of Birth");
                            System.out.println("4 - Email Address");
                            System.out.println("5 - Home Phone Number");
                            System.out.println("6 - Cell Phone Number");
                            System.out.println("7 - Work Phone Number");
                            System.out.println("8 - Marital Status");

                            int changeChoice = input.nextInt();

                            // Change surname
                            if(changeChoice == 1) {
                                System.out.print("Current value is: " + (parents.get(x)).getSurname());
                                System.out.println();
                                System.out.print("Input new surname: ");
                                String newSurname = input.next();
                                System.out.println();
                                parents.get(x).setSurname(newSurname);
                                System.out.println("Surname changed!");
                                break;
                            }

                            // Change given name
                            if(changeChoice == 2) {
                                System.out.print("Current value is: " + (parents.get(x)).getGivenName());
                                System.out.println();
                                System.out.print("Input new given name: ");
                                String newGivenName = input.next();
                                System.out.println();
                                parents.get(x).setGivenName(newGivenName);
                                System.out.println("Given name changed!");
                                break;
                            }

                            // Change Date of Birth
                            if(changeChoice == 3) {
                                System.out.print("Current value is: " + (parents.get(x)).getDateOfBirth());
                                System.out.println();
                                System.out.print("Input new Date of Birth: ");
                                String newDateofBirth = input.next();
                                System.out.println();
                                parents.get(x).setDateOfBirth(newDateofBirth);
                                System.out.println("Date of Birth changed!");
                                break;
                            }

                            // Change Email Address
                            if(changeChoice == 4) {
                                System.out.print("Current value is: " + (parents.get(x)).getEmail());
                                System.out.println();
                                System.out.print("Input new email address: ");
                                String newEmail = input.next();
                                System.out.println();
                                parents.get(x).setEmail(newEmail);
                                System.out.println("Email Address Changed changed!");
                                break;
                            }

                            // Change Home Phone Number
                            if(changeChoice == 5) {
                                System.out.print("Current value is: " + (parents.get(x)).getHomePhone());
                                System.out.println();
                                System.out.print("Input new home phone number: ");
                                String newHomePhone = input.next();
                                System.out.println();
                                parents.get(x).setHomePhone(newHomePhone);
                                System.out.println("Home Phone Number changed!");
                                break;
                            }

                            // Change Cell Phone Number
                            if(changeChoice == 6) {
                                System.out.print("Current value is: " + (parents.get(x)).getCellPhone());
                                System.out.println();
                                System.out.print("Input new Cell Phone Number: ");
                                String newCellPhone = input.next();
                                System.out.println();
                                parents.get(x).setCellPhone(newCellPhone);
                                System.out.println("Cell Phone Number changed!");
                                break;
                            }

                            // Change Work Phone Number
                            if(changeChoice == 7) {
                                System.out.print("Current value is: " + (parents.get(x)).getWorkPhone());
                                System.out.println();
                                System.out.print("Input new Work Number: ");
                                String newWorkPhone = input.next();
                                System.out.println();
                                parents.get(x).setWorkPhone(newWorkPhone);
                                System.out.println("Work Phone Number changed!");
                                break;
                            }

                            // Change Marital Status
                            if(changeChoice == 8) {
                                System.out.print("Current value is: " + (parents.get(x)).getMartialStatus());
                                System.out.println();
                                System.out.print("Input new marital status: ");
                                String newMaritalStatus = input.next();
                                System.out.println();
                                parents.get(x).setMartialStatus(newMaritalStatus);
                                System.out.println("Marital Status changed!");
                                break;
                            }

                            // if user inputs anything else
                            else {
                                System.out.println("Invalid input");
                            }

                        }

                        // if no parent with that name is found
                        else {
                            System.out.println("No parent with that name");
                        }
                    }


                }
            }

            // Display child or parent info
            else if(choice == 5) {
                System.out.println();
                System.out.print("Display info of children or parents: ");

                String listChoice = input.next();
                System.out.println();

                if(listChoice.equals("children")) {
                    System.out.println("Input child's first name: ");
                }
                else if(listChoice.equals("parents")) {
                    System.out.print("Input parent's first name: ");
                    String parentFirstName = input.next();
                    System.out.println();

                    System.out.println("Input parent's last name: ");
                    String parentLastName = input.next();
                    System.out.println();

                    for(int x = 0; x < parents.size(); x++) {

                        // Search the parent object lists for objects with those names
                        if (((parents.get(x)).getGivenName()).equals(parentFirstName) && (((parents.get(x)).getSurname()).equals(parentLastName))) {
                            System.out.println(parents.get(x).getGivenName());
                            System.out.print(" " + parents.get(x).getSurname());
                            System.out.println();
                }
                    }
                }

                // if the user inputs anything else
                else {
                    System.out.println("Invalid input");
                }
            }

            // Display list of children or parents
            else if(choice == 4) {
                System.out.println();
                System.out.print("Display lists of children or parents: ");

                String listChoice2 = input.next();
                System.out.println();

                if(listChoice2.equals("children")) {

                    // Print list of child objects with given names
                    for(int x = 0; x < children.size(); x++) {
                        System.out.println(children.get(x).getGivenName());
                    }
                }
                else if(listChoice2.equals("parents")) {

                    // Print list of parent objects with given names
                    for(int x = 0; x < parents.size(); x++) {
                        System.out.println(parents.get(x).getGivenName());
                    }
                }

                // if the user inputs anything else
                else {
                    System.out.println("Invalid input");
                }
            }

            else if(choice == 6) {
                System.out.println("There are " + registree + " children registered");
            }
        }

    }

}