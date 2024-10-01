// Goal of this file:
// The user can create, and alter, a file of persons by adding and removing them from an ArrayList

package nl.ErwinvanderLaan;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // The ArrayList
        ArrayList<Person> persons = new ArrayList<>();

        // A loop so the user can continuously add or remove persons from the HashMap
        while (true) {

            // Three choices for the user.
            System.out.println("""
            Choose one:
            1. add a person
            2. delete a person
            3. show all persons
            Or type 'q' to quit
            """);

            String choice = askForInput("Choose an option:");

            // A switch for each of the three choices.
            switch(choice) {

                case "1":

                    // Puts the entered name and age in the ArrayList.
                    String name = askForInput("Please enter the name of the person.");
                    int age = Integer.parseInt(askForInput("Please enter the age of the person."));
                    String email = askForInput("Please enter the E-mail address of the person.");
                    String city = askForInput("Please enter the name of the city where the person lives.");
                    int bsn = Integer.parseInt(askForInput("Please enter the bsn of the person."));
                    int phoneNumber = Integer.parseInt(askForInput("Please enter the phone number of the person."));

                    // Makes a person object and adds it to the ArrayList.
                    Person person = new Person(name, age, email, city, bsn, phoneNumber);
                    persons.add(person);
                    break;

                case "2":
                    // Removing a person from the HashMap by typing their name
                    String removeName = askForInput("Please enter the name of the person you want to remove ");
                    System.out.println("Name to be removed is: " + removeName + "\n");

                    //set to -1 because 0 is the first position in the list
                    int found = -1;
                    for(int x = 0; x < persons.size(); x++){
                        //compare String objects with equals
                      if (Objects.equals(persons.get(x).name, removeName)){
                          found = x;
                          break;
                      }
                    }
                    if(found >= 0) {
                        persons.remove(found);
                        System.out.printf("Item %s was removed\n", removeName);
                        break;
                    }
                    System.out.println("Item could not be removed because it was not found.");
                    break;

                case "3":
                    // Show the total person file to the user by printing the ArrayList.
                    System.out.println("The list of added persons:");

                    for (var i : persons) {
                        System.out.println(i);
                    }

                    break;

                case "q":
                    return;
            }
        }

    }
    // Scanner method to ask for user input.
    public static String askForInput(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.next();
    }
}