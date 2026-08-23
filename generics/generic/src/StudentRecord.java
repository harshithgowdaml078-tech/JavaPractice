import java.util.Random;

public class StudentRecord implements QuearyItem{
    private String name;
    private String course;
    private int yearStarted;
    protected static Random random = new Random();
    private  static String[] names = {"Ann", "John", "cicily", "rudra", "jjj"};
   private static String[] courses = {"C++", "Python", "Java"};

 public StudentRecord() {
     int lastindex =random.nextInt(65, 91);
     name = names[random.nextInt(5)] + " " + (char) lastindex;
     course = courses[random.nextInt(3)];
     yearStarted = random.nextInt(2018, 2023) ;

 }

    @Override
    public String toString() {
        return "%-15s, %-15s, %d".formatted(name,course,yearStarted);
    }

    public int getYearStarted() {
     return yearStarted;
    }

    @Override
    public Boolean fieldmatchvalue(String fieldname, String fieldvalue) {
        String fname = fieldname.toUpperCase();
        return switch (fname) {
            case "NAME" -> name.equalsIgnoreCase(fieldvalue);
            case "COURSE" -> course.equalsIgnoreCase(fieldvalue);
            case "YEARSTARTED" -> yearStarted == (Integer.parseInt(fieldvalue));
            default -> false;
        };
    }
}
