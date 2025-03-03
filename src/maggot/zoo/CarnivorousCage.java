package maggot.zoo;

public class CarnivorousCage extends Cage {
    CarnivorousCage(int capacity) {
        super(capacity);
        animalType = Type.CARNIVOROUS;
    }
}
