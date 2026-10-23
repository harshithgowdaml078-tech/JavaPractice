

import java.util.*;

public class Main {

    public static void main(String[] args) {


        Card[] facecard = new Card[13];
        Card aceofhearts = Card.getFaceCard(Card.Suit.HEART, 'A');
        Arrays.fill(facecard, aceofhearts);
        Card.printDeck(Arrays.asList(facecard), "Ace of Hearts", 1);
        List<Card> cards = new ArrayList<>(52);
        Collections.fill(cards, aceofhearts);
        System.out.println(cards);
        System.out.println("cards.size() = " + cards.size() );
        List<Card> acesofhearts = Collections.nCopies(13, aceofhearts);
        Card.printDeck(acesofhearts, "ACES OF HEARTS", 1);
        Card kingsofclubs = Card.getFaceCard(Card.Suit.CLUB, 'K');
        List<Card> ks = Collections.nCopies(13,kingsofclubs);
        Card.printDeck(ks, "KINGS OF CLUBS", 1);


        Collections.addAll(cards, facecard);
        Collections.addAll(cards, facecard);
        Card.printDeck(cards, "LIST ADD ALL ACE OF HEARTS",2);
        Collections.copy(cards, ks);
        Card.printDeck(cards, "KINGS OF CLUB COPY", 2);

        List<Card>copy = List.copyOf(ks);
        Card.printDeck(ks, "FULL COPY OF KS", 1);
        List<Card> deck = Card.getStandardDeck();
        Card.printDeck(deck);
        Collections.shuffle(deck);
        Card.printDeck(deck, "FULL SHUFFULED DECK", 4);
        Collections.reverse(deck);
        Card.printDeck(deck, "REVERSE SHUFFLING OF DECK", 4);
        var sorting = Comparator.comparing(Card::rank).thenComparing(Card::suit);
        Collections.sort(deck, sorting);
        Card.printDeck(deck, "SORTING EVERY CARD", 13);
        Collections.reverse(deck);
        Card.printDeck(deck, "sorted by rank, suit reversed", 13);
        List<Card> kings = new ArrayList<>(deck.subList(1, 4));
        Card.printDeck(kings, "kings in deck", 1);
        List<Card> tens = new ArrayList<>(deck.subList(16, 20));
        Card.printDeck(tens, "tens in deck", 1);
        Collections.shuffle(deck);
        int sublistindex = Collections.indexOfSubList(deck, tens);
        System.out.println("sublist index for ten = " + sublistindex);
        System.out.println("tens contains all = " + deck.contains(tens));
        boolean disjoint = Collections.disjoint(tens, deck);
        System.out.println("disjoint 1 = " + disjoint);
        boolean disjoint2 = Collections.disjoint(kings, tens);
        System.out.println("disjoint 2 = " + disjoint2);
        deck.sort(sorting);
        Card tensofhearts = Card.getNumericCard(Card.Suit.HEART, 10);
        int foundindex = Collections.binarySearch(deck, tensofhearts, sorting);
        System.out.println("index found = " + foundindex);
        System.out.println(deck.get(foundindex));
        Card tensofclubs = Card.getNumericCard(Card.Suit.CLUB, 10);
        Collections.replaceAll(deck, tensofclubs, tensofhearts);
        Card.printDeck(deck.subList(32, 36), "tens of hearts", 1);
        System.out.println("frequency of tens of clubs = " + Collections.frequency(deck, tensofclubs));
        System.out.println("max card = " + Collections.max(deck, sorting));
        System.out.println("min card = " + Collections.min(deck, sorting));
        var sortbysuit = Comparator.comparing(Card ::suit).thenComparing(Card::rank);
        deck.sort(sortbysuit);
        Card.printDeck(deck, "sorted by suit", 4);
        List<Card> copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, 2);
        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("rotated: " + 2 + ": " + copied);
        copied = new ArrayList<>(deck.subList(0, 13));
        Collections.rotate(copied, -2);
        System.out.println("Unrotated: " + deck.subList(0, 13));
        System.out.println("rotated: " + -2 + ": " + copied);
        copied = new ArrayList<>(deck.subList(0, 13));
        for(int i=0; i<copied.size() / 2; i++) {
            Collections.swap(copied, i, copied.size()-1-i);
        }
        System.out.println("manual reverse = " + copied);
    }
}

