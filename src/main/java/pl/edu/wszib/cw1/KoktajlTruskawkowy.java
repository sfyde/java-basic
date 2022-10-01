package pl.edu.wszib.cw1;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne  {


    @Override
    public void pij() {
        System.out.println("Pijalne");

    }

    @Override
    public void smak() {
        System.out.println("Smakuje!");
    }
}

