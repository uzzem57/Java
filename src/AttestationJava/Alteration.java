package AttestationJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Alteration extends ToyCars implements Interfaces{

    public Alteration(int id, String name, int volume, double toyDropRate, String model) {
        super(id, name, volume, toyDropRate, model);
    }

    private List <ToyCars> toys = new ArrayList<>();
    private List <ToyCars> prizeToys = new ArrayList<>();


    @Override
    public void addGames(int id, String name, int volume, double toyDropRate, String model) {
        ToyCars toy = new ToyCars(getId(), getName(), getVolume(), getToyDropRate(), getModel());
        toys.add(toy);

    }

    @Override
    public void setToyDropRate(int id, double toyDropRate) {
        for (ToyCars toy : toys) {
            if (toy.getId() == id) {
                toy.setToyDropRate(toyDropRate);
                break;
            }
        }
    }

    public void play() {

        double totalToyDropRate = 0;
        for (ToyCars toy : toys) {
            totalToyDropRate += toy.getToyDropRate();
        }

        Random rand = new Random();
        double randomNumber = rand.nextDouble() * totalToyDropRate;


        ToyCars prizeToy = null;
        for (ToyCars toy : toys) {
            if (randomNumber < toy.getToyDropRate()) {
                prizeToy = toy;
                break;
            }
            randomNumber -= toy.getToyDropRate();
        }

        if (prizeToy != null && prizeToy.getVolume() > 0) {
            prizeToys.add(prizeToy);

            // decrement the quantity of the prize toy
            prizeToy.setVolume(prizeToy.getVolume() - 1);
        }
    }



}
