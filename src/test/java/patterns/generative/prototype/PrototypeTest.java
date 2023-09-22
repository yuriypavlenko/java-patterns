package patterns.generative.prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrototypeTest {

    @Test
    public void test() {
        Tree tree1 = new Tree("Apple", "yellow");
        Tree tree2 = (Tree) tree1.clone();

        assertEquals(tree1.getType(), tree2.getType());
        assertEquals(tree1.getColor(), tree2.getColor());
    }
}
