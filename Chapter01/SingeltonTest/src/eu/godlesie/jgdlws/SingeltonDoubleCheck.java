package eu.godlesie.jgdlws;
public class SingeltonDoubleCheck {
    private static SingeltonDoubleCheck singelton = null;
    private SingeltonDoubleCheck() {};
    public static SingeltonDoubleCheck getInstance() {
        if (singelton == null)  {
            synchronized(SingeltonDoubleCheck.class) {
                if (singelton == null) {
                    singelton = new SingeltonDoubleCheck();
		}
            }
	}
	return singelton;
    }
}
