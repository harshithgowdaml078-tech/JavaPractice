public class Height {
    public static void convertToCentimeters(int heightinInches) {
        double centimeter = heightinInches * 2.54;
        System.out.println("no of centimeter is " + centimeter);
    }
    public static void convertToCentimeters(int heightinFeet, int heightinInches) {
        double inches = ((heightinFeet * 12) + heightinInches) * 2.54;
        System.out.println("height in inches " + inches);
    }
    public static void main(String [] args) {
      convertToCentimeters(71);
      convertToCentimeters(5, 11);
    }
}
