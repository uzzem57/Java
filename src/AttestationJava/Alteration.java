package AttestationJava;

import java.util.ArrayList;
import java.util.List;

public class Alteration extends ToyCars implements Interfaces{

    public Alteration(int id, String name, int volume, double toyDropRate, String model) {
        super(id, name, volume, toyDropRate, model);
    }

    private List <ToyCars> toys = new ArrayList<>();
    private List <ToyCars> prizeToys = new ArrayList<>();



    @Override
    public void addGames() {
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



}
