/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Main {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Laptop laptop = null;

        while (true) {
            // Pilihan laptop
            System.out.println("Select your laptop:");
            System.out.println("1. Lenovo");
            System.out.println("2. Toshiba");
            System.out.println("3. MacBook");
            System.out.println("4. EXIT");
            System.out.print("Enter your choice (1-4): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 4) {
                System.out.println("Exiting...");
                scanner.close();
                return;
            }

            switch (choice) {
                case 1:
                    laptop = new Lenovo();
                    break;
                case 2:
                    laptop = new Toshiba();
                    break;
                case 3:
                    laptop = new MacBook();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue; // Go back to the start of the loop
            }

            // Menu perintah
            while (true) {
                System.out.println("Enter command (ON, OFF, UP, DOWN, BACK): ");
                String command = scanner.nextLine().toUpperCase();

                switch (command) {
                    case "ON":
                        laptop.turnOn();
                        break;
                    case "OFF":
                        laptop.turnOff();
                        break;
                    case "UP":
                        laptop.increaseVolume();
                        break;
                    case "DOWN":
                        laptop.decreaseVolume();
                        break;
                    case "BACK":
                        System.out.println("Going back to laptop selection...");
                        break; // Break out of the command loop to select a new laptop
                    default:
                        System.out.println("Invalid command. Please try again.");
                }

                // If the user wants to go back, break the command loop
                if (command.equals("BACK")) {
                    break;
                }
            }
        }
    }
}

