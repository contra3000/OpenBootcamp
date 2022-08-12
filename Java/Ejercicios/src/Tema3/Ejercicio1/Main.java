package Tema3.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        double ivaArg = 0.21;
        double ivaGua = 0.12;

        double pricePapas = 10.67;
        double priceGaseosa= 12.05;
        double priceCafe = 10.00;

        double finalPapasArg = getPrice(pricePapas, ivaArg);
        double finalGaseosaArg = getPrice(priceGaseosa, ivaArg);
        double finalCafeArg = getPrice(priceCafe, ivaArg);
        System.out.println("El cafe en argentina vale: " + finalCafeArg);

        double finalPapasGua = getPrice(pricePapas, ivaGua);
        double finalGaseosaGua = getPrice(priceGaseosa, ivaGua);
        double finalCafeGua = getPrice(priceCafe, ivaGua);
        System.out.println("Las papas en Guatemala valen: " + finalPapasGua);

    }
    static double getPrice(double price, double iva){
        return price + (price*iva);
    }
}
