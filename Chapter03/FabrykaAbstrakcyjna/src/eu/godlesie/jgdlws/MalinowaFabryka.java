package eu.godlesie.jgdlws;

public class MalinowaFabryka implements MarmoladaFabrykaAbstrakcyjna {
    private final int owoc;
    private final int cukier;
    
    public MalinowaFabryka(int owoc, int cukier) {
        this.owoc = owoc;
        this.cukier = cukier;
    }

    @Override
    public Marmolada createMarmolada() {
        return new Truskawkowa(owoc, cukier);
    }
    

}
