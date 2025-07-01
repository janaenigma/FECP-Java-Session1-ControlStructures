package org.example;
import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter membership status (Regular, VIP, Premium): ");
        String status = input.nextLine().toLowerCase();

        System.out.print("Enter age: ");
        int age = input.nextInt();

        float price = 0;
        switch (status) {
            case "regular":
                if (age < 18) price = 50;
                else if (age >= 18 && age <= 64) price = 100;
                else if (age > 64) price = 75;
                break;
            case "vip":
                if (age < 18) price = 75;
                else if (age >= 18 && age <= 64) price = 150;
                else if (age > 64) price = 112.5f;
                break;
            case "premium":
                if (age < 18) price = 100;
                else if (age >= 18 && age <= 64) price = 200;
                else if (age > 64) price = 150;
                break;
            default:
                System.out.println("Invalid membership status entered.");
                break;
        }
        System.out.printf("Price: $" + "%.2f%n", price);

    }
}