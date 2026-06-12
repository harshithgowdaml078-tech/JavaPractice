package inheritance;

public class StringBuilder {
    static void main(String [] args) {


        String helloword = "Hello" + "World";
        helloword.concat(" and goodbye");
        java.lang.StringBuilder Builder = new java.lang.StringBuilder("Hello" + "World");
        Builder.append("and goobye");
        printinformation(helloword);
        printinformation(Builder);
        java.lang.StringBuilder emptystart = new java.lang.StringBuilder();

        emptystart.append("a".repeat(57));
        java.lang.StringBuilder emptystart32 = new java.lang.StringBuilder(32);

        emptystart32.append("a".repeat(32));
        printinformation(emptystart);
        printinformation(emptystart32);
        java.lang.StringBuilder builderplus = new java.lang.StringBuilder("hElLOo World");
        builderplus.append(" and goodbye");
        builderplus.deleteCharAt(16).insert(16, 'G');
        System.out.println(builderplus);
        builderplus.reverse().setLength(6);
        System.out.println(builderplus);

    }


    public static void printinformation(String string) {
        System.out.println(" string = " + string);
        System.out.println(" length = " + string.length());
    }
    public static  void printinformation(java.lang.StringBuilder builder) {
        System.out.println(" builder = " + builder);
        System.out.println(" length = " + builder.length());
        System.out.println(" length = " + builder.capacity());
    }
}
