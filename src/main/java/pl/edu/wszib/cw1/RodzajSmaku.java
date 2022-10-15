package pl.edu.wszib.cw1;

public enum RodzajSmaku {

    TRUSKAWKOWY(10),
    BANANOWY(5),
    SZPINAKOWY(1),
    CIASTECZKOWY(7),
    JABKŁOWY(6);

    private final int slodkosc;

    RodzajSmaku(final int slodkosc) {
        this.slodkosc = slodkosc;
    }

    public int slodkosc(){
        return slodkosc;
    }
}
