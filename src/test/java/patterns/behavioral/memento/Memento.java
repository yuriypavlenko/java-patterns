package patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;
public class Memento {
    private final List<Document> documents;
    private int position = -1;

    Memento() {
        documents = new ArrayList<>();
    }

    private void deleteAllFrom(int position) {
        if (documents.size() > position) {
            documents.subList(position, documents.size()).clear();
        }
    }

    public void save(Document document) {
        int size = documents.size();
        if (position < size - 1) {
            deleteAllFrom(position + 1);
        }
        documents.add(document);
        position++;
    }

    public Document getPrev() {
        if (position > 0) {
            position--;
        }
        return documents.get(position);
    }

    public Document getNext() {
        if (position < documents.size() - 1) {
            position++;
        }
        return documents.get(position);
    }
}
