package Tema10.Ejercicio6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++){
            numeros.add(i);
        }

        //Eliminando pares y recorriendo impares
        System.out.println("ArrayList numeros:");
        for (int i = 0 ; i < numeros.size() ; i++){
            if(numeros.get(i) % 2 == 0){
                numeros.remove(numeros.get(i));
                if (i < numeros.size()) {   // Condicion agregada para inhibir último caso
                    System.out.println(numeros.get(i));
                }
            }else {
                System.out.println(numeros.get(i));
            }
        }


    }
}
