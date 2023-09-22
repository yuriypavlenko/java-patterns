package patterns.behavioral.mediator;

import org.junit.jupiter.api.Test;

public class MediatorTest {

    @Test
    public void test() {
        UserChat chat = new UserChat();

        User user1 = new User(chat, "Jack");
        User user2 = new User(chat, "Erika");
        User user3 = new User(chat, "Piter");

        chat.addUser(user1);
        chat.addUser(user2);
        chat.addUser(user3);

        user2.sendMessage("Hi all!");
    }
}