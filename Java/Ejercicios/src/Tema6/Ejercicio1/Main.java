package Tema6.Ejercicio1;

public class Main {

    static CocheCRUD cocheCRUD = new CocheCRUDImpl();

    public static void main(String[] args) {

        Coche aa001 = new Coche("Amarok", "Volkswagen", 2.00, 2016, true);
        Coche aa002 = new Coche("Duke", "KTM", 0.37, 2018, true);
        Coche aa003 = new Coche("Toro", "Ford", 1.60, 2017, false);

        cocheCRUD.save(aa001);
        cocheCRUD.save(aa002);
        cocheCRUD.save(aa003);

        cocheCRUD.delete(aa003);

        System.out.println(cocheCRUD.findAll());


    }
}
