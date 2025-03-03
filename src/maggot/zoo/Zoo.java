package maggot.zoo;

public class Zoo {
    protected int cagesMaxAmount;
    protected Cage[] cages;

    Zoo(int cagesMaxAmount) {
        this.cagesMaxAmount = cagesMaxAmount;
        this.cages = new Cage[cagesMaxAmount];
    }

    public int getCagesMaxAmount () {
        return cagesMaxAmount;
    }

    public void loadCage(Cage cage) {
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (this.cages[i] == null) {
                this.cages[i] = cage;
                System.out.println("Клетка успешно установлена.");
                return;
            }
        }
        System.out.println("На площади зоопарка больше не уместить, братан.");
    }

    public int getCagesAmount() {
        int amount = 0;
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (this.cages[i] != null) {
                amount += 1;
            }
        }
        return amount;
    }

    public int getAnimalAmount() {
        int amount = 0;
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (cages[i] == null) {
                continue;
            }
            amount += cages[i].getAnimalAmount();
        }
        return amount;
    }

    public int getCarnivorousAmount() {
        int amount = 0;
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (cages[i] == null) {
                continue;
            }
            if (cages[i].animalType == Type.CARNIVOROUS) {
                for (int j = 0; j < cages[i].animals.length; j++) {
                    if (cages[i].animals[j] != null) {
                        amount += 1;
                    }
                }
            }
        }
        return amount;
    }

    public int getHerbivorousAmount() {
        int amount = 0;
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (cages[i] == null) {
                continue;
            }
            if (cages[i].animalType == Type.HERBIVOROUS) {
                for (int j = 0; j < cages[i].animals.length; j++) {
                    if (cages[i].animals[j] != null) {
                        amount += 1;
                    }
                }
            }
        }
        return amount;
    }

    public int getHerbivorousCagesAmount() {
        int amount = 0;
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (cages[i] == null) {
                continue;
            }
            if (cages[i].animalType == Type.HERBIVOROUS) {
                amount += 1;
            }
        }
        return amount;
    }

    public int getCarnivorousCagesAmount() {
        int amount = 0;
        for (int i = 0; i < cagesMaxAmount; i++) {
            if (cages[i] == null) {
                continue;
            }
            if (cages[i].animalType == Type.CARNIVOROUS) {
                amount += 1;
            }
        }
        return amount;
    }

    public void printZooInfo() {
        System.out.println("Количество мест для клеток в зоопарке: " + getCagesMaxAmount());
        System.out.println("Количество клеток: " + getCagesAmount());
        System.out.println("Количество клеток с хищниками: " + getCarnivorousCagesAmount());
        System.out.println("Количество клеток с травоядными: " + getHerbivorousCagesAmount());
        System.out.println("Количество животных: " + getAnimalAmount());
        System.out.println("Количество хищников: " + getCarnivorousAmount());
        System.out.println("Количество травоядных: " + getHerbivorousAmount());
        for (int i = 0; i < cages.length; i++) {
            if (cages[i] == null) {
                break;
            }
            System.out.println(" Клетка № " + (i + 1));
            cages[i].printCageInfo();
        }
    }

    public static Zoo generateZoo() {
        System.out.println("Генерация зоопарка...");
        int random = 2 + (int)(Math.random() * ((10 - 2) + 1));
        Zoo zoo = new Zoo(random);

        for(int i = 0; i < zoo.getCagesMaxAmount(); i++) {
            Cage cage = new Cage();
            cage.fillRandomAnimals();
            zoo.loadCage(cage);
        }

        System.out.println("...Зоопарк сгенерирован.");
        return zoo;
    }
}
