package patterns.behavioral.memento;

public class Document {
    private String content;

    Document() {
        content = "";
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
