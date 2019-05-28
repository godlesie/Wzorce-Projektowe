package eu.godlesie.jgdlws;
public class FabricMethod {
    public static void main(String[] args) {
        Marmolada truskawkowa = MarmoladaFabryka.getMarmolada(MarmoladaFabryka.Typ.TRUSKAWKOWA);
        System.out.println(truskawkowa);
        Marmolada malinowa = MarmoladaFabryka.getMarmolada(MarmoladaFabryka.Typ.MALINOWA);
        System.out.println(malinowa);
    }

}
