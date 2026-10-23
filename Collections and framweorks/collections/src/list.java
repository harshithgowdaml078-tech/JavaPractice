import java.util.ArrayList;
import java.util.Arrays;

public class list {
    static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String[] names = {"Virat", "Rohith", "Shubman", "Rahul"};
        list.addAll(Arrays.asList(names));
        System.out.println(list);
        list.addAll(Arrays.asList("Shreyas"));
        list.addAll(Arrays.asList("Jadeja", "Bumrah", "Bhuvi", "Arshdeep"));
        System.out.println(list);
        System.out.println("this list contains Shubman? "+list.contains("Shubman"));
        list.removeIf(s -> s.charAt(0) == 'J');
        System.out.println("this list contains Jadeja? "+list.contains("Jadeja"));
    }
}