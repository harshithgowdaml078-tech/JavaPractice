import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class chaining {
    static void main(String[] args) {
        String name = "Tim";
        Function<String, String> ucase = String::toUpperCase;
        System.out.println(ucase.apply(name));
        Function<String, String>lastname = s -> s.concat(" Buchalka");
        Function<String, String> ulastcase = ucase.andThen(lastname);
        System.out.println(ulastcase.apply(name));
        ulastcase = ulastcase.compose(lastname);
        System.out.println(ulastcase.apply(name));
        Function<String, String[]> f0 = ucase.andThen(s -> s.concat(" buchulka"))
                .andThen(s -> s.split(" "));
        System.out.println(Arrays.toString(f0.apply(name)));
        Function<String, String> f1 = ucase.andThen(s -> s.concat(" buchulka"))
                .andThen(s -> s.split(" "))
                        .andThen(s -> s[1].toUpperCase() + ", " +s[0].toLowerCase());
        System.out.println(f1.apply(name));
        Function<String, Integer> f2 = ucase.andThen(s -> s.concat(" buchulka"))
                .andThen(s -> s.split(" "))
                .andThen(s-> String.join(",", s))
                        .andThen(String::length);
        System.out.println(f2.apply(name));
        String[] names = {"Ann", "Bob", "Carol"};
        Consumer<String> s0 = s-> System.out.println(s.charAt(0));
        Consumer<String> s1 = System.out::println;
        Arrays.asList(names).forEach(s0.andThen(s -> System.out.println("-")).andThen(s1));
        Predicate<String> p1 = s -> s.equals("TIM");
        Predicate<String> p2 = s -> s.equalsIgnoreCase("Tim");
        Predicate<String> p3 = s -> s.startsWith("T");
        Predicate<String> p4 = s -> s.endsWith("M");
        Predicate<String> combined1 = p1.or(p2);
        System.out.println("combined1 = " + combined1.test(name));
        Predicate<String> combined2 = p3.and(p4);
        System.out.println("combined2 = " + combined2.test(name));
        Predicate<String> combined3 = p1.and(p2).negate();
        System.out.println("combined3 = " + combined3.test(name));

    }
}
