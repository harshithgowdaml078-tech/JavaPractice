package Array;

public class Array1 {
    static void main(String[] args) {
        int[] newarray = new int[5];
        newarray[3] = 18;
        newarray[2] = 7;
        System.out.println("1st Array = " + newarray[3] + " and 2nd Array = " + newarray[2] );
        double[] newdouble = new double[] {5.5, 10.5, 12.98, 3.67, 6.35};
        System.out.println("First = " + newdouble[0]);
        int newlength = newdouble.length;
        System.out.println("Length = " + newlength);
        System.out.println("last = " +newdouble[ (newlength - 1)]);
        String newstring[];
        newstring = new String[] {"Virat Kohli", "Sachin Tendulkar", "Ab Develliers", "Ricky Ponnting", "Kumar Sangakkaa"};
        for (int i = 0; i < newstring.length; i++) {
            System.out.println(newstring[i] + "");
        }
    }
}
