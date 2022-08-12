package Tema4.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"Juan", "Marcelo", "Eustifacio", "Lolo", "Mariela", "Andrea"};
        String concatenado = "";

        for(int i = 0; i < nombres.length; i++){
            if (i == 0) {
                concatenado = concatenado.concat("" + nombres[i]);
            }
            else if (i == (nombres.length-1)){
                concatenado = concatenado.concat(" y " + nombres[i] + " integran el grupo.");
            }
            else{
                concatenado = concatenado.concat(", " + nombres[i]);
            }
        }
        System.out.println(concatenado);

    }
}
