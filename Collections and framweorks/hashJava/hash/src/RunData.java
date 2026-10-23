import java.util.*;

public class RunData {
    static void main(String[] args) {
        List<contacts> emails = contactdata.getdata("email");
        List<contacts> phones = contactdata.getdata("phone");
        printdata("email list", emails);
        printdata("phone list", phones);

        Set<contacts> emailcontact = new HashSet<>(emails);
        Set<contacts> phonecontact = new HashSet<>(phones);
        printdata("email contact", emailcontact);
        printdata("phone data", phonecontact);
    }
    public static void printdata(String header, Collection<contacts> contact) {
        System.out.println("-----------------------");
        System.out.println(header);
        System.out.println("------------------------");
        contact.forEach(System.out::println);
    }
}
