package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsGroup {
    private List<Subscriber> subscribers;

    public NewsGroup() {
        subscribers = new ArrayList<Subscriber>();
    }

    public NewsGroup addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
        return this;
    }

    public void message(String message) {
        subscribers.forEach(subscriber -> subscriber.event(message));
    }
}
