/*package pl.pp;
import pl.pp.Person;

public class mojaDziewiataAplikacja {
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

public class MojaDziewiataAplikacja {
    public static void main(String[] args) {
        pl.pp.Magazyn magazyn1 = new pl.pp.Magazyn();
        magazyn1.setEmailKontaktu("kontakt@gmail.com");
        magazyn1.setNumerKontaktu("424444234");
        magazyn1.setPrzestrzenMagazynu(5000);

        System.out.println("Kontakt:" + magazyn1.getEmailKontaktu() + " numer: " + magazyn1.getNumerKontaktu() + " Przestrzen magazynu: " + magazyn1.getPrzestrzenMagazynu());
        magazyn1.DodajTowar(3000);
        magazyn1.OdejmijTowar(1000);
        magazyn1.DodajTowar(2500);
        double zajetosc=5000-magazyn1.getPrzestrzenMagazynu();
        System.out.println("Zajete: "+zajetosc);
    }
}