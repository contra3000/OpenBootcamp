public class Surtidor {

    public Surtidor() {
    }

    public int surtir(Coche coche){
        System.out.println(coche.getTypeEnergia() + ": full");
        return 100;
    }
}
