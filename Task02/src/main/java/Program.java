import java.util.Scanner;

public class Program {
    public void run() {
        MyLinkedList linkedList = new MyLinkedList();
        Validation validation = new Validation();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            printHint();
            switch (validation.validationEnterOperator()) {
                case "a" -> {
                    System.out.print("Введите элемент: ");
                    linkedList.enqueue(scanner.next());
                    System.out.println("Новый элемент добавлен в очередь.");
                }
                case "d" -> System.out.printf("Из очереди удален первый элемент - %s\n", linkedList.dequeue());
                case "f" -> System.out.printf("Первый элемент в очереди - %s\n", linkedList.first());
                case "p" -> {
                    System.out.print("Очередь: ");
                    linkedList.print();
                }
                case "e" -> System.exit(0);
            }
        }
    }
    public void printHint() {
        String msg = new StringBuilder()
                .append("Введите одно из действий:\n")
                .append("1. Добавить элемент в конец очереди - << a >>\n")
                .append("2. Просмотреть первый элемент из очереди и удаляет его - << d >>\n")
                .append("3. Просмотреть первый элемент в очереди - << f >>\n")
                .append("4. Просмотреть всю очередь - << p >>\n")
                .append("6. Выйти - << e >>")
                .toString();
        System.out.println(msg);
    }
}
