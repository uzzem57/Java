package OOP.cw4;

import java.util.ArrayList;
import java.util.List;

public class CatShelter extends AnimalShelter{
    private List<Animal> animals;

    public CatShelter() {
        this.animals = new ArrayList<>();
    }
    public void  addAnimal(Animal animal){
        animals.add(animal);
    }

    public void print() {
        for(Animal animal: animals){
            System.out.println(animal);
        }
    }
}
