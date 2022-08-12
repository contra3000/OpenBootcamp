package Tema10.Ejercicio9;

import java.io.*;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /*
    Sorpréndenos creando un programa de tu elección que utilice:
    InputStream, PrintStream, excepciones, un HashMap y un ArrayList, LinkedList o array.
     */

    public static void main(String[] args) {

        HashMap<String, Integer> miMapa = getStringIntegerHashMap();


        boolean ok = false;
        do {
            System.out.println("Gobierno azuliano");
            System.out.println("Bienvenido a la Votacion del dia");
            System.out.println("""
                    Elije una opcion para la pintura de la casa de gobierno:
                    1. Rojo
                    2. Verde
                    3. Azul
                    4. Amarillo
                    5. Violeta""");
            Scanner lector = new Scanner(System.in);
            try {
                int opcion = lector.nextInt();
                switch (opcion) {
                    case 1 -> {
                        miMapa.replace("Rojo", (miMapa.get("Rojo") + 1));
                        save(miMapa);
                        miMapa = getStringIntegerHashMap();
                        for (HashMap.Entry<String, Integer> elemento : miMapa.entrySet()) {
                            System.out.println(elemento.getKey() + " tiene " + elemento.getValue() + " votos.");
                        }
                        ok = true;
                    }
                    case 2 -> {
                        miMapa.replace("Verde", (miMapa.get("Verde") + 1));
                        save(miMapa);
                        miMapa = getStringIntegerHashMap();
                        for (HashMap.Entry<String, Integer> elemento : miMapa.entrySet()) {
                            System.out.println(elemento.getKey() + " tiene " + elemento.getValue() + " votos.");
                        }
                        ok = true;
                    }
                    case 3 -> {
                        miMapa.replace("Azul", (miMapa.get("Azul") + 1));
                        save(miMapa);
                        miMapa = getStringIntegerHashMap();
                        for (HashMap.Entry<String, Integer> elemento : miMapa.entrySet()) {
                            System.out.println(elemento.getKey() + " tiene " + elemento.getValue() + " votos.");
                        }
                        ok = true;
                    }
                    case 4 -> {
                        miMapa.replace("Amarillo", (miMapa.get("Amarillo") + 1));
                        save(miMapa);
                        miMapa = getStringIntegerHashMap();
                        for (HashMap.Entry<String, Integer> elemento : miMapa.entrySet()) {
                            System.out.println(elemento.getKey() + " tiene " + elemento.getValue() + " votos.");
                        }
                        ok = true;
                    }
                    case 5 -> {
                        miMapa.replace("Violeta", (miMapa.get("Violeta") + 1));
                        save(miMapa);
                        miMapa = getStringIntegerHashMap();
                        for (HashMap.Entry<String, Integer> elemento : miMapa.entrySet()) {
                            System.out.println(elemento.getKey() + " tiene " + elemento.getValue() + " votos.");
                        }
                        ok = true;
                    }
                    default -> System.out.println("Opcion invalida");
                }
            } catch (InputMismatchException e) {
                System.out.println("Numeros invalidos");
            }
        } while (!ok);
        System.out.println("\nGracias por su participacion activa en en la Nacion Azuliana!");

    }

    private static HashMap<String, Integer> getStringIntegerHashMap() {
        String proto = "";

        try {
            InputStream entrada = new FileInputStream("C:/Users/JuanManuel/Desktop/JavaProyects/Openbootcamp/Java/Java/Ejercicios/src/Tema10/Ejercicio9/BDD");
            byte[] datos = entrada.readAllBytes();
            for (byte dato : datos) {
                proto = proto.concat(String.valueOf((char)dato));
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String proto1 = proto.replace("{", "");
        String proto2 = proto1.replace("}", "");
        String proto3 = proto2.replace(" ", "");
        String[] proto4 = proto3.split(",");
        String[] proto40 = proto4[0].split("=");
        String[] proto41 = proto4[1].split("=");
        String[] proto42 = proto4[2].split("=");
        String[] proto43 = proto4[3].split("=");
        String[] proto44 = proto4[4].split("=");


        HashMap<String, Integer> miMapa = new HashMap<>();
        miMapa.put(proto40[0], Integer.valueOf(proto40[1]));
        miMapa.put(proto41[0], Integer.valueOf(proto41[1]));
        miMapa.put(proto42[0], Integer.valueOf(proto42[1]));
        miMapa.put(proto43[0], Integer.valueOf(proto43[1]));
        miMapa.put(proto44[0], Integer.valueOf(proto44[1]));
        return miMapa;
    }


    private static void save(HashMap<String, Integer> mapa) {
        try {
            PrintStream salida = new PrintStream("C:/Users/JuanManuel/Desktop/JavaProyects/Openbootcamp/Java/Java/Ejercicios/src/Tema10/Ejercicio9/BDD");
            salida.print(mapa);
            salida.close();
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado" + e.getMessage());
        }
    }


}
