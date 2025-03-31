public class Version2 {
    private Version2PCB[] pcbArray;
    private Version2PCB father;
    private int index;

    public Version2() {
        pcbArray = new Version2PCB[6];
        father = new Version2PCB(-1);
        pcbArray[0] = father;
        index = 1;
    }

    public void create(int parent) {
        Version2PCB process = new Version2PCB(parent);
        pcbArray[index] = process;
        pcbArray[parent].setFirstChild(index);

        index++;
    }

    public void destroy(int parent) {
        father.setFirstChild(-1);
        pcbArray = new Version2PCB[6];
        pcbArray[0] = father;
    }
}
