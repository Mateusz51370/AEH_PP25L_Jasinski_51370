/*package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proszę podaj swoje imię:");
        String forename = scanner.nextLine();

        System.out.println("Proszę podaj swoje nazwisko");
        String surname = scanner.nextLine();

        scanner.close();

        System.out.println("Witaj " + forename + " " + surname);
    }
}*/

/*package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        double x = 10;
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y = " + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));

    }
}*/

package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę");
        int x = scanner.nextInt();

        System.out.println("Licba x wynosi = " + x );

        var result = 2*x;
        System.out.println("Dwukrotność liczby x = " + result);

        result = x * x;
        System.out.println("Kwadrat liczby x = " + result);

        System.out.println("Podaj swój wiek: ");
        int wiek = scanner.nextInt();

        var rok = wiek * 365;
        System.out.println("Twój wiek w dniach: " + rok);

        var godz = rok * 24;
        System.out.println("Twój wiek w godzinach " + godz);

        var mint = godz * 60;
        System.out.println("Twój wiek w minutach " + mint);

        var sek = mint * 60;
        System.out.println("Twój wiek w sekundach " + sek);
    }
}