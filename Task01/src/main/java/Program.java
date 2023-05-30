import java.util.LinkedList;

public class Program {
    public void run() {
        MyList myList = new MyList();
        LinkedList<String> userList = myList.createList();
        myList.printList("Созданный список: ", userList);
        userList = myList.reverseList(userList);
        myList.printList("\"Перевернутый\" список: ", userList);
    }
}
