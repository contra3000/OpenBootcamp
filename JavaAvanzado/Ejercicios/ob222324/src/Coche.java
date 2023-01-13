abstract public class Coche {
    private final String tipo;
    private final int potencia;
    private int velocidad;
    private String typeEnergia;
    private int quantityEnergia;

    public Coche(String tipo, int potencia, String typeEnergia) {
        this.tipo = tipo;
        this.potencia = potencia;
        this.typeEnergia = typeEnergia;
        this.velocidad = 0;
        this.quantityEnergia = 0;
    }

    public String getTypeEnergia() {
        return typeEnergia;
    }

    public int getQuantityEnergia() {
        return quantityEnergia;
    }

    public String getTipo() {
        return tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int acelerar(int velocidad){
        this.velocidad += velocidad;
        return this.velocidad;
    }

    public int decelerar(int velocidad){
        this.velocidad -= velocidad;
        return this.velocidad;
    }

    public int frenar(){
        this.velocidad = 0;
        return getVelocidad();
    }

    public int llamarSurtidor(){
        Surtidor surtidor = new Surtidor();
        return setQuantityEnergia(surtidor.surtir(this));
    }

    private int setQuantityEnergia(int quantityEnergia) {
        return this.quantityEnergia = quantityEnergia;
    }
}
