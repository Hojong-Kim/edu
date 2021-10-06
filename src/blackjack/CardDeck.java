package blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    private List<Card> cards;
    // 메소드, 생성자 다른 점 2가지
    // 1. 클래스명이랑 이름이 같다.
    // 2. 리턴 타입이 없다. (리턴 타입이 있으면, 메소드가 된다.)
    public CardDeck() { // 기본 생성자
        init();
    }

    private void init() {
        String[] patters = new String[] {"스페이드", "하트", "클럽", "다이아몬드"};
        cards = new ArrayList();
        for (int i = 0; i < patters.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String denomination = String.valueOf(z);
                switch(z) {
                    case 1:
                        denomination = "A";
                        break;
                    case 11:
                        denomination = "J";
                        break;
                    case 12:
                        denomination = "Q";
                        break;
                    case 13:
                        denomination = "K";
                        break;
                    default:
                        denomination = String.valueOf(z);
                }
                Card c = new Card(patters[i], denomination);
                cards.add(c);
            }
        }

    }

    public void showAllCards() {
        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println(c);
        }
    }
}
