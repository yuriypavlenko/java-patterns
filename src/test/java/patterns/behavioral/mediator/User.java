package patterns.behavioral.mediator;

public class User {
    private Chat chat;
    private String name;

    User(Chat chat, String name) {
        this.chat = chat;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message) {
        System.out.printf("%s send message: %s \n", name, message);
        chat.sendMessage(this, message);
    }

    public void receiveMessage(String message) {
        System.out.printf("%s received message: %s \n", name, message);
    }
}
