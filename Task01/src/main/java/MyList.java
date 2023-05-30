import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class MyList {
    public LinkedList<String> createList() {
        LinkedList<String> enteredList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность списка: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.printf("Введите %d элемент списка: ", i + 1);
            enteredList.add(scanner.next());
        }
        return enteredList;
    }
    public LinkedList<String> reverseList(LinkedList<String> list) {
        Collections.reverse(list);
        return list;
    }
    public void printList(String msg, LinkedList<String> list) {
        System.out.print(msg);
        System.out.println(list);
    }
}
