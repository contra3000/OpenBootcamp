package Tema10.Ejercicio3;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>(6, 4);

        vector.add(10);
        vector.add(101);
        vector.add(1001);
        vector.add(10001);
        vector.add(100001);

        // Se eliminan 3er (index 2) y 2do (index 1) elemento
        // [en orden inverso para no perder precision al modificarse el index]
        vector.removeElementAt(2);
        vector.removeElementAt(1);

        System.out.println(vector);

    }
}
