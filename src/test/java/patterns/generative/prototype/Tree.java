package patterns.generative.prototype;

public class Tree implements Clonable {
    private String type;
    private String color;

    Tree(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    @Override
    public Clonable clone() {
        return new Tree(this.type, this.color);
    }
}
