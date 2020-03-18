import java.util.Scanner;

public class SumDiagonalLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter size of array : ");
        int x = scanner.nextInt();
        if (x > 0) {
            double[][] arrNumbers = new double[x][x];
            for (int i = 0; i < arrNumbers.length; i++) {
                for (int j = 0; j < arrNumbers[i].length; j++) {
                    System.out.printf("arr[%d][%d] = ", i, j);
                    arrNumbers[i][j] = scanner.nextDouble();
                }
            }
            double sum1 = 0;
            double sum2 = 0;
            for (int i = 0; i < arrNumbers.length; i++) {
                sum1 += arrNumbers[i][i];
            }
            System.out.printf("sum1 = %.2f\n", sum1);
            for (int i = 0; i < arrNumbers.length; i++) {
                sum2 += arrNumbers[arrNumbers.length - 1 - i][i];
            }
            System.out.printf("sum2 = %.2f\n", sum2);
        } else {
            System.out.printf("Invalid input !!");
        }
    }
}

