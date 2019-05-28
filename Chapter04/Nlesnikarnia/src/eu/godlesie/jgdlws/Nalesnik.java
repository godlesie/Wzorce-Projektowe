package eu.godlesie.jgdlws;
public class Nalesnik {
    private final int wielkosc;
    private final String nadzienie;
    private final String sos;
    
    //konstruktor nalesnika
    private Nalesnik(Builder builder) {
        this.wielkosc = builder.wielkosc;
        this.nadzienie = builder.nadzienie;
        this.sos = builder.sos;
    }
    public static class Builder {
        //parametr wymagany
        private final int wielkosc;
    	//parametry opcjonalne
        private String nadzienie = "miesne";
        private String sos = "lagodny";
    	//konstruktor
        public Builder(int wielkosc) {
            this.wielkosc = wielkosc;
        }
    	//metody ustawiajace
        public Builder nadzienie(String wartosc) {
            nadzienie = wartosc; return this;
        }
        public Builder sos(String wartosc) {
            sos = wartosc; return this;
        }
    	//metoda tworzaca
        public Nalesnik build() {
            return new Nalesnik(this);
        }
    }
    // tylko gettery do pobrania wartosci
    // ...
    }
