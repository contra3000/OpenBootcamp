public class ElectricCoche extends Coche{

    private final String typeBattery;
    public ElectricCoche(int potencia, String typeBattery) {
        super("electrico", potencia, "Energia electrica");
        this.typeBattery = typeBattery;
    }

    public String getTypeBattery() {
        return typeBattery;
    }

    @Override
    public int acelerar(int velocidad) {
        if (this.getQuantityEnergia() > 0){
            return super.acelerar(velocidad);
        }
        System.out.println("Llamar surtidor");
        return this.getVelocidad();
    }

    @Override
    public int decelerar(int velocidad) {
        if (this.getQuantityEnergia() > 0){
            return super.decelerar(velocidad);
        }
        System.out.println("Llamar surtidor");
        return this.getVelocidad();
    }
}
