package coders.iyun6;

import coders.iyun6.exception.AxtarilanUserMovcudDeyil;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();

        User user1 = new User(1, "Matin", "Imanzade", 21);
        User user2 = new User(2, "Vusal", "Rahimli", 21);
        User user3 = new User(3, "Nicat", "Almemmedli", 21);

        Card card1 = new Card(user1, "0001", LocalDate.of(2024, Month.OCTOBER, 15), 100.0);
        Card card2 = new Card(user2, "0002", LocalDate.of(2024, Month.JANUARY, 23), 150.0);
        Card card3 = new Card(user3, "0003", LocalDate.of(2024, Month.OCTOBER, 8), 200);

        cards.add(card1);
        cards.add(card2);
        cards.add(card3);


    }

    public static double getAmount(Card card) {
        return card.getAmount();
    }

    public static boolean cardToCard(Card senderCard, Card receiverCard, double amount) {
//        Optional<User> optionalUserSender = Optional.of(senderCard.getUser()).orElseThrow(new AxtarilanUserMovcudDeyil());
//        Optional<User> optionalUserReceiver = Optional.of(receiverCard.getUser());
//        Stream<Card> cardStream =
        return true;
//        Supplier
    }
}
