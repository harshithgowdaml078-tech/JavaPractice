package Polymorphism;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void WatchMovie() {
        String instancetype = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instancetype + " film");
    }
}
class Adventure extends Movie{
    public Adventure(String title) {
        super(title);
    }

    @Override
    public void WatchMovie() {
        super.WatchMovie();
        System.out.printf("...%s%n".repeat(3),
                 "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }
}
class Comedy extends Movie {
    public Comedy(String title) {
            super(title);
        }

        @Override
        public void WatchMovie() {
            super.WatchMovie();
            System.out.printf("...%s%n".repeat(3),
                    "something funny happens",
                    "something even funnier happens",
                    "happy ending");
        }

}
class Scifi extends Movie {
    public Scifi(String title) {
        super(title);
    }

    @Override
    public void WatchMovie() {
        super.WatchMovie();
        System.out.printf("...%s%n".repeat(3),
                "Alien attack Earth",
                "Space guys fight with aliens",
                "Planet at end of time wait for part -2");
    }

}


