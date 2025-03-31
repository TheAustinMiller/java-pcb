import java.util.LinkedList;

public class Version2PCB {
    private int parent;
    private int firstChild;
    private int youngerSibling;
    private int olderSibling;

    public Version2PCB(int parent) {
        this.parent = parent;
        firstChild = -1;
        olderSibling = -1;
        youngerSibling = -1;
    }

    public void setFirstChild(int child) {
        firstChild = child;
    }

    public void setYoungerSibling(int sibling) {
        youngerSibling = sibling;
    }

    public void setOlderSibling(int sibling) {
        olderSibling = sibling;
    }

    public int getParent() {
        return parent;
    }

    public int getfirstChild() {
        return firstChild;
    }

    public int getYoungerSibling() {
        return youngerSibling;
    }

    public int getOlderSibling() {
        return olderSibling;
    }
}
