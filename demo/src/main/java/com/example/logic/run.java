package com.example.logic;

import java.util.ArrayList;
import java.util.Scanner;

import com.example.logic.Module.ModuleArrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class run {

    public static void main(String[] args) {

        while (true) {
            ModuleArrays moduleArrays = new ModuleArrays();
            ArrayList<Module> unselectedModules = moduleArrays.getUnselectedModules();

            System.out.println("Wat wil je doen?");
            System.out.println("Wil je iets creëren? Typ: CREATE");
            System.out.println("Wil je iets weergeven? Typ: VIEW");
            Scanner scan = new Scanner(System.in);

            String inputA = scan.nextLine();
            if (inputA.equals("CREATE")) {

                System.out.println("Wat wil je creëren?");
                System.out.println("Wil je een cursus creëren? Typ: CURSUS");
                System.out.println("Wil je een cursist creëren? Typ: CURSIST");
                System.out.println("Wil je een inschrijving creëren? Typ: INSCHR");
                System.out.println("Wil je een certificaat creëren? Typ: CERT");
                String inputB = scan.nextLine();
                if (inputB.equals("CURSUS")) {
                    System.out.println("Wat is de cursusnaam?");
                    String naam = scan.nextLine();
                    Scanner input = new Scanner(System.in);
                    System.out.println("Selecteer een module:");
                    System.out.println(unselectedModules);
                    int moduleIndex = input.nextInt();
                    int i = 1;
                    for (Module m : unselectedModules) {
                        System.out.println(i + ". " + m.getTitel());
                        i++;
                    }
                    moduleArrays.addModuleToCourse(unselectedModules.get(moduleIndex));

                } else if (inputB.equals("CURSUSIST")) {
                    System.out.println("Wat is de naam van de cursist?");
                    String naam = scan.nextLine();
                    System.out.println("Wat is de email van de cursist?");
                    String email = scan.nextLine();
                    while (true) {
                        System.out.print("Wat is de email van de cursist? ");
                        String input = scan.nextLine();
                        if (hasNext(input)) {
                            // The input is a valid email address
                            System.out.println("Valid email address: " + input);
                            email = input;
                            break;
                        } else {
                            // The input is not a valid email address
                            System.out.println("Invalid email address. Please enter a valid email address.");
                        }
                    }

                } else if (inputA.equals("VIEW")) {
                    System.out.println("Wat wil je weergeven?");
                    String inputC = scan.nextLine();
                    if (inputC.equals("CURSIST")) {
                        System.out.println();
                    } else if (inputA.equals("CURSUS")) {
                        System.out.println();
                    } else if (inputA.equals("CERTIFICAAT")) {
                        System.out.println();
                    } else if (inputA.equals("INSCHRIJVING")) {
                        System.out.println();
                    } else
                        System.out.println("ERROR LMAO");

                }
            }
        }
    }

    public static boolean hasNext(String input) {
        // Regular expression for email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        // Compile the regular expression
        Pattern pattern = Pattern.compile(emailRegex);
        // Match the input against the regular expression
        Matcher matcher = pattern.matcher(input);
        // Return true if the input is a valid email address
        return matcher.matches();
    }
}
