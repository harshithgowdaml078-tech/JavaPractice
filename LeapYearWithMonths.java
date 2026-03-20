public class LeapYearWithMonths {
    public static void main (String [] args) {
        System.out.println(getDaysandMonths(2, 2008));
        System.out.println(getDaysandMonths(2, 2006));
        System.out.println(getDaysandMonths(3, 2008));
        System.out.println(getDaysandMonths(1, 2012));
        System.out.println(getDaysandMonths(11, 2016));
        System.out.println(getDaysandMonths(8, 2002));
        System.out.println(getDaysandMonths(2, 2020));
        System.out.println(getDaysandMonths(7, 2016));
        System.out.println(getDaysandMonths(3, 2024));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getDaysandMonths(int month, int year) {

        if(year < 1 || year > 9999) {
            return -1;
        }
        return switch(month) {
           case 1, 3, 5, 7, 8, 10 , 12 -> 31;
           case 2 -> isLeapYear(year) ? 29 : 28;
           case 4, 6, 9, 11 -> 30;
            default -> -1;
        };
    }
}
