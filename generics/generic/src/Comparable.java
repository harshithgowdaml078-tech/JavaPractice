import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Comparable{
    public static void main(String[] args) {
        Integer num = 6;
        Integer array[] = {6, 7, 8, 1, 2, -14, 0, -6};
        for(Integer i : array) {
            Integer value = num.compareTo(i);
            if(value == 0) {
                System.out.printf("the value %d == compareTo=%d %n", num,i, value);
            } else if (value < 0) {
                System.out.printf("the value %d < compareTo=%d %d %n", num,i,value);
            } else  {
                System.out.printf("the value %d > compareTo=%d %d %n", num,
                        i, value);
                String fruit = "banana";
                String fruits[] = {"BANANA", "Apple", "banana", "Pear", "SweetLime"};
                for(String s : fruits) {
                    int val = fruit.compareTo(s);
                    System.out.printf("%s %s %s compateTo=%d %n",fruit,(val == 0 ? "=":(val < 0) ? "<": ">"),s,val);
                }
                Arrays.sort(fruits);
                Arrays.toString(fruits);
                System.out.println("A:"+(int)'A' + " " + " a: " +(int)'a');
                System.out.println("B:"+(int)'B' + " " + " b: " +(int)'b');
                System.out.println("S:"+(int)'S' + " " + " b: " +(int)'b');
                System.out.println("P:"+(int)'P' + " " + " b: " +(int)'b');
                    Student newstudent = new Student("tim");
                    Student [] students = {new Student("Zach"), new Student("carly"), new Student("Anna") };
                    Arrays.sort(students);
                System.out.println(Arrays.toString(students));
                System.out.println("result = " + newstudent.compareTo(new Student("TIM")));
                Comparator<Student> gpacomparartor = new studentgpacomparator();
                Arrays.sort(students, gpacomparartor);
                System.out.println(Arrays.toString(students));

            }
        }
    }
}
class studentgpacomparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
    }
}
class Student implements java.lang.Comparable<Student> {

    private static int LAST_ID = 1000;
    private static Random random = new Random();
     String name;
    private int id;
    protected double gpa;

    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(7.0, 10.0);

    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }


    // @Override
    //ublic int compareTo(Object o) {
    //  Student other = (Student) o;
    //return name.compareTo(other.name);
    //}

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }
}
