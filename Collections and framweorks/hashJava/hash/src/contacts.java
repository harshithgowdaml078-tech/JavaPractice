import java.util.HashSet;
import java.util.Set;

public class contacts {
    private String name;
    private Set<String> phones = new HashSet<>();
    private  Set<String> emails = new HashSet<>();

    public contacts(String name) {
        this(name, null);
    }
    public contacts(String name, String email) {
        this(name, email, 0);
    }
    public contacts(String name, long phone) {
        this(name, null, phone);
    }
    public contacts(String name, String email, long phone) {
        this.name = name;
        if(email!= null) {
            emails.add(email);
        }
        if(phone > 0) {
            String p = String.valueOf(phone);
            p = "(%s) %s %s".formatted(p.substring(0,3), p.substring(3, 6), p.substring(6));
            phones.add(p);
        }
    }



    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }
    contacts mergedatacontact(contacts contact) {
    contacts newcontact = new contacts(name);
    newcontact.emails = new HashSet<>(this.emails);
    newcontact.phones = new HashSet<>(this.phones);
    newcontact.emails.addAll(contact.emails);
    newcontact.phones.addAll(contact.phones);
    return  newcontact;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        contacts contacts = (contacts) o;
        return getName().equals(contacts.getName());
    }

    @Override
    public int hashCode() {
        return 33 * getName().hashCode();
    }
    public
}
