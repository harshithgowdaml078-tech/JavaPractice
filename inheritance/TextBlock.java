package inheritance;

public class TextBlock {
    public static void main(String [] args) {
        String newblock = "text block\n" +
                "\t\u2022 again block\n" +
                "\t\t\u2022 new block";

        System.out.println(newblock);


        String Newblock = """
                
                text block
                   \u2022 again block
                      \u2022 new block""";
        System.out.println(Newblock);

        int age = 35;
        int birthyear = 2026 - age;
        System.out.printf("birthyear is %d%n", birthyear);
        System.out.printf("age = %d", age);
        for (int i = 1; i <= 10000; i *= 10){
            System.out.printf("printing %6d %n", i);
        }

    }

}
