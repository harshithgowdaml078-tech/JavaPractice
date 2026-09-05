import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    record person (String firstname, String lastname) {

        @Override
        public String toString() {
            return firstname + " " + lastname;
        }
    }

    static void main(String[] args) {
        List<person> cricketer = new ArrayList<>(List.of(new Main.person("Virat", "Kohli"),
                new person("MS", "Dhoni"),
                new person("Sourav", "Ganguly"),
                new person("KL", "Rahul")));
         var comparator = new Comparator<person>() {


             @Override
             public int compare(person o1, person o2) {
                 return o2.lastname.compareTo(o1.lastname);
             }
         };
        cricketer.sort((o1, o2) -> o2.lastname.compareTo(o1.lastname));
        System.out.println(cricketer);

        interface Enhancedcompartor<T> extends Comparator<person> {
            int newcompare(T  o1, T o2);
        }

        var mixedcomparator = new Enhancedcompartor<person>() {
            @Override
            public int compare(person o1, person o2) {
                int result = o1.lastname.compareTo(o2.lastname);
                return (result == 0 ? newcompare(o1, o2) : result)  ;
            }

            @Override
            public int newcompare(person o1, person o2) {
                return o1.firstname.compareTo(o2.firstname);
            }
        };
        cricketer.sort(mixedcomparator);
        System.out.println(cricketer);

    }
}

