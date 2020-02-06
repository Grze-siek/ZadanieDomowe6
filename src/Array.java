import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 5 liczb całkowitych:");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();
        int fourthtNumber = scanner.nextInt();
        int fifthNumber = scanner.nextInt();
        double[] liczby = {firstNumber, secondNumber, thirdNumber, fourthtNumber, fifthNumber};
        double sum = liczby[0] + liczby[2] + liczby[4];
        System.out.printf("%.2f + %.2f + %.2f = %.2f",liczby[0],liczby[2],liczby[4],sum);
    }
    }

