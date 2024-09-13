import java.util.Scanner;

public class MatrixTransform {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Введення розміру матриці
        System.out.print("Введіть розмір матриці n (n ≤ 20): ");
        int n = sc.nextInt();
        
        if (n > 20) {
            System.out.println("Розмір матриці не може перевищувати 20.");
            return;
        }

        int[][] matrix = new int[n][n];
        
        // Введення елементів матриці
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Знаходимо максимальний елемент і його позицію
        int maxRow = 0;
        int maxCol = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > matrix[maxRow][maxCol]) {
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Переміщуємо максимальний елемент на верхній лівий кут
        if (maxRow != 0) {
            // Переміщуємо рядок
            int[] tempRow = matrix[maxRow];
            matrix[maxRow] = matrix[0];
            matrix[0] = tempRow;
        }

        // Переміщуємо стовпець
        if (maxCol != 0) {
            for (int i = 0; i < n; i++) {
                int temp = matrix[i][maxCol];
                matrix[i][maxCol] = matrix[i][0];
                matrix[i][0] = temp;
            }
        }

        // Виведення перетвореної матриці
        System.out.println("Перетворена матриця:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
