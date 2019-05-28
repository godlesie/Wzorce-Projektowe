package eu.godlesie.jgdlws;
public class MarmoladaFabryka {
    public enum Typ{
        MALINOWA, TRUSKAWKOWA;
    }
    public static Marmolada getMarmolada(Typ typ) {
        Marmolada marmolada = null;
        switch (typ) {
            case MALINOWA:
                marmolada = new Malinowa();
                break;
            case TRUSKAWKOWA:
                marmolada = new Truskawkowa();
                break;
        }
        return marmolada;
    }
}
