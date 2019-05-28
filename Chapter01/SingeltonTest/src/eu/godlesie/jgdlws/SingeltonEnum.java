package eu.godlesie.jgdlws;
public enum SingeltonEnum {
    INSTANCE;
    //jakas zmienna
    int value;
    //tutaj moze byc konstruktor
    SingeltonEnum() { this.value = 2;  }
    public int getValue() { return this.value; };
}
