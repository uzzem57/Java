package OOP.cw4;

public class Main {
    public static void main(String[] args) {
        CatShelter shelter = new CatShelter();
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                shelter.addAnimal(new Cat(i*2,i*3,"Cat" + i));
            } else {
                shelter.addAnimal(new Dog(i*2,i*3,"Dog" + i));
            }

        }
        shelter.print();
        AnimalComporator comporator = new AnimalComporator();

    }

}
