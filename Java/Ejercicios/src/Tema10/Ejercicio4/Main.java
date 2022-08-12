package Tema10.Ejercicio4;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        for(int i = 0; i<1000; i++){
            vector.add(i);
        }

/*
        Podemos observar que si tuvieramos 1000 elementos para argegar, nuestro vector por defecto
        generaria 280 espacios que no terminariamos usando. De esta manera comprobamos la conveniencia
        de especificar "Capacity" y "capacityIncrement" en el caso de conocer cuanto espacio necesitamos.
 */
        System.out.println("Tamaño " + vector.size() + " Capacidad: " + vector.capacity());
    }
}
