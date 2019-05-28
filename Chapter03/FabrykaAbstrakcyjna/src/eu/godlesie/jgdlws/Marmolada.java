package eu.godlesie.jgdlws;

public abstract class Marmolada {
    public abstract String getNazwa();
    public abstract int getOwowcProcent();
    public abstract int getCukierProcent();
    
    @Override public String toString() {
        return getNazwa() + 
                "\nprocent owowcu: " + getOwowcProcent() +
                "\nprocent cukru:  " + getCukierProcent();
    }
}
