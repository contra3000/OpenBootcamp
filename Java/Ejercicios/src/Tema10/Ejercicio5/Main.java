package Tema10.Ejercicio5;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        names.add("Juan");
        names.add("Marcelo");
        names.add("Pedro");
        names.add("Benicio");

        LinkedList<String> linkedNames = new LinkedList<String>();

        //Copiando a LinkedList
        for (String name : names){
            linkedNames.addLast(name);
        }

        //Recorriendo ArrayList
        System.out.println("ArrayList:");
        for (String name : names){
            System.out.println(name);
        }

        //Recorriendo LinkedList
        System.out.println("LinkedList:");
        for (String name : linkedNames){
            System.out.println(name);
        }

    }
}
