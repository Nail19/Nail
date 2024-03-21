import java.io.IOException;

public class Calculator {
    public void plus(String word1, String word2) throws IOException {
        // Проверяем что слова в кавычках
        if (!word1.startsWith("\"") || !word1.endsWith("\"") || !word2.startsWith("\"") || !word2.endsWith("\"")) {
            throw new IOException("В выражение отсутствуют кавычки");
        }
        // Проверяем строку на наличие лишних пробелов
        word1 = word1.replace(" ", "");
        word2 = word2.replace(" ", "");
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

    public void minus(String word1, String word2) throws IOException {
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
        // Проверяем наличие лишних пробелов и выводим результат вычитания
        String result = word1.replaceAll(word2, "");
        System.out.println("\"" + result + "\"");

    }

    public void multiplication(String word, int number) throws IOException {
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

    public void division(String word, int number) throws IOException {
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
