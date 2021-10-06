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
        String[] patters = new String[] {"(♠ Spade)", "(♥ Heart)", "(♦ Diamond)", "(♣ Club)"};
        cards = new ArrayList();
        for (int i = 0; i < patters.length; i++) {
            for (int z = 1; z <= 13; z++) {
                String denomination = null;
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
                        denomination = String.valueOf(z);   // 2~10은 정수를 문자열로 변경
                        // denomination = z + "";
                }
                Card c = new Card(patters[i], denomination);
                cards.add(c);
                // cards.add(new Card(patters[i], denomination));
            }   // for문 종료
        }   // for문 종료
    }

    // 항상 랜덤한 카드를 준다.
    public Card getCard() {
        // if 콜렉션을 배열로 했다면 먼저 섞고, 순차적으로 카드를 주었을 것이다.
        // if 콜렉션을 ArrayList로 했다면 랜덤하게 카드를 준다.
        int rIdx = (int)(Math.random() * cards.size());
        return cards.remove(rIdx);

        // return cards.remove(int)(Math.random() * cards.size());
    }

    public void showAllCards() {
        /*
        for (int i = 0; i < cards.size(); i++) {
            Card c = cards.get(i);
            System.out.println(c);
        }
        */

        // ForEach
        for(Card c : cards) {
            System.out.println(c);
        }
    }
}
