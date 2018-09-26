import java.awt.*;

public class Car {


// Nummerplade
// Farve
// Topfart
// Er lygterne tændt?

    int topfart;
    String nummerplade;
    Color farve;
    boolean virkerLygterne;

    public Car(int inputTopfart,
               String inputNummerplade,
               Color inputFarve,
               boolean inputVirkerLygterne) {
        this.topfart = inputTopfart;
        this.nummerplade = inputNummerplade;
        this.farve = inputFarve;
        this.virkerLygterne = inputVirkerLygterne;
    }

        public void changePaintColor(Color nyFarve) {
            this.farve = nyFarve; 
    }

}