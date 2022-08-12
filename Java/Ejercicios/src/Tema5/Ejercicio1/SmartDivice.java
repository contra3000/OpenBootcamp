package Tema5.Ejercicio1;

public abstract class SmartDivice {

    Operative system;
    int speedCPU;
    int nucCPu;
    boolean wifi;
    boolean bluetooth;
    boolean NFC;
    boolean GPS;
    String batery;

    public SmartDivice(){}

    public SmartDivice(Operative system, int speedCPU, int nucCPu, boolean wifi, boolean bluetooth, boolean NFC, boolean GPS, String batery) {
        this.system = system;
        this.speedCPU = speedCPU;
        this.nucCPu = nucCPu;
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.NFC = NFC;
        this.GPS = GPS;
        this.batery = batery;
    }
}
