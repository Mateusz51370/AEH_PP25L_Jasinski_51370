/*package pl.pp;
import pl.pp.Person;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Person person1 = new Person("Test", "Testowy", 25); //nowy obiekt klasy Person
        person1.hiToAll(); //wywołanie metody hiToAll() z obiektu person1 klasy Person

        person1.growOld(10); //wywołanie metody growOld( z obiektu person1 klasy Person
        person1.hiToAll();

        person1.setForename("ZmienionyTest"); //wywołanie metody tzw. "settera" do zmiany imienia
        person1.hiToAll();

        String personName = person1.getForename(); //wywołanie metody tzw. "gettera" do pobrania imienia
        int personAge = person1.getAge(); //wywołanie metody tzw. "gettera" do pobrania wieku
        System.out.println("Pobrane imię to " + personName + " z wiekiem = " + personAge);

        Circle circle1 = new Circle(1.2); //nowy obiekt klasy Circle
        circle1.getInfo(); //wywołanie metody getInfo() z obiektu circle1 klasy Circle
        circle1.setRadius(2.6); //wywołanie metody tzw. "settera" do zmiany promienia
        circle1.getInfo();

    }
}*/

package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        konto1.setNumerKonta("52138812765512");
        konto1.setEmailWlasciciela("mechanik@gmail.pl");
        konto1.setNazwaWlasciciela("Tomek Mechanik");
        konto1.setStanKonta(1000.00);
        konto1.setNumerWlasciciela("521341211");

        System.out.println("Konto: "+ konto1.getNazwaWlasciciela() + " ("+ konto1.getEmailWlasciciela()+ " / "+ konto1.getNumerWlasciciela()+") -> Stan konta: "+ konto1.getStanKonta() + " PLN ("+ konto1.getNumerKonta()+")");
        konto1.wyciagKonto(900);
        konto1.zasilKonto(250);
        konto1.wyciagKonto(50);
        konto1.wyciagKonto(350);
    }
}