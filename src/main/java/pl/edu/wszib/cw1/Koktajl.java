package pl.edu.wszib.cw1;

public abstract class Koktajl implements Jadalne, Pijalne {
    @Override
    public void jedz(){
        pij();
    }
}
