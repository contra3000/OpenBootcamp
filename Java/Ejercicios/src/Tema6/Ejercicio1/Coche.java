package Tema6.Ejercicio1;

public class Coche {

    protected String model;
    protected String brand;
    protected double cc;
    protected int year;
    protected boolean sportMode;
    protected int speed;

    public Coche(){};

    public Coche(String model, String brand, double cc, int year, boolean sportMode) {
        this.model = model;
        this.brand = brand;
        this.cc = cc;
        this.year = year;
        this.sportMode = sportMode;
        this.speed = 0;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", cc=" + cc +
                ", year=" + year +
                ", sportMode=" + sportMode +
                ", speed=" + speed +
                '}';
    }
}
