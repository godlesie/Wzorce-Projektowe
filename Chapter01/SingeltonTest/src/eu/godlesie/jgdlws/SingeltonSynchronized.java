package eu.godlesie.jgdlws;
public class SingeltonSynchronized {
    private static SingeltonSynchronized singelton = null;
    private SingeltonSynchronized() {}
    public static synchronized SingeltonSynchronized getInstance() {
        if (singelton == null) {
            singelton = new SingeltonSynchronized();
	}
	return singelton;
    }
}
