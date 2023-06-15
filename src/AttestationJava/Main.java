package AttestationJava;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Alteration alt = new Alteration(1,"Toyota",30,25.0,"Corolla");

        alt.addGames(2,"Volvo",50,15.0,"S90");
        alt.addGames(3,"BMW",40,12.0,"X5");
        alt.addGames(4,"LandRover",20,10.0,"Freelander2");


        alt.setToyDropRate(2, 18.0);

        alt.play();

        try {
            alt.getPrizeToyCars();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}