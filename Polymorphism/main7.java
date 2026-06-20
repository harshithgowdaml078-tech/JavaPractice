package Polymorphism;

import java.util.Scanner;

public class main7 {
    static void main(String[] args) {
//Movie themovie = Movie.getmovie("S","Star Wars");
//themovie.WatchMovie();

        Scanner s = new Scanner(System.in);
        while(true) {
            System.out.println("Enter (A for Adventure and C for Comedy " +
                    " Enter (S fo ScienceFiction and Q for Quit");
            String type = s.nextLine();
            if("Qq".contains(type)) {
                break;
            }
            System.out.println("Enter Movie Title");
            String title = s.nextLine();
            Movie theMovie = Movie.getmovie(type,title);
            theMovie.WatchMovie();
        }
    }
}
