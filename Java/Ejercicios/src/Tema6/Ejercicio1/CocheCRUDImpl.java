package Tema6.Ejercicio1;
import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    List<Coche> coches = new ArrayList<>();

    @Override
    public void save(Coche coche) {
        coches.add(coche);
        System.out.println("Coche guardado");
    }

    @Override
    public void delete(Coche coche) {
        coches.remove(coche);
        System.out.println("Coche borrado");
    }

    @Override
    public List<Coche> findAll() {
        return coches;
    }
}
