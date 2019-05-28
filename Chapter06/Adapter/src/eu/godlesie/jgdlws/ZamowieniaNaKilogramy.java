package eu.godlesie.jgdlws;

public class ZamowieniaNaKilogramy implements Receptura{
    private final double kilogramy;
    private final Zamowienie zamowienie;
    
    public ZamowieniaNaKilogramy(Zamowienie zamowienie) {
        this.zamowienie = zamowienie;
        this.kilogramy = zamowienie.getKilogramy();
    }

    @Override
    public double getKilogramy() {
        return kilogramy;
    }

}
