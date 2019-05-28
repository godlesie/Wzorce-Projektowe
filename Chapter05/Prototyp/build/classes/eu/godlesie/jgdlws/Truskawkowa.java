package eu.godlesie.jgdlws;
public final class Truskawkowa extends Marmolada{
    private String nazwa;
    private int owoc;
    private int cukier;
    
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

    @Override
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public void setOwocProcent(int owoc) {
        this.owoc = owoc;
    }

    @Override
    public void setCukierProcent(int cukier) {
        this.cukier = cukier;
    }
}
