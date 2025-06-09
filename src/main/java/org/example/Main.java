package org.example;

import java.util.Scanner;

public class Main {
    private final static Scanner scanner = new Scanner(System.in);
    private final static LemonadeStand lemonadeStand = new LemonadeStand();

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void mainMenu() {
        label:
        while (true) {
            System.out.println("--------------------------------");
            System.out.println(" Main Menu");
            System.out.println("--------------------------------");
            System.out.println("1. Enter Normal Sale");
            System.out.println("2. Enter Custom Sale");
            System.out.println("3. Enter Discount Sale"); // inserted NEW discounted sale
            System.out.println("4. Display Inventory");
            System.out.println("5. Display Money");
            System.out.println("6. Buy Supplies");
            System.out.println("7. Exit");

            String choice = scanner.nextLine();

            // changed if statement to switch statement after IntelliJ suggestion
            switch (choice) {
                case "1":
                    enterNormalSale();
                    break;
                case "2":
                    enterCustomSale();
                    break;
                case "3":  // inserted NEW discount sale
                    enterDiscountSale();
                    break;
                case "4":
                    displayInventory();
                    break;
                case "5":
                    displayMoney();
                    break;
                case "6":
                    buySupplies();
                    break;
                case "7":
                    System.out.println("Goodbye!");
                    break label;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

        }
    }

    public static void enterNormalSale() {
        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade()) {
                System.out.println("Lemonade sold!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }

    public static void enterCustomSale() {
        System.out.println("Enter the number of lemons to use:");
        int lemons = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of sugar to use:");
        int sugar = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of ice to use:");
        int ice = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade(lemons, sugar, ice)) {
                System.out.println("Lemonade sold!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }

    // NEW Discounted sale option
    public static void enterDiscountSale() {
        System.out.println("Enter the number of lemonades to sell:");
        int numLemonades = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the discount percentage:");
        int discountAmount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numLemonades; i++) {
            if (lemonadeStand.sellLemonade(discountAmount)) {
                System.out.println("Lemonade sold for " + discountAmount + "% off!");
            } else {
                System.out.println("Not enough supplies to sell lemonade.");
            }
        }
    }


    public static void displayInventory() {
        System.out.println("Lemons: " + lemonadeStand.getLemons());
        System.out.println("Sugar: " + lemonadeStand.getSugar());
        System.out.println("Ice: " + lemonadeStand.getIce());
    }

    public static void displayMoney() {
        System.out.println("Money: $" + lemonadeStand.getMoney());
    }

    public static void buySupplies() {
        System.out.println("Enter the number of lemons to buy:");
        int lemons = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of sugar to buy:");
        int sugar = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the number of ice to buy:");
        int ice = Integer.parseInt(scanner.nextLine());

        lemonadeStand.buySupplies(lemons, sugar, ice);
    }
}