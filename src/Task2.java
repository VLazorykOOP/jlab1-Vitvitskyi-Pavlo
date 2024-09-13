import java.util.Scanner;
public class Task2 {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введiть розмiр масиву n (не бiльше 200): ");
        int n = sc.nextInt();

        if (n > 200) {
            System.out.println("Розмір масиву не може перевищувати 200.");
            return;
        }

        int[] a = new int[n];
        int[] duplicates = new int[n];
        int dupIndex = 0;

        System.out.println("Введiть елементи масиву:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Знаходимо повторювані елементи
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    // Перевіряємо, чи елемент ще не доданий до масиву duplicates
                    boolean alreadyInDuplicates = false;
                    for (int k = 0; k < dupIndex; k++) {
                        if (duplicates[k] == a[i]) {
                            alreadyInDuplicates = true;
                            break;
                        }
                    }
                    if (!alreadyInDuplicates) {
                        duplicates[dupIndex++] = a[i];
                    }
                }
            }
        }

        // Виводимо повторювані елементи
        System.out.println("Повторювані елементи:");
        for (int i = 0; i < dupIndex; i++) {
            System.out.print(duplicates[i] + " ");
        }
    }
}



















