package ex01;

class Node {
    public int empNo;
    public String name;
    public Node leftChild;
    public Node rightChild;

    public Node(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
    }

    public void displayNode() {
        System.out.print("{ " + empNo + ", " + name + " } ");
    }
}
