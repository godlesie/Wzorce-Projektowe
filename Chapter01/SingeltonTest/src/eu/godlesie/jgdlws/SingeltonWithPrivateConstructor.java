package eu.godlesie.jgdlws;
public class SingeltonWithPrivateConstructor {
    public static SingeltonWithPrivateConstructor singelton = new SingeltonWithPrivateConstructor();
    //prywatny konstruktor
    private SingeltonWithPrivateConstructor() {};
}
