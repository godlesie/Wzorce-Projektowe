package eu.godlesie.jgdlws;

public class Sloiki450 implements Zamowienie{
    private final double waga;
    public Sloiki450(int iloscSloikow) {
        this.waga = iloscSloikow * 0.45;
    }

    @Override
    public double getKilogramy() {
        return this.waga;
    }
}
