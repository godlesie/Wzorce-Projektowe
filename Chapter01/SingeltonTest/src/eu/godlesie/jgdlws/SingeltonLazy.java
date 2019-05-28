package eu.godlesie.jgdlws;
public class SingeltonLazy {
    private static SingeltonLazy singelton = null;
    private SingeltonLazy() {};
    public static SingeltonLazy getInstance() {
        if (singelton == null) {
            singelton = new SingeltonLazy();
        }
        return singelton;
    }
}
