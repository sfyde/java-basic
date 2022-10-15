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
    ANANASOWA ("Biale owoce", "Ananasowa"),
    HONEOYE("Wyrazista","Honeoye"),
    POLKA("Najsmaczniejsza","Polka"),
    KENT("Dla fanów słodyczy", "kent"),
    CHRISTINE("Zaowocuje szybko i obficie", "Christine");

    private final String cecha;

    private  final String nazwa;
    private RodzajTruskawki(final String cecha, final String nazwa) {
        this.cecha = cecha;
        this.nazwa = nazwa;

    }

    @Override
    public String toString() {
        return "RodzajTruskawki{" +
                "cecha='" + cecha + '\'' +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    public String cecha(){
        return cecha;


    }
}
