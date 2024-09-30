// Goal of this file: The user can create, and alter, a file of persons by adding and removing persons from a HashMap

package nl.ErwinvanderLaan;

import java.util.HashMap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice, ignore ;
        HashMap<String, Integer> listOfPersons = new HashMap<String, Integer>();
        Scanner userInput = new Scanner(System.in);

        for (; ; ) {
            // Three choices for the user.
            do {
                System.out.println("""
                Choose one
                1. add a person
                2. delete a person
                3. show all persons
                Or type 'q' to quit)""");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '3' & choice != 'q');

            if (choice == 'q') break;

            // A switch for each of the three choices.
            switch(choice) {
                // adding a person to the HashMap by typing their name and age. Name = key, Age = value.
                case '1':
                    // Asking the user to enter the name of the person to be added.
                    System.out.println("Please enter the name and age of the person you want to add ");

                    String name = userInput.nextLine();
                    int age = userInput.nextInt();

                    System.out.println("The name added is: " + name + "\n");
                    System.out.println("The age added is: " + age + "\n");

                    // Puts the entered name and age in the HashMap.
                    listOfPersons.put(name, age);

                    // Clears the Scanner of current input in case the user wants to input a new person.
                    userInput.nextLine();

                    break;

                case '2':
                    // Removing a person from the HashMap by typing their name
                    System.out.println("Please enter the name of the person you want to remove ");

                    String removeName = userInput.nextLine();

                    System.out.println("Name to be removed is: " + removeName + "\n");

                    listOfPersons.remove(removeName);

                    break;

                case '3':
                    // Show the total person file to the user by printing the Hashmap.
                    System.out.println("The list of added persons:");
                    System.out.println(listOfPersons + "\n");
                    break;
            }
        }
    }
}