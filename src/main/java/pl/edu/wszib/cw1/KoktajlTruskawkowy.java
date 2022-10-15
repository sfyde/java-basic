package pl.edu.wszib.cw1;

/**
 * Rodzaj truskawek:
 * annasowa
 * Honeoye
 * Polka
 * Kent
 * Christin
 */
public class KoktajlTruskawkowy extends Koktajl implements Smakowalne  {

    private final RodzajTruskawki rodzajTruskawki;

    private final RodzajSmaku rodzajSmaku;


    public KoktajlTruskawkowy(
            final int kcal,
            final RodzajTruskawki rodzajTruskawki,
            final RodzajSmaku rodzajSamku
    ) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        this.rodzajSmaku = rodzajSamku;
    }

    @Override
    public void pij() {
        System.out.println("Koktajl o cechach "+rodzajTruskawki.cecha() + " i slodkosci "+ rodzajSmaku.slodkosc() + " i smaku "+ smak());
        //String message = String.format("Pijalny koktajl %s", smak());
       // System.out.println(message);
    }

    @Override
    public RodzajSmaku smak(){
        return rodzajSmaku;
    }
}

