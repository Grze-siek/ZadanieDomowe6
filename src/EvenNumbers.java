public class EvenNumbers {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;
        while(number <= 100)
        {
            System.out.printf("%d, ", number);
            sum +=number;
            number += 2;
        }
        System.out.printf("\nSuma liczb przystych: %d", sum);
    }
}
