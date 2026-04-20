public class NewData {
    public static void main(String [] args) {
        for(int i = 1; i <= 5; i++) {
            StudentData s = new StudentData("245678" + i, switch(i) {
                case 1 -> "Alok";
                case 2 -> "Ashok";
                case 3 -> "bharath";
                case 4 -> "chintan";
                case 5 -> "daryl";
                default -> "Anonymous";
            }, "11/03/1997", "Java Masterclass" );
            System.out.println(s);
        }
    }
}
