package patterns.behavioral.memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    @Test
    public void test() {
        TextEditor editor = new TextEditor();
        assertEquals("", editor.read());
        editor.write("text1");
        assertEquals("text1", editor.read());
        editor.write("text2");
        assertEquals("text2", editor.read());

        editor.undo();
        assertEquals("text1", editor.read());
        editor.redo();
        assertEquals("text2", editor.read());
        editor.write("text3");
        assertEquals("text3", editor.read());
    }

    @Test
    public void undo() {
        TextEditor editor = new TextEditor();
        assertEquals("", editor.read());
        editor.write("text1");
        assertEquals("text1", editor.read());
        editor.undo();
        editor.undo();
        editor.undo();
        assertEquals("", editor.read());
    }

    @Test
    public void redo() {
        TextEditor editor = new TextEditor();
        assertEquals("", editor.read());
        editor.write("text1");
        assertEquals("text1", editor.read());
        editor.undo();
        assertEquals("", editor.read());
        editor.redo();
        assertEquals("text1", editor.read());
        editor.redo();
        editor.redo();
        editor.redo();
        assertEquals("text1", editor.read());
    }

    @Test
    public void rewrite() {
        TextEditor editor = new TextEditor();
        assertEquals("", editor.read());
        editor.write("text1");
        assertEquals("text1", editor.read());
        editor.write("text2");
        assertEquals("text2", editor.read());
        editor.undo();
        assertEquals("text1", editor.read());
        editor.write("text3");
        assertEquals("text3", editor.read());
        editor.redo();
        assertEquals("text3", editor.read());
        editor.redo();
        editor.redo();
        assertEquals("text3", editor.read());
        editor.undo();
        assertEquals("text1", editor.read());
    }
}
