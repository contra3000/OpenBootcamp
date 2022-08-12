package Tema10.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        int xy[][] = {
                {1, 2, 3, 4, 5, 6},
                {20, 40, 60, 80, 100, 120}
        };

        for(int x = 0; x < xy.length; x++){
            for(int y = 0; y < xy[x].length; y++){
                System.out.println("Para x=" + x + " y=" + y);
                System.out.println(xy[x][y]);
            }
        }
    }
}
