package edu.wctc;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char input;
        Scanner keyboard = new Scanner(System.in);
        JewelFactory jewelFactory = new JewelFactory();
        Maze game = new Maze(jewelFactory);
        do {
            System.out.println(game.getCurrentRoomDescription());
            System.out.println("Exits: " + game.getCurrentRoomExits());
            System.out.print(">>");
            input = keyboard.nextLine().toLowerCase(Locale.ROOT).charAt(0);

        switch (input) {
            case 'n':
                if (game.move('n') == false) {
                    System.out.println("Sorry not a valid direction");
                }
                break;
            case 'e':
                if (game.move('e') == false) {
                    System.out.println("Sorry not a valid direction");
                }
                break;
            case 's':
                if (game.move('s') == false) {
                    System.out.println("Sorry not a valid direction");
                }
                break;
            case 'w':
                if (game.move('w') == false) {
                    System.out.println("Sorry not a valid direction");
                }
                break;
            case 'u':
                if (game.move('u') == false) {
                    System.out.println("Sorry not a valid direction");
                }
                break;
            case 'd':
                if (game.move('d') == false) {
                    System.out.println("Sorry not a valid direction");
                }
                break;
            case 'v':
                System.out.println(game.getPlayerInventory());
                break;
            case 'i':
                System.out.println(game.interactWithCurrentRoom());
                break;
            case 'x':
                String temp = game.exitCurrentRoom();
                System.out.println(temp);
                if (temp.contains("escape")) {
                    game.finish();
                }
                break;
            case 'l':
                System.out.println(game.lootCurrentRoom());
                break;
            case 'a':

                break;
            default:
                System.out.println("Invalid input");
            }
        }while(!game.isFinshed());
    }
}