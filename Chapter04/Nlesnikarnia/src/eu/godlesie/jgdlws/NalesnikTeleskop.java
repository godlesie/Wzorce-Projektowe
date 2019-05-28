package eu.godlesie.jgdlws;
public class NalesnikTeleskop {
    int wielkosc;
    String nadzienie;
    String sos;
    NalesnikTeleskop() {
        this.wielkosc = 24;
        this.nadzienie = "standardowe";
        this.sos = "lagodny";
    };
    NalesnikTeleskop(int wielkosc, String nadzienie) {
        this.wielkosc = wielkosc;
        this.nadzienie = nadzienie;
        this.sos = "lagodny";
    };
    NalesnikTeleskop(int wielkosc, String nadzienie, String sos) {
        this.wielkosc = wielkosc;
        this.nadzienie = nadzienie;
        this.sos = sos;
    }
}
