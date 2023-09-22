package patterns.behavioral.memento;

import java.awt.*;

public class TextEditor {

    private Document document;
    private Memento memento;

    TextEditor() {
        document = new Document();
        memento = new Memento();
        memento.save(document);
    }

    public void write(String content) {
        Document document = new Document();
        document.setContent(content);
        this.document = document;
        memento.save(document);
    }

    public String read() {
        return document.getContent();
    }

    public void undo() {
        document = memento.getPrev();
    }

    public void redo() {
        document = memento.getNext();
    }
}
