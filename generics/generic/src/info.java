import java.util.ArrayList;
import java.util.List;

public class info {
    static void main(String[] args) {
        int count = 10;
        List<StudentRecord> students = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            students.add(new StudentRecord());
            students.add(new LpaStudent());
        }
        printlist(students);


        List<LpaStudent> lpastudent = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            lpastudent.add(new LpaStudent());
        }
        printlist(lpastudent);
        testlist(new ArrayList<String>(List.of("cyclops", "storm", "beast", "jean grey")));
        testlist(new ArrayList<Integer>(List.of(1, 2, 3, 4)));
        var querylist = new QueryList<>(lpastudent);
        var matches = querylist.getmatcjvallue("course", "python");
        printlist(matches);
    }
    public static void printlist(List < ? extends StudentRecord> students) {
        for (var student : students) {
            System.out.println(student);
            System.out.println();
        }
    }
        public static void testlist(List<?> list) {
            for(var element : list) {
                if(element instanceof String s) {
                    System.out.println(" " + s.toUpperCase());
                } else if (element instanceof  Integer i) {
                    System.out.println(" " + i.floatValue());
                }
            }
        }

}
