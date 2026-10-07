import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;

public class names {
    static void main(String[] args) {
        String[] name = {"BOB", "anna", "EVE", "martha", "THOMAS"};
        Arrays.setAll(name, i -> name[i].toUpperCase());
        System.out.println(Arrays.toString(name));
        Random random = new Random();
        Arrays.setAll(name, i -> name[i] + " " +(char) ('A'+ random.nextInt(26))+ ".");
        System.out.println(Arrays.toString(name));
        Arrays.setAll(name, i ->  { String firstname = name[i].split(" ")[0];
        String reverse2 = new StringBuilder(firstname).reverse().toString();
        return name[i] + " " + reverse2;}  );
        System.out.println(Arrays.toString(name));
    }
}
