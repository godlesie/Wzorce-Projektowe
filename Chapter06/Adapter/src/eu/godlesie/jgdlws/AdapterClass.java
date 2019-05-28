package eu.godlesie.jgdlws;
public class AdapterClass {
    public static void main(String[] args) {
        Receptura sloiki = new ZamowieniaNaKilogramy(new Sloiki450(1000));
        System.out.println(sloiki.getKilogramy() + " kg");
        Receptura wiaderko = new ZamowieniaNaKilogramy(new Wiaderko3(256));
        System.out.println(wiaderko.getKilogramy() + " kg");
    }

}
