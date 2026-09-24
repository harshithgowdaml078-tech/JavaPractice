import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Sigma", "Gamma", "Alpha"));
        for(String s1 : list) {
            System.out.println(s1);
        }
        System.out.println("-----------");
        list.forEach((var mystring) -> System.out.println(mystring));
        System.out.println("----------");
        list.forEach((var mystring) -> {char first = mystring.charAt(0);
            System.out.println(mystring + " means " + first); });
        var coords = Arrays.asList(new double[]{312.678, -678.342}, new double[]{765.876, -897.745}, new double[]{145.123, -175.983} );
        coords.forEach(s -> System.out.println(Arrays.toString(s)));
        list.removeIf(s -> s.equalsIgnoreCase("Sigma"));
        list.forEach(s ->System.out.println(s));
        list.removeIf(s -> s.startsWith("Ga"));
        list.forEach(s-> System.out.println(s));

        int result = calculator((a,b)-> a+b, 5, 2);
        String result1 = calculator((String a, String b) -> a+b, "green", "lantern");
        BiConsumer<Double, Double> p1 = (lat, lang) -> System.out.printf("[lat:%.3f long:%.3f]%n", lat, lang);
    }
    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2) {
        T result = function.apply(value1, value2);
        System.out.println("return result = " + result);
        return result;
    }
    public static <T> void processpoint(T t1, T t2, BiConsumer<T,T> consumer) {
        consumer.accept(t1, t2);
    }
}
