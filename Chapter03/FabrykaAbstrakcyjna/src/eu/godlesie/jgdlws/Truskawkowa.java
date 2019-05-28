package eu.godlesie.jgdlws;

public class Truskawkowa extends Marmolada{
    private final String nazwa;
    private final int owoc;
    private final int cukier;
    
    public Truskawkowa(int owoc, int cukier) {
        this.nazwa = "Truskawkowa";
        this.owoc = owoc;
        this.cukier = cukier;
    }

    @Override
    public String getNazwa() {
        return this.nazwa;
    }

    @Override
    public int getOwowcProcent() {
        return this.owoc;
    }

    @Override
    public int getCukierProcent() {
        return this.cukier;
    }

}
