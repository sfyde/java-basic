package pl.edu.wszib.cw1;

public abstract class KoktajlSmakowy extends Koktajl implements Smakowalne {

  protected  final  RodzajSmaku rodzajSmaku;
    protected KoktajlSmakowy(int kcal, RodzajSmaku rodzajSmaku) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public void pij() {

    }
}
