package inheritance;

public class StringMethods {
    public static void main(String [] args) {
        String newdate  = "10/03/2006";
        int startingindex = newdate.indexOf("2006");
        System.out.println("startingindex = " + startingindex);
        System.out.println("birthyear " + newdate.substring(startingindex));
        System.out.println("month = " + newdate.substring(3,5));
        String date = String.join("/","31","08","2007");
        System.out.println("Date = " +date);
        date = "05".concat("/").concat("04").concat("/").concat("1964");
        System.out.println("date = " + date);
        System.out.println("New Date = " + newdate.replace("/", "-"));
        System.out.println("Nigger\n".repeat(7));
        System.out.println("$*&#@~?".repeat(3).indent(8));



    }
}
