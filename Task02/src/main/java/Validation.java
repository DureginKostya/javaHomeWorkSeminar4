import java.util.Scanner;

public class Validation {
    public String validationEnterOperator() {
        System.out.print("Выполнить: ");
        Scanner scanner = new Scanner(System.in);
        String operator = scanner.next().trim().toLowerCase();
        Program program = new Program();
        while (true) {
            if ((operator.equals("a")) || (operator.equals("d")) || (operator.equals("f")) || (operator.equals("p")) || (operator.equals("e"))) {
                return operator;
            } else {
                System.out.println("!!! Введен неправильный оператор, пожалуйста повторите ввод !!!");
                System.out.println();
                program.printHint();
                System.out.print("Выполнить: ");
                operator = scanner.next().trim().toLowerCase();
            }
        }
    }
}
