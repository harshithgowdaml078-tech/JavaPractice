package Polymorphism;

public class main7 {
    static void main(String[] args) {
Movie themovie = new Movie("Star Wars");
themovie.WatchMovie();
Movie adventure = new Adventure("Life of Walter Mitty");
adventure.WatchMovie();
Movie comedy = new Comedy("Hangover");
comedy.WatchMovie();
Movie scifi = new Scifi("Arrival");
scifi.WatchMovie();
    }
}
