package OOP.cw4;

import java.util.Comparator;

public class AnimalComporator implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getWeight().compareTo(o2.getWeight());
    }
}
