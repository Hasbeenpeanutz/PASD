package assignment;

public class NodeQueue {
    StudentQueue data;
    NodeQueue next;

    public NodeQueue(StudentQueue data, NodeQueue next) {
        this.data = data;
        this.next = next;
    }
}
