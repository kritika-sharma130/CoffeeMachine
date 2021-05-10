/*   Created by IntelliJ IDEA.
 *   Author: Kritika Sharma
 *   Date: 11-05-2021
 *   Time: 03:37
 *   File: CoffeeMachine.java
 */
//code for coffee machine

import java.util.Scanner;

class CoffeeMachine {
    static int water = 400;
    static int milk = 540;
    static int coffeeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String action;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    System.exit(0);

            }
        } while (action != "exit");
    }

    private static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        if (money == 0) {
            System.out.println(money + " of money");
        } else {
            System.out.println("$" + money + " of money");
        }
        System.out.println();
    }

    private static void take() {
        System.out.println();
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }

    private static void fill() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println();
        System.out.println("Write how many ml of water do you want to add:");
        float w = scanner1.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        float m = scanner1.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        float c = scanner1.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int d = scanner1.nextInt();
        System.out.println();
        water += w;
        milk += m;
        coffeeBeans += c;
        disposableCups += d;
    }

    public static void buy() {
        Scanner scanner2 = new Scanner(System.in);
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String n = scanner2.nextLine();
        switch (n) {
            case "1":
                if (water >= 250 && coffeeBeans >= 16) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                    disposableCups = disposableCups - 1;
                } else if (water < 250 && coffeeBeans >= 16) {
                    System.out.println("Sorry, not enough water!");
                } else {
                    System.out.println("Sorry, not enough coffeeBeans!");
                }
                System.out.println();
                break;

            case "2":
                if (water >= 350 && coffeeBeans >= 20 && milk >= 75) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 350;
                    coffeeBeans -= 20;
                    milk -= 75;
                    money += 7;
                    disposableCups = disposableCups - 1;
                } else if (water < 350 && coffeeBeans >= 20 && milk >= 75) {
                    System.out.println("Sorry, not enough water!");
                } else if (water >= 350 && coffeeBeans < 20 && milk >= 75) {
                    System.out.println("Sorry, not enough coffeeBeans!");
                } else if (water >= 350 && coffeeBeans >= 20 && milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (water < 350 && coffeeBeans < 20 && milk >= 75) {
                    System.out.println("Sorry, not enough coffeeBeans and water!");
                } else if (water >= 350 && coffeeBeans < 20 && milk < 75) {
                    System.out.println("Sorry, not enough coffeeBeans and milk!");
                } else if (water < 350 && coffeeBeans >= 20 && milk < 75) {
                    System.out.println("Sorry, not enough water and milk!");
                } else {
                    System.out.println("Sorry, not enough resources!");
                }
                System.out.println();
                break;

            case "3":
                if (water >= 200 && coffeeBeans >= 12 && milk >= 100) {
                    System.out.println("I have enough resources, making you a coffee!");
                    water -= 200;
                    coffeeBeans -= 12;
                    milk -= 100;
                    money += 6;
                    disposableCups = disposableCups - 1;
                } else if (water < 200 && coffeeBeans >= 12 && milk >= 100) {
                    System.out.println("Sorry, not enough water!");
                } else if (water >= 200 && coffeeBeans < 12 && milk >= 100) {
                    System.out.println("Sorry, not enough coffeeBeans!");
                } else if (water >= 200 && coffeeBeans >= 12 && milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (water < 200 && coffeeBeans < 12 && milk >= 100) {
                    System.out.println("Sorry, not enough coffeeBeans and water!");
                } else if (water >= 200 && coffeeBeans < 12 && milk < 100) {
                    System.out.println("Sorry, not enough coffeeBeans and milk!");
                } else if (water < 200 && coffeeBeans >= 12 && milk < 100) {
                    System.out.println("Sorry, not enough water and milk!");
                } else {
                    System.out.println("Sorry, not enough resources!");
                }
                System.out.println();
                break;

            default:
                System.out.println();
                main(new String[0]);
                break;
        }
    }
}

