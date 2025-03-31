import java.util.LinkedList;

public class Version1 {
    private Version1PCB[] pcbArray;
    private int index;
    private Version1PCB father;

    public Version1() {
        pcbArray = new Version1PCB[6];
        index = 0;
        father = new Version1PCB(-1);
        pcbArray[0] = father;
        index++;
    }

    public void create(int parent) {
        Version1PCB process = new Version1PCB(parent); // new process
        pcbArray[index] = process; // places into array
        process.children = new LinkedList<Integer>(); // assigns children
        pcbArray[parent].children.add(index); // add to children list of parent

        index++;
    }

    public void destroy(int parent) {
        father.children = null;
        pcbArray = new Version1PCB[5];
        index = 0;
    }
}
