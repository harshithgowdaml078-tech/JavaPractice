package inheritance;

public class StringManipulation {

    public static void main(String [] args) {

        printinformation("Hello World");
        printinformation("");
        printinformation("\t    \n");

    }
    public static void printinformation(String string) {
        String helloworld = "Hello World";
        System.out.printf("the index of r = %d %n",helloworld.indexOf('r'));
        System.out.printf("the index of world = %d %n",helloworld.indexOf("World"));
        System.out.printf("the index of l = %d %n", helloworld.indexOf('l'));
        System.out.printf("the index of l = %d %n", helloworld.lastIndexOf('l'));
        System.out.printf("the index of l = %d %n", helloworld.indexOf('l', 3));
        System.out.printf("the index of l = %d %n", helloworld.indexOf('l', 8));
        String hellostringLoweredcase = helloworld.toLowerCase();
        if(helloworld.equals(hellostringLoweredcase)) {
            System.out.println("value matches exactly");
        }
        if(helloworld.equalsIgnoreCase(hellostringLoweredcase)) {
            System.out.println("value matches exactly in ingnored case");
        }
        if(helloworld.contains("Hello")) {
            System.out.println("it contains");
        }
        if(helloworld.endsWith("World")) {
            System.out.println("it ends with World");
        }
        if(helloworld.startsWith("Hello")) {
            System.out.println("it starts with hello");
        }

        int length = string.length();
        if(string.isEmpty()) {
            System.out.println("String is Empty");
            return;
        }
        if(string.isBlank()) {
            System.out.println("String is Blank");
        }
        System.out.printf("the length = %d %n", length);
        System.out.printf("First char = %c %n", string.charAt(0));
        System.out.printf("Lasr Char = %c %n", string.charAt(length - 1));
    }
}
