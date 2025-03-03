package maggot.zoo;

public class Cage {
    protected Type animalType;
    protected int capacity;
    protected Animal[] animals;

    Cage(int capacity) {
        this.capacity = capacity;
        animals = new Animal[capacity];
    }

    Cage() {
        capacity = 2 + (int) (Math.random() * ((10 - 2) + 1));
        animals = new Animal[capacity];
        if (Math.random() < 0.5) {
            animalType = Type.HERBIVOROUS;

        } else {
            animalType = Type.CARNIVOROUS;
        }
    }

    void loadInitialBulk(Animal[] animals) {
        if (this.capacity < animals.length) {
            throw new ArrayIndexOutOfBoundsException("Они не поместятся все в эту клетку, братан.");
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].diet != animalType) {
                throw new IllegalArgumentException("Животины сожрут друг друга, так нельзя, братан.");
            }
            this.animals[i] = animals[i];
        }
    }

    void loadOne(Animal animal) {
        if (animal.diet != animalType) {
            throw new IllegalArgumentException("Животины сожрут друг друга, так нельзя, братан.");
        }

        for (int i = 0; i < capacity; i++) {
            if (this.animals[i] == null) {
                this.animals[i] = animal;
                System.out.println("Животное успешно загружено.");
                return;
            }
        }
        System.out.println("В этой клетке нет места, братан.");
    }

    public void printCageInfo() {
        System.out.println("Животных в клетке: " + getAnimalAmount());
        System.out.println("Всего мест в клетке: " + capacity);
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                break;
            }
            animals[i].printInfo();
        }
    }

    public int getAnimalAmount() {
        int amount = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                amount += 1;
            }
        }
        return amount;
    }

    static public Cage generateRandomCage() {

        if (Math.random() < 0.5) {
            HerbivorousCage cage = new HerbivorousCage(2 + (int) (Math.random() * ((10 - 2) + 1)));

            return cage;
        } else {
            CarnivorousCage cage = new CarnivorousCage(2 + (int) (Math.random() * ((10 - 2) + 1)));

            return cage;
        }
    }

    public void fillRandomAnimals() {
        for (int i = 0; i < capacity; i++) {
            if (animalType == Type.HERBIVOROUS && Math.random() < 0.5) {
                boolean temp;
                if (Math.random() < 0.5) {
                    temp = true;
                } else {
                    temp = false;
                }
                Animal buffalo = new Buffalo(temp);
                animals[i] = buffalo;
            } else if (animalType == Type.HERBIVOROUS) {
                Animal chicken = new Chicken(20 + (int) (Math.random() * ((50 - 20) + 1)));
                animals[i] = chicken;
            }

            if (animalType == Type.CARNIVOROUS && Math.random() < 0.5) {
                Animal tiger = new Tiger(15 + (int) (Math.random() * ((42 - 15) + 1)));
                animals[i] = tiger;
            } else if (animalType == Type.CARNIVOROUS) {
                Animal furry = new Furry(228 + (int) (Math.random() * ((1488 - 228) + 1)));
                animals[i] = furry;
            }
        }
    }
}