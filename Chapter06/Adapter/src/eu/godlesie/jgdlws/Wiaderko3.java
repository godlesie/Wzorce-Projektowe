package eu.godlesie.jgdlws;

public class Wiaderko3 implements Zamowienie{
    private final double waga;
    public Wiaderko3(int ilosc) {
        this.waga = ilosc * 3;
    }

    @Override
    public double getKilogramy() {
        return this.waga;
    }

}
