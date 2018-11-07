package animal;

import edible.Editble;

public class Chicken extends Animal implements Editble {
    @Override
    public String makeSound(){
        return "Chicken: chip-chip...";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
