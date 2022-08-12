package Tema10.Ejercicio7;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.println(dividePorCero(6,0));
        } catch (ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }

    public static int dividePorCero(int a, int b) throws ArithmeticException{
        return a / b;
    }
}
