package maggot.zoo;

public class Chicken extends Animal {
    int featherNum;

    Chicken(int featherNum) {
        super("Курица", Type.HERBIVOROUS, 2, "Зерно");
        this.featherNum = featherNum;
    }

    public void sounds() {
        System.out.println("Ко-ко-ко.");
    }

    @Override
    public void printInfo() {
        System.out.println(name);
        System.out.println(translateType());
        System.out.println("Коэффициент пушистости: " + fluffiness);
        System.out.println("Любимая еда: " + favoriteFood);
        System.out.println("Число перьев: " + featherNum);
        sounds();
        shit();
    }
}
