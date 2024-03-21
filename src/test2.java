import java.io.IOException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) throws Exception {
        // Создаем сканер
        Scanner scanner = new Scanner(System.in);
        // Считываем строку
        String line = scanner.nextLine();
        // Проверяем входящую строку на пустоту
        if (line.isEmpty()) {
            throw new IOException("Неверное выражение");
        }
        // Создаем массив строки
        String[] lines;
        //Определяем знак выражения
        char expression;
        if (line.contains(" + ")) {
            lines = line.split(" \\+ ");
            expression = '+';
        } else if (line.contains(" - ")) {
            lines = line.split(" - ");
            expression = '-';
        } else if (line.contains(" * ")) {
            lines = line.split(" \\* ");
            expression = '*';
        } else if (line.contains(" / ")) {
            lines = line.split(" / ");
            expression = '/';
        } else {
            throw new Exception("Некорректный знак действия или не указан пробел перед и после знака выражение");
        }
        if (lines.length != 2) {
            throw new IOException("Не верное выражение");
        }
        Calculator calculator = new Calculator();
        switch (expression) {
            case '+':
                calculator.plus(lines[0], lines[1]);
                break;
            case '-':
                calculator.minus(lines[0], lines[1]);
                break;
            case '*':
                // Достаем строки из массива
                String word = lines[0];
                // Преобразуем вторую строку в число, если окажется не число, то выскочит исключение
                int number = Integer.parseInt(lines[1]);
                calculator.multiplication(word, number);
                break;
            case '/':
                // Достаем строки из массива
                String word1 = lines[0];
                // Преобразуем вторую строку в число, если окажется не число, то выскочит исключение
                int number1 = Integer.parseInt(lines[1]);
                calculator.division(word1, number1);
                break;
            default:
                throw new Exception("Некорректный знак действия или не указан пробел перед и после знака выражение");
        }
    }
}
