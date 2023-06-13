package AttestationJava;

public class Main {
    public static void main(String[] args) {
        Alteration alt = new Alteration();

        // add some toys
        alt.addGames(1,"Volvo",50,15.0,"S90");
        alt.addGames(2,"BMW",40,12.0,"X5");
        alt.addGames(3,"LandRover",20,10.0,"Freelander2");

        // set the weight of a toy
        alt.setToyDropRate(2, 30);

        // play the game
        alt.play();

        // get the prize toy
        try {
            alt.getPrizeToy();
        }
    }
}