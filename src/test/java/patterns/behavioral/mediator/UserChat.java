package patterns.behavioral.mediator;

import java.util.ArrayList;

public class UserChat implements Chat {
    ArrayList<User> users;

    UserChat() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        System.out.printf("%s connect to chat \n", user.getName());
        users.add(user);
    }

    @Override
    public void sendMessage(User user, String message) {
        for (User chatUser : users) {
            if (chatUser != user) {
                chatUser.receiveMessage(message);
            }
        }
    }
}
