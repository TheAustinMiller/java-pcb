import java.util.LinkedList;

public class Version1PCB {
    private int parent;
    public LinkedList<Integer> children;

    public Version1PCB(int parent) {
        this.parent = parent;
        children = new LinkedList<Integer>();
    }

    public int getParent() {
        return parent;
    }

    public LinkedList<Integer> getChildren() {
        return children;
    }
}
