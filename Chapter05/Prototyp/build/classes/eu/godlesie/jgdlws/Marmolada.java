package eu.godlesie.jgdlws;

public abstract class Marmolada implements Cloneable {
    public abstract String getNazwa();
    public abstract int getOwowcProcent();
    public abstract int getCukierProcent();
    public abstract void setNazwa(String nazwa);
    public abstract void setOwocProcent(int owoc);
    public abstract void setCukierProcent(int cukier);
    
    @Override public String toString() {
        return getNazwa() + 
                "\nprocent owowcu: " + getOwowcProcent() +
                "\nprocent cukru:  " + getCukierProcent();
    }
    @Override
    public Marmolada clone() throws CloneNotSupportedException {
        return (Marmolada)super.clone();
    }
}
