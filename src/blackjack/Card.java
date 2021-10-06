package blackjack;

public class Card {
    private String pattern;    // 무늬
    private String denomination;    // 숫자, 값

    public Card(String pattern, String denomination) {
        this.pattern = pattern;
        this.denomination = denomination;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getDenomination() {
        return this.denomination;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", this.pattern, this.denomination);
    }
}

