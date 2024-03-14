import java.io.IOException;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class Nail {
    public static void main(String[] args) throws Exception {
        // Создаем сканер
        Scanner scanner = new Scanner(System.in);
        // Считываем строку
        String line = scanner.nextLine();
        // Проверяем входящую строку на пустоту
        if (line.isEmpty()) {
            throw new IOException("Не верное выражение");
        }
        // Выполняем сложение строк,если в строке содержится плюс
        if (line.contains("+")) {
            // Делим строку на две части
            String[] lines = line.split("\\+");
            // Проверяем что получилось 2 строки
            if (lines.length != 2) {
                throw new IOException("Не верное выражение");
            }
            // Достаем строки из массива
            String word1 = lines[0];
            String word2 = lines[1];
            // Проверяем что слова в кавычках
            if (!word1.startsWith("\"") || !word1.endsWith("\"") || !word2.startsWith("\"") || !word2.endsWith("\"")) {
                throw new IOException("В выражение отсутствуют кавычки");
            }
            // Удаляем первые и последние символы строк
            word1 = word1.substring(1, word1.length() - 1);
            word2 = word2.substring(1, word2.length() - 1);
            // Проверяем длину строк
            if (word1.length() > 10 || word2.length() > 10) {
                throw new IOException("Строка содержит более 10 символов");
            }
            // Выводим результат сложения
            System.out.println(STR."\"\{word1 + word2}\"");
        }
        //Выполняем вычитание строк,если в строке содержится минус
        if (line.contains("-")) {
            // Делим строку на две части
            String[] lines = line.split("-");
            // Проверяем что получилось 2 строки
            if (lines.length != 2) {
                throw new IOException("Не верное выражение");
            }
            // Достаем строки из массива
            String word1 = lines[0];
            String word2 = lines[1];
            // Проверяем что слова в кавычках
            if (!word1.startsWith("\"") || !word1.endsWith("\"") || !word2.startsWith("\"") || !word2.endsWith("\"")) {
                throw new IOException("В выражение отсутствуют кавычки");
            }
            // Удаляем первые и последние символы строк
            word1 = word1.substring(1, word1.length() - 1);
            word2 = word2.substring(1, word2.length() - 1);
            // Проверяем длину строк
            if (word1.length() > 10 || word2.length() > 10) {
                throw new IOException("Строка содержит более 10 символов");
            }
            // Выводим результат вычитания
            System.out.println(word1.replaceAll(word2, ""));
        }
        // Выполняем умножение строк,если в строке содержится множитель
        if (line.contains("*")) {
            // Делим строку на две части
            String[] lines = line.split("\\*");
            // Проверяем что получилось 2 строки
            if (lines.length != 2) {
                throw new IOException("Не верное выражение");
            }
            // Достаем строки из массива
            String word = lines[0];
            // Преобразуем вторую строку в число, если окажется не число, то выскочит исключение
            int number = Integer.parseInt(lines[1]);
            // Проверяем что слово в кавычках
            if (!word.startsWith("\"") || !word.endsWith("\"")) {
                throw new IOException("В выражение отсутствуют кавычки");
            }
            // Удаляем первые и последние символы строк
            word = word.substring(1, word.length() - 1);
            // Проверяем длину строк
            if (word.length() > 10) {
                throw new IOException("Строка содержит более 10 символов");
            }
            // Проверяем диапозон нашего числа
            if (number < 1 || number > 10) {
                throw new IOException("Число не входит в диапозон");
            }
            // Умножаем строки
            String result = word.repeat(number);
            // Проверяем кол-во символом и выводим результат
            if (result.length() <= 40) {
                System.out.println(STR."\"\{result}\"");

            } else {
                System.out.println(STR."\"\{STR."\{result.substring(0, 40)}..."}\"");
            }
        }
        //Выполняем деление строк,если в строке содержится делитель
        if (line.contains("/")) {
            // Делим строку на две части
            String[] lines = line.split("/");
            // Проверяем что получилось 2 строки
            if (lines.length != 2) {
                throw new IOException("Не верное выражение");
            }
            // Достаем строки из массива
            String word = lines[0];
            // Преобразуем вторую строку в число, если окажется не число, то выскочит исключение
            int number = Integer.parseInt(lines[1]);
            // Проверяем что слово в кавычках
            if (!word.startsWith("\"") || !word.endsWith("\"")) {
                throw new IOException("В выражение отсутствуют кавычки");
            }
            // Удаляем первые и последние символы строк
            word = word.substring(1, word.length() - 1);
            // Проверяем длину строк
            if (word.length() > 10) {
                throw new IOException("Строка содержит более 10 символов");
            }
            // Проверяем диапозон нашего числа
            if (number < 1 || number > 10) {
                throw new IOException("Число не входит в диапозон");
            }
            // Делим строки
            String result = word.substring(0, word.length() / number);
            // Выводим результат
            System.out.println(STR."\"\{result}\"");

        }
    }
}