package pl.pp;
import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1, num2;
        System.out.println("Podaj dolną i górną granice (muszą być to liczby całkowite)");
        while (true) {
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();

            if (num1 < num2) {
                int sumaKwadratow = 0;
                for (int i = num1; i <= num2; i++) {
                    sumaKwadratow += i * i;
                }
                System.out.println("Suma kwadratów od " + (num1 * num1) + " do " + (num1 * num2) + " wynosi " + sumaKwadratow);
                System.out.println("Jeżeli chcesz zamknąć program, wpisz te same liczby");
                System.out.println("A jeżeli chcesz kontynuować, podaj kolejne liczby");
            } else {
                System.out.println("Koniec");
                break;
            }
        }

        double liczba1, liczba2, wynik;
        while(true){
            System.out.println("Witaj w prostym kalkulatorze, wybierz opcje");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.println("5. Wyjście");
            int opcja = scanner.nextInt();

            switch (opcja) {
                case 1:
                    System.out.print("Podaj pierwszą liczbę: ");
                    liczba1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    liczba2 = scanner.nextDouble();
                    wynik = liczba1 + liczba2;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 2:
                    System.out.print("Podaj pierwszą liczbę: ");
                    liczba1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    liczba2 = scanner.nextDouble();
                    wynik = liczba1 - liczba2;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 3:
                    System.out.print("Podaj pierwszą liczbę: ");
                    liczba1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    liczba2 = scanner.nextDouble();
                    wynik = liczba1 * liczba2;
                    System.out.println("Wynik: " + wynik);
                    break;
                case 4:
                    System.out.print("Podaj pierwszą liczbę: ");
                    liczba1 = scanner.nextDouble();
                    System.out.print("Podaj drugą liczbę: ");
                    liczba2 = scanner.nextDouble();
                    if (liczba2 != 0) {
                        wynik = liczba1 / liczba2;
                        System.out.println("Wynik: " + wynik);
                    } else {
                        System.out.println("Nie można dzielić przez zero.");
                    }
                    break;
                case 5:
                    System.out.println("Dowidzenia");
                    return;
                default:
                    System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
        }
    }
}
