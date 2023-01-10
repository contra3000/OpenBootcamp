import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        imprimeMayorYMenor(args);
    }

    public static void imprimeMayorYMenor(String[] numeros){
        int mayor = Arrays.stream(numeros)
                .map(Integer::parseInt)
                .reduce(0, Math::max);
        int menor = Arrays.stream(numeros)
                .map(Integer::parseInt)
                .reduce(Math::min)
                .orElse(mayor);

//        Comentado para usar funcional puro
//        for(int numero: numeros) {
//            //operador ternario
//            mayor = mayor < numero ? numero : mayor;
//            //equivalente funcional
//            menor = Math.min(menor, numero);
//        }

        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}
