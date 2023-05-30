import java.util.LinkedList;

public class MyLinkedList {
    private LinkedList<String> myList;
    public MyLinkedList() {
        myList = new LinkedList<>();
    }
    public void enqueue(String element) {
        myList.addLast(element);
    }
    public String dequeue() {
        if (!myList.isEmpty()) return myList.pollFirst();
        else throw new RuntimeException("List is empty");
    }
    public String first() {
        if (!myList.isEmpty()) return myList.peekFirst();
        else throw new RuntimeException("List is empty");
    }
    public void print() {
        System.out.println(myList);
    }
}
