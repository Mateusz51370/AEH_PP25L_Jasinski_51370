package pl.pp;
import java.util.ArrayList;
import java.util.List;

// Interfejs typPalwia
interface TypPaliwa {
    String getTypPaliwa();
}

// Klasa abstrakcyjna Pojazd
abstract class Pojazd {
    private String nrRejestracyjny;
    private String numerVin;
    private String kolor;
    private String cena;
    private double spalanie;
    private double poziomPaliwa;
    private double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, String cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void prowadz() {
        System.out.println("Pojazd o numerze rejestracyjnym " + nrRejestracyjny + " jest prowadzony.");
    }

    public void zatankuj() {
        System.out.println("Pojazd o numerze rejestracyjnym " + nrRejestracyjny + " został zatankowany.");
        this.poziomPaliwa = 100.0; // Załóżmy, że tankowanie uzupełnia paliwo do pełna
    }

    // Gettery dla pól
    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public String getNumerVin() {
        return numerVin;
    }

    public String getKolor() {
        return kolor;
    }

    public String getCena() {
        return cena;
    }

    public double getSpalanie() {
        return spalanie;
    }

    public double getPoziomPaliwa() {
        return poziomPaliwa;
    }

    public double getPrzebieg() {
        return przebieg;
    }

    @Override
    public String toString() {
        return "Numer rejestracyjny: " + nrRejestracyjny + ", VIN: " + numerVin + ", Kolor: " + kolor +
                ", Cena: " + cena + ", Spalanie: " + spalanie + ", Poziom paliwa: " + poziomPaliwa +
                ", Przebieg: " + przebieg;
    }
}

// Implementacje interfejsu TypPaliwa
class Diesel implements TypPaliwa {
    @Override
    public String getTypPaliwa() {
        return "diesel";
    }
}

class Benzyna implements TypPaliwa {
    @Override
    public String getTypPaliwa() {
        return "benzyna";
    }
}

class Elektryk implements TypPaliwa {
    @Override
    public String getTypPaliwa() {
        return "elektryk";
    }
}

// Klasy dziedziczące po Pojazd
class Osobowe extends Pojazd implements TypPaliwa {
    private int liczbaDrzwi;
    private TypPaliwa silnik;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, String cena, double spalanie, double poziomPaliwa, double przebieg, int liczbaDrzwi, TypPaliwa silnik) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.silnik = silnik;
    }

    public int getLiczbaDrzwi() {
        return liczbaDrzwi;
    }

    @Override
    public String getTypPaliwa() {
        return silnik.getTypPaliwa();
    }

    @Override
    public String toString() {
        return "Osobowy - " + super.toString() + ", Liczba drzwi: " + liczbaDrzwi + ", Typ paliwa: " + getTypPaliwa();
    }
}

class Ciezarowka extends Pojazd implements TypPaliwa {
    private double dodatkowePoleLadownosc;
    private TypPaliwa silnik;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, String cena, double spalanie, double poziomPaliwa, double przebieg, double dodatkowePoleLadownosc, TypPaliwa silnik) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.dodatkowePoleLadownosc = dodatkowePoleLadownosc;
        this.silnik = silnik;
    }

    public double getDodatkowePoleLadownosc() {
        return dodatkowePoleLadownosc;
    }

    @Override
    public String getTypPaliwa() {
        return silnik.getTypPaliwa();
    }

    @Override
    public String toString() {
        return "Ciężarówka - " + super.toString() + ", Ładowność: " + dodatkowePoleLadownosc + " ton, Typ paliwa: " + getTypPaliwa();
    }
}

class Motocykl extends Pojazd implements TypPaliwa {
    private boolean posiadaDostawke;
    private TypPaliwa silnik;

    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, String cena, double spalanie, double poziomPaliwa, double przebieg, boolean posiadaDostawke, TypPaliwa silnik) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
        this.silnik = silnik;
    }

    public boolean isPosiadaDostawke() {
        return posiadaDostawke;
    }

    @Override
    public String getTypPaliwa() {
        return silnik.getTypPaliwa();
    }

    @Override
    public String toString() {
        return "Motocykl - " + super.toString() + ", Posiada dostawkę: " + (posiadaDostawke ? "Tak" : "Nie") + ", Typ paliwa: " + getTypPaliwa();
    }
}

class SprzetBudowlany extends Pojazd implements TypPaliwa {
    private double przepracowaneGodziny;
    private TypPaliwa silnik;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, String cena, double spalanie, double poziomPaliwa, double przebieg, double przepracowaneGodziny, TypPaliwa silnik) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
        this.silnik = silnik;
    }

    public double getPrzepracowaneGodziny() {
        return przepracowaneGodziny;
    }

    @Override
    public String getTypPaliwa() {
        return silnik.getTypPaliwa();
    }

    @Override
    public String toString() {
        return "Sprzęt budowlany - " + super.toString() + ", Przepracowane godziny: " + przepracowaneGodziny + ", Typ paliwa: " + getTypPaliwa();
    }
}

// Klasa testowa
class TestWypozyczalni {
    public static void main(String[] args) {
        List<Pojazd> pojazdy = new ArrayList<>();

        // Tworzenie przykładowych pojazdów
        Osobowe samochod1 = new Osobowe("KR12345", "VIN1234567890ABCD1", "Czerwony", "50000 PLN", 8.5, 75.0, 120000.0, 4, new Benzyna());
        Ciezarowka ciezarowka1 = new Ciezarowka("WA98765", "VINABCDEFFEDCBA987", "Biały", "150000 PLN", 25.0, 50.0, 300000.0, 10.5, new Diesel());
        Motocykl motocykl1 = new Motocykl("GD54321", "VIN0987654321ABCDEF", "Czarny", "15000 PLN", 4.0, 90.0, 30000.0, false, new Benzyna());
        SprzetBudowlany koparka1 = new SprzetBudowlany("BZ11111", "VIN1122334455667788", "Żółty", "300000 PLN", 40.0, 80.0, 5000.0, 2500.0, new Diesel());
        Osobowe samochodElektryczny = new Osobowe("WW00000", "VIN9988776655443322", "Niebieski", "100000 PLN", 0.0, 95.0, 10000.0, 5, new Elektryk());

        pojazdy.add(samochod1);
        pojazdy.add(ciezarowka1);
        pojazdy.add(motocykl1);
        pojazdy.add(koparka1);
        pojazdy.add(samochodElektryczny);

        // Wywołanie metod i wyświetlenie informacji
        System.out.println("--- Lista pojazdów w wypożyczalni ---");
        for (Pojazd pojazd : pojazdy) {
            System.out.println(pojazd);
            pojazd.prowadz();
            if (pojazd.getPoziomPaliwa() < 60) {
                pojazd.zatankuj();
            }
            // Sprawdzenie typu paliwa (jeśli pojazd implementuje TypPaliwa)
            if (pojazd instanceof TypPaliwa) {
                TypPaliwa pojazdZTypemPaliwa = (TypPaliwa) pojazd;
                System.out.println("Typ paliwa: " + pojazdZTypemPaliwa.getTypPaliwa());
            }
            System.out.println("------------------------------------");
        }

        // Przykład dodatkowego działania
        System.out.println("\n--- Dodatkowe działania ---");
        System.out.println("Samochód 1 (benzyna):");
        System.out.println("Przed tankowaniem poziom paliwa: " + samochod1.getPoziomPaliwa());
        samochod1.zatankuj();
        System.out.println("Po tankowaniu poziom paliwa: " + samochod1.getPoziomPaliwa());

        System.out.println("\nKoparka 1 (diesel):");
        koparka1.prowadz();
        System.out.println("Przepracowane godziny: " + koparka1.getPrzepracowaneGodziny());
    }
}