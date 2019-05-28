package eu.godlesie.jgdlws;
public abstract class Marmolada {
    public abstract String getNazwa();
    public abstract int getOwocProcent();
    public abstract int getCukierProcent();
    @Override
    public String toString() {
        return getNazwa() + 
                "\nProcent owowcu: " + getOwocProcent() +
                "\nProcent cukru:  " + getCukierProcent();
    }
}
