import java.util.Scanner;

class MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Вибір типу введення
        System.out.println("Введіть тип даних для m та n (1 для цілого, 2 для дійсного): ");
        int inputType = sc.nextInt();

        // Вибір типу виведення
        System.out.println("Введіть тип результату (1 для цілого, 2 для дійсного): ");
        int outputType = sc.nextInt();

        double m = 0, n = 0;

        // Введення даних
        if (inputType == 1) {
            System.out.println("Введіть m (ціле число):");
            m = sc.nextInt();
            System.out.println("Введіть n (ціле число):");
            n = sc.nextInt();
        } else if (inputType == 2) {
            System.out.println("Введіть m (дійсне число):");
            m = sc.nextDouble();
            System.out.println("Введіть n (дійсне число):");
            n = sc.nextDouble();
        } else {
            System.out.println("Неправильний вибір типу даних!");
            return;
        }

        // Обчислення результату
        double result = ((n + 1) / (n * n * m + 2)) + ((m + n) / (m - n)) + n * n * n;

        // Виведення результату
        if (outputType == 1) {
            System.out.println("Результат (ціле число): " + (int) result);
        } else if (outputType == 2) {
            System.out.println("Результат (дійсне число): " + result);
        } else {
            System.out.println("Неправильний вибір типу результату!");
        }
    }
}
