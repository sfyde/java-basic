package pl.edu.wszib.cw1;
/**
 * Rodzaj truskawek:
 * annasowa
 * Honeoye
 * Polka
 * Kent
 * Christin
 */
public enum RodzajTruskawki {
    ANANASOWA ("Biale owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie");

    private final String cecha;
    private RodzajTruskawki(final String cecha) {
        this.cecha = cecha;

    }

    public String cecha(){
        return cecha;
    }
}
