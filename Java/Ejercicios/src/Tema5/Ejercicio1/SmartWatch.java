package Tema5.Ejercicio1;

public class SmartWatch extends SmartDivice {

    boolean oximeter;
    boolean acelerometer;
    int waterResistance;
    boolean signalSOS;
    int alto;
    int ancho;
    int grosor;
    String color;

    public SmartWatch(){}

    public SmartWatch(Operative system, int speedCPU, int nucCPu, boolean wifi, boolean bluetooth, boolean NFC, boolean GPS, String batery, boolean oximeter, boolean acelerometer, int waterResistance, boolean signalSOS, int alto, int ancho, int grosor, String color) {
        super(system, speedCPU, nucCPu, wifi, bluetooth, NFC, GPS, batery);
        this.oximeter = oximeter;
        this.acelerometer = acelerometer;
        this.waterResistance = waterResistance;
        this.signalSOS = signalSOS;
        this.alto = alto;
        this.ancho = ancho;
        this.grosor = grosor;
        this.color = color;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "oximeter=" + oximeter +
                ", acelerometer=" + acelerometer +
                ", waterResistance=" + waterResistance +
                ", signalSOS=" + signalSOS +
                ", alto=" + alto +
                ", ancho=" + ancho +
                ", grosor=" + grosor +
                ", color='" + color + '\'' +
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
