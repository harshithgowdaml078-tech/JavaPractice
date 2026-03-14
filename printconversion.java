public class printconversion {
    public static long toMilesPerHour(double kilometersPerHour) {
            if(kilometersPerHour < 0) {
                return -1;
            }
            long toMilesPerHour= Math.round(kilometersPerHour / 1.609);
         return toMilesPerHour;
        }
        public static void printConversion(double kilometersPerHour) {
            if(kilometersPerHour < 0) System.out.println("Invalid value");
            else {
                long toMilesPerHour = Math.round(kilometersPerHour / 1.609);
                System.out.println(kilometersPerHour + "XX km/h = " + toMilesPerHour + "YY mi/h");
            }

        }
    }
    public static void main(String [] args) {
    printconversion.printConversion(10.25);
    printconversion.printConversion(5.5);
    printconversion.printConversion(6.7);
    printconversion.printConversion(7.9);
    printconversion.printConversion(-1);
    printconversion.printConversion(2);
    }
