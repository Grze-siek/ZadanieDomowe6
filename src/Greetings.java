import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nameAmount = 5;
        String[] names = new String[nameAmount];
        System.out.println("Podaj 5 imion:");
        for (int i = nameAmount - 1; i >= 0; i--)
        {
            names[i] = scanner.nextLine();
        }
        for(String name: names)
            System.out.println("Cześć " + name);

        scanner.close();
    }

}
