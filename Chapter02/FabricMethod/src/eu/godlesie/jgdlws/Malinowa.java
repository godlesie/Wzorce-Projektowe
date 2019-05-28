package eu.godlesie.jgdlws;
public class Malinowa extends Marmolada {
    private final String nazwa = "Malinowa";
    private final int owocProcent;
    private final int cukierProcent;
    //konstruktor
    public Malinowa() {
        this.owocProcent = 13;
        this.cukierProcent = 45;
    }
    @Override
    public String getNazwa() { return this.nazwa; }
    @Override
    public int getOwocProcent() { return this.owocProcent; }
    @Override
    public int getCukierProcent() { return this.cukierProcent; }
}
