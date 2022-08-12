package Tema10.Ejercicio8;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        copy("C:/Users/JuanManuel/Desktop/JavaProyects/Openbootcamp/Java/Java/Ejercicios/src/Tema10/Ejercicio8/Repertorio1", "C:/Users/JuanManuel/Desktop/JavaProyects/Openbootcamp/Java/Java/Ejercicios/src/Tema10/Ejercicio8/Repertorio2");

    }

    public static void copy(String fileIn, String fileOut) {
        try {
            InputStream entrada = new FileInputStream(fileIn);
            byte[] datos = entrada.readAllBytes();

            PrintStream salida = new PrintStream(fileOut);
            for (byte dato : datos) {
                salida.print((char)dato);
            }
            entrada.close();
            salida.close();



        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado" + e.getMessage());
        } catch (IOException f) {
            System.out.println(f.getMessage());
        }



    }
}
