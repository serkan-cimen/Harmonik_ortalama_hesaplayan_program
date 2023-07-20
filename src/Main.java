import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Geçerli bir boyut girmelisiniz!");
            return;
        }

        double[] numbers = new double[n];

        System.out.print("Dizi elemanlarını giriniz : ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
        }

        double harmonicMean = calculateHarmonicMean(numbers);
        System.out.println("Dizinin harmonik ortalaması : " + harmonicMean);

        input.close();
    }

    public static double calculateHarmonicMean(double[] numbers) {
        double sumOfReciprocals = 0.0;

        for (double number : numbers) {
            sumOfReciprocals += 1.0 / number;
        }

        return numbers.length / sumOfReciprocals;
    }
}