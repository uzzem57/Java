package OOP.hw2;

import java.util.ArrayList;
import java.util.List;

public class Zoo  {
    private List<Animals> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public Zoo addAnimal(Animals animal){
        this.animals.add(animal);
        return this;
    }

    public List<Speakable> getSpeakables(){
        List<Speakable> answer = new ArrayList<>();

        for (Animals animal : animals){
            answer.add(animal);
        }

        return answer;
    }

    public int getChampionOfRunners(){
        int result = 25;

        List<Runable> list = getRunables();
        for (Runable runable : list){
            if (runable.speedOfRun() > result){
                result = runable.speedOfRun();
            }
        }

        return result;
    }

    public List<Runable> getRunables(){
        List<Runable> result = new ArrayList<>();
        for (Animals animal : animals){
            if (animal instanceof Runable){
                result.add((Runable) animal);
            }
        }
        return result;

    }

    public List<Swimable> getSwimable(){
        List<Swimable> result = new ArrayList<>();
        for (Animals animal : animals){
            if (animal instanceof Swimable){
                result.add((Swimable) animal);
            }
        }
        return result;

    }

    public  List<Animals> getAnimals() {
        return animals;
    }
}
