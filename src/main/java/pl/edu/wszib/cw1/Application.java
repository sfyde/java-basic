package pl.edu.wszib.cw1;

public class Application {

    public static void main(String[] args) {

        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(100, RodzajTruskawki.ANANASOWA, RodzajSmaku.CIASTECZKOWY);
        koktajlTruskawkowy.pij();
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.smak();

        int myVar =5;
        test(myVar);
        System.out.println(myVar);

    }

    public static void test(int myVar){
        myVar = 10;
    }

}
