package Tema5.Ejercicio1;

public class Main {

    public static void main(String[] args) {

        Operative IOS = new Operative("IOS");
        Operative Android = new Operative("Android");
        Operative Windows = new Operative("Windows");

        SmartPhone apple01 = new SmartPhone(IOS, 1056, 4, true, true, false, true, "carga rapida 20W", true, 256, 6.1f, 194);
        SmartWatch xiao01 = new SmartWatch(Android, 256, 2, true, true, true, true, "470 mAH", true, true, 5, false, 465, 465, 440, "negro");

        System.out.println(apple01.toString());
        System.out.println(xiao01.toString());
    }
}
