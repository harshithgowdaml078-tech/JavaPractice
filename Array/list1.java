package Array;

import java.util.ArrayList;
import java.util.List;

public class list1 {
    static void main(String[] args) {
        String[] items = {"Eggs", "Banana", "Bread Loaf", "Chowmien"};
        List<String> list = List.of(items);
        //System.out.println(list);

        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("Mango");
        //System.out.println(groceries);

        ArrayList<String>Groceies = new ArrayList<>(List.of("Yoghurt", "Cheese", "Curd", "Spices"));
        //System.out.println(Groceies);

        groceries.addAll(Groceies);
        System.out.println(groceries);
    }
}
