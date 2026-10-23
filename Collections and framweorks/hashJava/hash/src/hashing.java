import java.util.*;

public class hashing {
    static void main(String[] args) {
        String atext = "Hello";
        String btext = "Hello";
        String ctext = String.join("l", "He", "lo");
        String dtext = "He".concat("llo");
        String etext = "hello";

        List<String> text =Arrays.asList(atext, btext, ctext, dtext, etext);
        text.forEach(s -> System.out.println(s + ": " + s.hashCode()));
        Set<String> myset = new HashSet<>(text);
        System.out.println("my set = " + myset);
        System.out.println("size = " + myset.size());
        for(String myvalues : myset) {
            System.out.println("my value " + myvalues);
            for(int i=0; i<text.size(); i++) {
                if(myvalues == text.get(i)) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println(" ");
        }

        playingcard aceofhearts = new playingcard("heart", "ace");
        playingcard kingsofclubs = new playingcard("clubs", "king");
        playingcard queenofspades = new playingcard("spades", "queen");
        List<playingcard> cards = Arrays.asList(aceofhearts, kingsofclubs, queenofspades);
        cards.forEach(s -> System.out.println(s + ": " + s.hashCode()));
        Set<playingcard> deck = new HashSet<>();
        for(playingcard c : cards) {
            if(!deck.add(c)) {
                System.out.println("duplicate found " + c);
            }

        }
        System.out.println(deck);

    }
}
