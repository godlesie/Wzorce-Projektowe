package eu.godlesie.jgdlws;
public class Prototyp {
    public static void main(String[] args) throws CloneNotSupportedException {
        Marmolada truskawkowa = MarmoladaFabryka.getMarmolada(new TruskawkowaFabryka(12, 30));
        System.out.println(truskawkowa);
        
        Marmolada bio = truskawkowa.clone();
        bio.setNazwa("Truskawkowa BIO");
        bio.setCukierProcent(0);
        bio.setOwocProcent(80);
        System.out.println(bio);
    }
}
