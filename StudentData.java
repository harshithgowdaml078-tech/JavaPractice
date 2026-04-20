public class StudentData {
    private String id;
    private String name;
    private String DOB;
    private String Classlist;

    public StudentData(String id, String name, String DOB, String classlist) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        Classlist = classlist;
    }

    @Override
    public String toString() {
        return "StudentData{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", Classlist='" + Classlist + '\'' +
                '}';
    }
}
