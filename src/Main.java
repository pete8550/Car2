import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

    Car PetersBil = new Car(230,
            "HI70319",
            Color.BLUE,
            true);

    Car JulemandensBil = new Car (180,
            "HO80616",
            Color.RED,
            false);

    Car BaunesBil = new Car(190,
            "CM21835",
            Color.pink,
            true);

        System.out.println("Peters Nummerplade:" + PetersBil.nummerplade);
        System.out.println("Julemandens Topfart:" + JulemandensBil.topfart);

        System.out.println("Baunes bilfarve:" + BaunesBil.farve);
        BaunesBil.changePaintColor(Color.cyan);
        System.out.println("Baunes nye bilfarve:" + BaunesBil.farve);

        System.out.println(PetersBil.farve);
        PetersBil.changePaintColor(Color.BLACK);
        System.out.println(PetersBil.farve);
    }
}
