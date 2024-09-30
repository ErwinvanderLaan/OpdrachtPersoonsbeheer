// Goal of this file:
// The user can create, and alter, a file of persons by adding and removing persons from a HashMap

package nl.ErwinvanderLaan;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // The HashMap
        HashMap<String, String> listOfPersons = new HashMap<>();

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
                // adding a person to the HashMap by typing their name and age.
                // Name = key, Age = value.
                case "1":
                    // Asking the user to enter the name and age of the person to be added
                    String name = askForInput("Please enter the name of the person.");
                    String age = askForInput("Please enter the age of the person.");

                    System.out.println("The name added is: " + name);
                    System.out.println("The age added is: " + age + "\n");

                    // Puts the entered name and age in the HashMap.
                    listOfPersons.put(name, age);

                    break;

                case "2":
                    // Removing a person from the HashMap by typing their name
                    String removeName = askForInput("Please enter the name of the person you want to remove ");
                    System.out.println("Name to be removed is: " + removeName + "\n");

                    // Removes the entered name from the HashMap
                    listOfPersons.remove(removeName);

                    break;

                case "3":
                    // Show the total person file to the user by printing the Hashmap.
                    System.out.println("The list of added persons:");
                    System.out.println(listOfPersons + "\n");
                    break;

                case "q":
                    return;
            }
        }

    }
    public static String askForInput(String question) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(question);
        return scanner.next();
    }
}