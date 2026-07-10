package Array;


import java.util.ArrayList;
import java.util.Arrays;

record groceryitem(String name, String type, int count) {
        public groceryitem(String name) {
            this(name, "Diary", 1);
        }
    }

    public class Arraylist {
        static void main(String[] args) {
            groceryitem[] grocerylist = new groceryitem[4];
            grocerylist[0] = new groceryitem("Milk");
            grocerylist[1] = new groceryitem("Cashew Nuts", "Nuts and fruits", 4);
            grocerylist[2] = new groceryitem("Egg", "protien source", 12);
            grocerylist[3] = new groceryitem("Spinach", "vegetables and plants", 100);
            System.out.println(Arrays.toString(grocerylist));


            ArrayList objectlist = new ArrayList();
            objectlist.add(new groceryitem("butter"));
            objectlist.add(new groceryitem("fish", "protien source", 4));
            ArrayList<groceryitem> objectList = new ArrayList<>();
            objectList.add(new groceryitem("jaggery", "sweet source", 10));
           System.out.println(objectlist);
           System.out.println(objectList);


        }

    }


