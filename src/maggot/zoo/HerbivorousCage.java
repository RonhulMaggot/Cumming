package maggot.zoo;

public class HerbivorousCage extends Cage {
    HerbivorousCage(int capacity) {
        super(capacity);
        animalType = Type.HERBIVOROUS;
    }
}
