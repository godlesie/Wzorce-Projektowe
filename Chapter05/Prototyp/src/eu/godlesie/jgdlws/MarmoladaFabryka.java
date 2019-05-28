package eu.godlesie.jgdlws;

public class MarmoladaFabryka {
    public static Marmolada getMarmolada(MarmoladaFabrykaAbstrakcyjna fabryka) {
        return fabryka.createMarmolada();
    }
}
