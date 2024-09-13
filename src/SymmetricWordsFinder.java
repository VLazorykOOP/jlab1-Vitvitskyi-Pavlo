
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SymmetricWordsFinder {

    // Метод для перевірки, чи є слово симетричним (паліндромом)
    public static boolean isSymmetric(String word) {
        word = word.toLowerCase(); // Приводимо слово до нижнього регістру
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Метод для знаходження та друку симетричних слів
    public static void findSymmetricWords(String text) {
        // Розділяємо текст на слова, прибираючи пробіли та розділові знаки
        String[] words = text.split("[\\s,;:.!?]+");
        List<String> symmetricWords = new ArrayList<>();

        for (String word : words) {
            if (isSymmetric(word)) {
                symmetricWords.add(word);
            }
        }

        // Друкуємо всі симетричні слова
        if (symmetricWords.isEmpty()) {
            System.out.println("Немає симетричних слів.");
        } else {
            System.out.println("Symmetric words: " + symmetricWords);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Користувач вводить текст
        System.out.println("Введіть текст:");
        String text = sc.nextLine();

        // Викликаємо метод для пошуку симетричних слів
        findSymmetricWords(text);

        sc.close();
    }
}
