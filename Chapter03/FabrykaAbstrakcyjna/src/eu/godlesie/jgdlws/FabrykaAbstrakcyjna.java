package eu.godlesie.jgdlws;
public class FabrykaAbstrakcyjna {
    public static void main(String[] args) {
        Marmolada truskawkowa = MarmoladaFabryka.getMarmolada(new TruskawkowaFabryka(25, 30));
        Marmolada malinowa = MarmoladaFabryka.getMarmolada(new MalinowaFabryka(36,50));
        System.out.println(truskawkowa);
        System.out.println(malinowa);
    }

}
