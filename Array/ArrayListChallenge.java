package Array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayListChallenge {
    private static Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        boolean flag = true;
        ArrayList<String> groceries = new ArrayList<>();
        while (flag) {
            printactions();
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addgroceries(groceries);
                case 2 -> removegroceries(groceries);
                default -> flag = false;
            }
            groceries.sort(Comparator.naturalOrder());
            System.out.println(groceries);
        }

    }

    private static void addgroceries (ArrayList<String> groceries) {
        System.out.println("Add item [Seperate items by comma]");
        String[] items = scanner.nextLine().split(",");
        for(String i : items) {
            String trimmed = i.trim();
           if(groceries.indexOf(trimmed) < 0) {
               groceries.add(trimmed);
           }
        }
    }

    private static void removegroceries (ArrayList<String> groceries) {
        System.out.println("remove item [Seperate items by comma]");
        String[] items = scanner.nextLine().split(",");
        for(String i : items) {
            String trimmed = i.trim();
            groceries.remove(trimmed);
        }
    }




    private static void printactions () {
        String textblock = "Available actions:\n" +
                "\n" +
                "0 - to shutdown\n" +
                "\n" +
                "1 - to add item(s) to list (comma delimited list)\n" +
                "\n" +
                "2 - to remove any items (comma delimited list)\n" +
                "\n" +
                "Enter a number for which action you want to do:";
        System.out.println(textblock + " ");
    }
}
