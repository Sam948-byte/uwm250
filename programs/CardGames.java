import utils.RandomGenerator;

public class CardGames {
    public static final String[] suits = { "Club", "Spade", "Heart", "Diamond" };

    public static class Card {
        private int num;

        public Card(int num) {
            this.num = num;
        }

        public int value() {
            return num % 9 + 1;
        }

        public String suit() {
            return suits[num / 9];
        }

        public void display() {
            System.out.println(+ value() + " of " + suit() + "s");
        }
    }

    public static void main(String[] args) {
        Card[] deck = generateDeck();

        int n = RandomGenerator.generate(0, 35);
        System.out.println(n + 1);
        deck[n].display();

        displayDeck(deck);

        System.out.println("Shuffling");
        shuffleDeck(deck, 50);
        displayDeck(deck);

    }

    public static Card[] generateDeck() {
        Card[] deck = new Card[36];

        for (int i = 0; i < deck.length; i++) {
            deck[i] = new Card(i);
        }

        return deck;
    }

    public static void displayDeck(Card[] deck) {
        for (Card card : deck) {
            card.display();
        }
    }

    public static void shuffleDeck(Card[] deck, int n) {
        Card temp;
        int j, k;

        for (int i = 0; i < n; i++) {
            j = RandomGenerator.generate(0, 35);
            k = RandomGenerator.generate(0, 35);
            temp = deck[j];
            deck[j] = deck[k];
            deck[k] = temp;
        }

    }
}