package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    private static Map<Tree.COLOR, Tree> treeMap = new HashMap<>();

    public static Tree getTree(Tree.COLOR color) {
        Tree tree = treeMap.get(color);
        if (tree == null) {
            tree = new Tree(color);
            treeMap.put(color, tree);
        }
        return tree;
    }
}
