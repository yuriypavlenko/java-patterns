package patterns.structural.flyweight;

public class Tree implements Drawable {
    private String color;

    public Tree(COLOR color) {
        System.out.println("Creating new tree with color " + color);
        switch (color) {
            case RED -> this.color = "Red";
            case GREEN -> this.color = "Green";
            case BLUE -> this.color = "Blue";
        }
    }

    @Override
    public void draw(int x, int y) {
        System.out.printf("Draw tree with color %s on position %s, %s", color, x, y);
        System.out.println();
    }

    public enum COLOR {
        RED,
        GREEN,
        BLUE
    }
}
