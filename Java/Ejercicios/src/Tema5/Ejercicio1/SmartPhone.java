package Tema5.Ejercicio1;

public class SmartPhone extends SmartDivice {

    boolean LTE;
    int storage;
    float screenSize;
    double weight;

    public SmartPhone(){}

    public SmartPhone(Operative system, int speedCPU, int nucCPu, boolean wifi, boolean bluetooth, boolean NFC, boolean GPS, String batery, boolean LTE, int storage, float screenSize, double weight) {
        super(system, speedCPU, nucCPu, wifi, bluetooth, NFC, GPS, batery);
        this.LTE = LTE;
        this.storage = storage;
        this.screenSize = screenSize;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "LTE=" + LTE +
                ", storage=" + storage +
                ", screenSize=" + screenSize +
                ", weight=" + weight +
                ", system=" + system +
                ", speedCPU=" + speedCPU +
                ", nucCPu=" + nucCPu +
                ", wifi=" + wifi +
                ", bluetooth=" + bluetooth +
                ", NFC=" + NFC +
                ", GPS=" + GPS +
                ", batery='" + batery + '\'' +
                '}';
    }
}
