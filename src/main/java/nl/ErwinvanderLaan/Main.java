// Goal of this file: The user can create, and alter, a file of persons by adding and removing persons from a HashMap

package nl.ErwinvanderLaan;

import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    throws java.io.IOException {
        char choice, ignore ;
        HashMap<String, Integer> listOfPersons = new HashMap<String, Integer>();

        for (; ; ) {
            // Three choices for the user.
            do {
                System.out.println("Choose one");
                System.out.println("  1. add a person");
                System.out.println("  2. delete a person");
                System.out.println("  3. show all persons");
                System.out.print("Choose one (type 'q' to quit): ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '3' & choice != 'q');

            if (choice == 'q') break;

            System.out.println(" \n ");

            // A switch for each of the three choices.
            switch(choice) {
                // adding a person to the HashMap by typing their name and age. Name = key, Age = value.
                case '1':
                    System.out.println("Please enter the name of the person you want to add ");
                    char x = (char) System.in.read();
                    String name = Character.toString(x);
                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');

                    System.out.println("Please enter the age of the person you want to add ");
                    char a = (char) System.in.read();
                    int age = a - '0';

                    do {
                        ignore = (char) System.in.read();
                    } while (ignore != '\n');

                    listOfPersons.put(name, age);
                    break;

                case '2':
                    // Removing a person from the HashMap by typing their name
                    System.out.println("Please enter the name of the person you want to remove ");
                    char y = (char)System.in.read();
                    String z = Character.toString(y);
                    listOfPersons.remove(z);
                    break;

                case '3':
                    // Show the total person file to the user by printing the Hashmap.
                    System.out.println(listOfPersons);
                    break;
            }
            System.out.println(" \n ");
        }
    }
}