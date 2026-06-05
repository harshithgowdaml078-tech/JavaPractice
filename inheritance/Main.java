package inheritance;

public class Main extends Object{

  public static void main(String[] args) {
      Student jimmy = new Student("Jimmy", 21);
      System.out.println(jimmy);
      parentname carole = new parentname("Jimmy", 21, "carole");
       System.out.println(carole);
  }

  static class Student {
      private String name;
      private int age;
      Student(String name, int age) {
          this.name = name;
          this.age = age;
      }

      @Override
      public String toString() {
          return name + " is " + age + " year old ";
          //return "Student{" +
             //     "name='" + name + '\'' +
                 // ", age=" + age +
                 // '}';
      }
  }
  static class parentname extends Student {
   private String Parentname;
   parentname(String name, int age, String Parentname) {
       super(name, age);
       this.Parentname = Parentname;
   }

      @Override
      public String toString() {
       return Parentname + "'s kid " + super.toString();
          //return "parentname{" +
                  //"Parentname='" + Parentname + '\'' +
                 // ", name='" + name + '\'' +
                 // ", age=" + age +
                  //"} " + super.toString();
      }
  }
}
