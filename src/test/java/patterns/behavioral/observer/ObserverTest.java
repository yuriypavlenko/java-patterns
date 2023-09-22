package patterns.behavioral.observer;

import org.junit.jupiter.api.Test;

public class ObserverTest {

    @Test
    public void test() {
        NewsGroup newsGroup = new NewsGroup();

        Participant user1 = new Participant("Jack");
        Participant user2 = new Participant("Elen");
        Participant user3 = new Participant("Antony");

        newsGroup.addSubscriber(user1).addSubscriber(user3);

        newsGroup.message("message for all subscribers!");
    }
}
