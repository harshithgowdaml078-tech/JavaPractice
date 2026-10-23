import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Transac {
    public void main(String[] args) {
        List<transaction> transac = new ArrayList<>();
        transac.add(new transaction("DE0001", 500, "debit", "swiggy"));
        transac.add(new transaction("DE0002", 800, "debit", "rapido"));
        transac.add(new transaction("CRE0001", 1500, "credit", "appa"));
        transac.add(new transaction("CRE0002", 220, "credit", "praveen"));
        transac.add(new transaction("DE0003", 550, "debit", "swiggy"));
        transac.add(new transaction("DE0004", 330, "debit", "bookmyshow"));

        //transac.forEach(s -> System.out.println(s));
      var sorting = Comparator.comparing(transaction::getAmount);
        Collections.sort(transac, sorting);
        System.out.println("-----sorted-----");
        transac.forEach(System.out::println);
        transaction highest = Collections.max(transac, sorting);
        transaction lowest = Collections.min(transac, sorting);
        System.out.println("max = " + highest + " min = " + lowest);
        Collections.reverse(transac);
        System.out.println("----reverse------");
        transac.forEach(System.out::println);
        Collections.shuffle(transac);
        System.out.println("--------------shuffled---------");
        transac.forEach(System.out::println);
        transaction swiggy = new transaction("", 0, "", "swiggy");
        int count1 =    Collections.frequency(transac, swiggy);
        System.out.println("occured = " + count1);
    }
}
