import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ElectricCoche coche1 = new ElectricCoche(1000, "litio");
        System.out.println("Velocidad nueva: " + coche1.acelerar(10));
        coche1.llamarSurtidor();
        System.out.println("Velocidad nueva: " + coche1.acelerar(50));
    }
}
