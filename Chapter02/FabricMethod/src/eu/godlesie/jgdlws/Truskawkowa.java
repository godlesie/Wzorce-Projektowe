package eu.godlesie.jgdlws;
public class Truskawkowa extends Marmolada{
    private final String nazwa = "Truskawkowa";
    private final int owocProcent;
    private final int cukierProcent;
    //konstruktor
    public Truskawkowa() {
	this.owocProcent = 30;
	this.cukierProcent = 25;
    }
    @Override
    public String getNazwa() { return this.nazwa; }
    @Override
    public int getOwocProcent() { return this.owocProcent; }
    @Override
    public int getCukierProcent() { return this.cukierProcent; }
}
