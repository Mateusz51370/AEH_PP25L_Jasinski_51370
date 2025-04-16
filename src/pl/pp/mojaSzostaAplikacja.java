/*package pl.pp;

public class mojaSzostaAplikacja {
    public static void main(String[] args) {

        // Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji
        System.out.println("Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji");
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #1 to " + finalScore);
        }

        // Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji (innych niż poprzednio)
        System.out.println("Obliczenia i wyświetlenie wyniku dla wartości przypisanych w kodzie aplikacji (innych niż poprzednio)");
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #2 to " + finalScore);
        }

        // Obliczenia za pomocą metody calculateScore_noArguments(), ale nadal dla wartości przypisanych w kodzie metody
        System.out.println("Obliczenia za pomocą metody calculateScore_noArguments(), ale nadal dla wartości przypisanych w kodzie metody");
        calculateScore_noArguments();

        // Obliczenia za pomocą metody calculateScore(), ale tym razem dla wartości wpisanych do argumentu wywołania metody
        System.out.println("Obliczenia za pomocą metody calculateScore(), ale tym razem dla wartości wpisanych do argumentu wywołania metody");
        calculateScore_arguments(true, 2500, 9, 2500);
        // można to wywołać za pomocą wcześniej zadeklarowanych zmiennych
        calculateScore_arguments(gameOver, score, levelCompleted, bonus);
        // ale widzicie, że wyświetlanie funkcji jest również z numerkiem #4 (bo takie wyświetlanie jest zapisane
        // w metodzie. Co zrobić, żeby tak nie było? Poniżej:

        // Obliczenia i wyświetlanie można uniezależnić od siebie dodając parametr, który ta metoda będzie zwracać
        System.out.println("Obliczenia i wyświetlanie można uniezależnić od siebie dodając parametr, który ta metoda będzie zwracać za pomocą return");
        finalScore = calculateScore_argumentsReturn(gameOver, score, levelCompleted, bonus);
        System.out.println("Twoj wynik #5 to " + finalScore);
    }

    private static void calculateScore_noArguments() {
        boolean gameOver = true;
        int score = 150;
        int levelCompleted = 2;
        int bonus = 1000;

        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #3 to " + finalScore);
        }
    }
    private static void calculateScore_arguments(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Twoj wynik #4 to " + finalScore);
        }
    }
    private static int calculateScore_argumentsReturn(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}*/
package pl.pp;

import java.util.Scanner;

public class mojaSzostaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Podaj Liczbe N ");
            int liczbaN = scanner.nextInt();

            long czasStartuIter = System.nanoTime();
            //metodaIter(10000000);
            long wynikIter = metodaIter(liczbaN);
            long czasStopIter = System.nanoTime();
            long czasTrwaniaIter = (czasStopIter - czasStartuIter); // / 1000000;

            System.out.println("Silnia metoda Iteracyjna " + wynikIter);
            System.out.println("Czas trwania (Iteracyjnie) " + czasTrwaniaIter);

            long czasStartuReku = System.nanoTime();
            //metodaReku(10000000);
            long wynikReku = metodaReku(liczbaN);
            long czasStopReku = System.nanoTime();
            long czasTrwaniaReku = (czasStopReku - czasStartuReku); // / 1000000;

            System.out.println("Silnia metoda Rekurencyjna " + wynikReku);
            System.out.println("Czas trwania (Rekurencyjnie) " + czasTrwaniaReku);
        }

        public static long metodaIter(long LiczbaN) {
            long wynik = 1;
            for (int i = 1; i <= LiczbaN; i++) {
                wynik *= i;
            }
            return wynik;
        }

        public static long metodaReku(long LiczbaN) {
            if (LiczbaN < 2) {
                return 1;
            }
            else {
                return LiczbaN * metodaReku(LiczbaN - 1);
            }
    }
}