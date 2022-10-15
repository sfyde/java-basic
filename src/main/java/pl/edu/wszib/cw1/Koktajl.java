package pl.edu.wszib.cw1;

public abstract class Koktajl implements Jadalne, Pijalne {

    protected final int kcal;

    protected Koktajl(final int kcal){
        this.kcal = kcal;
    }


    // final wartosc moze byc ustawiona tylko raz
    @Override
    public void jedz(){

        pij();
    }
}
