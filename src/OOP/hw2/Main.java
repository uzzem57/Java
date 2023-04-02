package OOP.hw2;

public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Barsik", 1, "grey"))
                .addAnimal(new Dog("Tuzik", 2))
                .addAnimal(new Duck("Duck", 4));

        for (Animals animal : zoo.getAnimals()){
            System.out.println(animal);
            System.out.println(animal.say());
        }

        System.out.println("__________________________Speakable");

        for (Speakable speak : zoo.getSpeakables()){
            System.out.println(speak.say());
        }

        System.out.println("__________________________Runable");

        for (Runable runner : zoo.getRunables()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(runner), runner.speedOfRun()));
        }

        System.out.println("__________________________Swimable");

        for (Swimable swimmer : zoo.getSwimable()){
            System.out.println(String.format("%s, скорость: %s", String.valueOf(swimmer), swimmer.speedOfSwim()));
        }

    }
    }

