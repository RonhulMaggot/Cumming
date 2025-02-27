package maggot;

//import java.util.Scanner;


public class Zooo {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);

        Animal tiger = new Tiger();
        tiger.printInfo();
    }
}

interface Behavior {
    void sounds();

    default void shit() {
        System.out.println("Classical shit.");
    }
}

abstract class Animal implements Behavior {
    protected Type diet;
    protected int fluffiness;
    protected String favoriteFood;

    Animal(Type diet, int fluffiness, String favoriteFood) {
        this.diet = diet;
        this.fluffiness = fluffiness;
        this.favoriteFood = favoriteFood;
        sounds();
        shit();
    }

    public void printInfo() {
        System.out.println("Тип: " + diet);
        System.out.println("Коэффициент пушистости: " + fluffiness);
        System.out.println("Любимая еда: " + favoriteFood);
    }
}

class Furry extends Animal {
    Furry() {
        super(Type.CARNIVOROUS, 5, "Сперма");
    }

    public void sounds() {
        System.out.println("Чмок-чмок-чмок.");
    }
}

class Tiger extends Animal {
    Tiger() {
        super(Type.CARNIVOROUS, 5, "Зёбра");
    }

    public void sounds() {
        System.out.println("Аррр!");
    }
}

class Buffalo extends Animal {
    Buffalo() {
        super(Type.HERBIVOROUS, 3, "Травка");
    }

    public void sounds() {
        System.out.println("МУУУУУ?");
    }
}

class Chicken extends Animal {
    Chicken() {
        super(Type.HERBIVOROUS, 2, "Зерно");
    }

    public void sounds() {
        System.out.println("Ко-ко-ко.");
    }
}

enum Type {

    HERBIVOROUS,
    CARNIVOROUS
}
