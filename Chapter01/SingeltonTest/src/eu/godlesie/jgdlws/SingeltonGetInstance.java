package eu.godlesie.jgdlws;
public class SingeltonGetInstance {
    private static final SingeltonGetInstance SINGELTON = new SingeltonGetInstance();
    private SingeltonGetInstance() {};
    public static SingeltonGetInstance getInstance() {
	return SINGELTON;
    }
}
