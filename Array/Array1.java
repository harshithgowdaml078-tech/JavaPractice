package Array;

import java.util.Arrays;

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
        int newint[];
        //newstring = new String[] {"Virat Kohli", "Sachin Tendulkar", "Ab Develliers", "Ricky Ponnting", "Kumar Sangakkaa"};
        newint = new int[5];
        for (int i = 0; i < newint.length; i++) {
            newint[i] = newint.length - i;
        }
        for (int i = 0; i < newint.length; i++) {
            System.out.println(newint[i] + "");
        }
        System.out.println();
        for(int element : newint) {
            System.out.println(element + " = " );
        }
        System.out.println();
        System.out.println(Arrays.toString(newint));
        Object objectvariable = newint;
        if(objectvariable instanceof int[]) {
            System.out.println("Object variable is an instance of");
        }

        Object[] objecrarray = new Object[3];
        objecrarray[0] = "Hello";
        objecrarray[1] = new StringBuilder(" World");
        objecrarray[2] = newarray;
        System.out.println(Arrays.toString(objecrarray) + " ");



    }
}
