import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe z przedziału [100,200] podzielną przez 3: ");
        int userNumber = scanner.nextInt();

        while(userNumber <= 100 ||  userNumber >= 200 || !(userNumber%3 == 0)){
            if(userNumber <= 100) {
                System.out.println("Podana liczba jest za mała");
                System.out.println("Podaj liczbę");
                userNumber = scanner.nextInt();
                continue;
            }
            if(userNumber >= 200) {
                System.out.println("Podana liczba jest za duża");
                System.out.println("Podaj liczbę");
                userNumber = scanner.nextInt();
                continue;
            }
            if(!(userNumber%3 == 0)) {
                System.out.println("Podana liczba nie jest podzielna przez 3");
                System.out.println("Podaj liczbę");
                userNumber = scanner.nextInt();
            }
        }

        System.out.println("Twoja liczba jest ok!");
        scanner.close();
    }
}
